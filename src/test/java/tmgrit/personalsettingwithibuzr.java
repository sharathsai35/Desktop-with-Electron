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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class personalsettingwithibuzr {
	static WebDriver driver = null;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("personalsettingwithibuzr1.html");
		extent = new ExtentReports();
		extent.attachReporter(HtmlReporter);
	}
	@Before
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver-v9.0.1-linux-x64/chromedriver");
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
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[6]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("1.Click on iBUZR");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on iBUZR");
		test.info("EXPECTED RESULT ::  It should click on iBUZR ");
		String a=driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
		assertEquals("iBUZR", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on iBUZR ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("1");
	}
	//@Test
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
		String a=driver.findElement(By.xpath("//div[@id='iBuzrSuggestionMessagesWrapper']")).getAttribute("id");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='switch'])[5]")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("2.Switch the suggestion message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user");
		test.info("Click on Suggestion message");
		test.info("Click on personal setting");
		test.info("Click on iBUZR");
		test.info("Click on switch the suggestion messages");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should not display suggestion messages ");
		assertEquals("iBuzrSuggestionMessagesWrapper", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("Saved!", a2);
		test.pass(a2);
		System.out.println(a2);
		String a1=driver.findElement(By.xpath("//div[@id='iBuzrSuggestionMessagesWrapper']")).getAttribute("class");
		assertEquals("hidden", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying suggestion messages ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("2");
	}
	//@Test
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
		String a1=driver.findElement(By.xpath("//div[@id='iBuzrSuggestionMessagesWrapper']")).getAttribute("class");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='switch'])[5]")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("3.Switch the suggestion message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user");
		test.info("Click on Suggestion message");
		test.info("Click on personal setting");
		test.info("Click on iBUZR");
		test.info("Click on switch the suggestion messages");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should display suggestion messages ");
		assertEquals("hidden", a1);
		test.pass(a1);
		System.out.println(a1);
		String a=driver.findElement(By.xpath("//div[@id='iBuzrSuggestionMessagesWrapper']")).getAttribute("id");
		assertEquals("iBuzrSuggestionMessagesWrapper", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("Saved!", a2);
		test.pass(a2);
		System.out.println(a2);		
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying suggestion messages ");
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
		String a=driver.findElement(By.xpath("//div[@id='iBuzrCannedMessagesWrapper']")).getAttribute("id");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='switch'])[6]")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("4.Switch the canned message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user");
		test.info("Click on Suggestion message");
		test.info("Click on personal setting");
		test.info("Click on iBUZR");
		test.info("Click on switch the canned messages");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should not display canned messages ");
		assertEquals("iBuzrCannedMessagesWrapper", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("Saved!", a2);
		test.pass(a2);
		System.out.println(a2);
		String a1=driver.findElement(By.xpath("//div[@id='iBuzrCannedMessagesWrapper']")).getAttribute("class");
		assertEquals("hidden", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying canned messages ");
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
		String a1=driver.findElement(By.xpath("//div[@id='iBuzrCannedMessagesWrapper']")).getAttribute("class");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='switch'])[6]")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("5.Switch the canned message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user");
		test.info("Click on Suggestion message");
		test.info("Click on personal setting");
		test.info("Click on iBUZR");
		test.info("Click on switch the canned messages");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should display canned messages ");
		assertEquals("hidden", a1);
		test.pass(a1);
		System.out.println(a1);
		String a=driver.findElement(By.xpath("//div[@id='iBuzrCannedMessagesWrapper']")).getAttribute("id");
		assertEquals("iBuzrCannedMessagesWrapper", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("Saved!", a2);
		test.pass(a2);
		System.out.println(a2);		
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying canned messages ");
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
		String a=driver.findElement(By.xpath("//div[@id='iBuzrSuggestionMessagesWrapper']")).getAttribute("id");
		String a1=driver.findElement(By.xpath("//div[@id='iBuzrCannedMessagesWrapper']")).getAttribute("id");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='switch'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[6]")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("6.Switch the suggestion & canned message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user");
		test.info("Click on Suggestion message");
		test.info("Click on personal setting");
		test.info("Click on iBUZR");
		test.info("Click on switch the suggestion messages");
		test.info("Click on switch the canned messages");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should not display suggestion & canned messages ");
		assertEquals("iBuzrSuggestionMessagesWrapper", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("iBuzrCannedMessagesWrapper", a1);
		test.pass(a1);
		System.out.println(a1);
		assertEquals("Saved!", a2);
		test.pass(a2);
		System.out.println(a2);
		String a3=driver.findElement(By.xpath("//div[@id='iBuzrCannedMessagesWrapper']")).getAttribute("class");
		assertEquals("hidden", a3);
		test.pass(a3);
		System.out.println(a3);
		String a4=driver.findElement(By.xpath("//div[@id='iBuzrSuggestionMessagesWrapper']")).getAttribute("class");
		assertEquals("hidden", a4);
		test.pass(a4);
		System.out.println(a4);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying suggestion & canned messages ");
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
		String a=driver.findElement(By.xpath("//div[@id='iBuzrSuggestionMessagesWrapper']")).getAttribute("class");
		String a1=driver.findElement(By.xpath("//div[@id='iBuzrCannedMessagesWrapper']")).getAttribute("class");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='switch'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[6]")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("7.Switch the suggestion & canned message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user");
		test.info("Click on Suggestion message");
		test.info("Click on personal setting");
		test.info("Click on iBUZR");
		test.info("Click on switch the suggestion messages");
		test.info("Click on switch the canned messages");
		test.info("Click on chat");
		test.info("EXPECTED RESULT ::  It should display canned messages ");
		assertEquals("hidden", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("hidden", a1);
		test.pass(a1);
		System.out.println(a1);
		assertEquals("Saved!", a2);
		test.pass(a2);
		System.out.println(a2);	
		String a3=driver.findElement(By.xpath("//div[@id='iBuzrSuggestionMessagesWrapper']")).getAttribute("id");
		assertEquals("iBuzrSuggestionMessagesWrapper", a3);
		test.pass(a3);
		System.out.println(a3);
		String a4=driver.findElement(By.xpath("//div[@id='iBuzrCannedMessagesWrapper']")).getAttribute("id");
		assertEquals("iBuzrCannedMessagesWrapper", a4);
		test.pass(a4);
		System.out.println(a4);	
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying canned messages ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='canned-message-input']")).sendKeys("hello");
		driver.findElement(By.xpath("//div[@class='add-canned-message-btn']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("8.Enter new canned messages");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on iBUZR");
		test.info("Click on iburz");
		test.info("Enter canned messages");
		test.info("EXPECTED RESULT ::  It should add the new canned msgs ");
		assertEquals("Saved!", a2);
		test.pass(a2);
		System.out.println(a2);	
		String a=driver.findElement(By.xpath("//div[@class='ibuzr-messages-wrapper-container']")).getText();
		assertEquals("I am Busy\n"
				+ "👍\n"
				+ "👌\n"
				+ "test\n"
				+ "hi\n"
				+ "hello", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is adding the new canned msgs ");
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='remove-canned-message'])[2]")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("9.Remove the canned messages");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on iBUZR");
		test.info("Click on iburz");
		test.info("Click on remove canned messages");
		test.info("EXPECTED RESULT ::  It should remove the canned msg ");
		assertEquals("Saved!", a2);
		test.pass(a2);
		System.out.println(a2);	
		String a=driver.findElement(By.xpath("//div[@class='ibuzr-messages-wrapper-container']")).getText();
		assertEquals("I am Busy\n"
				+ "👍\n"
				+ "👌\n"
				+ "test\n"
				+ "hi", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is removing the canned msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("9");
	}
	//@Test
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
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='messenger-settings-tab'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='canned-message-emoji-preview-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='emojione emojione-32-people _1f642 row-visible']")).click();
		driver.findElement(By.xpath("//div[@class='add-canned-message-btn']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("10.Enter new emoji's canned messages");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on personal setting");
		test.info("Click on iBUZR");
		test.info("Click on iburz");
		test.info("Enter new emoji canned msgs");
		test.info("EXPECTED RESULT ::  It should add new emoji the canned msg ");
		assertEquals("Saved!", a2);
		test.pass(a2);
		System.out.println(a2);	
		String a=driver.findElement(By.xpath("//div[@class='ibuzr-messages-wrapper-container']")).getText();
		assertEquals("I am Busy\n"
				+ "👍\n"
				+ "👌\n"
				+ "test\n"
				+ "hi\n"
				+ "🙂", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is adding new emoji the canned msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("10");
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
