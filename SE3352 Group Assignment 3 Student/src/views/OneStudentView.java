package views;

public class OneStudentView extends models.Observer{
	
	private models.Student model;
	private controllers.StudentController controller;	
	
	// set the model and controller
	public OneStudentView(models.Student model, controllers.StudentController controller)
	{
		this.setModel(model);		
		this.setController(controller);
	}
	
	public void update()
	{
		this.show();
	}
	
	// when student information is updated
	public void onStudentUpdate()
	{
		//collect the data from user
		String newStudentInfo = "ID: user, password: 1234";
		this.controller.updateModel(newStudentInfo);
	}
	
	public OneStudentView() 
	{}
	
	public void show()
	{
		// display or refresh
	}

	// getter and setter for model
	public models.Student getModel() {
		return model;
	}

	public void setModel(models.Student model) {
		if (this.model !=  null)
			this.detach(this);
		
		this.model = model;
		this.model.attach(this);
	}

	// detach from subject
	private void detach(OneStudentView oneStudentView) {
		
	}

	// getter and setter for controller
	public controllers.StudentController getController() {
		return controller;
	}

	public void setController(controllers.StudentController controller) {
		this.controller = controller;
	}
}
