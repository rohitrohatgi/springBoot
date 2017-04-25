package com.rohit.DAO;

import com.rohit.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rohit on 25-04-2017.
 */
@Repository
public class FakeStudentDaoImpl implements StudentDao {

    private static Map<Integer,Student> students;

    static {
        students = new HashMap<Integer,Student>(){
            {
                put(1,new Student(1,"Rohit","English"));
                put(2,new Student(2,"Deepali","Maths"));
                put(3,new Student(3,"Ansh","Science"));

            }
        };
    }

    @Override
    public Collection<Student> getAllStudents(){
        return students.values();
    }

    @Override
    public Student getStudentById(int id){
        return students.get(id);
    }

    @Override
    public void updateStudent(Student student) {
        if(students.containsKey(student.getId())) {
            Student orig = students.get(student.getId());
            orig.setName(student.getName());
            orig.setSubject(student.getSubject());
        }else {
            students.put(student.getId(),student);
        }

    }
}
