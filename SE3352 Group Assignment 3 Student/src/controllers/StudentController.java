package controllers;

public class StudentController {
	models.Student model;
	views.OneStudentView view;
	
	// set model, view and controller
	public StudentController(models.Student model, views.OneStudentView view)
	{
		this.model = model;
		this.view = view;
		this.view.setController(this);
		
		// show or refresh since an update occurred
		view.show();
	}
	
	public void updateModel(String studentIDPassword)
	{
		// split the ID from the Password
		String studentID = "";
		String studentPassword = "";
		
		// set the updated information
		model.setStudentID(studentID);
		model.setPassword(studentPassword);
		
		//an update occurred, so a refresh should happen
		view.show();
	}
}
