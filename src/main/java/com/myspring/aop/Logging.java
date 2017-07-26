package com.myspring.aop;

/**
 * Created by Hessam on 7/26/17.
 */
public class Logging {
    public void beforeAdvice(){
        System.out.println("Going to setup student!");
    }
    public void afterAdvice(){
        System.out.println("Student setup has been setup");
    }
    public void afterReturningAdvice(Object retVal){
        System.out.println("retVal = " + retVal.toString());
    }
    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("ex = " + ex.toString());
    }
}
