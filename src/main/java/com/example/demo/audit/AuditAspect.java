package com.example.demo.audit;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditAspect {

    @After("execution(* com.example.demo.controller.PayloadController.handlePayload(..))")
    public void audit() {
        // Implement audit logic here
        System.out.println("Request audited");
    }
}