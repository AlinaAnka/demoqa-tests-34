package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BoxPage {

    private SelenideElement
            setFirstName = $("#userName"),
            setEmail = $("#userEmail"),
            setCurrentAddress = $("#currentAddress"),
            setPermanentAddress = $("#permanentAddress"),
            submit = $("#submit");


    public BoxPage openPage() {
        open("/text-box");
        return this;
    }

    public BoxPage setFirstName(String firstName) {
        setFirstName.setValue(firstName);
        return this;
    }

    public BoxPage setEmail(String email) {
        setEmail.setValue(email);
        return this;
    }

    public BoxPage setCurrentAddress(String currentAddress) {
        setCurrentAddress.setValue(currentAddress);
        return this;
    }

    public BoxPage setPermanentAddress(String permanentAddress) {
        setPermanentAddress.setValue(permanentAddress);
        return this;
    }

    public void submit() {
        submit.click();

    }

    public BoxPage checkResult(String key, String value) {
        $(".border").shouldHave(text(value));
        return this;
    }
}

