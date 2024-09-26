package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		/*
		 * // JavascriptExecutor js = (JavascriptExecutor) driver;
		 * 
		 * //single file upload
		 * 
		 * driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(
		 * "C:\\Users\\acer\\OneDrive\\Desktop\\raj.jpg");
		 * if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals(
		 * "raj.jpg")){ System.out.println("file uploaded successfil");
		 * 
		 * }else System.out.println("failed to upload");
		 */

		// multiple file uploading

		String file1 = "C:\\\\Users\\\\acer\\\\OneDrive\\\\Desktop\\\\raj.jpg";
		String file2 = "C:\\Users\\acer\\OneDrive\\Desktop\\raj 1.jpg";

		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);

		int noOfFile = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if (noOfFile == 2) {
			System.out.println("all files uploaded");

		} else {
			System.out.println("failed to upload all files");
		}
		// file names validation

		if (driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("raj.jpg")

				&& driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("raj 1.jpg")) {
			System.out.println("file names matching");
		} else {
			System.out.println("file names not matching");

		}
	}

}
