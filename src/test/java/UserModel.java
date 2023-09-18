import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(value = "true", ignoreUnknown = true)
public class UserModel {
    private int id;
    private String name;
    private String username;
    private String email;
    @JsonProperty("id")
    public int getId() {
        return id;
    }
    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonProperty("username")
    public String getUserName() {
        return username;
    }
    @JsonProperty("username")
    public void setUserName(String username) {
        this.username = username;
    }
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("name")
    public  String getName() {
        return name;
    }
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }


    class Company{
        private String name;
        private String bs;

    }

}
