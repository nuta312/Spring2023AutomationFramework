package selenium.demo.demoQA;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import selenium.demo.lesson2.BaseTest;

import java.util.List;


public class WebTablesTest extends BaseTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
        String result = findInfo(driver, "age", "39", "department");
        System.out.println(result);
        driver.close();
    }

    public static String findInfo(WebDriver driver, String searchField, String searchValue, String returnField) {
        List<WebElement> rows = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));

        for (WebElement row : rows) {
            List<WebElement> table = row.findElements(By.xpath(".//div[@role='gridcell']"));

            String firstName = table.get(0).getText();
            String lastName = table.get(1).getText();
            String age = table.get(2).getText();
            String email = table.get(3).getText();
            String salary = table.get(4).getText();
            String department = table.get(5).getText();


            if (findTheInfo(searchField, searchValue, firstName, lastName, age, email, salary, department)) {
                return returnValue(returnField, firstName, lastName, age, email, salary, department);
            }

        }
        return null;
    }

    private static boolean findTheInfo(String searchField, String value, String firstName, String lastName, String age, String email, String salary, String department) {
        switch (searchField) {
            case "firstName":
                return firstName.equalsIgnoreCase(value);
            case "lastName":
                return lastName.equalsIgnoreCase(value);
            case "age":
                return age.equals(value);
            case "email":
                return email.equalsIgnoreCase(value);
            case "salary":
                return salary.equals(value);
            case "department":
                return department.equalsIgnoreCase(value);
            default:
                return false;
        }
    }

    private static String returnValue(String returnField, String firstName, String lastName, String age, String email, String salary, String department) {
        switch (returnField) {
            case "firstName":
                return "First name = " + firstName;
            case "lastName":
                return "Last Name = " + lastName;
            case "age":
                return "Age = " + age;
            case "email":
                return "Email = " + email;
            case "salary":
                return "Salary = " + salary;
            case "department":
                return "Department = " + department;
            default:
                return "";
        }
    }

}


