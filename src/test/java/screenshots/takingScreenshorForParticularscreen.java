package screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takingScreenshorForParticularscreen {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement webtablebox = driver.findElement(By.xpath("//div[@id='HTML1']"));
		webtablebox.getScreenshotAs(OutputType.FILE);

		File sourcefile = webtablebox.getScreenshotAs(OutputType.FILE);
		// storing screenshot in project level
		File targetfile = new File(System.getProperty("user.dir") + "\\screenShot\\webtable.png");
		
		sourcefile.renameTo(targetfile);
	}

}
