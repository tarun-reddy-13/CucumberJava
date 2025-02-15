package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage_PF {

    private WebDriver driver;

    @FindBy(id="react-burger-menu-btn")
    WebElement menu;

    @FindBy(id="logout_sidebar_link")
    WebElement btn_logout;

    public HomePage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }
    public boolean checkLogOutIsDisplayed() throws InterruptedException {
        menu.click();
        Thread.sleep(1000);
        return btn_logout.isDisplayed();
    }

    public void clickLogout(){
        menu.click();
        btn_logout.click();
    }
}
