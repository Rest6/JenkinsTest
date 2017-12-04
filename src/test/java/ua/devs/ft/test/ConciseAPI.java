package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class ConciseAPI {

    public abstract WebDriver getWebDriver();


    public void open(String url){
        getWebDriver().get(url);
    }

    public void back(){
        getWebDriver().navigate().back();
    }

    public void assertThat(ExpectedCondition<Boolean> condition){
        (new WebDriverWait(getWebDriver(), 5)).until(condition);
    }

}
