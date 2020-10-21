package com.revature.rms.core.aspects;

import com.revature.rms.core.config.EurekaInstanceConfigBeanPostProcessor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.Arrays;

public abstract class CoreLoggingAspect {


	private static final Logger LOGGER = LoggerFactory.getLogger(CoreLoggingAspect.class);

	@Pointcut("within(com.revature..*)")
	public abstract void logAll();

	@Before("logAll()") // reuse logAll's pointcut
	public void logMethodStart(JoinPoint jp){
		String methodSig = extractMethodSignature(jp);
		String argStr = Arrays.toString(jp.getArgs());
		LOGGER.info(methodSig + " invoked at " + LocalDateTime.now());
		LOGGER.info("Input Arguments: " + argStr);
	}

	@AfterReturning(pointcut = "logAll()", returning = "returned")
	public void logMethodReturn(JoinPoint jp, Object returned){
		String methodSig = extractMethodSignature(jp);
		LOGGER.info(methodSig + " successfully returned at " + LocalDateTime.now());
		LOGGER.info("Object returned: " + returned);
	}

	@AfterThrowing(pointcut = "logAll()", throwing = "e")
	public void errorOccurrence(JoinPoint jp, Exception e){
		String methodSig = extractMethodSignature(jp);
		LOGGER.error(e + "was thrown in method " + methodSig + " at " + LocalDateTime.now(), e);
	}

	public String extractMethodSignature(JoinPoint jp){
		return  jp.getTarget().getClass().toString()
				+ "."
				+ jp.getSignature().getName();
	}

}
