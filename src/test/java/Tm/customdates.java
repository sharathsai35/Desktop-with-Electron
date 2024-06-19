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

public class customdates {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("customdatesinrecentsearch1.html");
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
	//@Test
	public void test00() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("EXPECTED RESULT ::  It should click custom dates ");
		String a=driver.findElement(By.xpath("//div[@data-value='4']")).getAttribute("class");
		assertEquals("recent-users-chat-filter-container", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on custom dates ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("custom dates");
	}
	//@Test
	public void test01() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with today without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on today");
		test.info("EXPECTED RESULT ::  It should click on today ");
		String a=driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[1]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("1");
	}
	//@Test
	public void test02() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with today input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on today");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getAttribute("class");
		assertEquals("no-recent-results-text", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("2");
	}
	//@Test
	public void test03() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with Yesterday without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on yesterday");
		test.info("EXPECTED RESULT ::  It should click on Yesterday ");
		String a=driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[2]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
		test.pass("Test Case:: TestCase PASSED");
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
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with yesterday input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on yesterday");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("4");
	}
	//@Test
	public void test05() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with last 7 days without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should click on Last 7 days ");
		String a=driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[3]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("5");
	}
	//@Test
	public void test06() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with Last 7 days input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("6");
	}
	@Test
	public void test07() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with Last 30 days without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should click on Last 30 days ");
		String a=driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[4]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("7");
	}
	//@Test
	public void test08() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with Last 30 days input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@data-name='test']")).getAttribute("data-name");
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching and displaying the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("8");
	}
	//@Test
	public void test09() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with This month without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should click on This month ");
		String a=driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[5]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("9");
	}
	@Test
	public void test10() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with This month with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@data-name='test']")).getAttribute("data-name");
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching & displaying the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("10");
	}
	//@Test
	public void test11() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with This year without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should click on This year ");
		String a=driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[6]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("11");
	}
	@Test
	public void test12() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with This year with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on this year");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@data-name='sharath kumar']")).getAttribute("data-name");
		assertEquals("sharath kumar", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching & displaying the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("12");
	}
	//@Test
	public void test13() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with Last year without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should click on Last year ");
		String a=driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[7]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("13");
	}
	//@Test
	public void test14() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with Last year with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@data-name='test']")).getAttribute("data-name");
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching & displaying the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("14");
	}
	//@Test
	public void test15() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='8']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with All dates without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on All dates");
		test.info("EXPECTED RESULT ::  It should click on All dates ");
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("15");
	}
	@Test
	public void test16() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='8']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on custom dates with All dates with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on All dates");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@data-name='test']")).getAttribute("data-name");
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching & displaying the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("16");
	}
	//@Test
	public void test17() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='customDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on date range apply button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on All dates");
		test.info("EXPECTED RESULT ::  It should click on apply button in date range ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("17");
	}
	//@Test
	public void test18() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[9]")).click();
		driver.findElement(By.xpath("//input[@id='customDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on date range with only from date ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on All dates");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select to date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select to date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("18");
	}
	@Test
	public void test19() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[9]")).click();
		driver.findElement(By.xpath("//input[@id='customDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on date range with only to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on All dates");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("19");
	}
	@Test
	public void test20() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[24]")).click();
		driver.findElement(By.xpath("//input[@id='customDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on date range with from & to dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on All dates");
		test.info("EXPECTED RESULT ::  It should display the msgs in btw that dates ");
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the msgs in btw date range ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("20");
	}
	@Test
	public void test21() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[24]")).click();
		driver.findElement(By.xpath("//input[@id='customDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on date range with from & to dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on All dates");
		test.info("EXPECTED RESULT ::  It should display the msgs in btw that dates ");
		String a=driver.findElement(By.xpath("//span[@data-name='test']")).getAttribute("data-name");
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the msgs in btw date range ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("21");
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
