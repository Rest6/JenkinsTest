package ua.devs.ft.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Beta;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.bind.annotation.XmlList;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

public class FTTest {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.firefox.marionette", "home//qa//Downloads//geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    @Test
    public void homePageTest(){

        driver.get("https://www.fiduciaritrust.com");

        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector(".container>h1")),
                        "Expertise et conseil en création de sociétés et comptes Offshore"));

        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector("#french_number")),
                        "01 76 36 21 29"));

        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector("#uk_number")),
                        "+44 20 380 892 23"));

        driver.findElement(By.cssSelector(".btn>a")).click();

        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector(".common-heading")),
                        "Contact"));

        driver.navigate().back();

        driver.findElement(By.cssSelector(".section-1 .btn>a")).click();

        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector(".common-heading")),
                        "Société offshore à Hong Kong"));

        driver.navigate().back();

        driver.findElement(By.cssSelector(".section-1 .block:nth-child(2) .btn>a")).click();

        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector(".common-heading")),
                        "Société offshore en Ecosse"));

        driver.navigate().back();

        driver.findElement(By.cssSelector(".section-1 .block:nth-child(3) .btn>a")).click();

        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector(".common-heading")),
                        "Société offshore en Angleterre"));

        driver.navigate().back();

        driver.findElement(By.cssSelector(".section-1 .block:nth-child(4) .btn>a")).click();

        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector(".common-heading")),
                        "Société offshore aux Seychelles"));

        driver.navigate().back();

        driver.findElement(By.cssSelector(".juridictions-btn>a")).click();

        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector(".common-heading")),
                        "Société offshore"));

        driver.navigate().back();

        driver.findElement(By.cssSelector(".container:nth-child(2) .btn>a")).click();

        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector(".common-heading")),
                        "Société offshore"));

        driver.navigate().back();

        driver.findElement(By.cssSelector(".home-link")).click();
        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector(".common-heading")),
                        "Société offshore"));

        driver.navigate().back();

        driver.findElement(By.cssSelector(".section-3 .block:nth-child(2) .home-link")).click();
        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector(".common-heading")),
                        "Délocalisation de siège social offshore T.U.P."));

        driver.navigate().back();

        driver.findElement(By.linkText("Défiscaliser son bénéfice dans une entreprise")).click();
        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector(".common-heading")),
                        "Comment défiscaliser son bénéfice dans une entreprise"));

        driver.navigate().back();

        driver.findElement(By.linkText("Ouverture de compte bancaire offshore")).click();
        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector(".common-heading")),
                        "Ouvrir un compte bancaire offshore"));

        driver.navigate().back();
        /*
        driver.findElement(By.cssSelector(".pager:nth-child(1)")).click();
        (new WebDriverWait(driver, 4)).until(
                textToBePresentInElement(driver.findElement(By.cssSelector(".slide>p")),
                        "Fiduciari Trust met toute son expertise et ses connaissances à " +
                                "votre service dans le processus d’obtention d’un permis de " +
                                "résidence à Chypre, vous permettant de devenir résident de " +
                                "l’Union Européenne."));

        */
    }
}
