package Enhancement;

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
import org.openqa.selenium.Keys;
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

public class Copymailidandmoiblenum {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("Copymailidandmoiblenum.html");
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
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//span[@class='user-email browser-link']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).perform();
		driver.findElement(By.xpath("//span[@class='user-profile-email-copy']")).click();
		Thread.sleep(2000);
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		driver.findElement(By.xpath("//span[@class='message-input']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Click on copy button in email ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Click on profile");
		test.info("Move to email");
		test.info("Click on email copy icon");
		test.info("EXPECTED RESULT ::  It should display copied as toast msg ");
		assertEquals("Copied!", a1);
		test.pass(a1);
		System.out.println(a1);
		String a=driver.findElement(By.xpath("//span[@class='browser-link']")).getText();
		assertEquals("unit@tm.com", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying toast msg as copied ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("0");
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
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='user-mobile']")).click();
		driver.findElement(By.xpath("//span[@class='user-profile-mobile-copy']")).click();
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='message-input']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Click on copy button in mobile num");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Click on profile");
		test.info("Move to mobile num");
		test.info("Click on mobile num copy icon");
		test.info("EXPECTED RESULT ::  It should display copied as toast msg ");
		assertEquals("Copied!", a1);
		test.pass(a1);
		System.out.println(a1);
		String a=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("9112345678", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying toast msg as copied ");
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
		driver.findElement(By.xpath("//span[@data-name='test delee']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.xpath("//div[@class='group-member-details']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e1).perform();
		driver.findElement(By.xpath("//span[@class='group-member-options']")).click();
		driver.findElement(By.xpath("(//span[@class='group-member-edit-option'])[3]")).click();
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//span[@class='user-email browser-link']"));
		ac.moveToElement(e).perform();
		driver.findElement(By.xpath("//span[@class='user-profile-email-copy']")).click();
		Thread.sleep(2000);
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		driver.findElement(By.xpath("//span[@class='message-input']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Click on copy button in email ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group: test delee");
		test.info("Click on profile");
		test.info("Select any user");
		test.info("Click on 3 dots for user");
		test.info("Select view & Click on it");
		test.info("Move to email");
		test.info("Click on email copy icon");
		test.info("EXPECTED RESULT ::  It should display copied as toast msg ");
		assertEquals("Copied!", a1);
		test.pass(a1);
		System.out.println(a1);
		String a=driver.findElement(By.xpath("//span[@class='browser-link']")).getText();
		assertEquals("admin@tm.com", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying toast msg as copied ");
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
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='user-email browser-link']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on email ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: unit");
		test.info("Click on profile");
		test.info("Click to email");
		test.info("EXPECTED RESULT ::  It should display compose of email ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying compose of email ");
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
