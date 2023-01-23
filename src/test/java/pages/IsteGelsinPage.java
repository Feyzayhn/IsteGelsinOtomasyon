package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class IsteGelsinPage {

    public IsteGelsinPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".IGButton_buttonWrapper__2VoRo.IGButton_lg__uXIqA")
    public WebElement reklamSonrakiButon;

    @FindBy(css = ".IGButton_buttonWrapper__2VoRo.IGButton_lg__uXIqA")
    public WebElement reklamTamamButon;
    
    @FindBy(css = ".dn-slide-buttons.horizontal>.dn-slide-deny-btn")
    public WebElement dahaSonraButon;

    @FindBy(css = ".register-title")
    public WebElement loginButon;

    @FindBy(xpath = "//*[.='Hoş Geldin!']")
    public WebElement hosGeldinText;

    @FindBy(css = ".subtitle")
    public WebElement smsOnayText;

    @FindBy(css = ".sms-wrapper")
    public WebElement smsOnay;

    @FindBy(css = ".close-btn")
    public WebElement cerezKapat;
    @FindBy(xpath = "//*[@value='+90 ']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[.='Devam Et']")
    public WebElement devamEtButon;

    @FindBy(css = ".otp-wrapper")
    public WebElement dogrulamaKodu;

    @FindBy(xpath = "//*[.='Alışverişe Başla']")
    public WebElement alisveriseBasla;

    @FindBy(css = ".search-inp")
    public WebElement aramaButonu;

    @FindBy(xpath = "(//*[@class='search-box']/*[@class='icon'])[2]")
    public WebElement aramaclick;

    @FindBy(xpath = "(//*[@class='ig-control-inp']/option)[2]")
    public WebElement fiyatiArtanUrun;

    @FindBy(css = ".DefaultCard_productCard_AddToCart__2WXbA")
    public List<WebElement> arananUrunListesi;

    @FindBy(css = ".basket-box")
    public WebElement sepetBox;

    @FindBy(css = ".go-to-basket-wrapper")
    public WebElement sepeteGitButon;

    @FindBy(css = ".cart-capsul-list")
    public WebElement sepet;

    @FindBy(xpath = "//*[.='Geçersiz telefon numarası.']")
    public WebElement gecersizPhoneNumberMessage;


}
