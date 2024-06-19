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

public class Replyfordocumentwithrightclick {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("replyfordocumentwithrightclick.html");
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
		/*driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(2000);
		Robot rb = new Robot(); 
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Pictures/Screenshot from 2022-07-21 14-42-50.png"); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000); 
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER); 
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000); 
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(5000);*/
		WebElement e=driver.findElement(By.xpath("//span[@class='image-attachment-span']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-action='reply']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Send image & reply to that image");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Click on attachment");
		test.info("Select the image");
		test.info("Send the image");
		test.info("Click on that image");
		test.info("Right click on that image");
		test.info("Select reply in it");
		test.info("Send reply msg");
		test.info("EXPECTED RESULT ::  It should reply text msg & It should not display image name ");
		String a1=driver.findElement(By.xpath("//span[@class='image_attachment']")).getAttribute("class");
		assertEquals("image_attachment", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is replying text msg & It is not displaying image name ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("image");
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
		/*driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(2000);
		Robot rb = new Robot();
		Thread.sleep(1000);
		//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);*/
		WebElement e=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-action='reply']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Send video & reply to that video");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Click on attachment");
		test.info("Select the video");
		test.info("Send the video");
		test.info("Click on that video");
		test.info("Right click on that video");
		test.info("Select reply in it");
		test.info("Send reply msg");
		test.info("EXPECTED RESULT ::  It should reply text msg & It should display video name ");
		String a1=driver.findElement(By.xpath("//div[@class='attachment-reply-description']")).getAttribute("class");
		assertEquals("attachment-reply-description", a1);
		test.pass(a1);
		System.out.println(a1);
		String a=driver.findElement(By.xpath("//span[@title='20210827_180112.mp4']")).getAttribute("title");
		assertEquals("20210827_180112.mp4", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is replying text msg & It is displaying image name ");
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
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(2000);
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Documents/Untitledtestcasesforlogin&signup.xlsx");
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(8000);
		WebElement e=driver.findElement(By.xpath("//span[@title='Untitledtestcasesforlogin&signup.xlsx']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-action='reply']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Send document & reply to that document");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Click on attachment");
		test.info("Select the document");
		test.info("Send the document");
		test.info("Click on that document");
		test.info("Right click on that document");
		test.info("Select reply in it");
		test.info("Send reply msg");
		test.info("EXPECTED RESULT ::  It should reply text msg & It should display document name ");
		String a1=driver.findElement(By.xpath("//div[@class='attachment-reply-description']")).getAttribute("class");
		assertEquals("attachment-reply-description", a1);
		test.pass(a1);
		System.out.println(a1);
		String a=driver.findElement(By.xpath("//span[@title='Untitledtestcasesforlogin_signup.xlsx']")).getAttribute("title");
		assertEquals("Untitledtestcasesforlogin_signup.xlsx", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is replying text msg & It is displaying document name ");
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
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(2000);
		Robot rb = new Robot();
		Thread.sleep(1000);
		//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
		StringSelection str = new StringSelection("/home/tvisha/Downloads/Instrumental.mp3");
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-action='reply']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Send audio & reply to that audio");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Click on attachment");
		test.info("Select the audio");
		test.info("Send the audio");
		test.info("Click on that audio");
		test.info("Right click on that audio");
		test.info("Select reply in it");
		test.info("Send reply msg");
		test.info("EXPECTED RESULT ::  It should reply text msg & It should display audio name ");
		String a1=driver.findElement(By.xpath("//div[@class='attachment-reply-description']")).getAttribute("class");
		assertEquals("attachment-reply-description", a1);
		test.pass(a1);
		System.out.println(a1);
		String a=driver.findElement(By.xpath("//span[@title='Instrumental.mp3']")).getAttribute("title");
		assertEquals("Instrumental.mp3",a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is replying text msg & It is displaying audio name ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("3");
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
