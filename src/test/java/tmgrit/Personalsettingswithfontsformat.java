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

public class Personalsettingswithfontsformat {
	static WebDriver driver = null;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("Personalsettingwithfonts&formats1.html");
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
	//@Test
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("0.Click on personal settings");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("EXPECTED RESULT ::  It should click on personal settings ");
		String a=driver.findElement(By.xpath("//div[@class='messenger-app-wrapper active']")).getAttribute("data-app");
		assertEquals("settings", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on personal settings ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("Personal settings");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("1.Click on fonts & format");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("EXPECTED RESULT ::  It should display fonts & format page ");
		String a=driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
		assertEquals("Fonts & Format", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying fonts & formats page ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[1]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("2.Click on radio button poppins");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on radio button poppins");
		test.info("EXPECTED RESULT ::  It should click on the radio button poppins ");
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[1]")).getText();
		assertEquals("Poppins\n"
				+ "(Default)", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on radio button poppins ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[2]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("3.Click on radio button Roboto");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on radio button Roboto");
		test.info("EXPECTED RESULT ::  It should click on the radio button Roboto ");
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[2]")).getText();
		assertEquals("Roboto", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on the radio button Roboto ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("3");
	}
	//@Test
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[3]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("4.Click on radio button Helvetica");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on radio button Helvetica");
		test.info("EXPECTED RESULT ::  It should click on the radio button Helvetica ");
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[3]")).getText();
		assertEquals("Helvetica", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on the radio button Helvetica ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[4]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("5.Click on radio button Karla");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on radio button Karla");
		test.info("EXPECTED RESULT ::  It should click on the radio button Karla ");
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[4]")).getText();
		assertEquals("Karla", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on the radio button Karla ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[5]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("6.Click on radio button Work Sans");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on radio button Work Sans");
		test.info("EXPECTED RESULT ::  It should click on the radio button Work Sans ");
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[5]")).getText();
		assertEquals("Work Sans", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on the radio button Work Sans ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[6]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("7.Click on radio button System");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on radio button System");
		test.info("EXPECTED RESULT ::  It should click on the radio button System ");
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[6]")).getText();
		assertEquals("System", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on the radio button System ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[7]")).click();
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[7]")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("8.Click on radio button 70%");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on radio button 70%");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should click on the radio button 70% ");		
		assertEquals("70%", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on the radio button 70% ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[8]")).click();
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[8]")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("9.Click on radio button 80%");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on radio button 80%");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should click on the radio button 80% ");
		assertEquals("80%", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on the radio button 80% ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[9]")).click();
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[9]")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("10.Click on radio button 90%");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on radio button 90%");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should click on the radio button 90% ");
		assertEquals("90%", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on the radio button 90% ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[10]")).click();
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio default'])")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("11.Click on radio button 100%");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on radio button 100%");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should click on the radio button 100% ");
		assertEquals("100%", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on the radio button 100% ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[11]")).click();
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[10]")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("12.Click on radio button 110%");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on radio button 110%");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should click on the radio button 110% ");
		assertEquals("110%", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on the radio button 110% ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("12");
	}
	//@Test
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[12]")).click();
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[11]")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("13.Click on radio button 125%");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on radio button 125%");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should click on the radio button 125% ");
		assertEquals("125%", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on the radio button 125% ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("13");
	}
	//@Test
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[13]")).click();
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[12]")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("14.Click on radio button 135%");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on radio button 135%");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should click on the radio button 135% ");
		assertEquals("135%", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on the radio button 135% ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("14");
	}
	//@Test
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[14]")).click();
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[13]")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("15.Click on radio button 150%");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on radio button 150%");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should click on the radio button 150% ");
		assertEquals("150%", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on the radio button 150% ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("15");
	}
	//@Test
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("16.Switch the messaging format(Hide)");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on switch the messaging format");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should switch the messaging format & it should not display in user/group chat ");
		String a=driver.findElement(By.xpath("//div[@class='input-bold-btn input-action-btn hidden']")).getAttribute("class");
		assertEquals("input-bold-btn input-action-btn hidden", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='input-italic-btn input-action-btn hidden']")).getAttribute("class");
		assertEquals("input-italic-btn input-action-btn hidden", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//div[@class='input-underline-btn input-action-btn hidden']")).getAttribute("class");
		assertEquals("input-underline-btn input-action-btn hidden", a2);
		test.pass(a2);
		System.out.println(a2);
		String a3=driver.findElement(By.xpath("//div[@class='input-strikethrough-btn input-action-btn hidden']")).getAttribute("class");
		assertEquals("input-strikethrough-btn input-action-btn hidden", a3);
		test.pass(a3);
		System.out.println(a3);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is switching the messaging format & it is not displaying in user/group chat ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("17.Switch the messaging format(show)");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on switch the messaging format");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should switch the messaging format & it should display in user/group chat ");
		String a=driver.findElement(By.xpath("//div[@class='input-bold-btn input-action-btn']")).getAttribute("class");
		assertEquals("input-bold-btn input-action-btn", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='input-italic-btn input-action-btn']")).getAttribute("class");
		assertEquals("input-italic-btn input-action-btn", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//div[@class='input-underline-btn input-action-btn']")).getAttribute("class");
		assertEquals("input-underline-btn input-action-btn", a2);
		test.pass(a2);
		System.out.println(a2);
		String a3=driver.findElement(By.xpath("//div[@class='input-strikethrough-btn input-action-btn']")).getAttribute("class");
		assertEquals("input-strikethrough-btn input-action-btn", a3);
		test.pass(a3);
		System.out.println(a3);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is switching the messaging format & it is displaying in user/group chat ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("18.Switch the forkout(Hide)");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on switch the forkout");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should switch the forkout & it should not display in user/group chat ");
		String a=driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn hidden']")).getAttribute("class");
		assertEquals("input-forkout-btn input-action-btn hidden", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is switching the forkout & it is not displaying in user/group chat ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("18");
	}
	//@Test
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("19.Switch the forkout(show)");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on switch the forkout");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should switch the forkout & it should display in user/group chat ");
		String a=driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).getAttribute("class");
		assertEquals("input-forkout-btn input-action-btn", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is switching the forkout & it is displaying in user/group chat ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("20.Switch the read receipt(Hide)");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on switch the read receipt");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should switch the read receipt & it should not display in user/group chat ");
		String a=driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn hidden']")).getAttribute("class");
		assertEquals("input-read-receipt-btn input-action-btn hidden", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is switching the read receipt & it is not displaying in user/group chat ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("21.Switch the read receipt(show)");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on switch the read receipt");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should switch the read receipt & it should display in user/group chat ");
		String a=driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).getAttribute("class");
		assertEquals("input-read-receipt-btn input-action-btn", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is switching the read receipt & it is displaying in user/group chat ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='switch'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("22.Switch the voice message(Hide)");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on switch the voice message");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should switch the voice message & it should not display in user/group chat ");
		String a=driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn hidden']")).getAttribute("class");
		assertEquals("input-microphone-btn input-action-btn hidden", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is switching the voice message & it is not displaying in user/group chat ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//label[@class='switch'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("23.Switch the voice message(show)");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on fonts & formats");
		test.info("Click on switch the voice message");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should switch the voice message & it should display in user/group chat ");
		String a=driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).getAttribute("class");
		assertEquals("input-microphone-btn input-action-btn", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is switching the voice message & it is displaying in user/group chat ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("23");
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
