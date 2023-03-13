package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    public static String getProperty(String fileName, String key) throws IOException {
        Properties prop = new Properties();
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            prop.load(fis);
            value = prop.getProperty(key);
        }
        catch (IOException exception)
        {
            System.out.println("Hata olustu : " + exception);
        }

        return value;

    }


    public static String getProperty(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("configuration.properties");
        prop.load(fis);

        String value = prop.getProperty(key);

        return value;

    }

    public static void setProperty(String fileName,String key, String value) throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(fileName);
        prop.load(fis);

        prop.setProperty(key, value);

        FileOutputStream fos = new FileOutputStream(fileName);
        prop.store(fos, null);
    }

    public static void setProperty(String key, String value) throws IOException {

        Properties prop = new Properties();
        try
        {
            FileInputStream fis = new FileInputStream("configuration.properties");
            prop.load(fis);
            prop.setProperty(key, value);
            FileOutputStream fos = new FileOutputStream("configuration.properties");
            prop.store(fos, null);
        }
        catch (Exception ex)
        {
            System.out.println("Dosya yazma hatasi : "+ ex);

        }
    }
}
