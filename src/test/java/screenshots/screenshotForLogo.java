package screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotForLogo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement logo = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
		File sourcefile = logo.getScreenshotAs(OutputType.FILE);
		File targetfile= new File(System.getProperty("user.dir")+"\\screenShot\\logo.png");
        sourcefile.renameTo(targetfile);
	}

}
