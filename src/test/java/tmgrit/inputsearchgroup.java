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

public class inputsearchgroup {
	static WebDriver driver = null;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("inputsearchgroupgrit2.html");
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		String a=driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("0.Click on search in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("EXPECTED RESULT ::  It should click on search in group ");		
		assertEquals("Search", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on search in group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("search");
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("1.Enter text in search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on search input");
		test.info("Enter text : test");
		test.info("EXPECTED RESULT ::  It should click on search in group ");		
		String a=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on search in group ");
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-up']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-up']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='conversation-search-arrow-down']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("2.Click on arrow up button & down arrow button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
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
		ExtentTest test=extent.createTest("3.Click on reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
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
		ExtentTest test=extent.createTest("4.Click on close button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("5.Click on All user in search");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("EXPECTED RESULT ::  It should display group users list ");				
		String a=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getAttribute("class");
		assertEquals("search-sender-users-wrapper", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying group users list ");
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("6.Select the user whose didn't send msg in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("7.Select multiple user in All users list");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select the users in list");
		test.info("Click on any msg");
		test.info("EXPECTED RESULT ::  It should display count of the users ");				
		String a=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		assertEquals("3 Selected", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying count of the users ");
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("8.Select the user & deselect the user in All users list");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("9.Combination with input search & All users list");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple user");
		test.info("Click on any msg");
		test.info("EXPECTED RESULT ::  It should display the selected user msgs ");				
		String a=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		assertEquals("3 Selected", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='conversation-message-search-highlight']")).getText();
		assertEquals("test", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the selected user msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("9");
	}
	@Test
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("10.Combination with input search & All users list & Click on reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple user");
		test.info("Click on any msg");
		test.info("Click on reset");
		test.info("EXPECTED RESULT ::  It should display the All user msgs ");				
		String a=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		assertEquals("All Users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("singleConversationSearchInput")).getAttribute("placeholder");
		assertEquals("Search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the All user msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("10");
	}
	//@Test
	public void test11() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("11.Combination with input search & All users list & Click on close button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple user");
		test.info("Click on any msg");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should not display the search input in group ");	
		assertEquals("Close", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying the search input in group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("11");
	}
	//@Test
	public void test12() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("12.Click on all dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("12");
	}
	@Test
	public void test13() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("13.Click on today in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("13");
	}
	//@Test
	public void test14() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("14.Click on Yesterday in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("14");
	}
	@Test
	public void test15() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("15.Click on Last 7 days in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("16.Click on Last 30 days in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("16");
	}
	@Test
	public void test17() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("17.Click on This month in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("17");
	}
	//@Test
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("18.Click on This year in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("18");
	}
	//@Test
	public void test19() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("19.Click on Last year in All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("19");
	}
	//@Test
	public void test20() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("20.Click on All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("20");
	}
	@Test
	public void test21() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("21.Click on apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("21");
	}
	@Test
	public void test22() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("22.Click on apply with only from date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("22");
	}
	//@Test
	public void test23() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("23.Click on apply with only to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("23");
	}
	@Test
	public void test24() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("24.Click on apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("24");
	}
	//combination of search input , users & All dates
	//@Test
	public void test25() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("25.Combination of search, users & today");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Today");
		test.info("EXPECTED RESULT ::  It should display Today's list ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying Today's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("25");
	}
	//@Test
	public void test26() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("26.Combination of search, users & yesterday");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Yesterday");
		test.info("EXPECTED RESULT ::  It should display yesterday's list ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying yesterday's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("26");
	}
	@Test
	public void test27() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("27.Combination of search, users & Last 7 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should display Last 7 day's list ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying Last 7 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("27");
	}
	@Test
	public void test28() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("28.Combination of search, users & Last 30 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should display Last 30 day's list ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying Last 30 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("28");
	}
	//@Test
	public void test29() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("29.Combination of search, users & This month");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should display This month list ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying This month list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("29");
	}
	//@Test
	public void test30() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("30.Combination of search, users & This year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should display This year list ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying This year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("30");
	}
	@Test
	public void test31() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("31.Combination of search, users & Last year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should display Last year list ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		assertEquals("Ouhh... It's empty in here.", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying Last year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("31");
	}
	//@Test
	public void test32() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("32.Combination of search, users & All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Select on All dates");
		test.info("EXPECTED RESULT ::  It should display All dates list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("32");
	}
	@Test
	public void test33() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("33.Combination of search, users & apply without from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("33");
	}
	@Test
	public void test34() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("34.Combination of search, users & apply with from date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
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
		System.out.println("34");
	}
	//@Test
	public void test35() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("35.Combination of search, users & apply with to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
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
		System.out.println("35");
	}
	@Test
	public void test36() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("36.Combination of search, users & apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display the msgs of that particular dates ");	
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Something went wrong try again later!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying the msg of that particular dates ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("36");
	}
	//combination of search & All dates
	//@Test
	public void test37() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("37.Combination of search & today");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Today's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("37");
	}
	//@Test
	public void test38() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("38.Combination of search & yesterday");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying yesterday's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("38");
	}
	@Test
	public void test39() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("39.Combination of search & Last 7 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 7 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("39");
	}
	//@Test
	public void test40() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("40.Combination of search & Last 30 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 30 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("40");
	}
	@Test
	public void test41() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("41.Combination of search & This month");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This month list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("41");
	}
	//@Test
	public void test42() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("42.Combination of search & This year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("42");
	}
	//@Test
	public void test43() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("43.Combination of search & Last year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("43");
	}
	@Test
	public void test44() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("44.Combination of search & All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("44");
	}
	@Test
	public void test45() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("45.Combination of search & apply without from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("45");
	}
	//@Test
	public void test46() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("46.Combination of search & apply with from date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("46");
	}
	//@Test
	public void test47() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("47.Combination of search & apply with to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		System.out.println("47");
	}
	@Test
	public void test48() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("48.Combination of search & apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
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
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the msg of that particular dates ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("48");
	}
	//combination of users & All dates
	@Test
	public void test49() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("49.Combination of users & today");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Today");
		test.info("EXPECTED RESULT ::  It should display Today's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Today", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Today's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("49");
	}
	//@Test
	public void test50() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("50.Combination of users & yesterday");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Yesterday");
		test.info("EXPECTED RESULT ::  It should display yesterday's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Yesterday", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying yesterday's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("50");
	}
	@Test
	public void test51() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("51.Combination of users & Last 7 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should display Last 7 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 7 Days", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 7 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("51");
	}
	@Test
	public void test52() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("52.Combination of users & Last 30 days");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should display Last 30 day's list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("Last 30 Days", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Last 30 day's list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("52");
	}
	//@Test
	public void test53() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("53.Combination of users & This month");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should display This month list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Month", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This month list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("53");
	}
	@Test
	public void test54() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("54.Combination of users & This year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should display This year list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("This Year", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying This year list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("54");
	}
	@Test
	public void test55() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("55.Combination of users & Last year");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
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
		System.out.println("55");
	}
	//@Test
	public void test56() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("56.Combination of users & All dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
		test.info("Select on All dates");
		test.info("EXPECTED RESULT ::  It should display All dates list ");	
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		assertEquals("All Dates", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All dates list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("56");
	}
	@Test
	public void test57() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("57.Combination of users & apply without from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
		test.info("Click on All dates");
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
	public void test58() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("58.Combination of users & apply with from date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
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
		System.out.println("58");
	}
	//@Test
	public void test59() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[27]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("59.Combination of users & apply with to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
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
		System.out.println("59");
	}
	@Test
	public void test60() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("60.Combination of users & apply with from & to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on All users");
		test.info("Select multiple users");
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
		System.out.println("60");
	}
	@Test
	public void test61() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("61.Combination of search, users & apply with from & to date & reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple user");
		test.info("Click on any msg");
		test.info("Click on All dates");
		test.info("Click on from date");
		test.info("Select any date");
		test.info("Click on to date");
		test.info("Select any date");
		test.info("Click on apply");
		test.info("Click on reset");
		test.info("EXPECTED RESULT ::  It should display the All user msgs ");				
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
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the All user msgs ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("61");
	}
	@Test
	public void test62() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[@data-name='test']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationSearchInput")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("senderSelectedText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-5-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-11-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("singleConversationCustomDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[23]")).click();
		driver.findElement(By.id("singleConversationCustomDateRangeFilterApply")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("62.Combination of search, users & apply with from & to date & close button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on 3 dots");
		test.info("Click on search");
		test.info("Click on input search");
		test.info("Enter text : test");
		test.info("Click on All users");
		test.info("Select multiple user");
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
		System.out.println("62");
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
