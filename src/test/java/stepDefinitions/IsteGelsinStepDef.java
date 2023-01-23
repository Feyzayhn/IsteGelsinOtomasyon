package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.IsteGelsinPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class IsteGelsinStepDef {

    IsteGelsinPage page= new IsteGelsinPage();

    @Given("Kullanici {string} gider")
    public void kullaniciGider(String arg0) {

        getDriver().get(ConfigReader.getProperty("isteGelUrl"));

        try {
            ReusableMethods.waitForVisibility(page.reklamSonrakiButon,3);
            ReusableMethods.jsScrollClick(page.reklamSonrakiButon);
            ReusableMethods.jsScrollClick(page.reklamSonrakiButon);
            ReusableMethods.jsScrollClick(page.reklamTamamButon);
            ReusableMethods.jsScrollClick(page.dahaSonraButon);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Then("Kullanici Giris yap veya Uye ol butonunun gorunur oldugunu dogrular ve butona  tiklar")
    public void kullaniciGirisYapVeyaUyeOlButonununGorunurOldugunuDogrularVeButonaTiklar() {

        assertTrue(page.loginButon.isDisplayed());
        page.loginButon.click();
    }

    @Then("Kullanici hoş geldin ve sms onayi metninin gorunur oldugunu dogrular")
    public void kullaniciHoşGeldinVeSmsOnayiMetnininGorunurOldugunuDogrular() throws IOException {

        page.cerezKapat.click();
        assertTrue(page.hosGeldinText.isDisplayed());
        assertTrue(page.smsOnayText.isDisplayed());
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshotWebElement("SmsOnay",page.smsOnay);

    }

    @Then("Kullanici telefon numarasi alaninin {string} olarak default geldigini dogrular")
    public void kullaniciTelefonNumarasiAlanininOlarakDefaultGeldiginiDogrular(String Kod) throws IOException {

        ReusableMethods.getScreenshotWebElement("Kod+90",page.phoneNumber);
        assertEquals(Kod,page.phoneNumber.getAttribute("value"));
    }

    @Then("Kullanici telefon  numarasini girer ve devam et butonuna tiklar")
    public void kullaniciTelefonNumarasiniGirerVeDevamEtButonunaTiklar() {

        page.phoneNumber.sendKeys(ConfigReader.getProperty("phoneNumber"));
        page.devamEtButon.click();

    }

    @Then("Kullanici otp ekraninin açıldigini dogrular ve otp dogru girilir")
    public void kullaniciOtpEkranininAçıldiginiDogrularVeOtpDogruGirilir() {

        assertTrue(page.dogrulamaKodu.isDisplayed());
        ReusableMethods.waitFor(15);
    }

    @Then("Kullanici alisverise basla butonuna tiklar")
    public void kullaniciAlisveriseBaslaButonunaTiklar() {

        page.alisveriseBasla.click();
    }

    @Then("Kullanici arama kutusuna istedigi bir urun ismini girer")
    public void kullaniciAramaKutusunaIstedigiBirUrunIsminiGirer() {



            page.aramaButonu.sendKeys("Meyveli Soda" );
            ReusableMethods.jsScrollClick(page.aramaclick);


    }

    @Then("Kullanici onerilen siralamalardan fiyati artana gore secenegini secer")
    public void kullaniciOnerilenSiralamalardanFiyatiArtanaGoreSeceneginiSecer() {

        ReusableMethods.jsScrollClick(page.fiyatiArtanUrun);


    }

    @And("Kullanici fiyati en dusuk olan urunu sepete ekler ve sepete ekledigini dogrular")
    public void kullaniciFiyatiEnDusukOlanUrunuSepeteEklerVeSepeteEklediginiDogrular() throws IOException {

         page.arananUrunListesi.get(0).click();
         page.sepetBox.click();
         page.sepeteGitButon.click();
         assertTrue(page.sepet.isDisplayed());
         ReusableMethods.waitFor(2);
         ReusableMethods.getScreenshotWebElement("Sepetteki Urun",page.sepet);
    }



}
