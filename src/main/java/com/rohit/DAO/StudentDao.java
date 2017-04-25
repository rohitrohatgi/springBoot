package com.rohit.DAO;

import com.rohit.Entity.Student;

import java.util.Collection;

/**
 * Created by Rohit on 26-04-2017.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void updateStudent(Student student);
}
