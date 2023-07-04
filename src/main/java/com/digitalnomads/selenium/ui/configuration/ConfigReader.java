package com.digitalnomads.selenium.ui.configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        try {
            String path = "src/main/resources/app.properties";
            FileInputStream input = new FileInputStream("path");
            Properties properties= new Properties();
            properties.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key).trim();
    }

    public static void main(String[] args) {
        System.out.println(getProperty("browser"));
    }

}


