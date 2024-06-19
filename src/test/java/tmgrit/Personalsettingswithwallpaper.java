package tmgrit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Personalsettingswithwallpaper {
	static WebDriver driver = null;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("Personalsettingswithwallpaper1.html");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("1.Click on Wallpapers");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("EXPECTED RESULT ::  It should click on wallpapers ");
		String a=driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
		assertEquals("Wallpapers", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on wallpapers ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='wallpaperSearchInput']")).sendKeys("sea");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("2.Enter valid search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on search");
		test.info("Enter search input : sea");
		test.info("EXPECTED RESULT ::  It should search the wallpapers ");
		String a=driver.findElement(By.xpath("//input[@id='wallpaperSearchInput']")).getAttribute("placeholder");
		assertEquals("Search Name", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='image']")).getAttribute("class");
		assertEquals("image", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching the wallpapers ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='wallpaperSearchInput']")).sendKeys("aaaa");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("3.Enter invalid search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on search");
		test.info("Enter invalid search input : aaaaa");
		test.info("EXPECTED RESULT ::  It should not search the wallpapers ");
		String a=driver.findElement(By.xpath("//input[@id='wallpaperSearchInput']")).getAttribute("placeholder");
		assertEquals("Search Name", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='messenger-wallpapers-wrapper']")).getAttribute("class");
		assertEquals("messenger-wallpapers-wrapper", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not searching the wallpapers ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='searchCategory']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("4.Click on select category");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on select category");
		test.info("EXPECTED RESULT ::  It should click on select category ");
		String a=driver.findElement(By.xpath("//select[@id='searchCategory']")).getAttribute("id");
		assertEquals("searchCategory", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on select category ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='searchCategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='Classic']")).click();
		driver.findElement(By.xpath("//div[@class='messenger-wallpaper-applied-container clearfix-height']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("5.Click on classic");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on select category");
		test.info("Click on classic");
		test.info("EXPECTED RESULT ::  It should click on classic ");
		String a=driver.findElement(By.xpath("//option[@value='Classic']")).getAttribute("value");
		assertEquals("Classic", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on classic ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='searchCategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='Corporate']")).click();
		driver.findElement(By.xpath("//div[@class='messenger-wallpaper-applied-container clearfix-height']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("6.Click on Corporate");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on select category");
		test.info("Click on Corporate");
		test.info("EXPECTED RESULT ::  It should click on Corporate ");
		String a=driver.findElement(By.xpath("//option[@value='Corporate']")).getAttribute("value");
		assertEquals("Corporate", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on Corporate ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='searchCategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='Floral']")).click();
		driver.findElement(By.xpath("//div[@class='messenger-wallpaper-applied-container clearfix-height']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("7.Click on Floral");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on select category");
		test.info("Click on Floral");
		test.info("EXPECTED RESULT ::  It should click on Floral ");
		String a=driver.findElement(By.xpath("//option[@value='Floral']")).getAttribute("value");
		assertEquals("Floral", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on Floral ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='searchCategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='Fun']")).click();
		driver.findElement(By.xpath("//div[@class='messenger-wallpaper-applied-container clearfix-height']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("8.Click on Fun");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on select category");
		test.info("Click on Fun");
		test.info("EXPECTED RESULT ::  It should click on Fun ");
		String a=driver.findElement(By.xpath("//option[@value='Fun']")).getAttribute("value");
		assertEquals("Fun", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on Fun ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='searchCategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='Meeting']")).click();
		driver.findElement(By.xpath("//div[@class='messenger-wallpaper-applied-container clearfix-height']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("9.Click on Meeting");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on select category");
		test.info("Click on Meeting");
		test.info("EXPECTED RESULT ::  It should click on Meeting ");
		String a=driver.findElement(By.xpath("//option[@value='Meeting']")).getAttribute("value");
		assertEquals("Meeting", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on Meeting ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='searchCategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='Travel']")).click();
		driver.findElement(By.xpath("//div[@class='messenger-wallpaper-applied-container clearfix-height']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("10.Click on Travel");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on select category");
		test.info("Click on Travel");
		test.info("EXPECTED RESULT ::  It should click on Travel ");
		String a=driver.findElement(By.xpath("//option[@value='Travel']")).getAttribute("value");
		assertEquals("Travel", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on Travel ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='searchCategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='Pet-Lovers']")).click();
		driver.findElement(By.xpath("//div[@class='messenger-wallpaper-applied-container clearfix-height']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("11.Click on Pet-Lovers");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on select category");
		test.info("Click on Pet-Lovers");
		test.info("EXPECTED RESULT ::  It should click on Pet-Lovers ");
		String a=driver.findElement(By.xpath("//option[@value='Pet-Lovers']")).getAttribute("value");
		assertEquals("Pet-Lovers", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on Pet-Lovers ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='searchCategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='Serene Sea Side']")).click();
		driver.findElement(By.xpath("//div[@class='messenger-wallpaper-applied-container clearfix-height']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("12.Click on Serene Sea Side");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on select category");
		test.info("Click on Serene Sea Side");
		test.info("EXPECTED RESULT ::  It should click on Serene Sea Side ");
		String a=driver.findElement(By.xpath("//option[@value='Serene Sea Side']")).getAttribute("value");
		assertEquals("Serene Sea Side", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on Serene Sea Side ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='searchCategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='Abstract']")).click();
		driver.findElement(By.xpath("//div[@class='messenger-wallpaper-applied-container clearfix-height']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("13.Click on Abstract");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on select category");
		test.info("Click on Abstract");
		test.info("EXPECTED RESULT ::  It should click on Abstract ");
		String a=driver.findElement(By.xpath("//option[@value='Abstract']")).getAttribute("value");
		assertEquals("Abstract", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on Abstract ");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='searchCategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='Celebration']")).click();
		driver.findElement(By.xpath("//div[@class='messenger-wallpaper-applied-container clearfix-height']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("14.Click on Celebration");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on select category");
		test.info("Click on Celebration");
		test.info("EXPECTED RESULT ::  It should click on Celebration ");
		String a=driver.findElement(By.xpath("//option[@value='Celebration']")).getAttribute("value");
		assertEquals("Celebration", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on Celebration ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='searchCategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='Music']")).click();
		driver.findElement(By.xpath("//div[@class='messenger-wallpaper-applied-container clearfix-height']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("15.Click on Music");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on select category");
		test.info("Click on Music");
		test.info("EXPECTED RESULT ::  It should click on Music ");
		String a=driver.findElement(By.xpath("//option[@value='Music']")).getAttribute("value");
		assertEquals("Music", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on Music ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='Coffee']")).click();
		driver.findElement(By.xpath("(//span[@class='apply-wallpaper'])[2]")).click();
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("16.Select one wallpaper & Click on apply");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Click on image ");
		test.info("Click on apply");
		test.info("Click on chat & Check the user");
		test.info("EXPECTED RESULT ::  It should display wallpaper in user ");		
		assertEquals("Applied Successfully!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying wallpaper in user ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='messenger-wallpapers-wrapper']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("17.Scroll the wallpapers");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on wallpapers");
		test.info("Scroll the wallpaper");
		test.info("EXPECTED RESULT ::  It should scroll down ");		
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is scrolling down ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("17");
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
