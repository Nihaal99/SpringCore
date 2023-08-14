package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
private String name;
private List<String> phones;
private Set<String> addresses;
private Map<String,String> courses;

public Set<String> getAddresses() {
	return addresses;
}
public void setAddresses(Set<String> addresses) {
	this.addresses = addresses;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
public Emp(String name,Set<String> addresses,List<String> phones, Map<String, String> courses) {
	super();
	this.name = name;
	this.addresses=addresses;
	this.phones = phones;
	this.courses = courses;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

} 
