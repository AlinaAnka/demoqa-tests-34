package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            setGender = $("#genterWrapper"),
            setUserNumber = $("#userNumber"),
            calendarInput = $("#dateOfBirthInput"),
            setSubjects = $("#subjectsInput"),
            setHobbies = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            setState = $("#state"),
            setCity = $("#city"),
            submit = $("#submit");


    Calendar calendar = new Calendar();


    public RegistrationPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public RegistrationPage setGender(String gender) {
        setGender.$(byText(gender)).click();
        return this;
    }

    public RegistrationPage setUserNumber(String userNumber) {
        setUserNumber.setValue(userNumber);
        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        calendarInput.click();
        calendar.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setSubjects(String subjects) {
        setSubjects.setValue(subjects).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies(String hobby) {
        setHobbies.$(byText(hobby)).click();
        return this;
    }

    public RegistrationPage setUploadPicture(String fileName) {
        uploadPicture.uploadFromClasspath(fileName);
        return this;
    }

    public RegistrationPage setCurrentAddress(String address) {
        currentAddress.setValue(address);
        return this;
    }

    public RegistrationPage setState(String state) {
        setState.scrollTo().click();
        $(byText(state)).click();
        return this;
    }

    public RegistrationPage setCity(String city) {
        setCity.click();
        $(byText(city)).click();
        return this;
    }

    public RegistrationPage submit() {
        submit.scrollTo().click();
        return this;
    }

    public RegistrationPage checkResult(String key, String value) {
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(value));
        return this;
    }

    public void checkErrorField() {
        emailInput.shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
        setUserNumber.shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
    }
}
