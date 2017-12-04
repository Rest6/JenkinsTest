package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OffshoreServicesPage extends BasePage {

    @FindBy(css = ".common-heading")
    WebElement servicesTitle;

    @FindBy(linkText = "Forex offshore")
    WebElement forexLink;

    @FindBy(css = ".section.divider .btn-block>a")
    WebElement firstContactUsButton;

    @FindBy(linkText = "Secrétariat offshore")
    WebElement secretaryLink;

    @FindBy(linkText = "Immatriculation de bateaux offshore")
    WebElement vasselsLink;

    @FindBy(linkText = "Licence de transport routier")
    WebElement transportLink;

    @FindBy(linkText = "Licence de casino et poker en ligne")
    WebElement casinoLink;

    @FindBy(linkText = "Expatriation fiscale en Lettonie")
    WebElement expatriationLink;

    @FindBy(css = ".section.divider:nth-child(2) .btn-block>a")
    WebElement secondContactUsButton;

    @FindBy(linkText = "Création de site internet")
    WebElement internetLink;

    @FindBy(linkText = "Secretaire personnel")
    WebElement secretaryPersonalLink;

    @FindBy(linkText = "Numero de telephone local")
    WebElement localPhonelLink;

    @FindBy(linkText = "Serveur securise a distance")
    WebElement serverlLink;

    @FindBy(linkText = "Notarisation et apostille")
    WebElement notarisationlLink;

    @FindBy(linkText = "Obtention d’un numéro de TVA")
    WebElement tvaLink;

    @FindBy(linkText = "Directeur nominé")
    WebElement directorLink;

    @FindBy(linkText = "Actionnaire nominé")
    WebElement actionareLink;

    @FindBy(linkText = "Procuration au représentant légal: Power of attorney")
    WebElement powerLink;

    public OffshoreServicesPage(WebDriver driver) {
        super(driver);
    }
}
