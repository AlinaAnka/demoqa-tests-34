package components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            setGender = $("label[for='gender-radio-2']"),
            setUserNumber = $("#userNumber"),
            calendarInput = $("#dateOfBirthInput"),
            subjects = $("#subjectsInput"),
            hobbies = $("label[for='hobbies-checkbox-1']"),
            uploadPicture = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            state = $("#react-select-3-input"),
            city = $("#react-select-4-input"),
            submit = $("#submit");


    Calendar calendar = new Calendar();


    public RegistrationPage openPage () {
        open("/automation-practice-form");
        return this;
    }
    public RegistrationPage setFirstName (String value) {
        firstNameInput.setValue(value);
        return this;
    }
    public RegistrationPage setLastName (String value) {
        lastNameInput.setValue(value);
        return this;
    }
    public RegistrationPage setEmail (String value) {
        emailInput.setValue(value);
        return this;
    }
    public RegistrationPage setGender (String value) {
        setGender.click();
        return this;
    }
    public RegistrationPage setUserNumber (String value) {
        setUserNumber.setValue(value);
        return this;
    }
    public RegistrationPage setDateOfBirth (String day, String month, String year) {
        calendarInput.click();
        calendar.setDate(day, month, year);
        return this;
    }
    public RegistrationPage setSubjects (String value) {
        subjects.setValue(value).pressEnter();
        return this;
    }
    public RegistrationPage setHobbies (String value) {
        hobbies.click();
        return this;
    }
    public RegistrationPage setUploadPicture (String fileName) {
        uploadPicture.uploadFromClasspath(fileName);
        return this;
    }
    public RegistrationPage setCurrentAddress (String value) {
        currentAddress.setValue(value);
        return this;
    }
    public RegistrationPage setState (String value) {
        state.setValue(value).pressEnter();
        return this;
    }
    public RegistrationPage setCity (String value) {
        city.setValue(value).pressEnter();
        return this;
    }
    public RegistrationPage setSubmit () {
        submit.click();
        return this;
    }
    public RegistrationPage checkResult(String key, String value) {
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(value));
        return this;
    }

}
