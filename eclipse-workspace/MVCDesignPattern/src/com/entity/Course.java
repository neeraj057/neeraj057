package com.entity;

public class Course {
	private String CourseName;
	private String CourseId;
	private String CourseCategory;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String courseName, String courseId, String courseCategory) {
		super();
		CourseName = courseName;
		CourseId = courseId;
		CourseCategory = courseCategory;
	}

	public String getId() {
		return CourseId;
	}

	public void setId(String id) {
		this.CourseId = id;
	}

	public String getName() {
		return CourseName;
	}

	public void setName(String name) {
		this.CourseName = name;
	}

	public String getCategory() {
		return CourseCategory;
	}

	public void setCategory(String category) {
		this.CourseCategory = category;
	}
}
