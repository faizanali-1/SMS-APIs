package com.learningAPI.APIs.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;

@Data
public class AddStudentRequestDto {
    @NotBlank(message = "enter your name")
    @Size(min = 3,max = 30 ,message = "name should greater than 3 char & less than 30 character")
    private String name;

    @Email
    @NotBlank(message = "email is required")
    private String email;
}
