package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverConfiguration;
import utilities.FrontEndOperation;

import java.time.Duration;

public class OpenBankHomePage extends GenericPage {

    private final WebDriver driver = DriverConfiguration.getDriver();
    private final JavascriptExecutor js = (JavascriptExecutor) driver;


    @FindBy(css = ".buttons-area__div-signup")
    private WebElement hazteClienteFooterButton;

    @FindBy(xpath = "//div[@class='new-user-requirements__buttons']//button[contains(text(),'¡Quiero hacerme cliente!')]")
    private WebElement quieroHacermeClienteButton;

    @FindBy(xpath = "//li[@class='ok-public-topbar__item ok-public-topbar__item-link']")
    private WebElement preguntas;

    @FindBy(xpath = "//ul[@class='ok-public-topbar__list']//span[contains(text(),'Cajeros')]")
    private WebElement cajeros;

    @FindBy(xpath = "//div[@class='ok-middle-topbar']//button[@class='mobile-menu-area__mobile-toggle']")
    private WebElement menu;

    @FindBy(xpath = "//ul[@class='ok-public-topbar__list']//span[contains(text(),'Contáctanos')]")
    private WebElement contactamos;

    @FindBy(xpath = "//li[@class='mobile-menu-area-sidebar__list__item mobile-menu-area-sidebar__list__item--with-border']//a[contains(text(),'Contáctanos')]")
    private WebElement contactamosMobile;

    @FindBy(xpath = "//li[@class='mobile-menu-area-sidebar__list__item mobile-menu-area-sidebar__list__item--with-border']//span[contains(text(),'Cuentas')]")
    private WebElement cuentasMobile;

    @FindBy(css = ".buttons-area__div-login")
    private WebElement buttonLogin;

    @FindBy(className = "container-cookie-modal-footer-button")
    private WebElement cookiePrimaryButton;

    @FindBy(className = "container-cookie-modal-settings__footer__all__button")
    private WebElement cookieAcceptAllSettingsButton;

    public OpenBankHomePage() {
        PageFactory.initElements(driver, this);
    }

    public void openHome() {
        driver.get("https://www.openbank.es/");
        FrontEndOperation.waitForPageReady();
        acceptCookies();
    }

    public void acceptCookies() {
        try {
            FrontEndOperation.clickWhenVisible(cookiePrimaryButton);
            FrontEndOperation.clickWhenVisible(cookieAcceptAllSettingsButton);
            FrontEndOperation.waitForPageReady();
        } catch (TimeoutException e) {
            System.out.println("Cookie banner not visibile (timeout).");
        } catch (Exception e) {
            System.out.println("Errore durante gestione cookie: " + e.getMessage());
        }
    }

    public void clickHazteClienteFooter() {
        FrontEndOperation.clickWhenVisible(hazteClienteFooterButton);
        FrontEndOperation.waitForPageReady();
    }

    public void clickQuieroHacermeCliente() {
        FrontEndOperation.clickWhenVisible(quieroHacermeClienteButton);
        FrontEndOperation.waitForPageReady();
    }

    public void clickPreguntas() {
        FrontEndOperation.clickWhenVisible(preguntas);
    }

    public void clickCajeros() {
        FrontEndOperation.clickWhenVisible(cajeros);
    }

    public void clickContactamos() {
        FrontEndOperation.clickWhenVisible(contactamos);
    }

    public void clickMenu() {
        FrontEndOperation.clickWhenVisible(menu);
    }

    public void clickContactamosMobile() {
        FrontEndOperation.clickWhenVisible(contactamosMobile);
    }

    public void clickCuentasMobile() {
        FrontEndOperation.clickWhenVisible(cuentasMobile);
    }

    public void buttonLogin() {
        FrontEndOperation.clickWhenVisible(buttonLogin);
    }
}
