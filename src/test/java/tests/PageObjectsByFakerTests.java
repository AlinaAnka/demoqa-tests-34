package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import helpers.FakeHelper;

public class PageObjectsByFakerTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void pageTest() {

        FakeHelper fakeHelper = new FakeHelper();

        String firstName = fakeHelper.firstName;
        String lastName = fakeHelper.lastName;
        String email = fakeHelper.email;
        String gender = fakeHelper.gender;
        String phoneNumber = fakeHelper.phoneNumber;
        String dayOfBirth = fakeHelper.dayOfBirth;
        String monthOfBirth = fakeHelper.monthOfBirth;
        String yearOfBirth = fakeHelper.yearOfBirth;
        String subject = fakeHelper.subject;
        String hobbies = fakeHelper.hobbies;
        String picture = fakeHelper.picture;
        String currentAddress = fakeHelper.currentAddress;
        String state = fakeHelper.state;
        String city = fakeHelper.city;


        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setUserNumber(phoneNumber)
                .setDateOfBirth(dayOfBirth,monthOfBirth,yearOfBirth)
                .setSubjects(subject)
                .setHobbies(hobbies)
                .setUploadPicture(picture)
                .setCurrentAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .submit();


        registrationPage
                .getResultTableComponent()
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", email)
                .checkResult("Gender", gender)
                .checkResult("Mobile", phoneNumber)
                .checkResult("Date of Birth", dayOfBirth + " " + monthOfBirth + "," + yearOfBirth)
                .checkResult("Subjects", subject)
                .checkResult("Hobbies", hobbies)
                .checkResult("Picture", picture)
                .checkResult("Address", currentAddress)
                .checkResult("State and City", state + " " + city);

    }

}




