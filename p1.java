package com.ilp.bean;

public class Applicant {
 String name;
 int age;
 String gender;
 double sum;
 double premium;
 
 
 
public Applicant(String name, int age, String gender, double sum, double premium) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.sum = sum;
	this.premium = premium;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public double getSum() {
	return sum;
}
public void setSum(double sum) {
	this.sum = sum;
}
public double getPremium() {
	return premium;
}
public void setPremium(double premium) {
	this.premium = premium;
}
 
	
	
}
