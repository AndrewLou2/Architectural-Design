import views.OnePageView;

public class PageAppAEntryPoint 
{
    private static void main(String[] args)
    {
        models.Page m = new models.Page();
        views.OnePageView v = new OnePageView();

        controllers.PageController c = new controllers.PageController(m, v);
    }
    
}
