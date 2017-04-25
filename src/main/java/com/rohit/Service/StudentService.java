package com.rohit.Service;

import com.rohit.DAO.FakeStudentDaoImpl;
import com.rohit.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Rohit on 25-04-2017.
 */
@Service
public class StudentService {
    @Autowired
    FakeStudentDaoImpl studentDao;
    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }
}
