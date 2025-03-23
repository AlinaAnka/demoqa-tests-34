package tests;

import pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class PageObjectsTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void pageTest() {
        registrationPage.openPage()
                .setFirstName("Alina")
                .setLastName("Kovrigina")
                .setEmail("alina885@mail.ru")
                .setGender("Female")
                .setUserNumber("1122334455")
                .setDateOfBirth("05", "April", "1905")
                .setSubjects("Math")
                .setHobbies("Sports")
                .setUploadPicture("picture.png")
                .setCurrentAddress("Moscow55")
                .setState("Haryana")
                .setCity("Karnal")
                .submit();


        registrationPage
                .getResultTableComponent()
                .checkResult("Student Name", "Alina Kovrigina")
                .checkResult("Student Email", "lina885@mail.ru")
                .checkResult("Gender", "Female")
                .checkResult("Mobile", "1122334455")
                .checkResult("Date of Birth", "05 April,1905")
                .checkResult("Subjects", "Math")
                .checkResult("Hobbies", "Sports")
                .checkResult("Picture", "picture.png")
                .checkResult("Address", "Moscow55")
                .checkResult("State and City", "Haryana Karnal");

    }

    @Test
    void negativeTest(){

            registrationPage.openPage()
                    .setFirstName("Alina")
                    .setLastName("Kovrigina")
                    .setEmail("alina885@mail")
                    .setGender("Female")
                    .setUserNumber("54321")
                    .submit();

        registrationPage.checkErrorField();

        }

    }




