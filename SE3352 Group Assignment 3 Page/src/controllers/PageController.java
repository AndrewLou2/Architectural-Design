package controllers;

public class PageController {
	
	models.Page model;
    views.OnePageView view;

    // set model, view and controller
    public PageController(models.Page model, views.OnePageView view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);
        
        // show or refresh since an update occurred
        view.show();
    }

    public void updateModel(String pageInfo) {
       
        String pageTitle = "";
        String pageBody = "";

        // set the updated information
        model.setPageTitle(pageTitle);
        model.setPageBody(pageBody);
        
        // an update occurred, so a refresh should happen
        view.show();
    }

}
