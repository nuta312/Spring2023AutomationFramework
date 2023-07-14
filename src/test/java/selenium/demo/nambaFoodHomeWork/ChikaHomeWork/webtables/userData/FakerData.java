package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.webtables.userData;

import com.github.javafaker.Faker;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.webtables.userData.UserWebTables;

public class FakerData {
    static Faker faker = new Faker();
    public static UserWebTables genericuser(){
        return UserWebTables.builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .email(faker.internet().emailAddress())
                .age(faker.number().digits(3))
                .salary(faker.number().digits(5))
                .deparments(faker.programmingLanguage().name())
                .build();
    }
}
