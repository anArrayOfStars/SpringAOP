package com.SpringAop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * @author mayue
 * @date 2017-10-25
 */
@Component
public class TransactionDemo {

    public void startTransaction(){
        System.out.println("begin transaction ");
    }

    public void commitTransaction(){
        System.out.println("begin transaction ");
    }

    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("begin transaction");

        joinPoint.proceed();

        System.out.println("commit transaction");
    }
}
