package com.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil 
{
public static String getProperty(String key) throws Throwable 
{

FileInputStream fis=new FileInputStream(".\\PropertiesFile\\Environment.properties");

Properties pr = new Properties();
pr.load(fis);

return pr.getProperty(key);
}
}