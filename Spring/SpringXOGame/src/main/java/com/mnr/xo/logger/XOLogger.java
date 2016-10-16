package com.mnr.xo.logger;

//import org.aspectj.lang.annotation.Aspect;

//@Component
//@Aspect
public class XOLogger {
	
	public XOLogger(){
		
	}

	public void printReturnedValue(Object obj) {
		System.out.println("Button Symbol is: " + obj);
	}
	
	public void buttonStartChange() {
		System.out.println("Button start changed");
	}

	public void buttonChanged() {
		System.out.println("Button changed");
	}
	
	public void checkWinner(Object obj) {
		if(obj.toString() != "EMPTY"){
			System.out.println("We have a winner");	
		}
	}
}
