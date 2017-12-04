package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JurisdictionsPage extends BasePage {

    @FindBy(css = ".common-heading")
    WebElement jurisdictionsTitle;

    @FindBy(css = ".bottom>ul>li>a")
    WebElement bancaireLink;

    @FindBy(css = ".bottom>ul>li:nth-child(2)>a")
    WebElement accountingLink;

    @FindBy(css = ".bottom>ul>li:nth-child(3)>a")
    WebElement secretaryLink;

    @FindBy(css = ".bottom>ul>li:nth-child(4)>a")
    WebElement transferLink;

    @FindBy(css = ".bottom>ul>li:nth-child(5)>a")
    WebElement rmcLink;

    @FindBy(css = ".bottom>ul>li:nth-child(6)>a")
    WebElement latviaLink;

    @FindBy(css = ".table-juridictions .slide:nth-child(3) .btn>a")
    WebElement hkPlusButton;

    @FindBy(css = ".table-juridictions .btn>a")
    WebElement scotPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(2) .btn>a")
    WebElement ukPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(4) .btn>a")
    WebElement chyprePlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(5) .btn>a")
    WebElement rakPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(6) .btn>a")
    WebElement dubaiPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(7) .btn>a")
    WebElement delawarePlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(8) .btn>a")
    WebElement latviaPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(9) .btn>a")
    WebElement bviPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(10) .btn>a")
    WebElement gibraltarPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(11) .btn>a")
    WebElement belizePlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(12) .btn>a")
    WebElement seychellesPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(13) .btn>a")
    WebElement maltaPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(14) .btn>a")
    WebElement singaporePlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(15) .btn>a")
    WebElement panamaPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(16) .btn>a")
    WebElement dominicaPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(17) .btn>a")
    WebElement lithuaniaPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(18) .btn>a")
    WebElement irlandPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(19) .btn>a")
    WebElement mauritiusPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(20) .btn>a")
    WebElement svPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(21) .btn>a")
    WebElement switzPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(22) .btn>a")
    WebElement estoniaPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(23) .btn>a")
    WebElement polandPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(24) .btn>a")
    WebElement bulgariaPlusButton;

    @FindBy(css = ".table-juridictions .slide:nth-child(25) .btn>a")
    WebElement georgiaPlusButton;

    public JurisdictionsPage(WebDriver driver) {
        super(driver);
    }
}
