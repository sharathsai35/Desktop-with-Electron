package Enhancement;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Recallmessages {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("Recallmessages2.html");
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
	public void test00() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='received-message-text']")).click();
		driver.findElement(By.xpath("//span[@class='conversation-option-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-recall-button conversation-option']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationNoBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the text message with no button ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Select any message");
		test.info("Right click on message");
		test.info("Select recall & Click on it");
		test.info("Click on no button");
		test.info("EXPECTED RESULT ::  It should not recall the message ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not recalling the message ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("Recall");
	}
	@Test
	public void test01() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='received-message-text']")).click();
		driver.findElement(By.xpath("//span[@class='conversation-option-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-recall-button conversation-option']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationYesBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the text message with yes button ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Select any message");
		test.info("Right click on message");
		test.info("Select recall & Click on it");
		test.info("Click on yes button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should recall the message & It should display correct view ");
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Message Recalled!", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is recalling the message & It is displaying correct view ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("1");
	}
	@Test
	public void test02() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='image-attachment-span']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationNoBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the image with no button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Click on attachment");
		test.info("Select image");
		test.info("Send the image");
		test.info("Select sended image");
		test.info("Right click on image");
		test.info("Select recall & Click on it");
		test.info("Click on no button");
		test.info("EXPECTED RESULT ::  It should not recall the message ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not recalling the message ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("2");
	}
	@Test
	public void test03() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='image-attachment-span']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationYesBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the image with yes button ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Select pervious image");
		test.info("Right click on image");
		test.info("Select recall & Click on it");
		test.info("Click on yes button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should recall the message & It should display correct view ");
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Message Recalled!", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is recalling the message & It is displaying correct view ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("3");
	}
	@Test
	public void test04() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationNoBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the video with no button ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Click on attachment");
		test.info("Select video");
		test.info("Send the video");
		test.info("Select sended video");
		test.info("Right click on video");
		test.info("Select recall & Click on it");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should not recall the message ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not recalling the message ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("4");
	}
	@Test
	public void test05() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationYesBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the video with yes button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Select previous video");
		test.info("Right click on video");
		test.info("Select recall & Click on it");
		test.info("Click on yes button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should recall the message & It should display correct view ");
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Message Recalled!", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is recalling the message & It is displaying correct view ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("5");
	}
	@Test
	public void test06() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//a[@class='messenger-attachment-hyperlink messenger-attachment-preview-a']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationNoBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the document with no button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Click on attachment");
		test.info("Select document");
		test.info("Send the document");
		test.info("Select sended document");
		test.info("Right click on document");
		test.info("Select recall & Click on it");
		test.info("Click on no button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should not recall the message ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not recalling the message ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("6");
	}
	@Test
	public void test07() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//a[@class='messenger-attachment-hyperlink messenger-attachment-preview-a']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationYesBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the document with yes button ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Select pervious document");
		test.info("Right click on document");
		test.info("Select recall & Click on it");
		test.info("Click on yes button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should recall the message & It should display correct view ");
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Message Recalled!", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is recalling the message & It is displaying correct view ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("7");
	}
	@Test
	public void test08() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationNoBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the audio files with no button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Click on attachment");
		test.info("Select audio file");
		test.info("Send the audio file");
		test.info("Select sended audio file");
		test.info("Right click on audio file");
		test.info("Select recall & Click on it");
		test.info("Click on no button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should not recall the message ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not recalling the message ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("8");
	}
	@Test
	public void test09() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationYesBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the audio files with yes button ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Select pervious audio file");
		test.info("Right click on audio file");
		test.info("Select recall & Click on it");
		test.info("Click on yes button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should recall the message & It should display correct view ");
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Message Recalled!", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is recalling the message & It is displaying correct view ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("9");
	}
	@Test
	public void test10() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(2000);
		Robot rb = new Robot();
		Thread.sleep(1000);
		//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
		StringSelection str = new StringSelection("/home/tvisha/Pictures/Screenshot from 2022-07-21 14-42-50.png");
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
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//span[@class='image-attachment-span']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_22985']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationNoBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the text message & image with no button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Send the message");
		test.info("Click on attachment");
		test.info("Select any image");
		test.info("Send the image");
		test.info("Right click on message");
		test.info("Select checkbox of image");
		test.info("Select recall & Click on it");
		test.info("Click on no button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should not recall the message ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not recalling the message ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("10");
	}
	@Test
	public void test11() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='image-attachment-span']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_22985']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationYesBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the text message & image with yes button ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Send pervious message");
		test.info("Right click on message");
		test.info("Select checkbox of image");
		test.info("Select recall & Click on it");
		test.info("Click on yes button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should recall the message & It should display correct view ");
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Messages Recalled!", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is recalling the message & It is displaying correct view ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("11");
	}
	@Test
	public void test12() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(2000);
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Pictures/Screenshot from 2022-07-21 14-42-50.png");
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
		driver.findElement(By.xpath("//div[@class='messenger-attachment-drag-img']")).click();
		StringSelection str1 = new StringSelection("/home/tvisha/Downloads/20210827_180112.mp4");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null);
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(8000);
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//span[@class='image-attachment-span']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_23002']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_22984']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationNoBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the text message, image & video with no button ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Send the message");
		test.info("Click on attachment");
		test.info("Select any image");
		test.info("Send the image");
		test.info("Select the video");
		test.info("Right click on message");
		test.info("Select checkbox of image");
		test.info("Select checkbox of video");
		test.info("Select recall & Click on it");
		test.info("Click on no button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should not recall the message ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not recalling the message ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("12");
	}
	@Test
	public void test13() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='image-attachment-span']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_23002']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_22984']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationYesBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the text message, image & video with yes button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Send the message");
		test.info("Click on attachment");
		test.info("Select any image");
		test.info("Send the image");
		test.info("Select the video");
		test.info("Right click on message");
		test.info("Select checkbox of image");
		test.info("Select checkbox of video");
		test.info("Select recall & Click on it");
		test.info("Click on yes button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should recall the message & It should display correct view ");
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Messages Recalled!", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is recalling the message & It is displaying correct view ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("13");
	}
	@Test
	public void test14() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='image-attachment-span']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_22987']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_22993']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_22996']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationNoBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the text message, image, document & video with no button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Send the message");
		test.info("Click on attachment");
		test.info("Select any image");
		test.info("Send the image");
		test.info("Select the video");
		test.info("Right click on message");
		test.info("Select checkbox of image");
		test.info("Select checkbox of video");
		test.info("Select checkbox of document");
		test.info("Select recall & Click on it");
		test.info("Click on no button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should not recall the messag ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not recalling the message ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("14");
	}
	@Test
	public void test15() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='image-attachment-span']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_22987']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_22993']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_22996']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationYesBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the text message, image, document & video with yes button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Select previous video");
		test.info("Right click on message");
		test.info("Select checkbox of image");
		test.info("Select checkbox of video");
		test.info("Select checkbox of document");
		test.info("Select recall & Click on it");
		test.info("Click on yes button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should recall the message & It should display correct view ");
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Messages Recalled!", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is recalling the message & It is displaying correct view ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("15");
	}
	@Test
	public void test16() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='image-attachment-span']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_23013']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_23015']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_23007']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_22988']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationNoBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the text message, image, document, audio & video with no button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Send the message");
		test.info("Click on attachment");
		test.info("Select any image");
		test.info("Send the image");
		test.info("Select the video");
		test.info("Right click on message");
		test.info("Select checkbox of image");
		test.info("Select checkbox of video");
		test.info("Select checkbox of document");
		test.info("Select checkbox of audio");
		test.info("Select recall & Click on it");
		test.info("Click on no button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should not recall the message ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not recalling the message ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("16");
	}
	@Test
	public void test17() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='Unit']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='image-attachment-span']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_23013']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_23015']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_23007']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='recallMessage_22988']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationYesBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Recall the text message, image, document, audio & video with yes button ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Select the video");
		test.info("Right click on message");
		test.info("Select checkbox of image");
		test.info("Select checkbox of video");
		test.info("Select checkbox of document");
		test.info("Select checkbox of audio");
		test.info("Select recall & Click on it");
		test.info("Click on yes button");
		test.info("View the recalled message");
		test.info("EXPECTED RESULT ::  It should recall the message & It should display correct view ");
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Messages Recalled!", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is recalling the message & It is displaying correct view ");
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
