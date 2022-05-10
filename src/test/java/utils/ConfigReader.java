package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    //this method will read any property file
    public static Properties readProperties(String filePath){ //String filePath parameter is the path of the file we need to read
        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    //this method get single value based on the key
    public static String getPropertyValue(String key){
        return prop.getProperty(key);
    }

}
