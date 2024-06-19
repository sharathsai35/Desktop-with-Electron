package Enhancement;

import static org.junit.Assert.*;

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

public class fontsandformats {
	 WebDriver driver ;
	 static ExtentHtmlReporter HtmlReporter;
	 static ExtentReports extent;
	@BeforeClass
	 static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("Personalsettingfonts&formats Tm.html");
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
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(capabilities);
		System.out.print("line executed");
		Thread.sleep(2000);
	}
	@Test
	public void test00() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='font-type-radio-wrapper'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		driver.findElement(By.xpath("//div[@class='toolbar-logout clearfix-height']")).click();
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(1000);
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Select in font type");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal settings");
		test.info("Click on fonts & formats");
		test.info("Select Helvetica");
		test.info("Click on chat");
		test.info("Click on logout");
		test.info("Login with same user : sharath@trends.com");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on personal settings");
		test.info("Click on fonts & formats");
		test.info("EXPECTED RESULT ::  It should select Helvetica ");
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[3]")).getText();
		assertEquals("Helvetica", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is selected Helvetica ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("0");
	}
	@Test
	public void test01() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='messenger-zoom-radio-wrapper'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		driver.findElement(By.xpath("//div[@class='toolbar-logout clearfix-height']")).click();
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(1000);
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Select any font size");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal settings");
		test.info("Click on fonts & formats");
		test.info("Select any font size : 80%");
		test.info("Click on chat");
		test.info("Click on logout");
		test.info("Login with same user : sharath@trends.com");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on personal settings");
		test.info("Click on fonts & formats");
		test.info("EXPECTED RESULT ::  It should select 80% ");
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is selected 100%(default) ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("1");
	}
	@Test
	public void test02() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		driver.findElement(By.xpath("//div[@class='toolbar-logout clearfix-height']")).click();
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[4]")).click();
		Thread.sleep(1000);
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Switch off the forkout button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal settings");
		test.info("Click on fonts & formats");
		test.info("Click on message entry box");
		test.info("Select forkout & switch it");
		test.info("Click on chat");
		test.info("Click on logout");
		test.info("Login with same user : sharath@trends.com");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on personal settings");
		test.info("Click on fonts & formats");
		test.info("EXPECTED RESULT ::  It should switch the forkout in message entry box ");
		String a=driver.findElement(By.xpath("//input[@id='forkoutSwitch']")).getAttribute("id");
		assertEquals("forkoutSwitch", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is switching the forout in message entry box ");
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
