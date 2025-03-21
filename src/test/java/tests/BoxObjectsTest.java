package tests;

import org.junit.jupiter.api.Test;
import pages.BoxPage;


public class BoxObjectsTest extends TestBase {

    BoxPage boxPage = new BoxPage();

    @Test
    void objectsTest() {
        boxPage.openPage()
                .setFirstName("Alina")
                .setEmail("alina885@mail.ru")
                .setCurrentAddress("moscow55")
                .setPermanentAddress("piter77")
                .submit();

        boxPage.checkResult("#name", "Alina")
                .checkResult("#email", "alina885@mail.ru")
                .checkResult("#currentAddress", "moscow55")
                .checkResult("#permanentAddress", "piter77");
    }

    }
