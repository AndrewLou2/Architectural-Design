package models;
import views.OnePageView;

public class Page {
	private String pageTitle;
    private String pageBody;

    public String getPageTitle() {
        return pageTitle;
    }
    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }
    public String getPageBody() {
        return pageBody;
    }
    public void setPageBody(String pageBody) {
        this.pageBody = pageBody;
    }

    public void attach(OnePageView onePageView) {

    }

}
