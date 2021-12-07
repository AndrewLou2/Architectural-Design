package controllers;

public class CourseController {
	models.Course model;
	views.OneCourseView view;
	
	public CourseController(models.Course model, views.OneCourseView view)
	{
		// set model, view and controller
		this.model = model;
		this.view = view;
		this.view.setController(this);
		
		// show or refresh
		view.show();
	}
	
	public void updateModel(String courseNameNum)
	{
		// split the course name and number
		String courseName = "";
		String courseNum = "";
		
		// set the name and number
		model.setCourseName(courseName);
		model.setCourseNum(courseNum);
		
		// an update occurred, so refresh
		view.show();
	}
}
