package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {


    @Test
    public void HomePageLoginMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.ChangeLanguage();
        homepage.ClickOnBootCampsAndCourses();
        homepage.ClickOnFilterIcon();
        homepage.ClickOnSearchInFilter();
        Thread.sleep(10000);
        homepage.RegionFilterField();
        homepage.SelectFromRegion();
        Thread.sleep(4000);
        homepage.SelectCategory();
        Thread.sleep(3000);
        homepage.ScrollToPosition(0,600);
        Thread.sleep(3000);



    }
}




