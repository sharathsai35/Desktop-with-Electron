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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class sendingdocuments {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("sendingdocuments.html");
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
		driver.findElement(By.xpath("//span[@data-name='dooo']")).click();
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(6000);
		ExtentTest test=extent.createTest("Send document");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user/group: dooo");
		test.info("Click on attachment");
		test.info("Select document");
		test.info("Click on Send ");
		test.info("Move cursor near document");
		test.info("EXPECTED RESULT ::  It should display document name ");
		String a=driver.findElement(By.xpath("//span[@title='Untitledtestcasesforlogin&signup.xlsx']")).getAttribute("title");
		assertEquals("Untitledtestcasesforlogin&signup.xlsx", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying document name ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("document");
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
		driver.findElement(By.xpath("//span[@data-name='dooo']")).click();
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='messenger-attachment-drag-img']")).click();
		Thread.sleep(1000);
		StringSelection str1 = new StringSelection("/home/tvisha/Downloads/SFTBR-04-converted.docx");
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
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(5000);
		Thread.sleep(6000);
		ExtentTest test=extent.createTest("Send document");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user/group: dooo");
		test.info("Click on attachment");
		test.info("Select documents");
		test.info("Click on Send ");
		test.info("Move cursor near documents");
		test.info("EXPECTED RESULT ::  It should display documents name ");
		String a=driver.findElement(By.xpath("//span[@title='Untitledtestcasesforlogin&signup.xlsx']")).getAttribute("title");
		assertEquals("Untitledtestcasesforlogin&signup.xlsx", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@title='SFTBR_04_converted.docx']")).getAttribute("title");
		assertEquals("SFTBR_04_converted.docx", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying documents name ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("1");
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
