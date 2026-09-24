package Myproject.SpringBoot.DTO;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentRequestDTO {
    @NotBlank(message = " Name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message="Enter a valid email")
    private String email;

    @NotBlank(message = "Phone is required")
    private String phone;

    @NotBlank(message = "Department is required")
    private String department;

    @Min(value = 2020, message = "Graduation year should be greater than 2020")
    @Max(value = 2100, message = "Graduation Year is invalid")
    private int graduationYear;

    @DecimalMin(value = "0.0",message = "CGPA cannot be negative")
    @DecimalMax(value = "10.0",message = "CGPA cannot exceed 10")
    private double cgpa;
}