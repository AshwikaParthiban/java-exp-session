package Myproject.SpringBoot.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    Long Id;
    String Name;
    String RollNo;
    String Dept;
    String Email;
    String Address;
    int year;
    int DOB;
    int PhNo;
    float Cgpa;
}
