package views;

public class OneCourseView extends models.Observer{
	
	private models.Course model;
	private controllers.CourseController controller;	
	
	// setting the model and controller
	public OneCourseView(models.Course model, controllers.CourseController controller)
	{
		this.setModel(model);		
		this.setController(controller);
	}
	
	public void update()
	{
		this.show();
	}
	
	// function for when the course information is updated
	public void onCourseUpdate()
	{
		//collect the data from user
		String newCourseInfo = "SE3352: Software Requirements and Analysis";
		this.controller.updateModel(newCourseInfo);
	}
	
	public OneCourseView() 
	{}
	
	public void show()
	{
		// display or refresh
	}

	// getter and setter for model
	public models.Course getModel() {
		return model;
	}

	public void setModel(models.Course model) {
		if (this.model !=  null)
			this.detach(this);
		
		this.model = model;
		this.model.attach(this);
	}

	// detach from subject
	private void detach(OneCourseView oneCourseView) {
		
	}
	
	// getter and setter for controller
	public controllers.CourseController getController() {
		return controller;
	}

	public void setController(controllers.CourseController controller) {
		this.controller = controller;
	}
}
