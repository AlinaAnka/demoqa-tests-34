package pages;

import static com.codeborne.selenide.Selenide.$;

public class Calendar {

    public void setDate(String day, String month, String year){

        $("select.react-datepicker__year-select").selectOption("1905");
        $("select.react-datepicker__month-select").selectOption("April");
        $("div.react-datepicker__day--005").click();


    }
}
