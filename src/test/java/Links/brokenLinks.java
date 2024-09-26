//import java.net.URL;
package Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) throws IOException {
	
		/*
		 * status code grater than = 400>>>that is a broken link status code less than =
		 * 400>>>that is a not broken link
		 */
	
	
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("total no of links :" +links.size());
		
		
		for(WebElement linkElement:links) {
		String hrefAttribute=linkElement.getAttribute("href");
			
			if(hrefAttribute==null || hrefAttribute.isEmpty()  ) {
				System.out.println("href attribte value null or empty, so not possible to check");
				continue;
			}
		//hit url to the server
			try {
			URL urlLink=new URL(hrefAttribute);// converting href value from string to url format
		HttpURLConnection	connection=  (HttpURLConnection) urlLink.openConnection();//open connection to the server
		connection.connect();// connection to server and ent request the server
		if(connection.getResponseCode()>=400) {
			System.out.println("Broken Link>>>>>>>>"+hrefAttribute);
		}
		else {
			System.out.println("not a broken link>>>>>>>"+ hrefAttribute);
		}
		}
	catch (Exception e) {
		// TODO: handle exception
	}
	}

	}
}
