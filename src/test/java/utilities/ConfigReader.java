package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import utilities.LoggerLoad;

public class ConfigReader {
	private static Properties properties;
	private final static String propertyFilePath = ".\\src\\test\\resources\\Config\\config.properties";

	public static void readConfig() throws Throwable {
		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();

			try {
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Config.properties not found at" + propertyFilePath);
		}

	}

	// Browser Type
	public static String browserType() {
		String browser = properties.getProperty("browser");
		LoggerLoad.info("Get Browser Type from Properties");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("Browser Not Specified in Config.Properties file");
	}

	// Base URL
	public static String applicationUrl() {
		String url = properties.getProperty("MainPageURL");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Config.properties file");
	}


}
