package controllers;

public class StudentController {
	models.Student model;
	views.OneStudentView view;
	
	public StudentController(models.Student model, views.OneStudentView view)
	{
		this.model = model;
		this.view = view;
		this.view.setController(this);
		
		view.show();
	}
	
	public void updateModel(String studentIDPassword)
	{
		// split the ID from the Password
		String studentID = "";
		String studentPassword = "";
		
		model.setStudentID(studentID);
		model.setPassword(studentPassword);
		
		//an update occurred, so a refresh should happen
		view.show();
	}
}
