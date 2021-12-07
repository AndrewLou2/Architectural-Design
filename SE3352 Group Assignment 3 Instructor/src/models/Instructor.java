package models;

import views.OneInstructorView;

public class Instructor {
    private String instructorID;
    private String password;

    public String getIntructorID() {
        return instructorID;
    }

    public void setIntructorID(String instructorID) {
        this.instructorID = instructorID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void attach(OneInstructorView oneInstructorView) {

    }
}
