package com.example.demo.domains;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
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

  public Student() {}

  public Student(long id, String name, LocalDate dob, String email) {
    this.id = id;
    this.name = name;
    this.dob = dob;
    this.email = email;
  }

  public Student(String name, LocalDate dob, String email) {
    this.name = name;
    this.dob = dob;
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return Period.between(dob, LocalDate.now()).getYears();
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Student{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", age="
        + age
        + ", dob="
        + dob
        + ", email='"
        + email
        + '\''
        + '}';
  }
}
