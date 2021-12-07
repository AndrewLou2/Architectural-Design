import views.OneCommentView;

//entry point for Model-View-Controller pattern of comment class

public class LessonCommentEntryPoint {
	
	public static void main(String[] args) {
		
		models.Comment m = new models.Comment();
		views.OneCommentView v = new OneCommentView();
		
		controllers.CommentController c = new controllers.CommentController(m, v);
	}

}
