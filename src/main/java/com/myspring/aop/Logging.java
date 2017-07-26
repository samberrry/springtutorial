package com.myspring.aop;

import org.aspectj.lang.annotation.*;

/**
 * Created by Hessam on 7/26/17.
 */
@Aspect
public class Logging {

    @Pointcut("execution(* com.myspring.*.*(..))")
    private void selectAll(){}
    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("Going to setup student!");
    }
    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("Student setup has been setup");
    }
    @AfterReturning(pointcut = "selectAll()",returning = "retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("retVal = " + retVal.toString());
    }
    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("ex = " + ex.toString());
    }
}
