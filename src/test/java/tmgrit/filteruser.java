package tmgrit;

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

public class filteruser {
	static WebDriver driver = null;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("inputfilterusergrit1.html");
		extent = new ExtentReports();
		extent.attachReporter(HtmlReporter);
	}
	@Before
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver-v9.0.1-linux-x64/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("/opt/Troop GRIT/Troop GRIT");
		options.setCapability("chromeOptions", options);
		options.setCapability("browserName", "chrome");
		Thread.sleep(1000);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 options.addArguments("--start-maximized");
		driver = new ChromeDriver(capabilities);
		System.out.print("line executed");
		Thread.sleep(3000);
	}
	@Test
	public void test00() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("0.Click on filter in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("EXPECTED RESULT ::  It should click on filter in user ");		
		String a=driver.findElement(By.xpath("//div[@class='new-filter-wrapper']")).getAttribute("class");
		assertEquals("new-filter-wrapper", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on filter in user ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("filter");
	}
	@Test
	public void test01() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("1.Click on filter on image in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on image icon");
		test.info("EXPECTED RESULT ::  It should click on image icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image active']")).getAttribute("data-title");
		assertEquals("Image", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on image icon in filter ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("1");
	}
	@Test
	public void test02() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("2.Click on image & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on image icon");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).getAttribute("data-title");
		assertEquals("Clear / Reset", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("2");
	}
	@Test
	public void test03() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("3.Click on image & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on image icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-close-icon']")).getAttribute("data-title");
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("3");
	}
	@Test
	public void test04() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-video']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("4.Click on filter video in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on video icon");
		test.info("EXPECTED RESULT ::  It should click on video icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-video active']")).getAttribute("data-title");
		assertEquals("Video", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on video icon in filter ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("4");
	}
	@Test
	public void test05() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-video']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("5.Click on video & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on video icon");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).getAttribute("data-title");
		assertEquals("Clear / Reset", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("5");
	}
	@Test
	public void test06() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-video']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("6.Click on video & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on video icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-close-icon']")).getAttribute("data-title");
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("6");
	}
	@Test
	public void test07() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("7.Click on filter doc in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on doc icon");
		test.info("EXPECTED RESULT ::  It should click on doc icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc active']")).getAttribute("data-title");
		assertEquals("File", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on doc icon in filter ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("7");
	}
	@Test
	public void test08() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("8.Click on doc & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on doc icon");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).getAttribute("data-title");
		assertEquals("Clear / Reset", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("8");
	}
	@Test
	public void test09() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("9.Click on doc & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on doc icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-close-icon']")).getAttribute("data-title");
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("9");
	}
	@Test
	public void test10() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-link']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("10.Click on filter link in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on link icon");
		test.info("EXPECTED RESULT ::  It should click on link icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-link active']")).getAttribute("data-title");
		assertEquals("Link", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on link icon in filter ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("10");
	}
	@Test
	public void test11() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("11.Click on link & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on link icon");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).getAttribute("data-title");
		assertEquals("Clear / Reset", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("11");
	}
	@Test
	public void test12() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("12.Click on link & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on link icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-close-icon']")).getAttribute("data-title");
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("12");
	}
	@Test
	public void test13() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-contact']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("13.Click on filter contact in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on contact icon");
		test.info("EXPECTED RESULT ::  It should click on contact icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-contact active']")).getAttribute("data-title");
		assertEquals("Contact", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on contact icon in filter ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("13");
	}
	@Test
	public void test14() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-contact']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("14.Click on contact & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on contact icon");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).getAttribute("data-title");
		assertEquals("Clear / Reset", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("14");
	}
	@Test
	public void test15() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-contact']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("15.Click on contact & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on contact icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-close-icon']")).getAttribute("data-title");
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("15");
	}
	@Test
	public void test16() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-location']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("16.Click on filter location in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on location icon");
		test.info("EXPECTED RESULT ::  It should click on location icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-location active']")).getAttribute("data-title");
		assertEquals("Location", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on location icon in filter ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("16");
	}
	@Test
	public void test17() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-location']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("17.Click on Location & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on location icon");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).getAttribute("data-title");
		assertEquals("Clear / Reset", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("17");
	}
	@Test
	public void test18() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-location']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("18.Click on location & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on location icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-close-icon']")).getAttribute("data-title");
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("18");
	}
	@Test
	public void test19() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("19.Click on filter read receipt in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on read receipt icon");
		test.info("EXPECTED RESULT ::  It should click on read receipt icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt active']")).getAttribute("data-title");
		assertEquals("Open Read Receipt", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on read receipt icon ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("19");
	}
	@Test
	public void test20() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("20.Click on read receipt & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on read receipt icon");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).getAttribute("data-title");
		assertEquals("Clear / Reset", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("20");
	}
	@Test
	public void test21() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("21.Click on read receipt & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : uppi ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on read receipt icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-close-icon']")).getAttribute("data-title");
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("21");
	}
	@Test
	public void test22() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("22.Click on filter image in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on image icon");
		test.info("EXPECTED RESULT ::  It should click on image icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image active']")).getAttribute("data-title");
		assertEquals("Image", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='image-attachment-span']")).getAttribute("class");
		assertEquals("image-attachment-span", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on image icon in filter ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("22");
	}
	@Test
	public void test23() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("23.Click on image & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on test : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on image icon");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).getAttribute("data-title");
		assertEquals("Clear / Reset", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("hi", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("23");
	}
	@Test
	public void test24() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("24.Click on image & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on image icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-close-icon']")).getAttribute("data-title");
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("hi", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("24");
	}
	@Test
	public void test25() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-video']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("25.Click on filter video in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on video icon");
		test.info("EXPECTED RESULT ::  It should click on video icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-video active']")).getAttribute("data-title");
		assertEquals("Video", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']")).getAttribute("class");
		assertEquals("video-attachment-wrapper", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on video icon in filter ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("25");
	}
	@Test
	public void test26() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-video']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("26.Click on video & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on video icon");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).getAttribute("data-title");
		assertEquals("Clear / Reset", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("hi", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("26");
	}
	@Test
	public void test27() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-video']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("27.Click on video & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on video icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-close-icon']")).getAttribute("data-title");
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("hi", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("27");
	}
	@Test
	public void test28() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("28.Click on filter doc in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on doc icon");
		test.info("EXPECTED RESULT ::  It should click on doc icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc active']")).getAttribute("data-title");
		assertEquals("File", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='messenger-attachment-link-name']")).getText();
		assertEquals("Aug_2021_Timesheet.xlsx", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on doc icon in filter ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("28");
	}
	@Test
	public void test29() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("29.Click on doc & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on doc icon");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).getAttribute("data-title");
		assertEquals("Clear / Reset", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("hi", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("29");
	}
	@Test
	public void test30() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("31.Click on doc & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on doc icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-close-icon']")).getAttribute("data-title");
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("hi", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("31");
	}
	@Test
	public void test32() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-link']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("32.Click on filter link in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on link icon");
		test.info("EXPECTED RESULT ::  It should click on link icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-link active']")).getAttribute("data-title");
		assertEquals("Link", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='browser-link']")).getAttribute("path");
		assertEquals("http://www.google.com", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on link icon in filter ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("32");
	}
	@Test
	public void test33() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("33.Click on link & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on link icon");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).getAttribute("data-title");
		assertEquals("Clear / Reset", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("hi", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("33");
	}
	@Test
	public void test34() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("34.Click on link & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on link icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-close-icon']")).getAttribute("data-title");
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("hi", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("34");
	}
	@Test
	public void test35() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-contact']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("35.Click on filter contact in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on contact icon");
		test.info("EXPECTED RESULT ::  It should click on contact icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-contact active']")).getAttribute("data-title");
		assertEquals("Contact", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='messenger-contact-name']")).getText();
		assertEquals("Ambulance", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on contact icon in filter ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("35");
	}
	@Test
	public void test36() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-contact']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("36.Click on contact & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on contact icon");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).getAttribute("data-title");
		assertEquals("Clear / Reset", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("hi", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("36");
	}
	@Test
	public void test37() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-contact']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("37.Click on contact & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on contact icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-close-icon']")).getAttribute("data-title");
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("hi", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("37");
	}
	@Test
	public void test38() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-location']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("38.Click on filter location in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on location icon");
		test.info("EXPECTED RESULT ::  It should click on location icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-location active']")).getAttribute("data-title");
		assertEquals("Location", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on location icon in filter ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("38");
	}
	@Test
	public void test39() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-location']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("39.Click on Location & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on location icon");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).getAttribute("data-title");
		assertEquals("Clear / Reset", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("hi", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("39");
	}
	@Test
	public void test40() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-location']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("40.Click on location & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on location icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-close-icon']")).getAttribute("data-title");
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("hi", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("40");
	}
	@Test
	public void test41() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("41.Click on filter Read Receipt in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on read receipt icon");
		test.info("EXPECTED RESULT ::  It should click on read receipt icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt active']")).getAttribute("data-title");
		assertEquals("Open Read Receipt", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on read receipt icon & it is displaying read receipt msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("41");
	}
	@Test
	public void test42() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("42.Click on read receipt & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on read receipt icon");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).getAttribute("data-title");
		assertEquals("Clear / Reset", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("hi", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("42");
	}
	@Test
	public void test43() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("43.Click on read receipt & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on read receipt icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the filter & it should display all the msgs ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-close-icon']")).getAttribute("data-title");
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("hi", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page & it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("43");
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
