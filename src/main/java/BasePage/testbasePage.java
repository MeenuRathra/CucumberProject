package BasePage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testbasePage {

	public static WebDriver driver;

	public static void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public int Randomnum(int maxnum) {

		Random rand = new Random();
		int Randomnum = rand.nextInt(maxnum);
		return Randomnum;
	}

	public void screenShot(WebDriver driver) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		String currentdir = System.getProperty("user.dir");
		SimpleDateFormat formatter= new SimpleDateFormat("MMYY_HHmmss");
		Date date= new Date();
		String label=formatter.format(date);

		try {
			FileUtils.copyFile(sourcefile,
					new File(currentdir + "/screenshots/" + label + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}}
	



