package Enhancement;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Recentuserchatsearch {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("Userchatsearch(myself).html");
		extent = new ExtentReports();
		extent.attachReporter(HtmlReporter);
	}
	
	@Before
	public void setup() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver-v9.0.1-linux-x64/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("/opt/troop-messenger/troop-messenger");
		options.setCapability("chromeOptions", options);
		options.setCapability("browserName", "chrome");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(capabilities);
		System.out.print("line executed");
		Thread.sleep(2000);
	}
	@Test
	public void test00() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath35@tm.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("myself");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Search by myself(sharathsai)");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat user search");
		test.info("Enter text : myself");
		test.info("EXPECTED RESULT ::  It should display myself user name ");
		String a=driver.findElement(By.xpath("//span[@data-name='sharathsai']")).getAttribute("data-name");
		assertEquals("sharathsai", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying myself user name ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("1");
	}
	@Test
	public void test01() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath35@tm.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("sharathsai");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Search by username(myself)");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat user search");
		test.info("Enter text : sharathsai");
		test.info("EXPECTED RESULT ::  It should display myself user name ");
		String a=driver.findElement(By.xpath("//span[@data-name='sharathsai']")).getAttribute("data-name");
		assertEquals("sharathsai", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying myself user name ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("2");
	}
	@After
	public void teardown() {
		extent.flush();
		driver.quit();
	}
	@AfterClass
	static public void endtest() {
		try {
			extent.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end test");
	}
}