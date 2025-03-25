package helpers;

import com.github.javafaker.Faker;
import java.util.Locale;

public class FakeHelper {
    Faker faker = new Faker(new Locale("en-GB"));

    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = faker.options().option("Female", "Male", "Other"),
            phoneNumber = faker.phoneNumber().subscriberNumber(10),
            yearOfBirth = String.valueOf(faker.number().numberBetween(1900, 2020)),
            monthOfBirth = faker.options().option("January", "August", "May", "February", "March"),
            dayOfBirth = String.format("%02d", faker.number().numberBetween(1, 29)),
            subject = faker.options().option("Math", "Economics", "English", "History"),
            hobbies = faker.options().option("Sports", "Music", "Reading"),
            picture = "image3.png",
            currentAddress = faker.address().fullAddress(),
            state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan"),
            city = findCityByState(state);

    public String findCityByState(String state) {
        return switch (state) {
            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> "";
        };

    }
}