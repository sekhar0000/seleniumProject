package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incognito {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
        opt.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://expired.badssl.com/");
		
		driver.manage().window().maximize();
		
	}

}
