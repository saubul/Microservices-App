package ru.saubulprojects.department.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
	@Pointcut("@annotation(ru.saubulprojects.department.annotation.Logged)")
	public void log() {
		
	}
	
	private Logger logger = Logger.getLogger("LOGGER");
	
	@Before("log()") 
	private void beforeLog(JoinPoint joinPoint) {
		logger.info("From " + joinPoint);
	}
	
}
