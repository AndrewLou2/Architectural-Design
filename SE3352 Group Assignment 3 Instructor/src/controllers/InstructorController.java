package controllers;

public class IntructorController {
    models.Intructor model;
    views.OneIntructorView view;

    // set model, view and controller
    public IntructorController(models.Intructor model, views.OneIntructorView view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);

        // show or refresh since an update occurred
        view.show();
    }

    public void updateModel(String intructorIDPassword) {
        // split the ID from the Password
        String intructorID = "";
        String intructorPassword = "";

        // set the updated information
        model.setIntructorID(intructorID);
        model.setPassword(intructorPassword);

        // an update occurred, so a refresh should happen
        view.show();
    }
}
