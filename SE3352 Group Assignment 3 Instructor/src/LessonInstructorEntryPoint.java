public class LessonInstructorEntryPoint {

    public static void main(String[] args) {
        
        models.Instructor m = new models.Instructor();
        views.OneIntructorView v = new OneInstructorView();
        controllers.InstructorController c = new controllers.InstructorController(m, v);
    }
}
