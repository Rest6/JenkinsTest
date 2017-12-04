package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends BasePage {

    @FindBy(css = ".common-heading")
    WebElement blogTitle;

    public BlogPage(WebDriver driver) {
        super(driver);
    }
}
