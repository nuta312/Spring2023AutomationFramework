package ui.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        try {
            properties = new Properties();
            String path = "src/main/app.properties";
            FileInputStream input = new FileInputStream(path);
            properties.load(input);
            input.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String getPropertyOf(String key){
        return properties.getProperty(key).trim();
    }

}
