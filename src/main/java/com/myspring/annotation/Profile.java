package com.myspring.annotation;

import com.myspring.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Hessam on 6/28/17.
 */
public class Profile {
    @Autowired
    @Qualifier("student1")
    private Student student;

    public Profile() {
        System.out.println("Inside Profile constructor." );
    }

    public void printAge(){
        System.out.println("Age: "+ student.getAge() );
    }

    public void printName(){
        System.out.println("Name: "+ student.getName() );
    }
}
