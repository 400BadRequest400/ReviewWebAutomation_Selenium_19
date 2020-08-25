package home;

import base.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;


public class HomePage extends WebAPI {


    @FindBy(how = How.CSS, using = webElementSearchBox)
    public WebElement SearchBox;

    @FindBy(how = How.CSS, using = webElementSearchBoxButton)
    public WebElement SearchBoxButton;

    @FindBy(how = How.XPATH, using = webElementSearchText)
    public WebElement SearchBoxValidation;


    //Action Method
    public void SearchBoxcheck(String searchitem ){
        SearchBox.sendKeys(searchitem);
        SearchBoxButton.click();
    }

    //Validate method
    public void validateSearchbox(){
        String actualresult = SearchBoxValidation.getText();
        String expectedresult = "Wilson Traditional Soccer Ball";
        Assert.assertEquals(actualresult,expectedresult,"search item not same");
    }
}


