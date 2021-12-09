package views;

public class OnePageView extends models.Observer 
{
    //Initialized the model and controller as private variables
    private models.Page model;
    private controllers.PageController controller;

    //Setting the controller and the model
    public OnePageView(models.Page model, controllers.PageController controller)
    {
        this.setModel(model);
        this.setController(controller);;
    }

    public void update()
	{
		this.show();
	}

    //This is the new update function for when the page updates
    public void onPageUpdate()
    {
        //connects data from the user
        String newPageInfo = "";
        this.controller.updateModel(newPageInfo);
    }


    public OnePageView()
    {

    }

    public void show()
    {
        //display or refresh
    }

    //Getter for the model
    public models.Page getModel()
    {
        return model;
    }
	
    //Setter for the model
    public void setModel(models.Page model)
    {
        if(this.model != null)
        {
            this.model.detach(this);
        }
        this.model = model;
        this.model.attach(this);
    }

    //Getter for the controller
    public controllers.PageController getController()
    {
        return controller;
    }

    //Setter for the controller
    public void setController(controllers.PageController controller)
    {
        this.controller = controller;
    }

}
