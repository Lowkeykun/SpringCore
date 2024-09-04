package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1) // We instruct spring that this aspect will execute first, if we did not indicate the order it will execute the aspects randomly
public class VehicleAspect {

    // Since before will run before a matched method execution, the parameters executes in the packages with a method first arguments (isStarted) then followed by any arguments
    @Before("execution(* com.example.service.*.*(..)) && args(isStarted,..)")
    public void checkStarted(JoinPoint joinPoint, boolean isStarted) throws Throwable{
        if (!isStarted){
            throw new RuntimeException("Vehicle is not started");
        }
    }
}
