package com.mapDemo;

public class Student {
	private int sid;
	private String name;
	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		Student s=(Student)o;
		
		if(s==null || s.getClass()!=this.getClass())
			return false;
		if(this.sid!=s.sid) {
			return false;
		}
		return true;
		
	}
	
	@Override
	public int hashCode() {
		return this.sid;
	}
	
	
}
