package pl.qualitycourses.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{
    private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToHomePage(){
        click(By.linkText("home"));
    }

    public void addNewContactPage() {
        click(By.linkText("add new"));
    }

    public void goToGroupPage() {
        click(By.linkText("groups"));
    }
}
