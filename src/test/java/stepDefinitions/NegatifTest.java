package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.IsteGelsinPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class NegatifTest {

    IsteGelsinPage page = new IsteGelsinPage();
    @When("Kullanici gecersiz telefon numarasi girer ve devam et butonuna tiklar")
    public void kullaniciGecersizTelefonNumarasiGirerVeDevamEtButonunaTiklar() {

        page.phoneNumber.sendKeys(Faker.instance().phoneNumber().cellPhone());
        page.devamEtButon.click();

    }

    @Then("Kullanici {string} mesajinin geldigini dogrular")
    public void kullaniciMesajininGeldiginiDogrular(String message) {

        assertEquals(message,page.gecersizPhoneNumberMessage.getText());

    }
}
