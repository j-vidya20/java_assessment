package com;

public class BMICalculator {

//private Patient pa;
private Patient patient[];

public Patient[] getPatient() {
	return patient;
}
//System.out.println( "the od"+patient[0]);
public void setPatient(Patient[] patient) {
	this.patient = patient;
}
double calculateBMI(double patientWeight, double patientHeight) {
	double bmi;
	bmi=(patientWeight/(patientHeight*patientHeight))*703;
	if(bmi>25.0) {
		System.out.println(bmi);
		System.out.println("The patient is overweight");
		//System.out.println(pa.getPatientid());
		
	}
	else {
		System.out.println(bmi);
		System.out.println("Patients BMI was normal");
		
	}
	
	return 0;
}

public BMICalculator() {
	super();
	
}



}