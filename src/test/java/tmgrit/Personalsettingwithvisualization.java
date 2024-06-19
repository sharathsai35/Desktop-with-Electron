package tmgrit;

import static org.junit.Assert.*;

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

public class Personalsettingwithvisualization {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("Personalsettingwithvisualization1.html");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("0.Click on personal settings");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("EXPECTED RESULT ::  It should click on personal settings ");
		String a=driver.findElement(By.xpath("//div[@class='messenger-app-wrapper active']")).getAttribute("data-app");
		assertEquals("settings", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on personal settings ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("Personal settings");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[8]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("1.Click on visualization");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on visualization");
		test.info("EXPECTED RESULT ::  It should click on visualization ");
		String a=driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
		assertEquals("Visualization", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='layout-type-content-wrapper clearfix-height']")).getText();
		assertEquals("Auto Adjust\n"
				+ "(Default)\n"
				+ "Broad Panel\n"
				+ "Narrow Panel\n"
				+ "On Large Screen\n"
				+ "On Small Screen", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on visualization ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[15]")).click();
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[14]")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='left-wrapper ui-resizable ui-resizable-autohide']")).click();
		Actions action = new Actions(driver);
		//action.moveToElement(e).click().perform();
		WebElement e1=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		action.click(e1).clickAndHold().moveByOffset(160, 100).perform();
		Thread.sleep(5000);
		int logoWidth = e1.getSize().getWidth();
		System.out.println("Logo width : "+logoWidth+" pixels");
		ExtentTest test=extent.createTest("2.Click on Auto Adjust");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on visualization");
		test.info("Click on auto adjust");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should display recent chat message view when resize the handle it should not display recent chat message view ");
		assertEquals("Auto Adjust\n"
				+ "(Default)", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='typing-message']")).getText();
		assertEquals("v", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying recent chat message view when resize the handle it is not displaying recent chat message view");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[16]")).click();
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[15]")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='left-wrapper ui-resizable ui-resizable-autohide']")).click();
		Actions action = new Actions(driver);
		//action.moveToElement(e).click().perform();
		WebElement e1=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		action.click(e1).clickAndHold().moveByOffset(100, 160).perform();
		Thread.sleep(5000);
		int logoWidth = e1.getSize().getWidth();
		System.out.println("Logo width : "+logoWidth+" pixels");
		ExtentTest test=extent.createTest("3.Click on Broad panel");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on visualization");
		test.info("Click on broad panel");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should display recent chat message view when resize the handle it should display recent chat message view");
		assertEquals("Broad Panel", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='typing-message']")).getText();
		assertEquals("v", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying recent chat message view when resize the handle it is displaying recent chat message view");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])[17]")).click();
		String a=driver.findElement(By.xpath("(//label[@class='messenger-settings-custom-radio'])[16]")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='messenger-app-wrapper']")).click();
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//div[@class='left-wrapper ui-resizable ui-resizable-autohide']"));
		Actions action = new Actions(driver);
		action.moveToElement(e).click().build().perform();
		WebElement e1=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		action.click(e1).clickAndHold().moveByOffset(160, 170).perform();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class='left-wrapper ui-resizable']")).click();
		//ac.moveByOffset(359, 93).build().perform();
		ExtentTest test=extent.createTest("4.Click on Narrow panel");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on visualization");
		test.info("Click on narrow panel");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should not display recent chat message view when we resize the handle it should not display recent chat message view ");
		assertEquals("Narrow Panel", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='typing-text hidden']")).getAttribute("class");
		assertEquals("typing-text hidden", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@class='typing-message']")).getText();
		assertEquals("", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying recent chat message view when we resize the handle it is not displaying recent chat message view ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("4");
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
