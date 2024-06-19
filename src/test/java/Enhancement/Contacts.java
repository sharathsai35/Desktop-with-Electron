package Enhancement;

import static org.junit.Assert.*;

import java.awt.AWTException;
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

public class Contacts {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("sendingcontacts1.html");
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
		driver.findElement(By.xpath("//div[@class='ibuzr-contacts-btn ibuzr-history-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-messageid='22599']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(6000);
		ExtentTest test=extent.createTest("Send contact in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: dooo");
		test.info("Click on ibuzr contacts");
		test.info("Select contact");
		test.info("Click on Send ");
		test.info("EXPECTED RESULT ::  It should display light color contact icon in recent chat user page ");
		String a=driver.findElement(By.xpath("//div[@data-messageid='22599']")).getAttribute("data-message");
		assertEquals("\"{\\\"contact_name\\\" : \\\"AL * dial\\\", \\\"contact_number\\\" : \\\"*321#\\\", \\\"contact_avatar\\\" : \\\"\\\", \\\"contact_id\\\" : \\\"0\\\"}\"", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//img[@src='/img/contact-icon-grey.svg']")).getAttribute("src");
		assertEquals("http://localhost:50001/img/contact-icon-grey.svg", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying light color contact icon in recent chat user page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("contact");
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
		driver.findElement(By.xpath("//span[@data-name='all members1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='ibuzr-contacts-btn ibuzr-history-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-messageid='22599']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(6000);
		ExtentTest test=extent.createTest("Send contact in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group: all members1");
		test.info("Click on ibuzr contacts");
		test.info("Select contact");
		test.info("Click on Send ");
		test.info("EXPECTED RESULT ::  It should display light color contact icon in recent chat user page ");
		String a=driver.findElement(By.xpath("//div[@data-messageid='22599']")).getAttribute("data-message");
		assertEquals("\"{\\\"contact_name\\\" : \\\"AL * dial\\\", \\\"contact_number\\\" : \\\"*321#\\\", \\\"contact_avatar\\\" : \\\"\\\", \\\"contact_id\\\" : \\\"0\\\"}\"", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//img[@src='/img/contact-icon-grey.svg']")).getAttribute("src");
		assertEquals("http://localhost:50001/img/contact-icon-grey.svg", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying light color contact icon in recent chat user page ");
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
		driver.findElement(By.xpath("//span[@data-name='fdsafds']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='ibuzr-contacts-btn ibuzr-history-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-messageid='22599']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(6000);
		ExtentTest test=extent.createTest("Send contact in Airtime-group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on Airtime-group: fdsafds");
		test.info("Click on ibuzr contacts");
		test.info("Select contact");
		test.info("Click on Send ");
		test.info("EXPECTED RESULT ::  It should display light color contact icon in recent chat user page ");
		String a=driver.findElement(By.xpath("//div[@data-messageid='22599']")).getAttribute("data-message");
		assertEquals("\"{\\\"contact_name\\\" : \\\"AL * dial\\\", \\\"contact_number\\\" : \\\"*321#\\\", \\\"contact_avatar\\\" : \\\"\\\", \\\"contact_id\\\" : \\\"0\\\"}\"", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//img[@src='/img/contact-icon-grey.svg']")).getAttribute("src");
		assertEquals("http://localhost:50001/img/contact-icon-grey.svg", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying light color contact icon in recent chat user page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("2");
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
