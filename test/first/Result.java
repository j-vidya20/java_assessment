package com;


import org.springframework.stereotype.Component;

@Component
public class Result {
	Cohorts c;
 DXC d;
public Result(Cohorts c, DXC d)
{
	this.c = c;
	this.d = d;
}
public void  display()
{
	
	System.out.println(c.CohortId);
	System.out.println(c.CohortName);
	System.out.println( c.emailId);
	System.out.println(c.contactNo);
}
}