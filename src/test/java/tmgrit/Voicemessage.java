package tmgrit;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
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

public class Voicemessage {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("Voicemessage.html");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("0.Click on voice message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on voice message icon");
		test.info("EXPECTED RESULT ::  It should click on voice message icon ");
		String a=driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).getAttribute("title");
		assertEquals("Voice Message", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on voice message icon ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("voice message");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("1.Send voice message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on voice message icon");
		test.info("Wait for some time ");
		test.info("Click on send button");
		test.info("EXPECTED RESULT ::  It should send voice message ");
		String a=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		assertEquals("audio-attachment-wrapper", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the voice message ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("2.Send voice message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on voice message icon");
		test.info("Wait for some time ");
		test.info("Click on send button");
		test.info("EXPECTED RESULT ::  It should send voice message ");
		String a=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		assertEquals("audio-attachment-wrapper", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the voice message ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='microphone-stop-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("3.Click on stop button in voice message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on voice message icon");
		test.info("Wait for some time ");
		test.info("Click on stop button");
		test.info("EXPECTED RESULT ::  It should stop the recording message ");
		String a=driver.findElement(By.xpath("//div[@class='microphone-stop-btn hidden']")).getAttribute("class");
		assertEquals("microphone-stop-btn hidden", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is stopping the recording message ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='microphone-stop-btn']")).click();
		driver.findElement(By.xpath("//div[@class='microphone-play-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("4.Click on play button in recorded message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on voice message icon");
		test.info("Wait for some time ");
		test.info("Click on stop button");
		test.info("Click on play button");
		test.info("EXPECTED RESULT ::  It should play the recorded message ");
		String a=driver.findElement(By.xpath("//div[@class='microphone-play-btn hidden']")).getAttribute("class");
		assertEquals("microphone-play-btn hidden", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is playing the recorded message ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='microphone-stop-btn']")).click();
		driver.findElement(By.xpath("//div[@class='microphone-play-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='microphone-pause-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("5.Click on pause button in recorded message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on voice message icon");
		test.info("Wait for some time ");
		test.info("Click on stop button");
		test.info("Click on play button");
		test.info("Click on pause button");
		test.info("EXPECTED RESULT ::  It should pause the recorded message ");
		String a=driver.findElement(By.xpath("//div[@class='microphone-pause-btn hidden']")).getAttribute("class");
		assertEquals("microphone-pause-btn hidden", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is pausing the recorded message ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='microphone-stop-btn']")).click();
		driver.findElement(By.xpath("//div[@class='microphone-play-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='microphone-pause-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='microphone-play-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("6.Click on play button after pausing the recorded message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on voice message icon");
		test.info("Wait for some time ");
		test.info("Click on stop button");
		test.info("Click on play button");
		test.info("Click on pause button");
		test.info("Click on play button again");
		test.info("EXPECTED RESULT ::  It should play the recorded message from starting position ");
		String a=driver.findElement(By.xpath("//div[@class='microphone-play-btn hidden']")).getAttribute("class");
		assertEquals("microphone-play-btn hidden", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is playing the recorded message from starting position ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='microphone-stop-btn']")).click();
		driver.findElement(By.xpath("//div[@class='microphone-record-close']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("7.Click on close");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on voice message icon");
		test.info("Wait for some time ");
		test.info("Click on stop button");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the recorded msg ");
		String a=driver.findElement(By.xpath("//span[@class='message-input']")).getAttribute("class");
		assertEquals("message-input", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the recorded msg ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='microphone-stop-btn']")).click();
		driver.findElement(By.xpath("//div[@class='open-microphone-settings']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("8.Click on settings");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on voice message icon");
		test.info("Wait for some time ");
		test.info("Click on stop button");
		test.info("Click on setting button");
		test.info("EXPECTED RESULT ::  It should open the audio device settings page ");
		String a=driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
		assertEquals("Audio Devices", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is opening the audio device settings page ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='microphone-stop-btn']")).click();
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-id='4379']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("9.Click on reply button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on voice message icon");
		test.info("Wait for some time ");
		test.info("Click on stop button");
		test.info("Click on send");
		test.info("Click on reply button");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("EXPECTED RESULT ::  It should send reply in the user/group ");
		String a=driver.findElement(By.xpath("//div[@class='audio-message-description']")).getText();
		assertEquals("Audio Message", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending reply in the user/group ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='audio-message-description']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("10.Click on replied voice message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on replied voice message");
		test.info("EXPECTED RESULT ::  It should display the replied voice msg ");
		String a=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		assertEquals("audio-attachment-wrapper", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the replied voice msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("10");
	}
	@Test
	public void test11() throws InterruptedException, AWTException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-receiver='12']")).click();
		Thread.sleep(2000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("11.Click on download");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Select voice message");
		test.info("Click on download");
		test.info("EXPECTED RESULT ::  It should download the voice msg ");
		String a=driver.findElement(By.xpath("//a[@class='download-attachment']")).getAttribute("class");
		assertEquals("download-attachment", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is downloading the voice msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("11");
	}
	@Test
	public void test12() throws InterruptedException, AWTException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@data-id='4372'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='forwardUser_12-1']")).click();
		driver.findElement(By.xpath("//label[@for='forwardUser_301-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='modalForwardSendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("12.Click on forward");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Select voice message");
		test.info("Click on forward");
		test.info("Click on forward button");
		test.info("Select the users/groups");
		test.info("EXPECTED RESULT ::  It should forward the voice msg ");
		String a=driver.findElement(By.xpath("//span[@class='forward-conversation-label-icon']")).getAttribute("class");
		assertEquals("forward-conversation-label-icon", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		assertEquals("audio-attachment-wrapper", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is forwarding the voice msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("12");
	}
	@Test
	public void test13() throws InterruptedException, AWTException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@data-id='4372'])[2]")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@id='forwardMessageCloseBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='forwardMessageCloseBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("13.Click on forward with cancel button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Select voice message");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should not forward the voice msg ");
		assertEquals("CANCEL", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not forwarding the voice msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("13");
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
