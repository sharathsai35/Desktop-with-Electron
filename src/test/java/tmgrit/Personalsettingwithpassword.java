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

public class Personalsettingwithpassword {
	static WebDriver driver;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("Personalsettingwithpassword2.html");
		extent = new ExtentReports();
		extent.attachReporter(HtmlReporter);
	}
	@Before
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/tvisha/Downloads/chromedriver-v9.0.1-linux-x64/chromedriver");
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
	//@Test
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("1.Click on password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("EXPECTED RESULT ::  It should click on password ");
		String a=driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
		assertEquals("Password", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on password ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("1");
	}
	//@Test
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("2.Click on save button without entering data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Enter old password", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter old password ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("2");
	}
	//@Test
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("settingsOldPasswordInput")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("3.Enter only old password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Enter old password");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Enter new password", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter new password ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("settingsNewPasswordInput")).sendKeys("456123");
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("4.Enter only new password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Enter new password : 123456");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Enter old password", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter old password ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("settingsConfirmPasswordInput")).sendKeys("456123");
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("5.Enter only confirm password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Enter confirm password : 123456");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Enter old password", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter old password ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("settingsOldPasswordInput")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("settingsNewPasswordInput")).sendKeys("234567");
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("6.Combination of old & new password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Enter old password : 123456");
		test.info("Enter new password : 654321");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please confirm your password!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please confirm your password! ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("settingsOldPasswordInput")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("settingsConfirmPasswordInput")).sendKeys("123654");
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("7.Combination of old & confirm password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Enter old password : 123456");
		test.info("Enter confirm password : 456");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Enter new password", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter new password ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("settingsNewPasswordInput")).sendKeys("456123");
		Thread.sleep(1000);
		driver.findElement(By.id("settingsConfirmPasswordInput")).sendKeys("456123");
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("8.Combination of new & confirm password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Enter new password : 123456");
		test.info("Enter confirm password : 123456");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Enter old password", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter old password ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("settingsOldPasswordInput")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("settingsNewPasswordInput")).sendKeys("456");
		driver.findElement(By.id("settingsConfirmPasswordInput")).sendKeys("123");
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("9.Enter with 3 characters new password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Enter old password : 123456");
		test.info("Enter new password : 456");
		test.info("Enter confirm password : 456");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Password should contain at least 6 characters", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Password should contain at least 6 characters ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("settingsOldPasswordInput")).sendKeys("345612");
		Thread.sleep(1000);
		driver.findElement(By.id("settingsNewPasswordInput")).sendKeys("456123");
		driver.findElement(By.id("settingsConfirmPasswordInput")).sendKeys("456123");
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("10.Enter with wrong old password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Enter old password : 345678");
		test.info("Enter new password : 123456");
		test.info("Enter confirm password : 123456");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Invalid Old Password", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Invalid Old Password ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("settingsOldPasswordInput")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("settingsNewPasswordInput")).sendKeys("123456");
		driver.findElement(By.id("settingsConfirmPasswordInput")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("11.Enter with same old,new & confirm password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Enter old password : 123456");
		test.info("Enter new password : 123456");
		test.info("Enter confirm password : 123456");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Nothing to update", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Nothing to update ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("settingsOldPasswordInput")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("settingsNewPasswordInput")).sendKeys("234567");
		driver.findElement(By.id("settingsConfirmPasswordInput")).sendKeys("098765");
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("12.Enter different new & confirm password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Enter old password : 123456");
		test.info("Enter new password : 234567");
		test.info("Enter confirm password : 098765");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Passwords doesn't match", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Passwords doesn't match ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("settingsOldPasswordInput")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("settingsNewPasswordInput")).sendKeys("123456");
		driver.findElement(By.id("settingsConfirmPasswordInput")).sendKeys("098765");
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("13.Enter same old & new password & confirm with different");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Enter old password : 123456");
		test.info("Enter new password : 123456");
		test.info("Enter confirm password : 098765");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Passwords doesn't match", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Passwords doesn't match ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("settingsOldPasswordInput")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("settingsNewPasswordInput")).sendKeys("abcdef");
		driver.findElement(By.id("settingsConfirmPasswordInput")).sendKeys("abcdef");
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("14.Enter password with alphabets");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Enter old password : 123456");
		test.info("Enter new password : abcdef");
		test.info("Enter confirm password : abcdef");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Password Changed Successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Password Changed Successfully ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("14");
	}
	/*@Test
	public void test15() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("abcdef");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("settingsOldPasswordInput")).sendKeys("abcdef");
		Thread.sleep(1000);
		driver.findElement(By.id("settingsNewPasswordInput")).sendKeys("adcd@123");
		driver.findElement(By.id("settingsConfirmPasswordInput")).sendKeys("adcd@123");
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("15.Enter password with alphabets & numerics");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Enter old password : 123456");
		test.info("Enter new password : adcd@123");
		test.info("Enter confirm password : adcd@123");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Password Changed Successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Password Changed Successfully ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("15");
	}*/
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
		driver.findElement(By.id("password")).sendKeys("abcdef");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("settingsOldPasswordInput")).sendKeys("abcdef");
		Thread.sleep(1000);
		driver.findElement(By.id("settingsNewPasswordInput")).sendKeys("123456");
		driver.findElement(By.id("settingsConfirmPasswordInput")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("16.Enter password with numerics");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on password");
		test.info("Enter old password : adcd@123");
		test.info("Enter new password : 123456");
		test.info("Enter confirm password : 123456");
		test.info("Click on save button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Password Changed Successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Password Changed Successfully ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("16");
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
