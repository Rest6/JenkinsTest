package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HKJurisdictionPage extends BasePage {
    @FindBy(css = ".common-heading")
    WebElement hkTitle;

    @FindBy(css = ".btn #show-checkout-button")
    WebElement hkCheckout;

    @FindBy(css = "#billing_first_name")
    WebElement hkFormName;

    @FindBy(css = "#billing_last_name")
    WebElement hkFormLastname;

    @FindBy(css = "#billing_company")
    WebElement hkFormCompany;

    @FindBy(css = "#billing_email")
    WebElement hkFormEmail;

    @FindBy(css = "#billing_phone")
    WebElement hkFormPhone;

    @FindBy(css = "#select2-billing_country-container")
    WebElement hkFormDropdown;

    @FindBy(css = ".select2-results__options #select2-billing_country-result-k170-UA")
    WebElement hkFormUK;

    @FindBy(css = "#billing_address_1")
    WebElement hkFormAddress;

    @FindBy(css = "#billing_city")
    WebElement hkFormCity;

    @FindBy(css = "#billing_postcode")
    WebElement hkFormPostal;

    @FindBy(css = "#order_comments")
    WebElement hkFormMessage;

    @FindBy(css = "#wc_checkout_add_ons_19")
    WebElement hkFormCheck1;

    @FindBy(css = "#wc_checkout_add_ons_26")
    WebElement hkFormCheck2;

    @FindBy(css = "#agb_confirm")
    WebElement hkFormTermsCheck;

    @FindBy(css = "#place_order")
    WebElement hkFormSubmit;

    public HKJurisdictionPage(WebDriver driver) {
        super(driver);
    }
}
