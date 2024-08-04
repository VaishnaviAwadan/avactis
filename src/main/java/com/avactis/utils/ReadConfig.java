package com.avactis.utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ReadConfig {
	
	    private Properties properties;

	    public ReadConfig(String filePath) {
	        properties = new Properties();
	        try {
	            FileInputStream fis = new FileInputStream("config/config.properties");
	            properties.load(fis);
	            fis.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public String getProperty(String key) {
	        return properties.getProperty(key);
	    }

	    public static void main(String[] args) {
	        ReadConfig config = new ReadConfig("config.properties");
	        System.out.println(config.getProperty("url")); // Example usage
	    }
	}

