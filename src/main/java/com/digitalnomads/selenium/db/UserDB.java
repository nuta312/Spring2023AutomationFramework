package com.digitalnomads.selenium.db;

import lombok.*;
import org.apache.commons.dbutils.BeanProcessor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDB {

    int emp_no;
    String birth_date;
    String first_name;
    String last_name;
    String gender;
    String hire_date;

    public UserDB (ResultSet rs) throws SQLException {
        new BeanProcessor().populateBean(rs,this);
    }

    public static List<UserDB>  getAll() throws SQLException{
        String query = "SELECT * FROM employees";
        try (ResultSet resultSet = DBConnection.query(query)){
            return new BeanProcessor().toBeanList(resultSet,UserDB.class);
        }
    }

    public static UserDB getBy (String column, String value) throws SQLException {
        String query = "SELECT * FROM employees WHERE"+ column + " =?;";
        ResultSet resultSet = DBConnection.query(query,value);
        if (!resultSet.next()) return null;
        return new BeanProcessor().toBean(resultSet, UserDB.class);
    }
}
