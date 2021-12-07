import views.OneCourseView;

// entry point for Model-View-Controller pattern of Course class
public class LessonCourseEntryPoint {

	public static void main(String[] args) {
		
		models.Course m = new models.Course();
		views.OneCourseView v = new OneCourseView();
		
		controllers.CourseController c = new controllers.CourseController(m, v);
	}

}
