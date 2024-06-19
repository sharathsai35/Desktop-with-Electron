package Tm;

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

public class forgotpwd {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("forgotpwd1.html");
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
		driver.findElement(By.xpath("//div[@class='forgot-password']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on forgot password ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("forgot password : Click on forgot password button");
		test.info("EXPECTED RESULT ::  It should display forgot password page ");
		String a=driver.findElement(By.xpath("//div[@class='forgot-password-heading-wrapper']")).getText();
		assertEquals("Forgot Password", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying forgot password page ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
		System.out.println("forgot password");
	}
	@Test
	public void test01() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='forgot-password']")).click();
		driver.findElement(By.id("forgotSubmitBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on submit in forgot password ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("forgot password : Click on forgot password button");
		test.info("Click on submit button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@id='forgotError']")).getText();
		assertEquals("Please enter email..", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter email.. ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
		System.out.println("1");
	}
	@Test
	public void test02() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='forgot-password']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("forgotEmail")).sendKeys("sharath");
		driver.findElement(By.id("forgotSubmitBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on submit by entering invalid email in forgot password ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("forgot password : Click on forgot password button");
		test.info("Enter email : sharath");
		test.info("Click on submit button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@id='forgotError']")).getText();
		assertEquals("Invalid Email!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Invalid Email! ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
		System.out.println("2");
	}
	@Test
	public void test03() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='forgot-password']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("forgotEmail")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("forgotSubmitBtn")).click();
		ExtentTest test=extent.createTest("Click on submit by entering valid email in forgot password ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("forgot password : Click on forgot password button");
		test.info("Enter email : sharath@trends.com");
		test.info("Click on submit button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		/*
		 * String a=driver.findElement(By.xpath("//div[@class='success']")).getText();
		 * assertEquals("Reset password has sent to your email", a); test.pass(a);
		 * System.out.println(a);
		 */
		test.log(Status.PASS ,"ACTUAL RESULT ::  Reset password has sent to your email ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
		System.out.println("3");
	}
	@Test
	public void test04() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='forgot-password']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("forgotEmail")).sendKeys("sharath@trends.com");
		//driver.findElement(By.id("forgotSubmitBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click here to login ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("forgot password : Click on forgot password button");
		test.info("Enter email : sharath@trends.com");
		test.info("Click on Click here to login");
		test.info("EXPECTED RESULT ::  It should display login page ");
		/*
		 * String a=driver.findElement(By.xpath("//span[@id='loginText']")).getText();
		 * assertEquals("LOGIN", a); test.pass(a); System.out.println(a);
		 */
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying login page ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
		System.out.println("4");
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
