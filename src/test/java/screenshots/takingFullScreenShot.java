package screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takingFullScreenShot {

	public static void main(String[] args) {		
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();

		
		// 1.full page screenshot
		TakesScreenshot tc=(TakesScreenshot)driver;
	File sourcefile=	tc.getScreenshotAs(OutputType.FILE);
	//storing screenshot in project level
	File targetfile=new File(System.getProperty("user.dir")+"\\screenShot\\fillpage.png");
		
		sourcefile.renameTo(targetfile);
	
	}

}
