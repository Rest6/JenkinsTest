package ua.devs.ft.test;

import org.junit.AfterClass;
import org.junit.Assert;
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

import static org.hamcrest.CoreMatchers.containsString;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

public class FTTest extends BaseTest{

    @Test
    public void homePageTest() throws InterruptedException {

        open("https://www.fiduciaritrust.com");

        assertThat(textToBePresentInElement(home.mainTitle,
                "Expertise et conseil en création de sociétés et comptes Offshore"));

        assertThat(textToBePresentInElement(home.frenchPhone,
                "01 76 36 21 29"));

        assertThat(textToBePresentInElement(home.englishPhone,
                "+44 20 380 892 23"));

        home.contactUsButton.click();
        assertThat(textToBePresentInElement(contact.contactTitle,
                "Contact"));
        back();

        home.hkButton.click();
        assertThat(textToBePresentInElement(hk.hkTitle,
                "Société offshore à Hong Kong"));

        back();

        home.scotlandButton.click();
        assertThat(textToBePresentInElement(scotland.scotlandTitle,
                "Société offshore en Ecosse"));

        back();

        home.ukButton.click();
        assertThat(textToBePresentInElement(uk.ukitle,
                "Société offshore en Angleterre"));

        back();

        home.seychellesButton.click();
        assertThat(textToBePresentInElement(seychelles.seychellesTitle,
                "Société offshore aux Seychelles"));

        back();

        home.jurisdictionButton.click();
        assertThat(textToBePresentInElement(jur.jurisdictionsTitle,
                "Société offshore"));

        back();

        home.secondJurisdictionButton.click();
        assertThat(textToBePresentInElement(jur.jurisdictionsTitle,
                "Société offshore"));

        back();

        home.jurisdictionLink.click();
        assertThat(textToBePresentInElement(jur.jurisdictionsTitle,
                "Société offshore"));

        back();

        home.fullTransferLink.click();
        assertThat(textToBePresentInElement(transfer.transferTitle,
                "Délocalisation de siège social offshore T.U.P."));

        back();

        home.taxLink.click();
        assertThat(textToBePresentInElement(tax.taxTitle,
                "Comment défiscaliser son bénéfice dans une entreprise"));

        back();

        home.bankLink.click();
        assertThat(textToBePresentInElement(bank.bankTitle,
                "Ouvrir un compte bancaire offshore"));

        back();

        home.foundsButton.click();
        assertThat(textToBePresentInElement(home.foundsText,
                "Vous souhaitez mettre en place un fond d’investissement ? " +
                        "Contactez-nous pour recevoir les informations complètes à ce sujet."));

        (new WebDriverWait(driver, 4).until(elementToBeClickable(driver.findElement(By.xpath("//section/div[2]/div[6]/div/a[1]/span/span/h2"))))).click();

        assertThat(textToBePresentInElement(home.registrationText,
                "Pour limiter les frais et faciliter l’usage d’un bateau, Fiduciari " +
                        "Trust offre son expertise unique dans le domaine d’enregistrement de " +
                        "bateaux et yachts, internationalement."));

        home.learnMoreButton.click();
        assertThat(textToBePresentInElement(services.servicesTitle,
                "Nos prestations offshore"));

    }

    @Test
    public void footerSection(){
        open("https://www.fiduciaritrust.com");

        home.servicesLink.click();
        assertThat(textToBePresentInElement(services.servicesTitle,
                "Nos prestations offshore"));

        home.contactLink.click();
        assertThat(textToBePresentInElement(contact.contactTitle,
                "Contact"));

        home.faqLink.click();
        assertThat(textToBePresentInElement(faq.faqTitle,
                "FAQ – Question fréquentes"));

        home.blogLink.click();
        assertThat(textToBePresentInElement(blog.blogTitle,
                "Blog"));

    }

    @Test
    public void jurisdictionPageTest(){
        open("https://www.fiduciaritrust.com");

        home.jurisdictionsTab.click();
        assertThat(textToBePresentInElement(jur.jurisdictionsTitle,
                "Société offshore"));

        jur.bancaireLink.click();
        assertThat(textToBePresentInElement(bank.bankTitle,
                "Ouvrir un compte bancaire offshore"));

        back();

        jur.accountingLink.click();
        assertThat(textToBePresentInElement(account.accountingTitle,
                "Comptabilité offshore"));
        back();

        jur.secretaryLink.click();
        assertThat(textToBePresentInElement(secretary.secretaryTitle,
                "Secrétariat offshore"));

        back();

        jur.transferLink.click();
        assertThat(textToBePresentInElement(transfer.transferTitle,
                "Délocalisation de siège social offshore T.U.P."));

        back();

        jur.rmcLink.click();
        assertThat(textToBePresentInElement(rmc.rmcTitle,
                "Achat d’une ready made / shelf company"));

        back();

        jur.latviaLink.click();
        assertThat(textToBePresentInElement(permit.permitTitle,
                "Titre de séjour européen en Lettonie"));

        back();

        home.learnMoreButton.click();
        assertThat(textToBePresentInElement(services.servicesTitle,
                "Nos prestations offshore"));
    }

    @Test
    public void hkPageTest() throws InterruptedException {
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.hkPlusButton.click();
        assertThat(textToBePresentInElement(hk.hkTitle,
                "Société offshore à Hong Kong"));

        Thread.sleep(1000);
        hk.hkCheckout.click();
        Thread.sleep(1000);
        hk.hkFormName.sendKeys("Test");
        hk.hkFormLastname.sendKeys("Test");
        hk.hkFormCompany.sendKeys("test");
        hk.hkFormEmail.sendKeys("grey.fox@devua.net");
        hk.hkFormPhone.sendKeys("380981556858");
        //hk.hkFormDropdown.click();
        //hk.hkFormUK.click();
        hk.hkFormAddress.sendKeys("Test, 11 test");
        hk.hkFormCity.sendKeys("Test");
        Thread.sleep(1000);
        hk.hkFormPostal.sendKeys("5656");
        Thread.sleep(1000);
        hk.hkFormMessage.sendKeys("test, test! test.");
        Thread.sleep(1000);
        hk.hkFormCheck1.click();
        Thread.sleep(1000);
        hk.hkFormCheck2.click();
        Thread.sleep(1000);
        hk.hkFormTermsCheck.click();
        Thread.sleep(1000);
        hk.hkFormSubmit.click();
        Thread.sleep(3000);
        assertThat(textToBePresentInElement(paypall.PayPallTitle,
                "Pay with PayPal"));
    }

    @Test
    public void scotlandPageTest(){

        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.scotPlusButton.click();
        assertThat(textToBePresentInElement(scotland.scotlandTitle,
                "Société offshore en Ecosse"));

        scotland.scotCheckout.click();
        assertThat(textToBePresentInElement(scotland.ammount,
                "2.200"));
    }

    @Test
    public void ukPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.ukPlusButton.click();
        assertThat(textToBePresentInElement(uk.ukitle,
                "Société offshore en Angleterre"));

        uk.Checkout.click();
        assertThat(textToBePresentInElement(uk.ammount,
                "1.500"));
    }

    @Test
    public void chyprePageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.chyprePlusButton.click();
        assertThat(textToBePresentInElement(cyprus.cyprusTitle,
                "Société offshore à Chypre"));

        cyprus.Checkout.click();
        assertThat(textToBePresentInElement(cyprus.ammount,
                "2.500"));
    }

    @Test
    public void rakPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.rakPlusButton.click();
        assertThat(textToBePresentInElement(rak.rakTitle,
                "Société offshore à Ras Al Khaïmah"));

        rak.Checkout.click();
        assertThat(textToBePresentInElement(rak.ammount,
                "2.400"));
    }

    @Test
    public void dubailPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.dubaiPlusButton.click();
        assertThat(textToBePresentInElement(dubai.dubaiTitle,
                "Société offshore à Dubaï"));

        dubai.Checkout.click();
        assertThat(textToBePresentInElement(dubai.ammount,
                "9.780"));
    }

    @Test
    public void delawarePageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.delawarePlusButton.click();
        assertThat(textToBePresentInElement(delaware.delawareTitle,
                "Société offshore au Delaware"));

        dubai.Checkout.click();
        assertThat(textToBePresentInElement(delaware.ammount,
                "2.350"));
    }

    @Test
    public void latviaPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.latviaPlusButton.click();
        assertThat(textToBePresentInElement(latvia.latviaTitle,
                "Société offshore en Lettonie"));

        dubai.Checkout.click();
        assertThat(textToBePresentInElement(latvia.ammount,
                "3.900"));
    }

    @Test
    public void bviPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.bviPlusButton.click();
        assertThat(textToBePresentInElement(bvi.bviTitle,
                "Société offshore aux BVI"));

        bvi.Checkout.click();
        assertThat(textToBePresentInElement(bvi.ammount,
                "2.500"));
    }

    @Test
    public void gibraltarPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.gibraltarPlusButton.click();
        assertThat(textToBePresentInElement(gibraltar.gibTitle,
                "Société offshore à Gibraltar"));

        gibraltar.Checkout.click();
        assertThat(textToBePresentInElement(gibraltar.ammount,
                "2.100"));
    }


    @Test
    public void belizePageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.belizePlusButton.click();
        assertThat(textToBePresentInElement(belize.belizeTitle,
                "Société offshore au Belize"));

        belize.Checkout.click();
        assertThat(textToBePresentInElement(belize.ammount,
                "1.690"));
    }

    @Test
    public void seychellesPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.seychellesPlusButton.click();
        assertThat(textToBePresentInElement(seychelles.seychellesTitle,
                "Société offshore aux Seychelles"));

        seychelles.Checkout.click();
        assertThat(textToBePresentInElement(seychelles.ammount,
                "750"));
    }

    @Test
    public void maltaPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.maltaPlusButton.click();
        assertThat(textToBePresentInElement(malta.maltaTitle,
                "Société offshore à Malte"));

        malta.Checkout.click();
        assertThat(textToBePresentInElement(malta.ammount,
                "5.000"));
    }


    @Test
    public void singaporePageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.singaporePlusButton.click();
        assertThat(textToBePresentInElement(singapore.singaporeTitle,
                "Société offshore à Singapour"));

        singapore.Checkout.click();
        assertThat(textToBePresentInElement(singapore.ammount,
                "6.000"));
    }

    @Test
    public void panamaPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.panamaPlusButton.click();
        assertThat(textToBePresentInElement(panama.panamaTitle,
                "Société offshore au Panama"));

        panama.Checkout.click();
        assertThat(textToBePresentInElement(panama.ammount,
                "2.690"));
    }

    @Test
    public void dominicaPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.dominicaPlusButton.click();
        assertThat(textToBePresentInElement(dominica.dominicaTitle,
                "Société offshore à La Dominique"));

        dominica.Checkout.click();
        assertThat(textToBePresentInElement(dominica.ammount,
                "2.000"));
    }

    @Test
    public void lithuaniaPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        //here you must test brochure

        jur.lithuaniaPlusButton.click();
        assertThat(textToBePresentInElement(lithuania.lithuaniaTitle,
                "Société offshore en Lituanie"));

        lithuania.Checkout.click();
        assertThat(textToBePresentInElement(lithuania.ammount,
                "3.900"));
    }
    @Test
    public void irlandPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.irlandPlusButton.click();
        assertThat(textToBePresentInElement(irland.irlandTitle,
                "Société offshore en Irlande"));

        irland.Checkout.click();
        assertThat(textToBePresentInElement(irland.ammount,
                "4.000"));
    }


    @Test
    public void mauritiusPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.mauritiusPlusButton.click();
        assertThat(textToBePresentInElement(mauritius.mauritiusTitle,
                "Société offshore à Maurice"));

        mauritius.Checkout.click();
        assertThat(textToBePresentInElement(mauritius.ammount,
                "1.390"));
    }

    @Test
    public void svPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.svPlusButton.click();
        assertThat(textToBePresentInElement(sv.svTitle,
                "Société offshore à Saint Vincent et les Grenadines"));

        sv.Checkout.click();
        assertThat(textToBePresentInElement(sv.ammount,
                "750"));
    }

    @Test
    public void switzPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.switzPlusButton.click();
        assertThat(textToBePresentInElement(switz.switzTitle,
                "Société offshore à Suisse"));

        switz.Checkout.click();
        assertThat(textToBePresentInElement(switz.ammount,
                "4.950"));
    }

    @Test
    public void estoniaPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.estoniaPlusButton.click();
        assertThat(textToBePresentInElement(estonia.estoniaTitle,
                "Société offshore Estonie"));

        estonia.Checkout.click();
        assertThat(textToBePresentInElement(estonia.ammount,
                "3.200"));
    }

    @Test
    public void polandPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.polandPlusButton.click();
        assertThat(textToBePresentInElement(poland.polandTitle,
                "Société offshore la Pologne"));

        poland.Checkout.click();
        assertThat(textToBePresentInElement(poland.ammount,
                "4.600"));
    }

    @Test
    public void bulgariaPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.bulgariaPlusButton.click();
        assertThat(textToBePresentInElement(bulgaria.bulgariaTitle,
                "Société offshore en Bulgarie"));

        bulgaria.Checkout.click();
        assertThat(textToBePresentInElement(bulgaria.ammount,
                "5.500"));
    }

    @Test
    public void georgiaPageTest(){
        open("https://www.fiduciaritrust.com/creation-societe-offshore/");

        jur.georgiaPlusButton.click();
        assertThat(textToBePresentInElement(georgia.georgiaTitle,
                "Société offshore en Géorgie"));

        georgia.Checkout.click();
        assertThat(textToBePresentInElement(georgia.ammount,
                "6.000"));
    }

    @Test
    public void bankPageTest(){
        open("https://www.fiduciaritrust.com/");

        home.bankTab.click();
        assertThat(textToBePresentInElement(bank.bankTitle,
                "Ouvrir un compte bancaire offshore"));

        bank.PresentationsLink.click();
        assertThat(textToBePresentInElement(services.servicesTitle,
                "Nos prestations offshore"));

        back();

        bank.faqLink.click();
        assertThat(textToBePresentInElement(faq.faqTitle,
                "FAQ – Question fréquentes"));

        back();

        bank.ukLink.click();
        assertThat(textToBePresentInElement(uk.ukitle,
                "Société offshore en Angleterre"));

        back();

        bank.hkLink.click();
        assertThat(textToBePresentInElement(hk.hkTitle,
                "Société offshore à Hong Kong"));

        back();

        bank.scotlandLink.click();
        assertThat(textToBePresentInElement(scotland.scotlandTitle,
                "Société offshore en Ecosse"));

    }

    @Test
    public void personalAccountTest(){
        open("https://www.fiduciaritrust.com/compte-bancaire-offshore/");

        bank.currentLink.click();
        assertThat(textToBePresentInElement(current.currentTitle,
                "Compte bancaire offshore personnel"));

        current.Checkout.click();
        assertThat(textToBePresentInElement(current.ammount,
                "750"));

        back();

        bank.depositLink.click();
        assertThat(textToBePresentInElement(deposit.depositTitle,
                "Compte à terme offshore"));


        deposit.personalLink.click();
        assertThat(textToBePresentInElement(current.currentTitle,
                "Compte bancaire offshore personnel"));

        back();

        deposit.corporateLink.click();
        assertThat(textToBePresentInElement(corporate.corporateTitle,
                "Compte bancaire de société"));

        corporate.Checkout.click();
        assertThat(textToBePresentInElement(corporate.ammount,
                "1.000"));

        corporate.close.click();

        back();

        deposit.banksLink.click();
        assertThat(textToBePresentInElement(ourBanks.ourBanksTitle,
                "Nos banques offshore"));

        back();

        deposit.faq.click();
        assertThat(textToBePresentInElement(faq.faqTitle,
                "FAQ – Question fréquentes"));

    }

    @Test
    public void accountOpeningTest(){
        open("https://www.fiduciaritrust.com/compte-bancaire-offshore/");

        bank.corporateLink.click();
        assertThat(textToBePresentInElement(corporate.corporateTitle,
                "Compte bancaire de société"));

        back();

        bank.eCommerceLink.click();
        assertThat(textToBePresentInElement(ecommerce.ecommerceTitle,
                "E-commerce offshore: contrat VAD"));

        ecommerce.corporateLink.click();
        assertThat(textToBePresentInElement(corporate.corporateTitle,
                "Compte bancaire de société"));

        back();

        ecommerce.cardsLink.click();
        assertThat(textToBePresentInElement(cards.cardsTitle,
                "Cartes bancaires offshore"));

        back();

        ecommerce.anonCardLink.click();
        assertThat(textToBePresentInElement(anon.anonymousTitle,
                "Carte bancaire anonyme offshore"));

        back();

        ecommerce.banksLink.click();
        assertThat(textToBePresentInElement(ourBanks.ourBanksTitle,
                "Nos banques offshore"));
    }

    @Test
    public void creditCardTest(){
        open("https://www.fiduciaritrust.com/compte-bancaire-offshore/");

        bank.visaLink.click();
        assertThat(textToBePresentInElement(cards.cardsTitle,
                "Cartes bancaires offshore"));

        back();

        bank.anonymousLink.click();
        assertThat(textToBePresentInElement(anon.anonymousTitle,
                "Carte bancaire anonyme offshore"));
    }

    @Test
    public void ourBanksTest(){
        open("https://www.fiduciaritrust.com/compte-bancaire-offshore/");

        bank.ourBanksLink.click();
        assertThat(textToBePresentInElement(ourBanks.ourBanksTitle,
                "Nos banques offshore"));

        ourBanks.PresentationsLink.click();
        assertThat(textToBePresentInElement(services.servicesTitle,
                "Nos prestations offshore"));

        back();

        ourBanks.faqLink.click();
        assertThat(textToBePresentInElement(faq.faqTitle,
                "FAQ – Question fréquentes"));

        back();

        ourBanks.ukLink.click();
        assertThat(textToBePresentInElement(uk.ukitle,
                "Société offshore en Angleterre"));

        back();

        ourBanks.hkLink.click();
        assertThat(textToBePresentInElement(hk.hkTitle,
                "Société offshore à Hong Kong"));

        back();

        ourBanks.scotlandLink.click();
        assertThat(textToBePresentInElement(scotland.scotlandTitle,
                "Société offshore en Ecosse"));
    }

    @Test
    public void presentationsPageTest(){
        open("https://www.fiduciaritrust.com/");

        home.presentationsTab.click();
        assertThat(textToBePresentInElement(services.servicesTitle,
                "Nos prestations offshore"));


        services.forexLink.click();
        assertThat(textToBePresentInElement(forex.forexTitle,
                "Trading FOREX offshore"));

        back();

        services.firstContactUsButton.click();
        assertThat(textToBePresentInElement(contact.contactTitle,
                "Contact"));

        back();

        services.secretaryLink.click();
        assertThat(textToBePresentInElement(secretary.secretaryTitle,
                "Secrétariat offshore"));

        back();

        services.vasselsLink.click();
        assertThat(textToBePresentInElement(vassels.vasselsTitle,
                "Immatriculation de bateaux offshore"));

        back();

        services.transportLink.click();
        assertThat(textToBePresentInElement(transport.transportTitle,
                "Licence de transport routier"));

        back();

        services.casinoLink.click();
        assertThat(textToBePresentInElement(casino.casinoTitle,
                "Licence de casino et poker en ligne"));

        back();

        services.expatriationLink.click();
        assertThat(textToBePresentInElement(exp.expatriationTitle,
                "Expatriation fiscale en Lettonie"));

        back();

        services.secondContactUsButton.click();
        assertThat(textToBePresentInElement(contact.contactTitle,
                "Contact"));
    }

    @Test
    public void secretaryOffshorePageTest(){
        open("https://www.fiduciaritrust.com/prestations-offshore/");

        services.secretaryLink.click();
        assertThat(textToBePresentInElement(secretary.secretaryTitle,
                "Secrétariat offshore"));

        secretary.Checkout.click();
        assertThat(textToBePresentInElement(secretary.ammount,
                 "40"));
    }

    @Test
    public void internetPageTest(){
        open("https://www.fiduciaritrust.com/prestations-offshore/");

        services.internetLink.click();
        assertThat(textToBePresentInElement(internet.internetTitle,
                "Création de votre site internet"));

        internet.Checkout.click();
        assertThat(textToBePresentInElement(internet.ammount,
                "350"));
    }

    @Test
    public void secretaryPersonalPageTest(){
        open("https://www.fiduciaritrust.com/prestations-offshore/");

        services.secretaryPersonalLink.click();
        assertThat(textToBePresentInElement(secretPersonal.personalTitle,
                "Secretaire personnelle"));

        secretPersonal.Checkout.click();
        assertThat(textToBePresentInElement(secretPersonal.ammount,
                "140"));
    }

    @Test
    public void phoneLocalPageTest(){
        open("https://www.fiduciaritrust.com/prestations-offshore/");

        services.localPhonelLink.click();
        assertThat(textToBePresentInElement(localPhone.localPhoneTitle,
                "Numero de telephone local"));

        localPhone.Checkout.click();
        assertThat(textToBePresentInElement(localPhone.ammount,
                "960"));
    }


    @Test
    public void secureServer(){
        open("https://www.fiduciaritrust.com/prestations-offshore/");

        services.serverlLink.click();
        assertThat(textToBePresentInElement(secure.secureTitle,
                "Serveur securise a distance"));

        secure.Checkout.click();
        assertThat(textToBePresentInElement(secure.ammount,
                "400"));

    }

    @Test
    public void notarisationPageTest(){
        open("https://www.fiduciaritrust.com/prestations-offshore/");

        services.notarisationlLink.click();
        assertThat(textToBePresentInElement(notarization.notarizationTitle,
                "Notarisation et apostille"));

        notarization.Checkout.click();
        assertThat(textToBePresentInElement(notarization.ammount,
                "250"));
    }


    @Test
    public void tvaPageTest(){
        open("https://www.fiduciaritrust.com/prestations-offshore/");

        services.tvaLink.click();
        assertThat(textToBePresentInElement(tva.tvaTitle,
                "Obtention d’un numéro de TVA"));

        tva.Checkout.click();
        assertThat(textToBePresentInElement(tva.ammount,
                "500"));
    }

    @Test
    public void directorPageTest(){
        open("https://www.fiduciaritrust.com/prestations-offshore/");

        services.directorLink.click();

        assertThat(textToBePresentInElement(director.directorTitle,
                "Directeur nominé"));

        director.Checkout.click();
        assertThat(textToBePresentInElement(director.ammount,
                "350"));
    }

    @Test
    public void actionarePageTest(){
        open("https://www.fiduciaritrust.com/prestations-offshore/");

        services.actionareLink.click();

        assertThat(textToBePresentInElement(actionare.actionareTitle,
                "Actionnaire nominé"));

        actionare.Checkout.click();
        assertThat(textToBePresentInElement(actionare.ammount,
                "350"));
    }

    @Test
    public void powerOfAttorneyPageTest(){
        open("https://www.fiduciaritrust.com/prestations-offshore/");

        services.powerLink.click();

        assertThat(textToBePresentInElement(poa.powerTitle,
                "Procuration au représentant légal: Power of attorney"));

        poa.Checkout.click();
        assertThat(textToBePresentInElement(poa.ammount,
                "120"));
    }

    @Test
    public void faqPageTest(){
        open("https://www.fiduciaritrust.com/");

        home.faqTab.click();
        assertThat(textToBePresentInElement(faq.faqTitle,
                "FAQ – Question fréquentes"));

    }

    @Test
    public void fiduciariPageTest(){
        open("https://www.fiduciaritrust.com/");

        home.fiduciariTab.click();
        assertThat(textToBePresentInElement(fiduciari.fiduciariTitle,
                "À propos de Fiduciari Trust"));
    }

    @Test
    public void contactPageTest() {
        open("https://www.fiduciaritrust.com/");

        home.contactTab.click();
        assertThat(textToBePresentInElement(contact.contactTitle,
                "Contact"));

        contact.name.sendKeys("Test");
        contact.email.sendKeys("grey.fox@devsua.net");
        contact.phone.sendKeys("981556858");
        contact.message.sendKeys("Test, test!, test.");

        contact.submit.click();
        assertThat(textToBePresentInElement(contact.successMessage,
                "Votre message a bien été envoyé. Merci."));

    }


    HomePage home = new HomePage(driver);
    ContactPage contact = new ContactPage(driver);
    HKJurisdictionPage hk = new HKJurisdictionPage(driver);
    ScotlandJurisdictionPage scotland = new ScotlandJurisdictionPage(driver);
    UKJurisdictionPage uk = new UKJurisdictionPage(driver);
    SeychellesJurisdictionPage seychelles = new SeychellesJurisdictionPage(driver);
    JurisdictionsPage jur = new JurisdictionsPage(driver);
    FullTransferPage transfer = new FullTransferPage(driver);
    TaxPage tax = new TaxPage(driver);
    BankAccountPage bank = new BankAccountPage(driver);
    OffshoreServicesPage services = new OffshoreServicesPage(driver);
    FAQPage  faq = new FAQPage(driver);
    BlogPage blog = new BlogPage(driver);
    AccountingPage account = new AccountingPage(driver);
    SecrataryPage secretary = new SecrataryPage(driver);
    RMCPage rmc = new RMCPage(driver);
    LatviaPermitPage permit = new LatviaPermitPage(driver);
    PayPallPage paypall = new PayPallPage(driver);
    CyprusJurisdictionPage cyprus = new CyprusJurisdictionPage(driver);
    RAKJurisdictionPage rak = new RAKJurisdictionPage(driver);
    DubaiJurisdictionPage dubai = new DubaiJurisdictionPage(driver);
    DelawareJurisdictionPage delaware = new DelawareJurisdictionPage(driver);
    LatviaJurisdictionPage latvia = new LatviaJurisdictionPage(driver);
    BVIJurisdictionPage bvi = new BVIJurisdictionPage(driver);
    GibraltarJurisdictionPage gibraltar = new GibraltarJurisdictionPage(driver);
    BelizeJurisdictionPage belize = new BelizeJurisdictionPage(driver);
    MaltaJurisdictionPage malta = new MaltaJurisdictionPage(driver);
    SingaporeJurisdictionPage singapore = new SingaporeJurisdictionPage(driver);
    PanamaJurisdictionPage panama = new PanamaJurisdictionPage(driver);
    DominicaJurisdictionPage dominica = new DominicaJurisdictionPage(driver);
    LithuaniaJurisdictionPage lithuania = new LithuaniaJurisdictionPage(driver);
    IrlandJurisdictionPage irland = new IrlandJurisdictionPage(driver);
    MauritiusJurisdictionPage mauritius = new MauritiusJurisdictionPage(driver);
    SVJurisdictionPage sv = new SVJurisdictionPage(driver);
    SwitzJurisdictionPage switz = new SwitzJurisdictionPage(driver);
    EstoniaJurisdictionPage estonia = new EstoniaJurisdictionPage(driver);
    PolandJurisdictionPage poland = new PolandJurisdictionPage(driver);
    BulgariaJurisdictionPage bulgaria = new BulgariaJurisdictionPage(driver);
    GeorgiaJurisdictionPage georgia = new GeorgiaJurisdictionPage(driver);
    CurrentAccountPage current = new CurrentAccountPage(driver);
    DepositPage deposit = new DepositPage(driver);
    CorporateBankPage corporate = new CorporateBankPage(driver);
    OurBanksPage ourBanks = new OurBanksPage(driver);
    AccountOpeningPage opening = new AccountOpeningPage(driver);
    EcommersPage ecommerce = new EcommersPage(driver);
    BankCardsPage cards = new BankCardsPage(driver);
    AnonymousCardPage anon = new AnonymousCardPage(driver);
    ForexPage forex = new ForexPage(driver);
    VasselsPage vassels = new VasselsPage(driver);
    TransportPage transport = new TransportPage(driver);
    CasinoPage casino = new CasinoPage(driver);
    ExpatriationLatviaPage exp = new ExpatriationLatviaPage(driver);
    InternetPage internet = new InternetPage(driver);
    SecretaryPersonalPage secretPersonal = new SecretaryPersonalPage(driver);
    LocalPhonePage localPhone = new LocalPhonePage(driver);
    SecureServerPage secure = new SecureServerPage(driver);
    NotarisationPage notarization = new NotarisationPage(driver);
    TVAPage tva = new TVAPage(driver);
    DirectorPage director = new DirectorPage(driver);
    ActionarePage actionare = new ActionarePage(driver);
    PowerOfAttorneyPage poa = new PowerOfAttorneyPage(driver);
    FiduciariPage fiduciari = new FiduciariPage(driver);
}
