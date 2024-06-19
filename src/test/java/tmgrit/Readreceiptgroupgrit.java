package tmgrit;

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

public class Readreceiptgroupgrit {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("Readreceiptgroupgrit2.html");
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
		Thread.sleep(1000);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		Thread.sleep(1000);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		Thread.sleep(1000);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		//driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("0.Select all the users");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Enter  text : test");
		test.info("Click on read receipt icon");
		test.info("Click on select all");
		test.info("EXPECTED RESULT ::  It should select all the users ");
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-selected-members-wrapper']")).getText();
		assertEquals("5 users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).getText();
		assertEquals("Select all", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is selecting all the users ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("read receipt");
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		//driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("1.Deselect the select all");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Enter  text : test");
		test.info("Click on read receipt icon");
		test.info("Click on select all");
		test.info("Deselect the select all");
		test.info("EXPECTED RESULT ::  It should select all the users ");
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-selected-members-wrapper hidden']")).getAttribute("class");
		assertEquals("read-receipt-selected-members-wrapper hidden", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).getText();
		assertEquals("Select all", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is selecting all the users ");
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='readReceipt-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='readReceipt-9-1']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("2.Deselect the users");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Enter  text : test");
		test.info("Click on read receipt icon");
		test.info("Click on select all");
		test.info("Deselect the two users");
		test.info("EXPECTED RESULT ::  It should deselect the users & It should not highlight the checkbox of select all ");
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-selected-members-wrapper']")).getText();
		assertEquals("3 users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).getText();
		assertEquals("Select all", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is deselecting the users & It is not highlighting the checkbox of select all");
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//input[@id='readReceiptMembersSearch']")).sendKeys("upendra");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("3.search the valid user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Enter  text : test");
		test.info("Click on read receipt icon");
		test.info("search the user : upendra");
		test.info("EXPECTED RESULT ::  It should search the users  ");
		String a=driver.findElement(By.xpath("//div[@data-username='Upendra']")).getAttribute("data-username");
		assertEquals("Upendra", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching the users ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("3");
	}
	//@Test
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//input[@id='readReceiptMembersSearch']")).sendKeys("aaaaa");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("4.search the invalid user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Enter  text : test");
		test.info("Click on read receipt icon");
		test.info("search the user : aaaaa");
		test.info("EXPECTED RESULT ::  It should not search the users  ");
		String a=driver.findElement(By.xpath("//div[@class='no-results-found']")).getAttribute("class");
		assertEquals("no-results-found", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No results Found! ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("4");
	}
	//@Test
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-selected-members-wrapper']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='read-receipt-selected-members-wrapper-close']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("5.Click on close button in read receipt");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Enter  text : test");
		test.info("Click on read receipt icon");
		test.info("Click on select all");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should deselect the read receipt symbol ");
		assertEquals("5 users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='read-receipt-selected-members-wrapper hidden']")).getAttribute("class");
		assertEquals("read-receipt-selected-members-wrapper hidden", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is deselecting the read receipt symbol ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("5");
	}
	//@Test
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-selected-members-wrapper']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("6.Select all the users in read receipt & send");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Enter  text : test");
		test.info("Click on read receipt icon");
		test.info("Click on select all");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send read receipt to all the users ");
		assertEquals("5 users", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a2);
		test.pass(a2);
		System.out.println(a2);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending read receipt to all the users ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("6");
	}
	//@Test
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-selected-members-wrapper hidden']")).getAttribute("class");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("7.Deselect the select all & click on send");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Enter  text : test");
		test.info("Click on read receipt icon");
		test.info("Click on select all");
		test.info("Deselect the select all");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should send the msg without read receipt ");
		assertEquals("read-receipt-selected-members-wrapper hidden", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the msg without read receipt ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("7");
	}
	//@Test
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='readReceipt-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='readReceipt-9-1']")).click();
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-selected-members-wrapper']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("8.Deselect the users");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Enter  text : test");
		test.info("Click on read receipt icon");
		test.info("Click on select all");
		test.info("Deselect the two users");
		test.info("EXPECTED RESULT ::  It should deselect the users & It should send the msg with read receipt ");
		assertEquals("3 users", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a2);
		test.pass(a2);
		System.out.println(a2);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is deselecting the users & It is send the msg with read receipt");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("8");
	}
	//@Test
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//input[@id='readReceiptMembersSearch']")).sendKeys("upendra");
		driver.findElement(By.xpath("//label[@for='readReceipt-5-1']")).click();
		String a=driver.findElement(By.xpath("//div[@data-username='Upendra']")).getAttribute("data-username");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("9.search the user & Click on send with read receipt");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Enter  text : test");
		test.info("Click on read receipt icon");
		test.info("search the user : upendra");
		test.info("Select the user : upendra");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should search the user & Click on send  ");
		assertEquals("Upendra", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a2);
		test.pass(a2);
		System.out.println(a2);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching the user & Click on send ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("9");
	}
	//@Test
	public void test10() throws InterruptedException, AWTException {
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(1000);
		Robot rb = new Robot();
		Thread.sleep(1000);
		//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
		StringSelection str = new StringSelection("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
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
		ExtentTest test=extent.createTest("10.Send the image with read receipt in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Click on attachment");
		test.info("Select the image");
		test.info("Click on read receipt icon");
		test.info("Click on select all");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should display read receipt symbol to the image ");
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='image_attachment_background']")).getAttribute("class");
		assertEquals("image_attachment_background", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying read receipt symbol to the image ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("10");
	}
	//@Test
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(1000);
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
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
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(8000);
		ExtentTest test=extent.createTest("11.Send the image(caption) with read receipt in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Click on attachment");
		test.info("Select the image");
		test.info("Click on read receipt icon");
		test.info("Click on select all");
		test.info("Enter caption : test");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should display read receipt symbol to the image with caption");
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='image_attachment_background']")).getAttribute("class");
		assertEquals("image_attachment_background", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("(//span[@class='image-caption'])[2]")).getText();
		assertEquals("test", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying read receipt symbol to the image with caption ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("11");
	}
	//@Test
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(1000);
		Robot rb = new Robot();
		Thread.sleep(1000);
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(8000);
		ExtentTest test=extent.createTest("12.Send the video with read receipt to user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Click on attachment");
		test.info("Select the video");
		test.info("Click on read receipt icon");
		test.info("Click on select all");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should display read receipt symbol to the video");
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']")).getAttribute("class");
		assertEquals("video-attachment-wrapper", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying read receipt symbol to the video ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("12");
	}
	//@Test
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(1000);
		Robot rb = new Robot();
		Thread.sleep(1000);
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(8000);
		ExtentTest test=extent.createTest("13.Send the video(caption) with read receipt in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Click on attachment");
		test.info("Select the video");
		test.info("Click on read receipt icon");
		test.info("Click on select all");
		test.info("Enter caption : test");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should display read receipt symbol to the video with caption ");
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']")).getAttribute("class");
		assertEquals("video-attachment-wrapper", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("(//span[@class='image-caption'])[2]")).getText();
		assertEquals("test", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying read receipt symbol to the video with caption ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("13");
	}
	@Test
	public void test14() throws InterruptedException, AWTException {
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(1000);
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/Aug_2021_Timesheet.xlsx");
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
		ExtentTest test=extent.createTest("14.Send the doc with read receipt in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Click on attachment");
		test.info("Select the doc");
		test.info("Click on read receipt icon");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should display read receipt symbol to the doc ");
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='messenger-attachment-link-name']")).getText();
		assertEquals("Aug_2021_Timesheet.xlsx", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying read receipt symbol to the doc ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("14");
	}
	@Test
	public void test15() throws InterruptedException, AWTException {
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(1000);
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/SFTBR-04-converted.docx");
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
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(5000);
		ExtentTest test=extent.createTest("15.Send the doc(caption) with read receipt in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Click on attachment");
		test.info("Select the doc");
		test.info("Click on read receipt icon");
		test.info("Enter caption : test");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should display read receipt symbol to the doc with caption ");
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("(//span[@class='messenger-attachment-link-name'])[2]")).getText();
		assertEquals("SFTBR-04-converted.docx", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("(//span[@class='image-caption'])[2]")).getText();
		assertEquals("test", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying read receipt symbol to the doc with caption ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("15");
	}
	@Test
	public void test16() throws InterruptedException {
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("www.google.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("16.Send the link with read receipt in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Enter  text : www.google.com");
		test.info("Click on read receipt icon");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should display read receipt symbol to the link ");
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='browser-link']")).getAttribute("path");
		assertEquals("http://www.google.com", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying read receipt symbol to the link ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("16");
	}
	@Test
	public void test17() throws InterruptedException, AWTException {
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/eclipse-inst-jre-linux64/Test/Personalsettingwithaudiodevices.html");
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
		StringSelection str1 = new StringSelection("/home/tvisha/Downloads/Instrumental.mp3");
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
		Thread.sleep(8000);
		ExtentTest test=extent.createTest("17.Send the multiple attachment with read receipt in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Click on attachment");
		test.info("Select the html doc");
		test.info("Select audio file");
		test.info("Click on read receipt icon");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should display read receipt symbol to the html doc & audio ");
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("(//span[@class='messenger-attachment-link-name'])[1]")).getText();
		assertEquals("Personalsettingwithaudiodevices.html", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		assertEquals("audio-attachment-wrapper", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying read receipt symbol to the html doc & audio ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("17");
	}
	//@Test
	public void test18() throws InterruptedException, AWTException {
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/eclipse-inst-jre-linux64/Test/Personalsettingwithaudiodevices.html");
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='messenger-attachment-drag-img']")).click();
		Thread.sleep(1000);
		StringSelection str1 = new StringSelection("/home/tvisha/Downloads/Instrumental.mp3");
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
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(8000);
		ExtentTest test=extent.createTest("18.Send the multiple attachment(caption) with read receipt in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group : test01");
		test.info("Click on attachment");
		test.info("Select the html doc");
		test.info("Select audio file");
		test.info("Click on read receipt icon");
		test.info("Enter caption : 1");
		test.info("Click on send");
		test.info("EXPECTED RESULT ::  It should display read receipt symbol to the html doc & audio with caption");
		String a=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("title");
		assertEquals("Read Receipt", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("(//span[@class='messenger-attachment-link-name'])[3]")).getText();
		assertEquals("Personalsetting.....html", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		assertEquals("audio-attachment-wrapper", a2);
		test.pass(a2);
		System.out.println(a2);
		String a3=driver.findElement(By.xpath("//span[@class='image-caption']")).getText();
		assertEquals("", a3);
		test.pass(a3);
		System.out.println(a3);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying read receipt symbol to the html doc & audio with caption");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("18");
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


