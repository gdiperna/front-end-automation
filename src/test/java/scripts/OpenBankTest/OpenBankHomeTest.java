package scripts.OpenBankTest;

import org.junit.jupiter.api.Test;
import pages.OpenBankHomePage;
import scripts.GenericTest;


public class OpenBankHomeTest extends GenericTest<OpenBankHomePage> {

    @Test
    public void shouldNavigateToRegistrationFlow() {
        controller.openHome();
        controller.clickHazteClienteFooter();
        controller.clickQuieroHacermeCliente();
    }

    @Test
    public void shouldAccessPreguntasSection() {
        controller.openHome();
        controller.clickPreguntas();
    }

    @Test
    public void shouldAccessContactanosSection() {
        controller.openHome();
        controller.clickContactamos();
    }

    @Test
    public void shouldAccessCajerosSection() {
        controller.openHome();
        controller.clickCajeros();
    }

    @Test
    public void shouldAccessLoginSection() {
        controller.openHome();
        controller.buttonLogin();
    }
}
