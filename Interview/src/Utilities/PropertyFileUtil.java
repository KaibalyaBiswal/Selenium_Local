package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertyFileUtil 
{
public static String getValueForKey(String key) throws Throwable, IOException
{
	Properties configureProperties = new Properties();
	
//FileInputStream	configureProperties=new FileInputStream(".PropertiesFile/Environment.properties");

	configureProperties.load(new FileInputStream(new File("./PropertiesFile/Environment.properties")));

	return configureProperties.getProperty(key);
}
}
