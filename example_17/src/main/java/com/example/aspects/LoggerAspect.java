package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

// Aspect handles the logic
@Aspect
@Component
public class LoggerAspect {

    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    // Around is an advice works like @Before and @After (ProceedingJoinPoint and proceed() are exclusive only for @Around)
    @Around("execution(* com.example.service.*.*(..))") // using execution pointcut syntax parameters which where the advice should apply
    public void log (ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().toString() + " method excuted");
        Instant start = Instant.now();
        joinPoint.proceed(); // invokes the method
        Instant finish = Instant.now();
        long tineElapsed = Duration.between(start,finish).toMillis();
        logger.info(joinPoint.getSignature().toString() + " took "+tineElapsed+" milliseconds");
        logger.info(joinPoint.getSignature().toString() + " method execution ends");

    }
}
