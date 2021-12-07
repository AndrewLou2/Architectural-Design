import views.OneStudentView;

// entry point for Model-View-Controller pattern for Student class
public class LessonStudentEntryPoint {

	public static void main(String[] args) {
		
		models.Student m = new models.Student();
		views.OneStudentView v = new OneStudentView();
		
		controllers.StudentController c = new controllers.StudentController(m, v);
	}

}
