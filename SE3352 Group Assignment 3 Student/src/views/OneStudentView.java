package views;

public class OneStudentView extends models.Observer{
	
	private models.Student model;
	private controllers.StudentController controller;	
	
	public OneStudentView(models.Student model, controllers.StudentController controller)
	{
		this.setModel(model);		
		this.setController(controller);
	}
	
	public void update()
	{
		this.show();
	}
	
	public void onStudentUpdate()
	{
		//collect the data from user
		String newStudentInfo = "Jiyong Song";
		this.controller.updateModel(newStudentInfo);
	}
	
	public OneStudentView() 
	{}
	
	public void show()
	{
		// display or refresh
	}

	public models.Student getModel() {
		return model;
	}

	public void setModel(models.Student model) {
		if (this.model !=  null)
			this.detach(this);
		
		this.model = model;
		this.model.attach(this);
	}

	private void detach(OneStudentView oneStudentView) {
		
	}

	public controllers.StudentController getController() {
		return controller;
	}

	public void setController(controllers.StudentController controller) {
		this.controller = controller;
	}
}
