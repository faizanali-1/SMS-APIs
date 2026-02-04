package com.learningAPI.APIs.controller;

import com.learningAPI.APIs.dto.AddStudentRequestDto;
import com.learningAPI.APIs.dto.StudentDto;
import com.learningAPI.APIs.entity.Student;
import com.learningAPI.APIs.repository.StudentRepository;
import com.learningAPI.APIs.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.channels.ReadableByteChannel;
import java.util.List;
import java.util.Map;

//is ma hm student ki saari ki saari apis bnaein gy.

@RestController //iska bean bnaany k liy and i want k is ko spring framework
//handle kry .
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;


    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudent() {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudent());
    }
    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id){
       return ResponseEntity.status(HttpStatus.OK).body(studentService.getStudentById(id));
    }
@PostMapping
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody @Valid AddStudentRequestDto addStudentRequestDto ){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
}
@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
}
@PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable  Long id,
                                                    @RequestBody AddStudentRequestDto addStudentRequestDto) {
        return  ResponseEntity.ok(studentService.updateStudent(id,addStudentRequestDto));
}
@PatchMapping("/{id}")
    public ResponseEntity<StudentDto> updatePartialStudent(@PathVariable Long id,
                                                           @RequestBody Map<String,Object> updates){
        return ResponseEntity.ok(studentService.updatePartialStudent(id,updates));
}
}


