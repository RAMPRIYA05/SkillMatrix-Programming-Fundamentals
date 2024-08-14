package com.chainsys.skilltesttask;

public class PeopleTemp {
	public String name;
	public int age;
	
	
	
	public PeopleTemp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "PeopleTemp [name=" + name + ", age=" + age + "]";
	}
	
	

}
