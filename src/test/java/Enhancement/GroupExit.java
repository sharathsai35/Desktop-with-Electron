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

public class GroupExit {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("groupexit.html");
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
		driver.findElement(By.xpath("//span[@data-name='Sample']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='groupExitSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("Sample");
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Group exit with no button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group: sample");
		test.info("Click on group profile");
		test.info("Select the settings");
		test.info("Select exit from group");
		test.info("Click on submit");
		test.info("Click on no button in popup");
		test.info("Click on recent chat user search");
		test.info("Search exited group name");
		test.info("EXPECTED RESULT ::  It should not exit from group ");
		String a=driver.findElement(By.xpath("//span[@data-name='Sample']")).getAttribute("data-name");
		assertEquals("Sample", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not existing from group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("exit");
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
		driver.findElement(By.xpath("//span[@data-name='Sample']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='groupExitSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(2000);
		String a3=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("Sample");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[5]")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Group exit with yes button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group: sample");
		test.info("Click on group profile");
		test.info("Select the settings");
		test.info("Select exit from group");
		test.info("Click on submit");
		test.info("Click on yes button in popup");
		test.info("Click on recent chat user search");
		test.info("Search exited group name");
		test.info("Click on filter of all members & groups");
		test.info("Select deleted/exited groups");
		test.info("EXPECTED RESULT ::  It should exit from group & It should display in deleted/exited from group with group icon");
		
		assertEquals("Group Left!", a3);
		test.pass(a3);
		System.out.println(a3);
		String a=driver.findElement(By.xpath("//span[@data-name='sample']")).getAttribute("data-name");
		assertEquals("sample", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='group-icon']")).getAttribute("class");
		assertEquals("group-icon",a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@class='deactivated-group-text']")).getText();
		assertEquals("Exited on 26 Jul' 2022",a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not existing from group & It is displaying in deleted/exited from group with group icon");
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
		driver.findElement(By.xpath("//span[@data-name='ari delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='groupExitSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("ari delete");
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Airtime-Group exit with no button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on Airtime-group: ari delete");
		test.info("Click on Airtime-group profile");
		test.info("Select the settings");
		test.info("Select exit from group");
		test.info("Click on submit");
		test.info("Click on no button in popup");
		test.info("Click on recent chat user search");
		test.info("Search exited group name");
		test.info("EXPECTED RESULT ::  It should not exit from group ");
		String a=driver.findElement(By.xpath("//span[@data-name='ari delete']")).getAttribute("data-name");
		assertEquals("ari delete", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not existing from group ");
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
		driver.findElement(By.xpath("//span[@data-name='ari delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='groupExitSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(2000);
		String a3=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("ari delete");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[5]")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Airtime-Group exit with yes button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on Airtime-group: ari delete");
		test.info("Click on group profile");
		test.info("Select the settings");
		test.info("Select exit from group");
		test.info("Click on submit");
		test.info("Click on yes button in popup");
		test.info("Click on recent chat user search");
		test.info("Search exited group name");
		test.info("Click on filter of all members & groups");
		test.info("Select deleted/exited groups");
		test.info("EXPECTED RESULT ::  It should exit from group & It should display in deleted/exited from group with Airtime-group icon");
		assertEquals("Group Left!", a3);
		test.pass(a3);
		System.out.println(a3);
		String a=driver.findElement(By.xpath("//span[@data-name='ari delete']")).getAttribute("data-name");
		assertEquals("ari delete", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='group-icon']")).getAttribute("class");
		assertEquals("group-icon",a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@class='deactivated-group-text']")).getText();
		assertEquals("Exited on 26 Jul' 2022",a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not existing from group & It is displaying in deleted/exited from group with group icon");
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
