package helpers;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class FakeHelper {
    Faker faker = new Faker(new Locale("en-GB"));

    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = faker.options().option("Female", "Male", "Other"),
            phoneNumber = faker.phoneNumber().subscriberNumber(10),
            yearOfBirth = String.valueOf(faker.number().numberBetween(1900, 2020)),
            monthOfBirth = faker.options().option("January","August", "May", "February", "March"),
            dayOfBirth = String.format("%02d", faker.number().numberBetween(1, 29)),
            subject = faker.options().option("Math", "Economics", "English", "History"),
            hobbies = faker.options().option("Sports", "Music", "Reading"),
            picture = "image3.png",
            currentAddress = faker.address().fullAddress(),
            state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan"),
            city =  faker.options().option(CityHelper.stateCitiesMap.get(state));

    public static class CityHelper {
        private static final Map<String, String[]> stateCitiesMap = new HashMap<>();

        static {
            stateCitiesMap.put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
            stateCitiesMap.put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
            stateCitiesMap.put("Haryana", new String[]{"Karnal", "Panipat"});
            stateCitiesMap.put("Rajasthan", new String[]{"Jaipur", "Jaiselmer"});
        }
    }
}