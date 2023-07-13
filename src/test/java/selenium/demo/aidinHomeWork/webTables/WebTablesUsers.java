package selenium.demo.aidinHomeWork.webTables;

import com.digitalnomads.selenium.ui.models.User;
import com.github.javafaker.Faker;

import java.util.ArrayList;

public class WebTablesUsers {
    Faker f = new Faker();
    public void addToList(ArrayList<String> list, User user){
        list.add(user.firstName);
        list.add(user.lastName);
        list.add(user.age);
        list.add(user.email);
        list.add(user.salary);
        list.add(user.department);
    }
    User aidin = User.builder().firstName("Aidin").lastName("Iskenderov").email("aidin@gmail.com")
            .age("17").salary("270000").department("QA").build();
    User manas = User.builder().firstName("Manas").lastName("Erkinbekov").email("manas@gmail.com")
            .age("24").salary("560000").department("JavaDev").build();
    User fake = User.builder().firstName(f.name().firstName()).lastName(f.name().lastName())
            .email(f.internet().emailAddress()).age("23").salary("20000").department("Builder").build();
}
