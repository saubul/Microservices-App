package ru.saubulprojects.user.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
	@Pointcut("@annotation(ru.saubulprojects.user.annotation.Logged)")
	public void log() {
		
	}
	
	private Logger logger = Logger.getLogger("LOGGER");
	
	@Before("log()")
	public void beforeLog(JoinPoint joinPoint) {
		logger.info("From: " + joinPoint);
	}
	
}
