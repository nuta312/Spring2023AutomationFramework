import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CheckUserNameRest {
    @Test
    public void test01CheckName(){
        var userList = List.of(RestAssured
                .given()
                .log().all()
                .baseUri("https://jsonplaceholder.typicode.com/")
                .get("/users")
                .then()
                .log().all()
                .extract()
                .body()
                .as(UserModel[].class));

        Assert.assertEquals(userList.size(),10);

        assert userList.get(0).getName().matches("\\D+") : "no alphabet";
    }
}
