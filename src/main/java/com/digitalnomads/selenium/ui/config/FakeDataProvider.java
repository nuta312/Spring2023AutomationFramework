package com.digitalnomads.selenium.ui.config;

import com.digitalnomads.selenium.ui.models.Student;
import com.github.javafaker.Faker;

import java.util.List;

public class FakeDataProvider {

    Faker faker = new Faker();

    public String generateFakeFullName(){
        return faker.name().fullName();
    }
    public String generateFakeFirstName(){return faker.name().firstName();}
    public String generateFakeLastName(){return faker.name().lastName();}
    public String generateFakeMobile(){return faker.number().digits(10);}
    public String generateFakeDateOfBirth(){return faker.date().birthday().toString();}

    public String generateFakeEmail(){
        return faker.internet().emailAddress();
    }

    public String generateFakeCurrentAddress(){
        return faker.address().fullAddress();
    }
    public String generateFakePermanentAddress(){
        return faker.address().secondaryAddress();
    }
    public String generateFakePassword(){
        return faker.internet().password(8,20);
    }

    public Student generateStudentsForm(){
       return  Student.builder()
                .firstName(generateFakeFirstName())
                .lastName(generateFakeLastName())
                .userEmail(generateFakeEmail())
                .gender("Female")
                .mobileNumber(generateFakeMobile())
                .dateOfBirth("06/11/1999")
                .subjects(List.of("Maths", "Arts", "Biology"))
                .hobbies(List.of("Sports"))
                .picturePath("C:\\Users\\Lenovo\\Desktop\\pozitivnye_kartinki_2.jpg")
                .currentAddress(generateFakeCurrentAddress())
                .state("NCR")
                .city("Delhi")
                .build();

    }


}
