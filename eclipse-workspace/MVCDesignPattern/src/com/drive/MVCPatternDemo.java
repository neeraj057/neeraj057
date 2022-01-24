package com.drive;

import com.controller.CourseController;
import com.entity.Course;
import com.view.CourseView;

public class MVCPatternDemo {
	public static void main(String[] args) {
		
		//Fetch record
		Course model = fetchCourseFromDatabase();
		
		// Create a view
		CourseView view = new CourseView();
		CourseController controller = new CourseController(model, view);
		controller.updateView();
		
		// update model data
		controller.setCourseName("DotNet");
		System.out.println("--------------------------------------------------");
		System.out.println();
		System.out.println("After updating, Course Details are as follows");
		controller.updateView();
	}

	private static Course fetchCourseFromDatabase() {
		Course course = new Course();
		course.setName("Java");
		course.setId("01");
		course.setCategory("Programming");
		return course;
	}
}
