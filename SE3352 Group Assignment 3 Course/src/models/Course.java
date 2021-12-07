package models;

import views.OneCourseView;

public class Course {	
	private String courseName;
	private String courseNum;

	// getter and setter for course name
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	// getter and setter for course number
	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	
	public void attach(OneCourseView oneCourseView) {		
		
	}
}
