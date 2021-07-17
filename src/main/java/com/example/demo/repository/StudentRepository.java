package com.example.demo.repository;

import com.example.demo.domains.Course;
import com.example.demo.domains.CourseRegistration;
import com.example.demo.domains.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

  @Query("SELECT s FROM Student s WHERE s.email = ?1")
  Optional<Student> findStudentByEmail(String email);

  @Query("SELECT cr FROM CourseRegistration cr WHERE cr.student.id = ?1")
  List<CourseRegistration> findAllCourses(Long student_id);
}
