package com.learningAPI.APIs.service.impl;

import com.learningAPI.APIs.dto.AddStudentRequestDto;
import com.learningAPI.APIs.dto.StudentDto;
import com.learningAPI.APIs.entity.Student;
import com.learningAPI.APIs.repository.StudentRepository;
import com.learningAPI.APIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor

public class StudentServiceImp implements StudentService {
    public final StudentRepository studentRepository;
    public final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStudent(){
            List<Student> students = studentRepository.findAll();
            return students
                    .stream()
                    .map(student -> modelMapper.map(student,StudentDto.class))
                    .toList();
    }
@Override
public StudentDto getStudentById(Long id){
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("student not found with id : " +id));
return modelMapper.map(student,StudentDto.class);
    }

    @Override
    public StudentDto createNewStudent(@RequestBody AddStudentRequestDto addStudentRequestDto) {
     Student newStudent = modelMapper.map(addStudentRequestDto,Student.class);
       Student student = studentRepository.save(newStudent);
        return modelMapper.map(student,StudentDto.class);
    }

    @Override
    public void deleteStudentById(Long id) {
        if(!studentRepository.existsById(id)){
            throw new IllegalArgumentException("STUDENT DOES NOT EXIST BY ID :" +id);
        }
        studentRepository.deleteById(id);
    }

    @Override
    public StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("student not found with id : " +id));
        modelMapper.map(addStudentRequestDto,student);
        student = studentRepository.save(student);
        return modelMapper.map(student,StudentDto.class);
    }

    @Override
    public StudentDto updatePartialStudent(Long id, Map<String, Object> updates) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("student not found with id : " +id));
        updates.forEach((field,value) -> {
            switch (field){
                case "name": student.setName((String) value);
                break;
                case "email": student.setEmail((String) value);
                break;

                default:
                    throw new IllegalArgumentException("Field is not Supported");
            }
        });
        Student savedStudent = studentRepository.save(student);
        return modelMapper.map(savedStudent,StudentDto.class);
    }


}
