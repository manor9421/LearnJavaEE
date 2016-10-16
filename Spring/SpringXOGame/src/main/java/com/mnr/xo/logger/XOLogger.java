package com.mnr.xo.logger;

//import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class XOLogger {
	
	public XOLogger(){
		
	}

	public void printValue(Object obj) {
		System.out.println(obj);
	}

	public void init() {
		System.out.println("init");
	}

	public void close() {
		System.out.println("close");
	}
}
