package com.example.demo.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Data
@NoArgsConstructor
public class Student {
  @Id
  @SequenceGenerator(
      name = "student_sequence",
      sequenceName = "student_sequence",
      allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
  @ApiModelProperty(notes = "Id of student", name = "id", required = true, value = "1")
  private Long id;

  @ApiModelProperty(notes = "Name of student", name = "name", required = true, value = "Sohee")
  private String name;

  @Transient
  @ApiModelProperty(notes = "Age of student", name = "age", value = "13")
  private Integer age;

  @ApiModelProperty(
      notes = "Date of birth of student",
      name = "dob",
      required = true,
      value = "2008-05-16")
  private LocalDate dob;

  @ApiModelProperty(
      notes = "Email of student",
      name = "email",
      required = true,
      value = "Sohee@gmail.com")
  private String email;

  public Student(String name, LocalDate dob, String email) {
    this.name = name;
    this.dob = dob;
    this.email = email;
  }
}
