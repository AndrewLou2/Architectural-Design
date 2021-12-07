package controllers;

public class CommentController {
	
	models.Comment model;
    views.OneCommentView view;

    // set model, view and controller
    public CommentController(models.Comment model, views.OneCommentView view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);

        // show or refresh since an update occurred
        view.show();
    }

    public void updateModel(String comment_Body) {
       
        String commentBody = "";

        // set the updated information
        model.setCommentBody(commentBody);
        

        // an update occurred, so a refresh should happen
        view.show();
    }

}
