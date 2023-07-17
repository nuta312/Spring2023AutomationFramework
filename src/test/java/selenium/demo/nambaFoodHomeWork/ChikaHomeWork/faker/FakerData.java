package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.faker;

import com.github.javafaker.Faker;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.user.User;


public class FakerData {
   static Faker faker = new Faker();
    public static User greatNewUser(){
        return User.builder().userFirstName(faker.name().firstName())
                .userLastName(faker.name().lastName())
                .userEmail(faker.internet().emailAddress())
                .userPassword(faker.name().username()+faker.number().digits(3))
                .build();
    }

}
