package seleniumLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class openingURL {

	public static void main(String[] args) {
		//WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
        System.out.println(driver.getTitle());
		
		String actual=driver.getTitle();
		
		if (actual.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			
			System.out.println("test passed");
		}
			
		else {
		   System.out.println("test failed");
				
		}
		driver.quit();
	}

}
