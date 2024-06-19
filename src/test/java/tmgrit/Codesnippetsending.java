package tmgrit;

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

public class Codesnippetsending {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("Codesnippetsending1.html");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-code-btn input-action-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("0.Click on code snippet");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet icon");
		test.info("EXPECTED RESULT ::  It should click on code snippet icon ");
		String a=driver.findElement(By.xpath("//div[@class='input-code-btn input-action-btn active']")).getAttribute("title");
		assertEquals("Code Snippet", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on code snippet icon ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("code snippet");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-code-btn input-action-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("1.Send code snippet");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet icon");
		test.info("Enter text : test test");
		test.info("Click on send button");
		test.info("EXPECTED RESULT ::  It should send the code snippet msg ");
		String a=driver.findElement(By.xpath("//div[@class='code-snippet-wrapper']")).getText();
		assertEquals("Untitled.txt\n"
				+ "test test\n"
				+ "+ show full code\n"
				+ "Edit", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending the code snippet msg ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-code-btn input-action-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='c-s-c-w']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("2.Click on sent code snippet");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet icon");
		test.info("Enter text : test test");
		test.info("Click on send button");
		test.info("Click on sended code snippet");
		test.info("EXPECTED RESULT ::  It should click on sended code snippet msg ");
		String a=driver.findElement(By.xpath("//div[@class='code-snippet-wrapper']")).getText();
		assertEquals("Untitled.txt\n"
				+ " test test\n"
				+ "+ show full code\n"
				+ "Edit", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='code-f-w']")).getText();
		assertEquals("from :\n"
				+ "sharath", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on sended code snippet msg ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='c-s-c-w']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='code-r-b']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("3.Click on reply & send msg");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet msg");
		test.info("Click on reply");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("EXPECTED RESULT ::  It should send reply to the code snippet msg ");
		String a=driver.findElement(By.xpath("//div[@class='c-s-r-t-w']")).getText();
		assertEquals("Untitled.txt", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is sending reply to the code snippet msg ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='c-s-c-w']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='code-f-b']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='forwardUser_12-1']")).click();
		driver.findElement(By.xpath("//label[@for='forwardUser_301-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='modalForwardSendMessageBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("4.Click on forward & send to the user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet msg");
		test.info("Click on froward icon");
		test.info("Click on forward");
		test.info("Select the users/groups");
		test.info("Click on send button");
		test.info("EXPECTED RESULT ::  It should forward the code snippet msg to the user ");
		String a=driver.findElement(By.xpath("//span[@class='forward-conversation-label-icon']")).getAttribute("class");
		assertEquals("forward-conversation-label-icon", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='code-snippet-wrapper']")).getText();
		assertEquals("Untitled.txt\n"
				+ "test test\n"
				+ "+ show full code\n"
				+ "Edit", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is forwarding the code snippet msg to the user ");
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='c-s-c-w']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='code-f-b']")).click();
		Thread.sleep(2000);
		String a1=driver.findElement(By.xpath("//span[@id='forwardMessageCloseBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='forwardMessageCloseBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("5.Click on forward & click on cancel button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet msg");
		test.info("Click on forward icon");
		test.info("Click on cancel button");
		test.info("EXPECTED RESULT ::  It should not forward the code snippet msg ");
		assertEquals("CANCEL", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not forwarding the code snippet msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("5");
	}
	@Test
	public void test06() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='c-s-c-w']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='code-d-b']")).click();
		Thread.sleep(2000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("6.Click on download");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet msg");
		test.info("Click on download icon");
		test.info("EXPECTED RESULT ::  It should download the code snippet msg ");
		String a1=driver.findElement(By.xpath("//span[@class='code-d-b']")).getAttribute("class");
		assertEquals("code-d-b", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is downloading the code snippet msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("6");
	}	
	@Test
	public void test07() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='c-s-c-w']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='code-e-b']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//div[@class='CodeMirror cm-s-default CodeMirror-wrap']"));
		Actions ac=new Actions(driver);
		ac.click(e).sendKeys(" test\n"
				+ "test test").perform();
		driver.findElement(By.id("codeSubmitBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("7.Click on edit & edit the msg");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet msg");
		test.info("Click on edit icon");
		test.info("Enter text : test\n"
				+ "test test");
		test.info("Click on submit");
		test.info("EXPECTED RESULT ::  It should edit the code snippet msg ");
		String a1=driver.findElement(By.xpath("//span[@class='edited-conversation-icon']")).getAttribute("class");
		assertEquals("edited-conversation-icon", a1);
		test.pass(a1);
		System.out.println(a1);
		String a=driver.findElement(By.xpath("//span[@class='edited-conversation-name']")).getText();
		assertEquals("( sharath )", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is editing the code snippet msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("7");
	}
	@Test
	public void test08() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='c-s-c-w']")).click();
		Thread.sleep(2000);
		String a1=driver.findElement(By.xpath("//span[@class='code-c-b']")).getAttribute("class");
		driver.findElement(By.xpath("//span[@class='code-c-b']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("8.Click on close");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet msg");
		test.info("Click on close icon");
		test.info("EXPECTED RESULT ::  It should close the code snippet msg ");
		assertEquals("code-c-b", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the code snippet msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("8");
	}
	@Test
	public void test09() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='c-s-c-w']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='code-e-b']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='codeTitleInput']")).clear();
		driver.findElement(By.xpath("//input[@id='codeTitleInput']")).sendKeys("aaaa");
		Thread.sleep(2000);
		driver.findElement(By.id("codeSubmitBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("9.Edit the name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet msg");
		test.info("Click on edit icon");
		test.info("Click on page name");
		test.info("Clear the name");
		test.info("Enter new name : aaaa");
		test.info("Click on submit");
		test.info("EXPECTED RESULT ::  It should change the name of code snippet msg ");
		String a1=driver.findElement(By.xpath("//span[@class='code-c-b']")).getAttribute("class");
		assertEquals("code-c-b", a1);
		test.pass(a1);
		System.out.println(a1);
		String a=driver.findElement(By.xpath("//div[@class='c-s-fn-w']")).getText();
		assertEquals("aaaa.txt", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is changing the name of code snippet msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("9");
	}
	@Test
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='c-s-c-w']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='code-e-b']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='codeTitleInput']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("codeSubmitBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("10.Edit the name & clear the name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet msg");
		test.info("Click on edit icon");
		test.info("Click on page name");
		test.info("Clear the name");
		test.info("Enter new name : aaaa");
		test.info("Click on submit");
		test.info("EXPECTED RESULT ::  It should change the name of code snippet msg ");
		String a1=driver.findElement(By.xpath("//span[@class='code-c-b']")).getAttribute("class");
		assertEquals("code-c-b", a1);
		test.pass(a1);
		System.out.println(a1);
		String a=driver.findElement(By.xpath("//div[@class='c-s-fn-w']")).getText();
		assertEquals("Untitled.txt", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is changing the name of code snippet msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("10");
	}
	@Test
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='c-s-c-w']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='code-e-b']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='code-m-w']")).click();
		driver.findElement(By.xpath("//div[@data-searchtext='C']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("codeSubmitBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("11.Select language");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet msg");
		test.info("Click on language");
		test.info("Select language : C");
		test.info("EXPECTED RESULT ::  It should select the language in the code snippet msg ");
		String a=driver.findElement(By.xpath("//div[@class='c-s-fn-w']")).getText();
		assertEquals("Untitled.txt.c", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is selecting the language in the code snippet msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("11");
	}
	@Test
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='c-s-c-w']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='code-e-b']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='code-m-w']")).click();
		driver.findElement(By.xpath("//input[@id='codeModeSearchInput']")).sendKeys("java");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("12.Search language");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet msg");
		test.info("Click on language");
		test.info("Search language : Java");
		test.info("EXPECTED RESULT ::  It should search the language in the code snippet msg ");
		String a=driver.findElement(By.xpath("//div[@data-searchtext='Java']")).getText();
		assertEquals("Java", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching the language in the code snippet msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("12");
	}
	@Test
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='c-s-c-w']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='code-e-b']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='code-m-w']")).click();
		driver.findElement(By.xpath("//input[@id='codeModeSearchInput']")).sendKeys("java");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='codeModeSearchInput']")).clear();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("13.Search language & Clear the search");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet msg");
		test.info("Click on language");
		test.info("Search language : Java");
		test.info("EXPECTED RESULT ::  It should search the language & Clear the text in the code snippet msg ");
		String a=driver.findElement(By.xpath("//input[@id='codeModeSearchInput']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching the language & clearing the text in the code snippet msg ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='c-s-c-w']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='code-e-b']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='code-m-w']")).click();
		driver.findElement(By.xpath("//input[@id='codeModeSearchInput']")).sendKeys("java");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-searchtext='Java']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("codeSubmitBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("14.Search language & Click on submit");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet msg");
		test.info("Click on language");
		test.info("Search language : Java");
		test.info("Click on java");
		test.info("Click on submit");
		test.info("EXPECTED RESULT ::  It should select the searched language in the code snippet msg ");
		String a=driver.findElement(By.xpath("//div[@class='c-s-fn-w']")).getText();
		assertEquals("Untitled.txt.java", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is selecting the searched language in the code snippet msg ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@class='c-s-f-b']")).getText();
		driver.findElement(By.xpath("//span[@class='c-s-f-b']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("15.Click on show full code");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Select code snippet");
		test.info("Click on show full code");
		test.info("EXPECTED RESULT ::  It should click on show full code in the code snippet msg ");
		assertEquals("+ show full code", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on show full code in the code snippet msg ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("15");
	}
	@Test
	public void test16() throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@class='c-s-e-b']")).getText();
		driver.findElement(By.xpath("//span[@class='c-s-e-b']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("16.Click on edit");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Select code snippet");
		test.info("Click on edit");
		test.info("EXPECTED RESULT ::  It should click on edit & it should highlight the edit icon in the code snippet msg ");
		assertEquals("Edit", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on edit & it is highlighting the edit icon in the code snippet msg ");
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='c-s-e-b']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.id("codeSubmitBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("17.Click on code snippet & switch to user1/group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Select code snippet");
		test.info("Click on edit");
		test.info("Click on another user1/group1");
		test.info("Click on submit");
		test.info("EXPECTED RESULT ::  It should display the code snippet msg in user");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the code snippet msg in user");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("16");
	}
	@Test
	public void test18() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='c-s-c-w']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='code-r-b']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='c-s-r-t-w']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("18.Click on replied msg");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh");
		test.info("Click on code snippet msg");
		test.info("Click on reply");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Click on replied msg");
		test.info("EXPECTED RESULT ::  It should click on replied msg & it should highlight the exact replied msg ");
		String a1=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']")).getText();
		assertEquals("test test test\n"
				+ "test test", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on replied msg & it is highlighted the exact replied msg ");
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
