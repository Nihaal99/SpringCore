package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
private List<String> friends;
private Map<String,Integer> fees;
private Properties property;

public Properties getProperty() {
	return property;
}
public void setProperty(Properties property) {
	this.property = property;
}
public Map<String, Integer> getFees() {
	return fees;
}
public void setFees(Map<String, Integer> fees) {
	this.fees = fees;
}
public List<String> getFriends(){
	return friends;
}
public void setFriends(List<String> friends) {
	this.friends=friends;
}
@Override
public String toString() {
	return "Person [friends=" + friends + ", fees=" + fees + ",property=" + property + "]";
}

}
