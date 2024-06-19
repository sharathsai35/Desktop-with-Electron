package Troopgrit;

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

public class innersearchuser {
	 WebDriver driver ;
	 ExtentHtmlReporter HtmlReporter;
	 static ExtentReports extent;
	@BeforeClass
	 public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("innersearchusergrit.html");
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
	public void test034() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		String a=driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("34.Click on search in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on User : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("EXPECTED RESULT ::  It should click on search in user ");		
		assertEquals("Search", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on search in user ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("34");
	}
	@Test
	public void test035() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("35.Enter text in search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on search input");
		test.info("Enter text : test");
		test.info("EXPECTED RESULT ::  It should click on search in user ");		
		String a=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on search in user ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("35");
	}
	@Test
	public void test036() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-up']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-down']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("36.Click on arrow up button & down arrow button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on search input");
		test.info("Enter text : test");
		test.info("Click on arrow up");
		test.info("Click on arrow down");
		test.info("EXPECTED RESULT ::  It should click on arrow up & arrow down ");		
		String a=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on arrow up & arrow down ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("36");
	}
	@Test
	public void test037() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-up']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("37.Click on reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on search input");
		test.info("Enter text : test");
		test.info("Click on arrow up");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should refresh the page ");				
		assertEquals("Refresh", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("37");
	}
	@Test
	public void test038() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-up']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("38.Click on close button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on search input");
		test.info("Enter text : test");
		test.info("Click on arrow up");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the search input page ");				
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the search input page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("38");
	}
	//All users
	@Test
	public void test039() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("39.Click on All user in search");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("EXPECTED RESULT ::  It should display users list ");				
		String a=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getAttribute("class");
		assertEquals("search-sender-users-wrapper", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying users list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("39");
	}
	@Test
	public void test040() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-12-1']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("40.Select the user whose didn't send msg in user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select the user in that list");
		test.info("EXPECTED RESULT ::  It should display empty msgs ");				
		String a=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying empty msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("40");
	}
	@Test
	public void test041() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("41.Select user in All users list");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select the user in list");
		test.info("Click on any msg");
		test.info("EXPECTED RESULT ::  It should display of the username ");				
		String a=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		assertEquals("Me", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying of the username ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("41");
	}
	@Test
	public void test042() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("42.Select the user & deselect the user in All users list");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select the user");
		test.info("Deselect the user");
		test.info("Click on any msg");
		test.info("EXPECTED RESULT ::  It should display All users ");				
		String a=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		assertEquals("All Users", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All users ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("42");
	}
	//search text & All users
	@Test
	public void test043() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-12-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("43.Combination with input search & All users list");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user :maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple user");
		test.info("Click on any msg");
		test.info("EXPECTED RESULT ::  It should display the selected user msgs ");				
		String a=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		assertEquals("All Users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the selected user msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("43");
	}
	@Test
	public void test044() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-12-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("44.Combination with input search & All users list & Click on reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select users");
		test.info("Click on any msg");
		test.info("Click on reset");
		test.info("EXPECTED RESULT ::  It should refresh the search page ");				
		String a=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		assertEquals("All Users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("singleConversationSearchInput")).getAttribute("placeholder");
		assertEquals("Search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the search page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("44");
	}
	@Test
	public void test045() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("45.Combination with input search & All users list & Click on close button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user :maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on any msg");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should not display the search input in group ");	
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying the search input in group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("45");
	}
	//All dates
	@Test
	public void test046() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("46.Click on all dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user :maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("EXPECTED RESULT ::  It should display All dates list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("46");
	}
	@Test
	public void test047() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("47.Click on today in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Today");
		test.info("EXPECTED RESULT ::  It should display Today's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Today", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Today's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("47");
	}
	@Test
	public void test048() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("48.Click on Yesterday in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Yesterday");
		test.info("EXPECTED RESULT ::  It should display yesterday's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Yesterday", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying yesterday's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("48");
	}
	@Test
	public void test049() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("49.Click on Last 7 days in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should display Last 7 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 7 Days", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 7 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("49");
	}
	@Test
	public void test050() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("50.Click on Last 30 days in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should display Last 30 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 30 Days", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 30 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("50");
	}
	@Test
	public void test051() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("51.Click on This month in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should display This month list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Month", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This month list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("51");
	}
	@Test
	public void test052() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("52.Click on This year in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should display This year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Year", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("52");
	}
	@Test
	public void test053() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("53.Click on Last year in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should display Last year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last Year", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("53");
	}
	@Test
	public void test054() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("54.Click on All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Select on All dates");
		test.info("EXPECTED RESULT ::  It should display All dates list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("54");
	}
	@Test
	public void test055() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("55.Click on apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Select All dates");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("55");
	}
	@Test
	public void test056() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("56.Click on apply with only from date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select to date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select to date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("56");
	}
	@Test
	public void test057() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("57.Click on apply with only to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("57");
	}
	@Test
	public void test058() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("58.Click on apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user: maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display the msgs of that particular dates ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Date Range", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the msg of that particular dates ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("58");
	}
	//combination of search input , users & All dates
	@Test
	public void test059() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("59.Combination of search, users & today");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on Today");
		test.info("EXPECTED RESULT ::  It should display Today's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Today", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Today's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("59");
	}
	@Test
	public void test060() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("60.Combination of search, users & yesterday");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on Yesterday");
		test.info("EXPECTED RESULT ::  It should display yesterday's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Yesterday", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying yesterday's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("60");
	}
	@Test
	public void test061() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("61.Combination of search, users & Last 7 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user :maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should display Last 7 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 7 Days", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 7 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("61");
	}
	@Test
	public void test062() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("62.Combination of search, users & Last 30 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user :maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should display Last 30 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 30 Days", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 30 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("62");
	}
	@Test
	public void test063() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("63.Combination of search, users & This month");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should display This month list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Month", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This month list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("63");
	}
	@Test
	public void test064() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("64.Combination of search, users & This year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should display This year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Year", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("64");
	}
	@Test
	public void test065() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("65.Combination of search, users & Last year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user :maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should display Last year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last Year", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("65");
	}
	@Test
	public void test066() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("66.Combination of search, users & All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Select on All dates");
		test.info("EXPECTED RESULT ::  It should display All dates list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("66");
	}
	@Test
	public void test067() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("67.Combination of search, users & apply without from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("67");
	}
	@Test
	public void test68() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("68.Combination of search, users & apply with from date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user :maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select to date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select to date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("68");
	}
	@Test
	public void test069() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("69.Combination of search, users & apply with to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("69");
	}
	@Test
	public void test070() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("70.Combination of search, users & apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display the msgs of that particular dates ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Date Range", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the msg of that particular dates ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("70");
	}
	//combination of search & All dates
	@Test
	public void test071() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("71.Combination of search & today");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Today");
		test.info("EXPECTED RESULT ::  It should display Today's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Today", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Today's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("71");
	}
	@Test
	public void test072() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("72.Combination of search & yesterday");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Yesterday");
		test.info("EXPECTED RESULT ::  It should display yesterday's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Yesterday", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying yesterday's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("72");
	}
	@Test
	public void test073() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("73.Combination of search & Last 7 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user :maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should display Last 7 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 7 Days", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 7 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("73");
	}
	@Test
	public void test074() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("74.Combination of search & Last 30 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user :maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should display Last 30 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 30 Days", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 30 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("74");
	}
	@Test
	public void test075() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("75.Combination of search & This month");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should display This month list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Month", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This month list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("75");
	}
	@Test
	public void test076() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("76.Combination of search & This year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should display This year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Year", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("76");
	}
	@Test
	public void test077() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("77.Combination of search & Last year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should display Last year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last Year", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("77");
	}
	@Test
	public void test078() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("78.Combination of search & All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Select on All dates");
		test.info("EXPECTED RESULT ::  It should display All dates list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("78");
	}
	@Test
	public void test079() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("79.Combination of search & apply without from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("79");
	}
	@Test
	public void test080() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("80.Combination of search & apply with from date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select to date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select to date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("80");
	}
	@Test
	public void test081() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("81.Combination of search & apply with to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("81");
	}
	@Test
	public void test082() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("82.Combination of search & apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display the msgs of that particular dates ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Date Range", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the msg of that particular dates ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("82");
	}
	//combination of All users & All dates
	@Test
	public void test083() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("83.Combination of users & today");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on Today");
		test.info("EXPECTED RESULT ::  It should display Today's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Today", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@data-username='Me']")).getAttribute("data-username");
		assertEquals("Me", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Today's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("83");
	}
	@Test
	public void test084() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("84.Combination of users & yesterday");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on Yesterday");
		test.info("EXPECTED RESULT ::  It should display yesterday's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Yesterday", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@data-username='Me']")).getAttribute("data-username");
		assertEquals("Me", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying yesterday's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("84");
	}
	@Test
	public void test085() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("85.Combination of users & Last 7 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should display Last 7 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 7 Days", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@data-username='Me']")).getAttribute("data-username");
		assertEquals("Me", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 7 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("85");
	}
	@Test
	public void test086() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("86.Combination of users & Last 30 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should display Last 30 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 30 Days", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@data-username='Me']")).getAttribute("data-username");
		assertEquals("Me", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 30 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("86");
	}
	@Test
	public void test087() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("87.Combination of users & This month");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should display This month list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Month", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@data-username='Me']")).getAttribute("data-username");
		assertEquals("Me", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This month list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("87");
	}
	@Test
	public void test088() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("88.Combination of users & This year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should display This year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Year", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@data-username='Me']")).getAttribute("data-username");
		assertEquals("Me", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("88");
	}
	@Test
	public void test089() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("89.Combination of users & Last year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should display Last year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last Year", a);
		test.pass(a);
		System.out.println(a);
		String a2=driver.findElement(By.xpath("//div[@data-username='Me']")).getAttribute("data-username");
		assertEquals("Me", a2);
		test.pass(a2);
		System.out.println(a2);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("89");
	}
	@Test
	public void test090() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("90.Combination of users & All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Select on All dates");
		test.info("EXPECTED RESULT ::  It should display All dates list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@data-username='Me']")).getAttribute("data-username");
		assertEquals("Me", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("90");
	}
	@Test
	public void test091() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("91.Combination of users & apply without from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("91");
	}
	@Test
	public void test092() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("92.Combination of users & apply with from date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select to date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select to date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("92");
	}
	@Test
	public void test093() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("93.Combination of users & apply with to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("93");
	}
	@Test
	public void test094() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("94.Combination of users & apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display the msgs of that particular dates ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Date Range", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@data-username='Me']")).getAttribute("data-username");
		assertEquals("Me", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the msg of that particular dates ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("94");
	}
	@Test
	public void test095() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("95.Combination of search, users & apply with from & to date & reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on any msg");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("Click on reset");
		test.info("EXPECTED RESULT ::  It should refresh the search input page ");				
		String a=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		assertEquals("All Users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("singleConversationSearchInput")).getAttribute("placeholder");
		assertEquals("Search", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is refreshing the search input page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("95");
	}
	@Test
	public void test096() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("//tr//th[@class='prev']")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("96.Combination of search, users & apply with from & to date & close button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : maneesh ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select user");
		test.info("Click on any msg");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should not display the search input in group ");	
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying the search input in group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("96");
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
