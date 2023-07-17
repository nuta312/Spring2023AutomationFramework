package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class User {
private String userFirstName;
private String userLastName;
private String userEmail;
private String userPassword;

}
