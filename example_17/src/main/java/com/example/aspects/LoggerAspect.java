package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

// Aspect handles the logic
@Aspect
@Component
// execute the aspect in second
@Order(2)
public class LoggerAspect {

    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    // Around is an advice works like @Before and @After (ProceedingJoinPoint and proceed() are exclusive only for @Around)
    @Around("execution(* com.example.service.*.*(..))") // using execution pointcut syntax parameters which where the advice should apply
    public Object log (ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().toString() + " method excuted with execution log");
        Instant start = Instant.now();
        Object logValue = joinPoint.proceed(); // invokes the method
        Instant finish = Instant.now();
        long tineElapsed = Duration.between(start,finish).toMillis();
        logger.info(joinPoint.getSignature().toString() + " took "+tineElapsed+" milliseconds");
        logger.info(joinPoint.getSignature().toString() + " method execution ends");
        return logValue;
    }

    @Around("@annotation(com.example.service.interfaces.LogAspect)")
    public Object annotatedLog (ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString()+ " method executed with log annotation");
        Instant start = Instant.now();
        Object annotatedLogValue = joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info(joinPoint.getSignature().toString()+ " took " + timeElapsed+ " milliseconds");
        return annotatedLogValue;
    }

    // @AfterThrowing executes some logic after throwing an exception, also passing a parameter "ex" that captures the exception
    @AfterThrowing(value = "execution(* com.example.service.*.*(..))", throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex){
        logger.log(Level.SEVERE, joinPoint.getSignature()+ "An exception is thrown "+ex.getMessage());
    }

    // @AfterReturning executes some logic after returning a value, also passing a parameter "vehicleValue" that captures the return value
    @AfterReturning(value = "execution(* com.example.service.*.*(..))",returning = "vehicleValue")
    public void logVehicleValue(JoinPoint joinPoint, Object vehicleValue){
        logger.log(Level.INFO, joinPoint.getSignature()+ "Vehicle value is " + vehicleValue);
    }
}
