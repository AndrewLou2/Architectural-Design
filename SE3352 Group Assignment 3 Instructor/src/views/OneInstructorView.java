package views;

public class OneInstructorView {

    private models.Instructor model;
    private controllers.IntructorController controller;

    // set the model and controller
    public OneIntructorView(models.Intructor model, controllers.IntructorController controller)
	{
		this.setModel(model);		
		this.setController(controller);
	}

    public void update() {
        this.show();
    }

    // when Intructor information is updated
    public void onIntructorUpdate() {
        // collect the data from user
        String newIntructorInfo = "ID: root, password: user";
        this.controller.updateModel(newIntructorInfo);
    }

    public OneIntructorView() 
	{}

    public void show() {
        // display or refresh
    }

    // getter and setter for model
    public models.Intructor getModel() {
        return model;
    }

    public void setModel(models.Intructor model) {
        if (this.model != null)
            this.detach(this);

        this.model = model;
        this.model.attach(this);
    }

    // detach from subject
    private void detach(OneIntructorView oneIntructorView) {

    }

    // getter and setter for controller
    public controllers.IntructorController getController() {
        return controller;
    }

    public void setController(controllers.IntructorController controller) {
        this.controller = controller;
    }
}
