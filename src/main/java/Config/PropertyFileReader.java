package Config;


import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader {
    private static final String CONFIG_FILE = "config.properties";
    private Properties properties;

    public PropertyFileReader() {
        loadProperties();
    }

    private void loadProperties() {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (input != null) {
                properties.load(input);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public String getUserName() {
        return properties.getProperty("Username");
    }

    public String getPassword() {
        return properties.getProperty("Password");
    }

    public String getHomepageURL() {
        return properties.getProperty("homepageUrl");
    }
}


