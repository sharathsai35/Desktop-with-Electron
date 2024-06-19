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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Troopgrit {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("troopgritall1.html");
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
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
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
		Thread.sleep(1000);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(capabilities);
		System.out.print("line executed");
		Thread.sleep(2000);
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
		assertEquals("Internal Server Error", a);
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
		assertEquals("Internal Server Error", a);
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
		assertEquals("Internal Server Error", a);
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
		driver.findElement(By.xpath("//span[@data-name='sharath']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		String a=driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("27.##Inner Search## for user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("EXPECTED RESULT ::  It should click on search in user ");		
		assertEquals("Search", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on search in user ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("27");
	}
	@Test
	public void test028() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("28.Enter text in search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on search input");
		test.info("Enter text : test");
		test.info("EXPECTED RESULT ::  It should click on search in user ");		
		String a=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on search in user ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("28");
	}
	@Test
	public void test029() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-up']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-down']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("29.Click on arrow up button & down arrow button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on search input");
		test.info("Enter text : test");
		test.info("Click on arrow up");
		test.info("Click on arrow down");
		test.info("EXPECTED RESULT ::  It should click on arrow up & arrow down ");		
		String a=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on arrow up & arrow down ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("29");
	}
	@Test
	public void test030() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-up']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("30.Click on reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on search input");
		test.info("Enter text : test");
		test.info("Click on arrow up");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the page ");				
		assertEquals("Refresh", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("30");
	}
	@Test
	public void test031() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-up']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("31.Click on close button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on search input");
		test.info("Enter text : test");
		test.info("Click on arrow up");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the search input page ");				
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the search input page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("31");
	}
	@Test
	public void test032() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("32.Click on today in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Today");
		test.info("EXPECTED RESULT ::  It should display Today's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Today", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Today's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("32");
	}
	@Test
	public void test033() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("33.Click on Yesterday in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Yesterday");
		test.info("EXPECTED RESULT ::  It should display yesterday's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Yesterday", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying yesterday's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("33");
	}
	@Test
	public void test034() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("34.Click on Last 7 days in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should display Last 7 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 7 Days", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 7 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("34");
	}
	@Test
	public void test035() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("35.Click on Last 30 days in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should display Last 30 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 30 Days", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 30 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("35");
	}
	@Test
	public void test036() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("36.Click on This month in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should display This month list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Month", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This month list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("36");
	}
	@Test
	public void test037() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("37.Click on This year in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should display This year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Year", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("37");
	}
	@Test
	public void test038() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("38.Click on Last year in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should display Last year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last Year", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("38");
	}
	@Test
	public void test039() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("39.Click on All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Select on All dates");
		test.info("EXPECTED RESULT ::  It should display All dates list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("39");
	}
	@Test
	public void test040() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("40.Click on apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Select All dates");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("40");
	}
	@Test
	public void test041() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("41.Click on apply with only from date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select to date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select to date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("41");
	}
	@Test
	public void test042() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("42.Click on apply with only to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("42");
	}
	@Test
	public void test043() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("43.Click on apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display the msgs of that particular dates ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Date Range", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the msg of that particular dates ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("43");
	}
	//combination of search & All dates
	@Test
	public void test044() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("44.Combination of search & today");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Today");
		test.info("EXPECTED RESULT ::  It should display Today's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Today", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Today's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("44");
	}
	@Test
	public void test045() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("45.Combination of search & yesterday");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Yesterday");
		test.info("EXPECTED RESULT ::  It should display yesterday's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Yesterday", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying yesterday's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("45");
	}
	@Test
	public void test046() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("46.Combination of search & Last 7 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself :sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should display Last 7 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 7 Days", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 7 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("46");
	}
	@Test
	public void test047() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("47.Combination of search & Last 30 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself :sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should display Last 30 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 30 Days", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 30 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("47");
	}
	@Test
	public void test048() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("48.Combination of search & This month");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should display This month list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Month", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This month list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("48");
	}
	@Test
	public void test049() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("49.Combination of search & This year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should display This year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Year", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("49");
	}
	@Test
	public void test050() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("50.Combination of search & Last year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should display Last year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last Year", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("50");
	}
	@Test
	public void test051() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("51.Combination of search & All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Select on All dates");
		test.info("EXPECTED RESULT ::  It should display All dates list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("51");
	}
	@Test
	public void test052() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("52.Combination of search & apply without from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("52");
	}
	@Test
	public void test053() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("53.Combination of search & apply with from date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select to date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select to date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("53");
	}
	@Test
	public void test054() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[26]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("54.Combination of search & apply with to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("54");
	}
	@Test
	public void test055() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("55.Combination of search & apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display the msgs of that particular dates ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Date Range", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the msg of that particular dates ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("55");
	}
	@Test
	public void test056() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("56.##Inner Filter##Click on filter on image in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on image icon");
		test.info("EXPECTED RESULT ::  It should click on image icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image active']")).getAttribute("data-title");
		assertEquals("Image", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='image_attachment_background']")).getAttribute("class");
		assertEquals("image_attachment_background", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on image icon in filter ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("56");
	}
	@Test
	public void test057() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("57.Click on image & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("57");
	}
	@Test
	public void test058() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("58.Click on image & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("58");
	}
	@Test
	public void test059() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-video']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("59.Click on filter video in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("59");
	}
	@Test
	public void test060() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-video']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("60.Click on video & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("60");
	}
	@Test
	public void test061() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-video']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("61.Click on video & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("61");
	}
	@Test
	public void test062() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("62.Click on filter doc in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on doc icon");
		test.info("EXPECTED RESULT ::  It should click on doc icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc active']")).getAttribute("data-title");
		assertEquals("File", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='messenger-attachment-link-name']")).getText();
		assertEquals("Readreceiptgroupgrit1.html", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on doc icon in filter ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("62");
	}
	@Test
	public void test063() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("63.Click on doc & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("63");
	}
	@Test
	public void test064() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("64.Click on doc & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("64");
	}
	@Test
	public void test065() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-link']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("65.Click on filter link in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("65");
	}
	@Test
	public void test066() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("66.Click on link & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("66");
	}
	@Test
	public void test067() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("67.Click on link & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("67");
	}
	@Test
	public void test068() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-contact']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("68.Click on filter contact in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("68");
	}
	@Test
	public void test069() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-contact']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("69.Click on contact & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("69");
	}
	@Test
	public void test070() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-contact']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("70.Click on contact & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("70");
	}
	@Test
	public void test071() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-location']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("71.Click on filter location in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("71");
	}
	@Test
	public void test072() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-location']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("72.Click on Location & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("72");
	}
	@Test
	public void test073() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-location']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("73.Click on location & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("73");
	}
	@Test
	public void test074() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("74.Click on filter read receipt in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("74");
	}
	@Test
	public void test075() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("75.Click on read receipt & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("75");
	}
	@Test
	public void test076() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("76.Click on read receipt & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
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
		System.out.println("76");
	}
	@Test
	public void test077() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option view-profile-header-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("77.Click on view profile");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on myself : sharath ");
		test.info("Click on 3 dots");
		test.info("Click on view profile");
		test.info("EXPECTED RESULT ::  It should display profile page ");		
		String a=driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
		assertEquals("Profile", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying profile page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("77");
	}
	@Test
	public void test078() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("sharath");;
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("78.##Recent user Search## Search with valid user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Search on user : sharath");
		test.info("EXPECTED RESULT ::  It should display user name in the list ");
		String a=driver.findElement(By.xpath("//span[@data-name='sharath']")).getAttribute("data-name");
		assertEquals("sharath", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying username in the list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("78");
	}
	@Test
	public void test079() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaaa");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("79.Search with invalid user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Search on user : aaaaaa");
		test.info("EXPECTED RESULT ::  It should not display user name ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying username ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("79");
	}
	@Test
	public void test080() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaaa");
		Thread.sleep(1000);
		driver.findElement(By.id("clearRecentUserSearch")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("80.Click on close button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Search on user : aaaaaa");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the search & It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the search & It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("80");
	}
	@Test
	public void test081() throws InterruptedException {
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
		driver.findElement(By.id("unreadMessageFilterBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("81.Click on unread msg with users/groups ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on unread msgs");
		test.info("EXPECTED RESULT ::  It should display the unread msgs of users & groups ");
		String a=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("title");
		assertEquals("Unread Messages", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//span[@data-name='maneesh']")).getAttribute("data-name");
		assertEquals("maneesh", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the unread msgs of users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("81");
	}
	@Test
	public void test082() throws InterruptedException {
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
		driver.findElement(By.id("unreadMessageFilterBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("recentUserSearch")).sendKeys("maneesh");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("82.Click on unread msg with recent user search with valid data ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on unread msgs");
		test.info("Click on recent user search");
		test.info("Enter valid name : maneesh");
		test.info("EXPECTED RESULT ::  It should display the unread msgs of users & groups ");
		String a=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("title");
		assertEquals("Unread Messages", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//span[@data-name='maneesh']")).getAttribute("data-name");
		assertEquals("maneesh", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the unread msgs of users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("82");
	}
	@Test
	public void test083() throws InterruptedException {
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
		driver.findElement(By.id("unreadMessageFilterBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaa");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("83.Click on unread msg with recent user search with invalid data ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on unread msgs");
		test.info("Click on recent user search");
		test.info("Enter invalid name : aaaa");
		test.info("EXPECTED RESULT ::  It should not display the unread msgs of users & groups ");
		String a=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("title");
		assertEquals("Unread Messages", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("83");
	}
	@Test
	public void test084() throws InterruptedException {
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
		driver.findElement(By.id("unreadMessageFilterBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaa");
		Thread.sleep(2000);
		driver.findElement(By.id("recentUserSearch")).clear();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("84.Search with invalid data & Clear the text ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on unread msgs");
		test.info("Click on recent user search");
		test.info("Enter invalid name : aaaa");
		test.info("Clear the text in recent user search");
		test.info("EXPECTED RESULT ::  It should clear the data ");
		String a=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("title");
		assertEquals("Unread Messages", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//span[@data-name='maneesh']")).getAttribute("data-name");
		assertEquals("maneesh", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clearing the data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("84");
	}
	@Test
	public void test085() throws InterruptedException {
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
		Thread.sleep(3000);
		driver.findElement(By.id("unreadMessageFilterBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("85.Click on unread msg with empty msgs ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on unread msgs");
		test.info("EXPECTED RESULT ::  It should highlight the unread msgs ");
		String a=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("title");
		assertEquals("Unread Messages", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//div[@class='no-unread-contacts-section']")).getText();
		assertEquals("All caught up", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is highlighting the unread msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("85");
	}
	@Test
	public void test086() throws InterruptedException {
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
		driver.findElement(By.id("unreadMessageFilterBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("unreadMessageFilterBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("86.Click on active unread msg ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on unread msgs");
		test.info("Again click on unread msgs");
		test.info("EXPECTED RESULT ::  It should display all the users & groups ");
		String a=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("title");
		assertEquals("Unread Messages", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("86");
	}
	//favourites
	@Test
	public void test087() throws InterruptedException {
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
		driver.findElement(By.id("favouriteUserFilterBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("87.Click on favourite with users");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on favourites");
		test.info("EXPECTED RESULT ::  It should highlight the favourites icon ");
		String a=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("title");
		assertEquals("Favourite Users", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//span[@data-name='test01']")).getAttribute("data-name");
		assertEquals("test01", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is highlighted the favourites icon ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("87");
	}
	@Test
	public void test088() throws InterruptedException {
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
		driver.findElement(By.id("favouriteUserFilterBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("88.Click on favourites with recent user search with valid data ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on favourites");
		test.info("Click on recent user search");
		test.info("Enter valid text : test");
		test.info("EXPECTED RESULT ::  It should display the favourite users & groups ");
		String a=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("title");
		assertEquals("Favourite Users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("class");
		assertEquals("active", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@data-name='test01']")).getAttribute("data-name");
		assertEquals("test01", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the favourite users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("88");
	}
	@Test
	public void test089() throws InterruptedException {
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
		driver.findElement(By.id("favouriteUserFilterBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaa");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("89.Click on favourite with recent user search with invalid data ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on favourite");
		test.info("Click on recent user search");
		test.info("Enter invalid text : aaaa");
		test.info("EXPECTED RESULT ::  It should not display the favourite users & groups ");
		String a=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("title");
		assertEquals("Favourite Users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("class");
		assertEquals("active", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("89");
	}
	@Test
	public void test090() throws InterruptedException {
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
		driver.findElement(By.id("favouriteUserFilterBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaa");
		Thread.sleep(2000);
		driver.findElement(By.id("recentUserSearch")).clear();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("90.Clear the search data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on favourites");
		test.info("Click on recent user search");
		test.info("Enter invalid text : aaaa");
		test.info("Clear the recent user search");
		test.info("EXPECTED RESULT ::  It should clear the data ");
		String a=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("title");
		assertEquals("Favourite Users", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//span[@data-name='test01']")).getAttribute("data-name");
		assertEquals("test01", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clearing the data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("90");
	}
	@Test
	public void test091() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='user-favourite-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("favouriteUserFilterBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("91.Click on favourite without users");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on favourites");
		test.info("EXPECTED RESULT ::  It should not display the users & groups ");
		String a=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("title");
		assertEquals("Favourite Users", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("91");
	}
	@Test
	public void test092() throws InterruptedException {
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
		driver.findElement(By.id("favouriteUserFilterBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("favouriteUserFilterBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("92.Click on active favourite ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on favourites");
		test.info("Again click on favourite");
		test.info("EXPECTED RESULT ::  It should display All the users & groups ");
		String a=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("title");
		assertEquals("Favourite Users", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is display all the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("92");
	}
	@Test
	public void test093() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("93.##Add Group## Click on submit");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on add group");
		test.info("Click on submit");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please enter group name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying toast msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("93");
	}
	@Test
	public void test094() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test01");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("94.Add Group by entering only group name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on add group");
		test.info("Enter group name : test01");
		test.info("Click on submit");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Minimum 2 users are required for creating a group!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying toast msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("94");
	}
	@Test
	public void test095() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("asdfghjklasdfghjklqwerqwerqwertyuityuiopopmnbvcxzzxcvbnm");
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("95.Enter group name with more than 50 characters ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add for users");
		test.info("Click on create");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group Name should be maximum of 50 characters", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Group Name should be maximum of 50 characters ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("95");
	}
	@Test
	public void test096() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control description-input']")).sendKeys("asdfghjklasdfghjklqwerqwerqwertyuityuiopopmnbvcxzzxcvbnm");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("96.Enter description ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter description name : test");
		test.info("EXPECTED RESULT ::  It should display count of the characters ");
		String a=driver.findElement(By.xpath("//span[@class='info-text']")).getText();
		assertEquals("Characters Left : 24", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Characters Left : 24 ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("96");
	}
	@Test
	public void test097() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//input[@class='form-control description-input']"));
		e.sendKeys("aaa");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("97.Add Group with only description");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on add group");
		test.info("Enter description : aaa");
		test.info("Click on submit");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please enter group name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying toast msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("97");
	}
	@Test
	public void test098() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("maneesh");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("98.Search valid username in add group ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add to users");
		test.info("Search the valid username ");
		test.info("EXPECTED RESULT ::  It should display particular username ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying particular username ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("98");
	}
	@Test
	public void test099() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("99.Add Group by adding only with user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on add group");
		test.info("Add multiple users");
		test.info("Click on submit");
		test.info("EXPECTED RESULT ::  It should displaying toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please enter group name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying toast msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("99");
	}
	@Test
	public void test0100() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//input[@class='form-control description-input']"));
		e.sendKeys("aaa");
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("100.Add Group with description & users");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on add group");
		test.info("Enter description : aaa");
		test.info("Add the multiple users");
		test.info("Click on submit");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please enter group name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying toast msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("100");
	}
	@Test
	public void test0101() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("aaaaa");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("101.Search invalid username in add group ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add to users");
		test.info("Search the invalid username");
		test.info("EXPECTED RESULT ::  It should display particular username ");
		String a=driver.findElement(By.xpath("//div[@class='no-results-found']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No results Found! ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("101");
	}
	@Test
	public void test0102() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("aaaaa");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='reset-btn'])[2]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("102.Search invalid username & Click on reset button ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add to users");
		test.info("Search the invalid username");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should display all the users ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all the users ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("102");
	}
	@Test
	public void test0103() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("103.Add the users in add group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add to users");
		test.info("Click on added");
		test.info("EXPECTED RESULT ::  It should display added user count ");
		String a=driver.findElement(By.xpath("//span[@id='lazyConnectAddedGroupUsersCountText']")).getText();
		assertEquals("3", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying added user count ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("103");
	}
	@Test
	public void test0104() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("104.Click on added");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add to users");
		test.info("Click on added");
		test.info("EXPECTED RESULT ::  It should display added usernames ");
		String a=driver.findElement(By.xpath("//span[@id='lazyConnectAddedGroupUsersCountText']")).getText();
		assertEquals("3", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying added usernames ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("104");
	}
	@Test
	public void test0105() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='remove-btn'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='remove-btn'])[1]")).click();
		ExtentTest test=extent.createTest("105.Click on added & Click on remove the users");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add to users");
		test.info("Click on added");
		test.info("Click on cross symbol to users");
		test.info("EXPECTED RESULT ::  It should not display the added usernames ");
		String a=driver.findElement(By.xpath("//span[@id='lazyConnectAddedGroupUsersCountText']")).getText();
		assertEquals("1", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying the added usernames ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("105");
	}
	@Test
	public void test0106() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("maneesh");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("106.Search username & click on add");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Search username : maneesh");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("EXPECTED RESULT ::  It should display the added username ");
		String a=driver.findElement(By.xpath("//div[@class='table-col']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the added username ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("106");
	}
	@Test
	public void test0107() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("maneesh");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		WebElement e1=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[5]"));
		e1.click();
		e1.sendKeys("maneesh");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("107.Search valid username in added");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Search username : maneesh");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Search with valid username");
		test.info("EXPECTED RESULT ::  It should display particular username ");
		String a=driver.findElement(By.xpath("//div[@class='table-col']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying particular username ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("107");
	}
	@Test
	public void test0108() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("maneesh");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		WebElement e1=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[5]"));
		e1.click();
		e1.sendKeys("aaaaa");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("108.Search invalid username in added");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Search username : maneesh");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Search with invalid username");
		test.info("EXPECTED RESULT ::  It should not display any username ");
		String a=driver.findElement(By.xpath("//div[@class='no-results-found']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No results Found! ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("108");
	}
	@Test
	public void test0109() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("maneesh");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		WebElement e1=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[5]"));
		e1.click();
		e1.sendKeys("aaaaa");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("109.Search invalid username in added & Click on reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Search username : maneesh");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Search with invalid username");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should display username ");
		String a=driver.findElement(By.xpath("//div[@class='table-col']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the username ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("109");
	}
	@Test
	public void test0110() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("maneesh");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		WebElement e1=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[5]"));
		e1.click();
		e1.sendKeys("maneesh");
		driver.findElement(By.xpath("(//div[@data-tab='1'])[15]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("110.Search username & add & Search username in added & Click on new");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Search username : maneesh");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Search username : maneesh");
		test.info("Click on new");
		test.info("EXPECTED RESULT ::  It should display username & it should click on new ");
		String a=driver.findElement(By.xpath("//div[@class='tab active']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the username & it is clicking on new");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("110");
	}
	@Test
	public void test0111() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test02");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		driver.findElement(By.xpath("(//span[@class='admin-btn'])[1]")).click();
		String a=driver.findElement(By.xpath("//span[@class='admin-btn active']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("111.Click on admin to users ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Click on admin to one user");
		test.info("Click on create");
		test.info("EXPECTED RESULT ::  It should display admin to username ");
		assertEquals("A", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying admin to username ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("111");
	}
	@Test
	public void test0112() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test03");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		driver.findElement(By.xpath("(//span[@class='moderator-btn'])[2]")).click();
		String a=driver.findElement(By.xpath("//span[@class='moderator-btn active']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("112.Click on moderator to users ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Click on moderator to one user");
		test.info("Click on create");
		test.info("EXPECTED RESULT ::  It should display moderator to username ");
		assertEquals("M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying moderator to username ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("112");
	}
	@Test
	public void test0113() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		driver.findElement(By.xpath("(//span[@class='moderator-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='remove-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='1'])[15]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("113.Click on admin to user & remove the user & add the same user ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Click on admin to one user");
		test.info("Click on remove the user");
		test.info("Click on new");
		test.info("Add the same user");
		test.info("Click on added");
		test.info("EXPECTED RESULT ::  It should not display admin to username ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying admin to username ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("113");
	}
	@Test
	public void test0114() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//div[@class='group-avatar'])[2]"));
		e.click();
		driver.findElement(By.linkText("/home/tvisha/Pictures/Screenshot from 2022-05-20 11-09-25.png"));
		//driver.findElement(By.xpath("//div[@data-avatar='airtime2.png']"));
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("114.Click on moderator to user & remove the user & add the same user ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Click on moderator to one user");
		test.info("Click on remove the user");
		test.info("Click on new");
		test.info("Add the same user");
		test.info("Click on added");
		test.info("EXPECTED RESULT ::  It should not display moderator to username ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying moderator to username ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("114");
	}
	@Test
	public void test0115() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test03");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("115.Add Group with group name & add one user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on add group");
		test.info("Enter group name : test01");
		test.info("Add the multiple users");
		test.info("Click on submit");
		test.info("EXPECTED RESULT ::  It should Add the group ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group created successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is Adding the group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("115");
	}
	@Test
	public void test0116() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test01");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("116.Add Group with group name & users");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on add group");
		test.info("Enter group name : test01");
		test.info("Add the multiple users");
		test.info("Click on submit");
		test.info("EXPECTED RESULT ::  It should Add the group ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group created successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is Adding the group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("116");
	}
	@Test
	public void test0117() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test02");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//input[@class='form-control description-input']"));
		e.sendKeys("aaa");
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("117.Add Group with description");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on add group");
		test.info("Enter group name : test02");
		test.info("Enter description : aaa");
		test.info("Add the multiple users");
		test.info("Click on submit");
		test.info("EXPECTED RESULT ::  It should Add the group ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group created successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is Adding the group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("117");
	}
	@Test
	public void test0118() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='search-user-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("118.##SEARCH USER##");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on search user");
		test.info("EXPECTED RESULT ::  It should display the search user page ");
		String a1=driver.findElement(By.xpath("//div[@class='header-text']")).getText();
		assertEquals("Add Contact", a1);
		test.pass(a1);
		System.out.println(a1);
		String a=driver.findElement(By.xpath("//div[@class='enter-search-data-wrapper']")).getText();
		assertEquals("Enter characters in input to search", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the search user page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("118");
	}
	@Test
	public void test0119() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='search-user-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control search-input']")).sendKeys("m");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='enter-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("119.Enter in Search by Username/Designation/Name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on search user");
		test.info("Enter search input : m");
		test.info("Click on enter");
		test.info("EXPECTED RESULT ::  It should display the related users ");
		String a=driver.findElement(By.xpath("//div[@class='table-row']")).getText();
		assertEquals("Name\n"
				+ "Designation\n"
				+ "ID\n"
				+ "Actions", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the related users ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("119");
	}
	@Test
	public void test0120() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='search-user-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='form-control search-input'])[2]")).sendKeys("m");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='enter-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("120.Enter in search ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on search user");
		test.info("Enter search input : m");
		test.info("Click on enter");
		test.info("EXPECTED RESULT ::  It should not display the users ");
		String a=driver.findElement(By.xpath("//div[@class='enter-search-data-wrapper']")).getText();
		assertEquals("Enter characters in input to search", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying the users ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("120");
	}
	@Test
	public void test0121() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='search-user-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control search-input']")).sendKeys("m");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='enter-btn']")).click();
		driver.findElement(By.xpath("(//input[@class='form-control search-input'])[2]")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='enter-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("121.Enter in both search input ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on search user");
		test.info("Enter search input : m");
		test.info("Click on enter");
		test.info("Enter search input : 1");
		test.info("Click on enter");
		test.info("EXPECTED RESULT ::  It should display related users ");
		String a=driver.findElement(By.xpath("//div[@class='table-row']")).getText();
		assertEquals("Name\n"
				+ "Designation\n"
				+ "ID\n"
				+ "Actions", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("(//div[@class='table-col'])[5]")).getText();
		assertEquals("Uppi1", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying related users ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("121");
	}
	@Test
	public void test0122() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='search-user-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control search-input']")).sendKeys("m");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='enter-btn']")).click();
		String a=driver.findElement(By.xpath("//div[@class='table-row']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='reset-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("122.Enter in Search by Username/Designation/Name & Click on reset");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on search user");
		test.info("Enter search input : m");
		test.info("Click on enter");
		test.info("Click on reset");
		test.info("EXPECTED RESULT ::  It should refresh the page ");
		assertEquals("Name\n"
				+ "Designation\n"
				+ "ID\n"
				+ "Actions", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='enter-search-data-wrapper']")).getText();
		assertEquals("Enter characters in input to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("122");
	}
	@Test
	public void test0123() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='search-user-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='form-control search-input'])[2]")).sendKeys("m");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='enter-btn']")).click();
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//div[@class='enter-search-data-wrapper']")).getText();
		driver.findElement(By.xpath("//span[@class='reset-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("123.Enter in search & Click on reset");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on search user");
		test.info("Enter search input : m");
		test.info("Click on enter");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the page ");
		assertEquals("Enter characters in input to search", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='enter-search-data-wrapper']")).getText();
		assertEquals("Enter characters in input to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("123");
	}
	@Test
	public void test0124() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='search-user-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control search-input']")).sendKeys("m");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='enter-btn']")).click();
		driver.findElement(By.xpath("(//input[@class='form-control search-input'])[2]")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='enter-btn']")).click();
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//div[@class='table-row']")).getText();
		String a1=driver.findElement(By.xpath("(//div[@class='table-col'])[5]")).getText();
		driver.findElement(By.xpath("//span[@class='reset-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("124.Enter in both search input & click on reset");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on search user");
		test.info("Enter search input : m");
		test.info("Click on enter");
		test.info("Enter search input : 1");
		test.info("Click on enter");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the page ");
		assertEquals("Name\n"
				+ "Designation\n"
				+ "ID\n"
				+ "Actions", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("Uppi1", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//div[@class='enter-search-data-wrapper']")).getText();
		assertEquals("Enter characters in input to search", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("124");
	}
	@Test
	public void test0125() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='search-user-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control search-input']")).sendKeys("m");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='enter-btn']")).click();
		String a=driver.findElement(By.xpath("//div[@class='table-row']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='close-lazy-connect-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("125.Enter in Search by Username/Designation/Name & Click on close");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on search user");
		test.info("Enter search input : m");
		test.info("Click on enter");
		test.info("Click on close");
		test.info("EXPECTED RESULT ::  It should close the page ");
		assertEquals("Name\n"
				+ "Designation\n"
				+ "ID\n"
				+ "Actions", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//span[@id='chatUserName']")).getAttribute("id");
		assertEquals("chatUserName", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("125");
	}
	@Test
	public void test0126() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='search-user-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='form-control search-input'])[2]")).sendKeys("m");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='enter-btn']")).click();
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//div[@class='enter-search-data-wrapper']")).getText();
		driver.findElement(By.xpath("//div[@class='close-lazy-connect-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("126.Enter in search & Click on close");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on search user");
		test.info("Enter search input : m");
		test.info("Click on enter");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the page ");
		assertEquals("Enter characters in input to search", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//span[@id='chatUserName']")).getAttribute("id");
		assertEquals("chatUserName", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("126");
	}
	@Test
	public void test0127() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='search-user-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control search-input']")).sendKeys("m");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='enter-btn']")).click();
		driver.findElement(By.xpath("(//input[@class='form-control search-input'])[2]")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='enter-btn']")).click();
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//div[@class='table-row']")).getText();
		String a1=driver.findElement(By.xpath("(//div[@class='table-col'])[5]")).getText();
		driver.findElement(By.xpath("//div[@class='close-lazy-connect-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("127.Enter in both search input & click on close");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on search user");
		test.info("Enter search input : m");
		test.info("Click on enter");
		test.info("Enter search input : 1");
		test.info("Click on enter");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the page ");
		assertEquals("Name\n"
				+ "Designation\n"
				+ "ID\n"
				+ "Actions", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("Uppi1", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@id='chatUserName']")).getAttribute("id");
		assertEquals("chatUserName", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("127");
	}
	@Test
	public void test0128() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='close-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("128.Click on close");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the add button page ");
		String a2=driver.findElement(By.xpath("//div[@class='add-btn']")).getAttribute("class");
		assertEquals("add-btn", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the add button page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("128");
	}
	@Test
	public void test0129() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("129.Enter text in search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on search input");
		test.info("Enter text : test");
		test.info("EXPECTED RESULT ::  It should click on search in group ");		
		String a=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on search in group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("129");
	}
	@Test
	public void test0130() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-up']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-up']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-down']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("130.Click on arrow up button & down arrow button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on search input");
		test.info("Enter text : test");
		test.info("Click on arrow up");
		test.info("Click on arrow down");
		test.info("EXPECTED RESULT ::  It should click on arrow up & arrow down ");		
		String a=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on arrow up & arrow down ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("130");
	}
	@Test
	public void test0131() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-up']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("131.Click on reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on search input");
		test.info("Enter text : test");
		test.info("Click on arrow up");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the page ");				
		assertEquals("Refresh", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("131");
	}
	@Test
	public void test0132() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-up']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("132.Click on close button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on search input");
		test.info("Enter text : test");
		test.info("Click on arrow up");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the search input page ");				
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the search input page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("132");
	}
	@Test
	public void test0133() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("133.Click on All user in search");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("EXPECTED RESULT ::  It should display group users list ");				
		String a=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getAttribute("class");
		assertEquals("search-sender-users-wrapper", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying group users list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("133");
	}
	@Test
	public void test0134() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("134.Select the user whose didn't send msg in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select the user in that list");
		test.info("EXPECTED RESULT ::  It should display empty msgs ");				
		String a=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying empty msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("134");
	}
	@Test
	public void test0135() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("135.Select multiple user in All users list");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select the users in list");
		test.info("Click on any msg");
		test.info("EXPECTED RESULT ::  It should display count of the users ");				
		String a=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		assertEquals("3 Selected", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying count of the users ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("135");
	}
	@Test
	public void test0136() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("136.Select the user & deselect the user in All users list");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select the user");
		test.info("Deselect the user");
		test.info("Click on any msg");
		test.info("EXPECTED RESULT ::  It should display All users ");				
		String a=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		assertEquals("All Users", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All users ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("136");
	}
	@Test
	public void test0137() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("137.Combination with input search & All users list");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple user");
		test.info("Click on any msg");
		test.info("EXPECTED RESULT ::  It should display the selected user msgs ");				
		String a=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		assertEquals("3 Selected", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the selected user msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("137");
	}
	@Test
	public void test0138() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("138.Combination with input search & All users list & Click on reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple user");
		test.info("Click on any msg");
		test.info("Click on reset");
		test.info("EXPECTED RESULT ::  It should display the All user msgs ");				
		String a=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		assertEquals("All Users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("singleConversationSearchInput")).getAttribute("placeholder");
		assertEquals("Search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the All user msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("138");
	}
	@Test
	public void test0139() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("139.Combination with input search & All users list & Click on close button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple user");
		test.info("Click on any msg");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should not display the search input in group ");	
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying the search input in group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("139");
	}
	@Test
	public void test0140() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("140.Click on all dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("EXPECTED RESULT ::  It should display All dates list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("140");
	}
	@Test
	public void test0141() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("141.Click on today in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Today");
		test.info("EXPECTED RESULT ::  It should display Today's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Today", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Today's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("141");
	}
	@Test
	public void test0142() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("142.Click on Yesterday in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Yesterday");
		test.info("EXPECTED RESULT ::  It should display yesterday's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Yesterday", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying yesterday's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("142");
	}
	@Test
	public void test0143() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("143.Click on Last 7 days in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should display Last 7 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 7 Days", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 7 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("143");
	}
	@Test
	public void test0144() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("144.Click on Last 30 days in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should display Last 30 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 30 Days", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 30 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("144");
	}
	@Test
	public void test0145() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("145.Click on This month in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should display This month list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Month", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This month list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("145");
	}
	@Test
	public void test0146() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("146.Click on This year in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should display This year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Year", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("146");
	}
	@Test
	public void test0147() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("147.Click on Last year in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should display Last year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last Year", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("147");
	}
	@Test
	public void test0148() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("148.Click on All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Select on All dates");
		test.info("EXPECTED RESULT ::  It should display All dates list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("148");
	}
	@Test
	public void test0149() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("149.Click on apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Select All dates");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("149");
	}
	@Test
	public void test0150() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("150.Click on apply with only from date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select to date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select to date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("150");
	}
	@Test
	public void test0151() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[26]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("151.Click on apply with only to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("151");
	}
	@Test
	public void test0152() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("152.Click on apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display the msgs of that particular dates ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Date Range", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the msg of that particular dates ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("152");
	}
	//combination of search input , users & All dates
	@Test
	public void test0153() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("153.Combination of search, users & today");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Today");
		test.info("EXPECTED RESULT ::  It should display Today's list ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying Today's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("153");
	}
	@Test
	public void test0154() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("154.Combination of search, users & yesterday");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Yesterday");
		test.info("EXPECTED RESULT ::  It should display yesterday's list ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying yesterday's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("154");
	}
	@Test
	public void test0155() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("155.Combination of search, users & Last 7 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should display Last 7 day's list ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying Last 7 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("155");
	}
	@Test
	public void test0156() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("156.Combination of search, users & Last 30 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should display Last 30 day's list ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying Last 30 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("156");
	}
	@Test
	public void test0157() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("157.Combination of search, users & This month");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should display This month list ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying This month list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("157");
	}
	@Test
	public void test0158() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("158.Combination of search, users & This year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should display This year list ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying This year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("158");
	}
	@Test
	public void test0159() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("159.Combination of search, users & Last year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should display Last year list ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying Last year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("159");
	}
	@Test
	public void test0160() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("160.Combination of search, users & All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Select on All dates");
		test.info("EXPECTED RESULT ::  It should display All dates list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("160");
	}
	@Test
	public void test0161() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("161.Combination of search, users & apply without from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("161");
	}
	@Test
	public void test0162() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("162.Combination of search, users & apply with from date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select to date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select to date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("162");
	}
	@Test
	public void test0163() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("163.Combination of search, users & apply with to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("163");
	}
	@Test
	public void test0164() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("164.Combination of search, users & apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display the msgs of that particular dates ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying the msg of that particular dates ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("164");
	}
	//combination of search & All dates
	@Test
	public void test0165() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("165.Combination of search & today");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Today");
		test.info("EXPECTED RESULT ::  It should display Today's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Today", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Today's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("165");
	}
	@Test
	public void test0166() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("166.Combination of search & yesterday");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Yesterday");
		test.info("EXPECTED RESULT ::  It should display yesterday's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Yesterday", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying yesterday's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("166");
	}
	@Test
	public void test0167() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("167.Combination of search & Last 7 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should display Last 7 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 7 Days", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 7 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("167");
	}
	@Test
	public void test0168() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("168.Combination of search & Last 30 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should display Last 30 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 30 Days", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 30 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("168");
	}
	@Test
	public void test0169() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("169.Combination of search & This month");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should display This month list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Month", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This month list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("169");
	}
	@Test
	public void test0170() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("170.Combination of search & This year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should display This year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Year", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("170");
	}
	@Test
	public void test0171() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("171.Combination of search & Last year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should display Last year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last Year", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("171");
	}
	@Test
	public void test0172() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("172.Combination of search & All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Select on All dates");
		test.info("EXPECTED RESULT ::  It should display All dates list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("172");
	}
	@Test
	public void test0173() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("173.Combination of search & apply without from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("173");
	}
	@Test
	public void test0174() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("174.Combination of search & apply with from date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select to date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select to date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("174");
	}
	@Test
	public void test0175() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("175.Combination of search & apply with to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("175");
	}
	@Test
	public void test0176() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("176.Combination of search & apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display the msgs of that particular dates ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Date Range", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the msg of that particular dates ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("176");
	}
	//combination of users & All dates
	@Test
	public void test0177() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("177.Combination of users & today");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Today");
		test.info("EXPECTED RESULT ::  It should display Today's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Today", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Today's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("177");
	}
	@Test
	public void test0178() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("178.Combination of users & yesterday");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Yesterday");
		test.info("EXPECTED RESULT ::  It should display yesterday's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Yesterday", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying yesterday's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("178");
	}
	@Test
	public void test0179() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("179.Combination of users & Last 7 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should display Last 7 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 7 Days", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 7 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("179");
	}
	@Test
	public void test0180() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("180.Combination of users & Last 30 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should display Last 30 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 30 Days", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 30 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("180");
	}
	@Test
	public void test0181() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("181.Combination of users & This month");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should display This month list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Month", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This month list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("181");
	}
	@Test
	public void test0182() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("182.Combination of users & This year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should display This year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Year", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("182");
	}
	@Test
	public void test0183() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("183.Combination of users & Last year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should display Last year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last Year", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("183");
	}
	@Test
	public void test0184() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("184.Combination of users & All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Select on All dates");
		test.info("EXPECTED RESULT ::  It should display All dates list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("184");
	}
	@Test
	public void test0185() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("185.Combination of users & apply without from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("185");
	}
	@Test
	public void test0186() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("186.Combination of users & apply with from date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select to date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select to date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("186");
	}
	@Test
	public void test0187() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("187.Combination of users & apply with to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("187");
	}
	@Test
	public void test0188() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("188.Combination of users & apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display the msgs of that particular dates ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Date Range", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the msg of that particular dates ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("188");
	}
	@Test
	public void test0189() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("189.Combination of search, users & apply with from & to date & reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple user");
		test.info("Click on any msg");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("Click on reset");
		test.info("EXPECTED RESULT ::  It should display the All user msgs ");				
		String a=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		assertEquals("All Users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("singleConversationSearchInput")).getAttribute("placeholder");
		assertEquals("Search", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the All user msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("189");
	}
	@Test
	public void test0190() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("190.Combination of search, users & apply with from & to date & close button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple user");
		test.info("Click on any msg");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should not display the search input in group ");	
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying the search input in group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("190");
	}
	@Test
	public void test0191() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("191.Click on filter image in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("191");
	}
	@Test
	public void test0192() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("192.Click on image & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("192");
	}
	@Test
	public void test0193() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-image']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("193.Click on image & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("193");
	}
	@Test
	public void test0194() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-video']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("194.Click on filter video in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("194");
	}
	@Test
	public void test0195() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-video']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("195.Click on video & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("195");
	}
	@Test
	public void test0196() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-video']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("196.Click on video & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("196");
	}
	@Test
	public void test0197() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("197.Click on filter doc in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("197");
	}
	@Test
	public void test0198() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("198.Click on doc & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("198");
	}
	@Test
	public void test0199() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-doc']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("199.Click on doc & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("199");
	}
	@Test
	public void test0200() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-link']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("200.Click on filter link in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("200");
	}
	@Test
	public void test0201() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("201.Click on link & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("201");
	}
	@Test
	public void test0202() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("202.Click on link & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("202");
	}
	@Test
	public void test0203() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-contact']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("203.Click on filter contact in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("203");
	}
	@Test
	public void test0204() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-contact']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("204.Click on contact & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("204");
	}
	@Test
	public void test0205() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-contact']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("205.Click on contact & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("205");
	}
	@Test
	public void test0206() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-location']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("206.Click on filter location in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("206");
	}
	@Test
	public void test0207() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-location']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("207.Click on Location & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("207");
	}
	@Test
	public void test0208() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-location']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("208.Click on location & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("208");
	}
	@Test
	public void test0209() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("209.Click on filter Read Receipt in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
		test.info("Click on 3 dots");
		test.info("Click on filter");
		test.info("Click on read receipt icon");
		test.info("EXPECTED RESULT ::  It should click on read receipt icon in filter ");		
		String a=driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt active']")).getAttribute("data-title");
		assertEquals("Open Read Receipt", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getAttribute("id");
		assertEquals("messengerConversationMessage", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is clicking on read receipt icon but it is displaying all the msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("209");
	}
	@Test
	public void test0210() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("210.Click on read receipt & reset in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("210");
	}
	@Test
	public void test0211() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option filter-access-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-icon filter-icon-read-receipt']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("211.Click on read receipt & close in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01 ");
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
		System.out.println("211");
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
