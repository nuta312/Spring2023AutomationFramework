package dbTest;

import com.digitalnomads.selenium.db.DBConnection;
import com.digitalnomads.selenium.db.UserDB;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBdemo {
    public static void main(String[] args) throws SQLException {
        DBConnection.open("employees");
        ResultSet resultSet = DBConnection.
                query("select * from employees where first_name = ?;","Abdulla");
        resultSet.next();
        DBConnection.close();
        System.out.println(new UserDB(resultSet));

    }
}
