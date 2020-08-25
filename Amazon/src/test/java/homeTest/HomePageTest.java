package homeTest;

import base.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {

    HomePage homePage;

    @BeforeMethod
    public void init(){
        homePage = PageFactory.initElements(driver,HomePage.class);
    }

    @Test
    public void setHomePageTest(){
        homePage.SearchBoxcheck("hand sanitizer");
        sleepFor(3);
        //homePage.validateSearchbox();
        sleepFor(3);
    }
}
