package pages;

import org.openqa.selenium.WebDriver;

public class GoogleHome_Page extends BasePage {


    private String searchButton = "(//*[@class=\"gNO89b\"])[1]";
    private String searchTextField = "//*[@name=\"q\"]";
    private String firstResult = "(//*[@class=\"LC20lb DKV0Md\"])[1]";

    public GoogleHome_Page() {
        super(driver);
    }

    public void navigateToGoogle(String URL){
        navigateTo(URL);
    }

    public void clickGoogleSearch(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField,criteria);
    }

    public String textForElement_firstResult(){
        return textForElement(firstResult);
    }


}
