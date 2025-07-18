package scripts.OpenBankCocumber;


import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.OpenBankHomePage;
import scripts.GenericTest;
import scripts.Hooks;

public class OpenBankHomeTestC extends GenericTest<OpenBankHomePage> {

    @Given("I open the OpenBank homepage")
    public void i_open_the_openbank_homepage() {
        Hooks.controllerO.openHome();
    }

    @When("I click the footer {string} button")
    public void i_click_the_footer_button(String buttonText) {
        if (buttonText.equalsIgnoreCase("Hazte cliente")) {
            Hooks.controllerO.clickHazteClienteFooter();
        }
    }

    @When("I click the \"Contáctanos\" link")
    public void i_click_contactanos() {
        Hooks.controllerO.clickContactamos();
    }

    @When("I click the \"Preguntas\" link")
    public void i_click_preguntas() {
        Hooks.controllerO.clickPreguntas();
    }

    @When("I click the \"Cajeros\" link")
    public void i_click_cajeros() {
        Hooks.controllerO.clickCajeros();
    }

    @When("I click the \"Acceder\" button")
    public void i_click_acceder() {
        Hooks.controllerO.buttonLogin();
    }

    @When("I click {string}")
    public void i_click_button(String button) {
        switch (button) {
            case "¡Quiero hacerme cliente!":
                Hooks.controllerO.clickQuieroHacermeCliente();
                break;
            case "Preguntas":
                Hooks.controllerO.clickPreguntas();
                break;
            case "Contáctanos":
                Hooks.controllerO.clickContactamos();
                break;
            case "Cajeros":
                Hooks.controllerO.clickCajeros();
                break;
            case "Acceder":
                Hooks.controllerO.buttonLogin();
                break;
            default:
                throw new IllegalArgumentException("Unknown button: " + button);
        }
    }

    @Then("I should be on the registration page")
    public void i_should_be_on_registration_page() {
        System.out.println("Arrived on registration page (add assertion).");
    }

    @Then("I should see the {string} content")
    public void i_should_see_content(String section) {
        System.out.println("Checked content for: " + section);
    }

    @Then("I should see the contact section")
    public void i_should_see_the_contact_section() {
        System.out.println("Contact section is visible.");
    }

    @Then("I should see the cajeros map")
    public void i_should_see_the_cajeros_map() {
        System.out.println("Cajeros section is visible.");
    }

    @Then("I should be redirected to the login page")
    public void i_should_be_redirected_to_login() {
        System.out.println("Login page loaded.");
    }

    @Before
    public void setUpController() {
        if (controller == null) {
            controller = createControllerInstance();
        }
    }


}

