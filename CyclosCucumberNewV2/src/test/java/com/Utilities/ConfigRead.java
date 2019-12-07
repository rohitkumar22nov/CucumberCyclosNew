package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead {
	
	
	Properties pro;
	public String path = "./Config\\Config.properties";
	
	
	public ConfigRead()
	{
		
		File configFile = new File(path);
		FileInputStream fileInput = null;
		
	    try {
			fileInput = new FileInputStream(configFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    pro = new Properties();
	    
	    try {
			pro.load(fileInput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   
		
	}
	
	
	   public String getApplicationURL()
	   {
		   String BaseURL = pro.getProperty("BaseURL");
		   return BaseURL;
	   }	
	   
	   
	   public String getChromepath()
	   {
		   String chromepath = pro.getProperty("chromepath");
		   return chromepath;
	   }
	   
	   
	   public String getFirefoxpath()
	   {
		   String firefoxpath = pro.getProperty("firefoxpath");
		   return firefoxpath;
	   }
	   
	   
	   
	   public String getIEpath()
	   {
		   String IEpath = pro.getProperty("iepath");
		   return IEpath;
	   }
	   
	   
	   public String getUserName()
	   {
		   String userName = pro.getProperty("LoginName");
		   return userName;
	   }
	   
	   
	   
	   public String getPassword()
	   {
		   String password = pro.getProperty("Password");
		   return password;
	   }
	   

}
