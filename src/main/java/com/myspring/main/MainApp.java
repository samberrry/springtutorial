package com.myspring.main;

import com.myspring.HelloIndia;
import com.myspring.HelloWorld;
import com.myspring.collection.MyCollection;
import com.myspring.di.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hessam on 5/6/17.
 */
public class MainApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        MyCollection myCollection = (MyCollection)context.getBean("myCollection");
        myCollection.getAddressList();
        myCollection.getAddressSet();
        myCollection.getAddressMap();
        myCollection.getAddressProp();

    }
}
