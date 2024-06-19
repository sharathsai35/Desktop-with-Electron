package Troopgrit;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

public class Loginandsendmessage {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("Loginandsendmessage1.html");
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
		Thread.sleep(1000);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		Thread.sleep(1000);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		Thread.sleep(1000);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
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
	public void test000() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("##LOGIN USER##");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Login : Click on login button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='error']")).getText();
		assertEquals("Please enter username", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying toast msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("Login");
	}
	@Test
	public void test001() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("1.Enter only username");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Login : Click on login button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='error']")).getText();
		assertEquals("Password is required!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying toast msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("1");
	}
	@Test
	public void test002() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("2.Enter only password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='error']")).getText();
		assertEquals("Please enter username", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying toast msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("2");
	}
	@Test
	public void test003() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("aaaaaa");
		driver.findElement(By.id("password")).sendKeys("aaaaaa");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("3.Enter invalid username & invalid password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : aaaaa ");
		test.info("Password : aaaaaa");
		test.info("Login : Click on login button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='error']")).getText();
		assertEquals("<!DOCTYPE html> <html lang=\"en\"> <head> <meta charset=\"utf-8\"> <title>Error</title> </head> <body> <pre>Cannot POST /ldap/user/v1/authenticate</pre> </body> </html>", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying toast msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("3");
	}
	@Test
	public void test004() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("aaaaaa");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("4.Enter invalid username & valid password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : aaaaaa ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='error']")).getText();
		assertEquals("<!DOCTYPE html> <html lang=\"en\"> <head> <meta charset=\"utf-8\"> <title>Error</title> </head> <body> <pre>Cannot POST /ldap/user/v1/authenticate</pre> </body> </html>", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying toast msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("4");
	}
	@Test
	public void test005() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("aaaaaaa");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("5.Enter valid username & invalid password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : aaaaaaa");
		test.info("Login : Click on login button");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='error']")).getText();
		assertEquals("<!DOCTYPE html> <html lang=\"en\"> <head> <meta charset=\"utf-8\"> <title>Error</title> </head> <body> <pre>Cannot POST /ldap/user/v1/authenticate</pre> </body> </html>", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying toast msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("5");
	}
	@Test
	public void test006() throws InterruptedException {
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
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("6.Enter with valid username & password");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("EXPECTED RESULT ::  It should login into the user ");
		String a=driver.findElement(By.xpath("//div[@class='messenger-app-wrapper active']")).getAttribute("data-app");
		assertEquals("message", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is logging into the user ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("6");
	}
	@Test
	public void test007() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("7.##SEND MESSAGE##");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself");
		test.info("Enter text : test");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the text msg ");
		String a=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the text msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("7");
	}
	@Test
	public void test008() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("8.Send attachment image");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself");
		test.info("Click on attachment");
		test.info("Click on any image");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of image ");
		String a=driver.findElement(By.xpath("//div[@class='image_attachment_background']")).getAttribute("class");
		assertEquals("image_attachment_background", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of image ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("8");
	}
	@Test
	public void test009() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/20210827_180112.mp4");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("9.Send attachment video");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself");
		test.info("Click on attachment");
		test.info("Click on any video");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of video ");
		String a=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']")).getAttribute("class");
		assertEquals("video-attachment-wrapper", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of video ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("9");
	}
	@Test
	public void test010() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/eclipse-inst-jre-linux64/Test/Readreceiptgroupgrit1.html");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("10.Send attachment doc");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself");
		test.info("Click on attachment");
		test.info("Click on any doc");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of doc ");
		String a=driver.findElement(By.xpath("//span[@class='messenger-attachment-link-name']")).getText();
		assertEquals("Readreceiptgroupgrit1.html", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of doc ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("10");
	}
	@Test
	public void test011() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/ElectronAPIDemosSetup.exe");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("11.Send attachment with exe file");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself");
		test.info("Click on attachment");
		test.info("Click on exe file");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should not send the attachment of exe file ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("exe format is not supported!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not sending the attachment of exe file ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("11");
	}
	@Test
	public void test012() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/1638963475702.mp3");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("12.Send attachment audio file");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself");
		test.info("Click on attachment");
		test.info("Click on audio file");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of audio file ");
		String a=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		assertEquals("audio-attachment-wrapper", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of audio file ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("12");
	}
	@Test
	public void test013() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("13.Send the voice message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself");
		test.info("Click on voice message icon");
		test.info("Wait for few seconds");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the voice message ");
		String a=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		assertEquals("audio-attachment-wrapper", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the voice message ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("13");
	}
	@Test
	public void test014() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//div[@class='input-code-btn input-action-btn']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("14.Send the code snippet without code/text");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself");
		test.info("Click on code snippet icon");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Code cannot be empty!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the code snippet msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("14");
	}
	@Test
	public void test015() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//div[@class='input-code-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("15.Send the code snippet");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself");
		test.info("Click on code snippet icon");
		test.info("Enter text/code : test");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the code snippet msg ");
		String a=driver.findElement(By.xpath("//div[@class='code-snippet-wrapper']")).getAttribute("class");
		assertEquals("code-snippet-wrapper", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the code snippet msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("15");
	}
	@Test
	public void test016() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("16.##Send Message with Read Receipt##");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Enter text : test");
		test.info("Click on read receipt");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the text msg with read receipt symbol ");
		String a=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the text msg with read receipt symbol ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("16");
	}
	@Test
	public void test017() throws InterruptedException, AWTException {
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
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("17.Send attachment image with read receipt");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on read receipt");
		test.info("Click on attachment");
		test.info("Click on any image");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of image with read receipt symbol ");
		String a=driver.findElement(By.xpath("//div[@class='image_attachment_background']")).getAttribute("class");
		assertEquals("image_attachment_background", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of image with read receipt symbol ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("17");
	}
	@Test
	public void test018() throws InterruptedException, AWTException {
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
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/20210827_180112.mp4");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("18.Send attachment video with read receipt");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on read receipt");
		test.info("Click on attachment");
		test.info("Click on any video");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of video with read receipt symbol ");
		String a=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']")).getAttribute("class");
		assertEquals("video-attachment-wrapper", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of video with read receipt symbol ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("18");
	}
	@Test
	public void test019() throws InterruptedException, AWTException {
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
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/eclipse-inst-jre-linux64/Test/Readreceiptgroupgrit1.html");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("19.Send attachment doc with read receipt");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on read receipt");
		test.info("Click on attachment");
		test.info("Click on any doc");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of doc with read receipt symbol ");
		String a=driver.findElement(By.xpath("//span[@class='messenger-attachment-link-name']")).getText();
		assertEquals("Readreceiptgroupgrit1.html", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of doc with read receipt symbol ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("19");
	}
	@Test
	public void test020() throws InterruptedException, AWTException {
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
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/1638963475702.mp3");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("20.Send attachment audio file with read receipt");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on read receipt");
		test.info("Click on attachment");
		test.info("Click on audio file");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of audio file with read receipt symbol ");
		String a=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		assertEquals("audio-attachment-wrapper", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of audio file with read receipt symbol ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("20");
	}
	@Test
	public void test021() throws InterruptedException, AWTException {
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
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("21.Send the voice message with read receipt");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on read receipt");
		test.info("Click on voice message icon");
		test.info("Wait for few seconds");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the voice message with read receipt symbol ");
		String a=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		assertEquals("audio-attachment-wrapper", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the voice message with read receipt symbol ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("21");
	}
	@Test
	public void test022() throws InterruptedException, AWTException {
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
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//div[@class='input-code-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("22.Send the code snippet with read receipt");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on read receipt");
		test.info("Click on code snippet icon");
		test.info("Enter text/code : test");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the code snippet msg with read receipt symbol ");
		String a=driver.findElement(By.xpath("//div[@class='code-snippet-wrapper']")).getAttribute("class");
		assertEquals("code-snippet-wrapper", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the code snippet msg with read receipt symbol ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("22");
	}
	@Test
	public void test023() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("23.##Send attachment with caption## image");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself");
		test.info("Click on attachment");
		test.info("Click on any image");
		test.info("Enter caption : test");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of image with caption ");
		String a=driver.findElement(By.xpath("//div[@class='image_attachment_background']")).getAttribute("class");
		assertEquals("image_attachment_background", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='image-caption']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of image with caption ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("23");
	}
	@Test
	public void test024() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/20210827_180112.mp4");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("24.Send attachment video with caption ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself");
		test.info("Click on attachment");
		test.info("Click on any video");
		test.info("Enter caption : test");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of video with caption ");
		String a=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']")).getAttribute("class");
		assertEquals("video-attachment-wrapper", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='image-caption']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of video with caption ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("24");
	}
	@Test
	public void test025() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/eclipse-inst-jre-linux64/Test/Readreceiptgroupgrit1.html");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("25.Send attachment doc with caption");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself");
		test.info("Click on attachment");
		test.info("Click on any doc");
		test.info("Enter caption : test");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of doc with caption ");
		String a=driver.findElement(By.xpath("//span[@class='messenger-attachment-link-name']")).getText();
		assertEquals("Readreceiptgroupgrit1.html", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='image-caption']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of doc with caption ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("25");
	}
	@Test
	public void test026() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/1638963475702.mp3");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("26.Send attachment audio file with caption");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself");
		test.info("Click on attachment");
		test.info("Click on audio file");
		test.info("Enter caption : test");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of audio file with caption ");
		String a=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		assertEquals("audio-attachment-wrapper", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='image-caption']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of audio file with caption ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("26");
	}
	@Test
	public void test027() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='forkoutUser-1-14-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		String a1=driver.findElement(By.xpath("//span[@class='forkout-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("27.##Send Message with Forkout##");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Enter text : test");
		test.info("Click on forkout");
		test.info("Select the users/groups");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the text msg for selected users/groups with forkout symbol ");
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("forkout-conversation-label-icon", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@data-name='uppi']")).getText();
		assertEquals("Uppi", a2);
		test.pass(a2);
		System.out.println(a2);
		String a3=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		String a4=driver.findElement(By.xpath("//span[@class='forkout-conversation-label-icon']")).getAttribute("class");
		assertEquals("test", a3);
		test.pass(a3);
		System.out.println(a3);
		assertEquals("forkout-conversation-label-icon", a4);
		test.pass(a4);
		System.out.println(a4);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the text msg for selected users/groups with forkout symbol ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("27");
	}
	@Test
	public void test028() throws InterruptedException, AWTException {
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
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='forkoutUser-1-14-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(3000);
		String a=driver.findElement(By.xpath("//div[@class='image_attachment_background']")).getAttribute("class");
		String a1=driver.findElement(By.xpath("//span[@class='forkout-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("28.Send attachment image with forkout");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on forkout");
		test.info("Select users/groups");
		test.info("Click on attachment");
		test.info("Click on any image");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of image for users/groups with forkout symbol ");
		assertEquals("image_attachment_background", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("forkout-conversation-label-icon", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@data-name='uppi']")).getText();
		assertEquals("Uppi", a2);
		test.pass(a2);
		System.out.println(a2);
		String a3=driver.findElement(By.xpath("//div[@class='image_attachment_background']")).getAttribute("class");
		String a4=driver.findElement(By.xpath("//span[@class='forkout-conversation-label-icon']")).getAttribute("class");
		assertEquals("image_attachment_background", a3);
		test.pass(a3);
		System.out.println(a3);
		assertEquals("forkout-conversation-label-icon", a4);
		test.pass(a4);
		System.out.println(a4);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of image for users/groups with forkout symbol ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("28");
	}
	@Test
	public void test029() throws InterruptedException, AWTException {
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
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='forkoutUser-1-14-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/20210827_180112.mp4");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(8000);
		String a=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']")).getAttribute("class");
		String a1=driver.findElement(By.xpath("//span[@class='forkout-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("29.Send attachment video with forkout");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on forkout");
		test.info("Select users/groups");
		test.info("Click on attachment");
		test.info("Click on any video");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of video for users/groups with forkout symbol ");
		assertEquals("video-attachment-wrapper", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("forkout-conversation-label-icon", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@data-name='uppi']")).getText();
		assertEquals("Uppi", a2);
		test.pass(a2);
		System.out.println(a2);
		String a3=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']")).getAttribute("class");
		assertEquals("video-attachment-wrapper", a3);
		test.pass(a3);
		System.out.println(a3);
		String a4=driver.findElement(By.xpath("//span[@class='forkout-conversation-label-icon']")).getAttribute("class");
		assertEquals("forkout-conversation-label-icon", a4);
		test.pass(a4);
		System.out.println(a4);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of video for users/groups with forkout symbol ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("29");
	}
	@Test
	public void test030() throws InterruptedException, AWTException {
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
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='forkoutUser-1-14-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/eclipse-inst-jre-linux64/Test/Readreceiptgroupgrit1.html");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(4000);
		String a=driver.findElement(By.xpath("//span[@class='messenger-attachment-link-name']")).getText();
		String a1=driver.findElement(By.xpath("//span[@class='forkout-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		Thread.sleep(4000);
		ExtentTest test=extent.createTest("30.Send attachment doc with forkout");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on forkout");
		test.info("Select users/groups");
		test.info("Click on attachment");
		test.info("Click on any doc");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of doc for users/groups with forkout symbol ");
		assertEquals("Readreceiptgroupgrit1.html", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("forkout-conversation-label-icon", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@data-name='uppi']")).getText();
		assertEquals("Uppi", a2);
		test.pass(a2);
		System.out.println(a2);
		String a3=driver.findElement(By.xpath("//span[@class='messenger-attachment-link-name']")).getText();
		assertEquals("Readreceiptgroupgrit1.html", a3);
		test.pass(a3);
		System.out.println(a3);
		String a4=driver.findElement(By.xpath("//span[@class='forkout-conversation-label-icon']")).getAttribute("class");
		assertEquals("forkout-conversation-label-icon", a4);
		test.pass(a4);
		System.out.println(a4);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of doc for users/groups with forkout symbol ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("30");
	}
	@Test
	public void test031() throws InterruptedException, AWTException {
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
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='forkoutUser-1-14-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/1638963475702.mp3");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		String a1=driver.findElement(By.xpath("//span[@class='forkout-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("31.Send attachment audio file with forkout");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on forkout");
		test.info("Select the users/groups");
		test.info("Click on attachment");
		test.info("Click on audio file");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the attachment of audio file for users/groups with forkout symbol ");
		assertEquals("audio-attachment-wrapper", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("forkout-conversation-label-icon", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@data-name='uppi']")).getText();
		assertEquals("Uppi", a2);
		test.pass(a2);
		System.out.println(a2);
		String a3=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		assertEquals("audio-attachment-wrapper", a3);
		test.pass(a3);
		System.out.println(a3);
		String a4=driver.findElement(By.xpath("//span[@class='forkout-conversation-label-icon']")).getAttribute("class");
		assertEquals("forkout-conversation-label-icon", a4);
		test.pass(a4);
		System.out.println(a4);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the attachment of audio file for users/groups with forkout symbol ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("31");
	}
	@Test
	public void test032() throws InterruptedException, AWTException {
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
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='forkoutUser-1-14-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		String a1=driver.findElement(By.xpath("//span[@class='forkout-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("32.Send the voice message with forkout");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on forkout");
		test.info("Select users/groups");
		test.info("Click on voice message icon");
		test.info("Wait for few seconds");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the voice message for users/groups with forkout symbol ");
		assertEquals("audio-attachment-wrapper", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("forkout-conversation-label-icon", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@data-name='uppi']")).getText();
		assertEquals("Uppi", a2);
		test.pass(a2);
		System.out.println(a2);
		String a3=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		assertEquals("audio-attachment-wrapper", a3);
		test.pass(a3);
		System.out.println(a3);
		String a4=driver.findElement(By.xpath("//span[@class='forkout-conversation-label-icon']")).getAttribute("class");
		assertEquals("forkout-conversation-label-icon", a4);
		test.pass(a4);
		System.out.println(a4);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the voice message for users/groups with forkout symbol ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("32");
	}
	@Test
	public void test033() throws InterruptedException, AWTException {
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
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-code-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='forkoutUser-1-14-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(5000);
		String a=driver.findElement(By.xpath("//div[@class='code-snippet-wrapper']")).getAttribute("class");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name='uppi']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("33.Send the code snippet with forkout");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on forkout");
		test.info("Select users/groups");
		test.info("Click on code snippet icon");
		test.info("Enter text/code : test");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the code snippet msg for users/groups with forkout symbol ");
		assertEquals("code-snippet-wrapper", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//span[@data-name='uppi']")).getText();
		assertEquals("Uppi", a2);
		test.pass(a2);
		System.out.println(a2);
		String a3=driver.findElement(By.xpath("//div[@class='code-snippet-wrapper']")).getAttribute("class");
		assertEquals("code-snippet-wrapper", a3);
		test.pass(a3);
		System.out.println(a3);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not sending the code snippet msg for users/groups with forkout symbol and it is highlighting forkout symbol with users/groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("33");
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
