package views;

public class OnePageView extends models.Observer 
{
    private models.Page model;
    private controllers.PageController controller;

    public OnePageView(models.Page model, controllers.PageController controller)
    {
        this.setModel(model);
        this.setController(controller);;
    }

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

    public models.Page getModel()
    {
        return model;
    }

    public void setModel(models.Page model)
    {
        if(this.model != null)
        {
            this.model.attach(this);
        }
        this.model = model;
        this.model.attach(this);
    }

    public controllers.PageController getController()
    {
        return controller;
    }

    public void setController(controllers.PageController controller)
    {
        this.controller = controller;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        
    }
}
