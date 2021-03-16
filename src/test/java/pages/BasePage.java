package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver driver;    //Tenemos una instancia del WebDriver compartida con todas las clases. En todas las intancias de la clase BasePage la variable driver será la misma ya que existe a nivel de clase, no existe por separado para cada instancia.
    private  static WebDriverWait wait;

    static {                                                    //Bloque Estatico para definir variables Estaticas
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);   //Declaro el Objeto Driver de tipo Chromedriver.
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public static void navigateTo(String URL){
        driver.get(URL);
    }


    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        Find(locator).click();
    }

    public void write(String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    public String textForElement(String locator){
        return Find(locator).getText();
    }







    /**
     * -----------------------------------------------------------------------------------------------------
     * 1  -Creo OBJETOS ESTATICOS WebDriver(protected) y WebDriverWait(privat).
     * 2  -En un Bloque Estatico:
     * 2.1   -Creo Objeto chromeOptions
     * 2.2   -Declaro el Objeto Driver como de tipo ChromeDriver y como parametro le paso las chromeOptions.
     * 3  -El Constructor de la Clase BasePage requiere como parametro un objeto driver
     * 3.1   -Igualo el driver que recive el constructor con el de declarado mi clase estatica.
     * 3.2   -Declaro el Objeto wait y como parametro le paso las el driver y los segundos de espera.
     * -----------------------------------------------------------------------------------------------------
     */



}
