package Myproject.SpringBoot.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String workerId;
    private String dept;
    private String email;
    private String address;
    private int age;
    private int dob;
    private long phNo;
    private float salary;
}