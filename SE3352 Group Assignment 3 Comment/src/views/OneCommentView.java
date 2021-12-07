package views;

public class OneCommentView extends models.Observer {
	
	private models.Comment model;
    private controllers.CommentController controller;

    // set the model and controller
    public OneCommentView(models.Comment model, controllers.CommentController controller)
	{
		this.setModel(model);		
		this.setController(controller);
	}

    public void update() {
        this.show();
    }

    // when Comment information is updated
    public void onCommentUpdate() {
        // collect the data from user
        String newCommentInfo = "Comment body: Anything user types ";
        this.controller.updateModel(newCommentInfo);
    }

    public OneCommentView() 
	{}

    public void show() {
        // display or refresh
    }

    // getter and setter for model
    public models.Comment getModel() {
        return model;
    }

    public void setModel(models.Comment model) {
        if (this.model != null)
            this.detach(this);

        this.model = model;
        this.model.attach(this);
    }

    // detach from subject
    private void detach(OneCommentView oneCommentView) {

    }

    // getter and setter for controller
    public controllers.CommentController getController() {
        return controller;
    }

    public void setController(controllers.CommentController controller) {
        this.controller = controller;
    }

}
