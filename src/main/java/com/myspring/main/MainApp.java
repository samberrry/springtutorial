package com.myspring.main;

import com.myspring.HelloIndia;
import com.myspring.HelloWorld;
import com.myspring.di.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hessam on 5/6/17.
 */
public class MainApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        obj.getMessage1();
//        obj.getMessage2();
//
//        HelloIndia obj2 = (HelloIndia)context.getBean("helloIndia");
//        obj2.getMessage1();
//        obj2.getMessage2();
//        obj2.getMessage3();

        TextEditor textEditor = (TextEditor)context.getBean("textEditor");
        textEditor.spellCheck();

    }
}
