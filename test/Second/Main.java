package com;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
   public static void main(String[] args) {
      ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

      Patient p = (Patient) context.getBean("patient");
     // 
      //context.close();
      System.out.print("ID : " + p.getPatientid()+"  BMI is :" );
     p.calculateBMI();
      context.close();
   }
}