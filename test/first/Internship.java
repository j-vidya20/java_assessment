package com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Internship  {
   public static void main(String[] args) {
	   AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Result r = context.getBean(Result.class);
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		Cohorts c = (Cohorts)app.getBean("cohorts");
   }
}