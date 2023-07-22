package ui.config;

import com.github.javafaker.Faker;

public class FakeDataProvider {

   public Faker faker = new Faker();

    public String generateFakeFullName(){
        return faker.name().fullName();
    }
    public String generateFakeFirstName(){
        return faker.name().firstName();
    }
    public String generateFakeLastName(){
        return faker.name().lastName();
    }
    public String generateFakeMobileNumber(){
        return faker.phoneNumber().subscriberNumber().concat(faker.phoneNumber().subscriberNumber())
                .concat(faker.phoneNumber().subscriberNumber());
    }
    public String generateDateOfBirth(){
        return "10Jul1990";
    }
    public String generateFakeSubject(){
        return faker.chuckNorris().fact();
    }


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
        return faker.internet().password(6,10,true,true,true);
    }

}
