package com.tka.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAspect {

//	@Before("execution (* com.tka.entity.Recharge.*(..))")
//	public void beforeMain() {
//		System.err.println("UR Data pack is Expiring Soon .. Plz Recharge ... !");
//	}

//	@Before("execution( public void myRecharge())")
//	public void beforeMain() {
//		System.err.println("UR Data pack is Expiring Soon .. Plz Recharge ... !");
//	}

//	@After("execution (* com.tka.entity.Recharge.*(..))")
//	public void afterMain() {
//		System.err.println("Enjoy UR data pack ... !");
//	}

	@Around("execution (* com.tka.entity.Recharge.*(..))")
	public void afterMain(ProceedingJoinPoint p) {

		System.err.println("UR Data pack is Expiring Soon .. Plz Recharge ... !");
		try {
			p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("Enjoy UR data pack ... !");
	}

}
