package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readproperties {

	public static void main(String[] args) throws IOException {
		
	
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\dataFile\\config.properties");
	
	Properties obj=new Properties();
	
	obj.load(file);
    String url=	obj.getProperty("appUrl");
     String email=	obj.getProperty("email");
     String pass=	obj.getProperty("password");
	
  
     System.out.println(url+" "+email+" "+pass);
    
     
     Set<String> keys=   obj.stringPropertyNames();
     System.out.println(keys);
     
     file.close();


		

	}
	
}
