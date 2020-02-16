package com.abhishek.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.student.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
