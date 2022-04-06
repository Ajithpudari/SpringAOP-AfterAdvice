package com.javaspr.aop;


import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class RunAfterExecution implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object retVal, Method methodArg, Object[] args,
                               Object target) throws Throwable {

        System.out.println("Inside RunAfterExecution.afterReturning() method...");
        System.out.println("Running after advice...");
    }
}