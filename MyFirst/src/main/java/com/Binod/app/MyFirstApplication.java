package com.Binod.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class MyFirstApplication {

	public static void main(String[] args) {
		//run returns  ApplicationContext so we will store it
		
		 ApplicationContext context=SpringApplication.run(MyFirstApplication.class, args);
		
		
//		old method of invoking Print() by instancing an object
//		 Binod obj= new Binod();
//		 obj.print();
		
		 
//		 Dependency Injection :: it's a way of providing the necessary dependencies (objects or values) that 
//		 a class needs from the outside, rather than the class creating them itself. 
//		 we will use Application context 
		 
		 System.out.println("--------------Dependecy Injection--------------");
		 
		Binod obj= context.getBean(Binod.class);
		obj.print();
		
//		Binod obj1= context.getBean(Binod.class);// will same object will be returned??=> YES Indeed
//		obj1.print();
		
		
		System.out.println("--------------Auto Wiring--------------");
		 
		//Auto wiring::
//		 is a feature that allows Spring to automatically inject dependencies into 
//		 beans without explicitly specifying them
//		lets say that we are invoking method of class that depends on another class
//		At that time Wiring concept is used
		
		Laptop obj2= context.getBean(Laptop.class);
		obj2.start();
		
//		
	}

}
