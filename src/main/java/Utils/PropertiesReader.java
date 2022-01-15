package Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    Properties properties;

    public PropertiesReader(){
        properties = new Properties();

        InputStream stream = getClass().getClassLoader().getResourceAsStream("config.properties");
        try {
            properties.load(stream);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getEmail(){
        return properties.getProperty("email");
    }

    public String getPass(){
        return properties.getProperty("pass");
    }

    public String getUrl(){
        return properties.getProperty("url");
    }

    public String getAPIUrl (){
        return properties.getProperty("APIurl");
    }

}
