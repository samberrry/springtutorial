package com.myspring.main;

import com.myspring.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hessam on 5/6/17.
 */
public class MainApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Student student = (Student) context.getBean("student");

        student.getAge();
        student.getName();

        student.printThrowException();

    }
}
