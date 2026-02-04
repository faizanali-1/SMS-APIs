package com.learningAPI.APIs.service;

import com.learningAPI.APIs.dto.AddStudentRequestDto;
import com.learningAPI.APIs.dto.StudentDto;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<StudentDto> getAllStudent();

    StudentDto getStudentById(Long id);
    
    StudentDto createNewStudent(@RequestBody AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(Long id);

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);

    StudentDto updatePartialStudent(Long id, Map<String, Object> updates);
}
