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

public class Recentusersearch {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("Recentusersearchgrit1.html");
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
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
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
	//@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("sharath");;
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("0.Search with valid user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Search on user : sharath");
		test.info("EXPECTED RESULT ::  It should display user name in the list ");
		String a=driver.findElement(By.xpath("//span[@data-name='sharath']")).getAttribute("data-name");
		assertEquals("sharath", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying username in the list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("recent search");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaaa");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("1.Search with invalid user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Search on user : aaaaaa");
		test.info("EXPECTED RESULT ::  It should not display user name ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying username ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaaa");
		Thread.sleep(1000);
		driver.findElement(By.id("clearRecentUserSearch")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("2.Click on close button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Search on user : aaaaaa");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should close the search & It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the search & It is displaying all users & groups ");
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("3.Click on recent user search filters");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("EXPECTED RESULT ::  It should display the filters ");
		String a=driver.findElement(By.xpath("//div[@class='recent-users-search-filter-wrapper']")).getAttribute("class");
		assertEquals("recent-users-search-filter-wrapper", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the filters ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("3");
	}
	//All members & groups
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='recent-users-search-filter-text active']")).getText();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-text active']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("4.Click on All members & group in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("Click on All members & groups");
		test.info("EXPECTED RESULT ::  It should display All members & group in recent user list ");
		assertEquals("All Members/Groups", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All members & group in recent user list ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("uppi");
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-text active']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("5.Click on All members & group in filter & search with valid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : uppi ");
		test.info("Click on filter in recent user search");
		test.info("Click on All members & groups");
		test.info("EXPECTED RESULT ::  It should display that particular user search names in  All members & group ");
		String a=driver.findElement(By.xpath("//span[@data-name='uppi']")).getAttribute("data-name");
		assertEquals("uppi", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying that particular user search names in  All members & group ");
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-text active']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("6.Click on All members & group in filter & search with invalid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaaaa ");
		test.info("Click on filter in recent user search");
		test.info("Click on All members & groups");
		test.info("EXPECTED RESULT ::  It should display No data ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying No data ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-text active']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("7.Click on close button with search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaaaa ");
		test.info("Click on filter in recent user search");
		test.info("Click on All members & groups");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display All users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All users & groups ");
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-text active']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("8.Click on close button without search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("Click on All members & groups");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display All users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("8");
	}
	//Members
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		String a=driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[1]")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[1]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("9.Click on members in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("Click on members");
		test.info("EXPECTED RESULT ::  It should display only members in recent user list ");
		assertEquals("Members", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying only members in recent user list ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("uppi");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[1]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("10.Click on members in filter & search with valid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : uppi");
		test.info("Click on filter in recent user search");
		test.info("Click on members");
		test.info("EXPECTED RESULT ::  It should display particular members in recent user list ");
		String a=driver.findElement(By.xpath("//span[@data-name='uppi']")).getAttribute("data-name");
		assertEquals("uppi", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying particular members in recent user list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("10");
	}
	@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[1]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("11.Click on members in filter & search with invalid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaaaa");
		test.info("Click on filter in recent user search");
		test.info("Click on members");
		test.info("EXPECTED RESULT ::  It should display No data ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying No data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("11");
	}
	@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("12.Click on close button with search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaaaa ");
		test.info("Click on filter in recent user search");
		test.info("Click on members");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display All users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All users & groups ");
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("13.Click on close button without search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("Click on members");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display All users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("13");
	}
	//Groups
	@Test
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		String a=driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[2]")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[2]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("14.Click on groups in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("Click on groups");
		test.info("EXPECTED RESULT ::  It should display only groups in recent user list ");
		assertEquals("Groups", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying only groups in recent user list ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[2]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("15.Click on groups in filter & search with valid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : test");
		test.info("Click on filter in recent user search");
		test.info("Click on groups");
		test.info("EXPECTED RESULT ::  It should display particular groups in recent user list ");
		String a=driver.findElement(By.xpath("//span[@data-name='test01']")).getAttribute("data-name");
		assertEquals("test01", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying particular groups in recent user list ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[2]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("16.Click on groups in filter & search with invalid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaaaa");
		test.info("Click on filter in recent user search");
		test.info("Click on groups");
		test.info("EXPECTED RESULT ::  It should display No data ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying No data ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("17.Click on close button with search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaaaa ");
		test.info("Click on filter in recent user search");
		test.info("Click on group");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display All users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("17");
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("18.Click on close button without search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("Click on groups");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display All users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("18");
	}
	//Orange Members
	@Test
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		String a=driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[3]")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[3]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("19.Click on orange members in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("Click on orange members");
		test.info("EXPECTED RESULT ::  It should display only orange members in recent user list ");
		assertEquals("Orange Member", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying only orange members in recent user list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("19");
	}
	@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("upendra");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[3]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("20.Click on orange members in filter & search with valid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : upendra");
		test.info("Click on filter in recent user search");
		test.info("Click on orange members");
		test.info("EXPECTED RESULT ::  It should display particular orange member in recent user list ");
		String a=driver.findElement(By.xpath("//span[@data-name='Upendra']")).getAttribute("data-name");
		assertEquals("Upendra", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying particular orange member in recent user list ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[3]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("21.Click on orange member in filter & search with invalid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaaaa");
		test.info("Click on filter in recent user search");
		test.info("Click on orange members");
		test.info("EXPECTED RESULT ::  It should display No data ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying No data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("21");
	}
	//@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("22.Click on close button with search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaaaa ");
		test.info("Click on filter in recent user search");
		test.info("Click on orange members");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display All users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All users & groups ");
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("23.Click on close button without search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("Click on orange members");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display All users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("23");
	}
	//Deactivated users
	//@Test
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		String a=driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[4]")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[4]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("24.Click on deactivated users in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("Click on Deactivated users");
		test.info("EXPECTED RESULT ::  It should display only deactivated users in recent user list ");
		assertEquals("De-Activated Users", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying only deactivated users in recent user list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("24");
	}
	@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("zbdb");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("25.Click on De-Activated Users in filter & search with valid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : zbdb");
		test.info("Click on filter in recent user search");
		test.info("Click on De-Activated Users");
		test.info("EXPECTED RESULT ::  It should display particular De-Activated Users in recent user list ");
		String a=driver.findElement(By.xpath("//span[@data-name='zbdb']")).getAttribute("data-name");
		assertEquals("zbdb", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying particular De-Activated Users in recent user list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("25");
	}
	@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[4]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("26.Click on De-Activated Users in filter & search with invalid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaaaa");
		test.info("Click on filter in recent user search");
		test.info("Click on De-Activated Users");
		test.info("EXPECTED RESULT ::  It should display No data ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying No data ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("27.Click on close button with search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaaaa ");
		test.info("Click on filter in recent user search");
		test.info("Click on De-Activated Users");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display All users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All users & groups ");
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("28.Click on close button without search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("Click on De-Activated Users");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display All users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("28");
	}
	//Deleted/Exit groups
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		String a=driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[5]")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[5]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("29.Click on Deleted/Exit groups in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("Click on Deleted/Exit Groups");
		test.info("EXPECTED RESULT ::  It should display only Deleted/Exit Groups in recent user list ");
		assertEquals("Deleted/Exit Groups", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying only Deleted/Exit Groups in recent user list ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[5]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("30.Click on Deleted/Exit Groups in filter & search with valid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : test");
		test.info("Click on filter in recent user search");
		test.info("Click on Deleted/Exit Groups");
		test.info("EXPECTED RESULT ::  It should display particular Deleted/Exit Groups in recent user list ");
		String a=driver.findElement(By.xpath("//span[@data-name='test01']")).getAttribute("data-name");
		assertEquals("test01", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying particular Deleted/Exit Groups in recent user list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("30");
	}
	//@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[5]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("31.Click on Deleted/Exit Groups in filter & search with invalid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaaaa");
		test.info("Click on filter in recent user search");
		test.info("Click on Deleted/Exit Groups");
		test.info("EXPECTED RESULT ::  It should display No data ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying No data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("31");
	}
	@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("32.Click on close button with search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaaaa ");
		test.info("Click on filter in recent user search");
		test.info("Click on Deleted/Exit Groups");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display All users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All users & groups ");
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("33.Click on close button without search input");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("Click on Deleted/Exit Groups");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display All users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying All users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("33");
	}
	//Custom dates
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("34.Click on custom dates");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("EXPECTED RESULT ::  It should click custom dates ");
		String a=driver.findElement(By.xpath("//div[@data-value='4']")).getAttribute("class");
		assertEquals("recent-users-chat-filter-container", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on custom dates ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("34");
	}
	//Today
	@Test
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("35.Click on custom dates with today without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on today");
		test.info("EXPECTED RESULT ::  It should click on today ");
		String a=driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[1]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("36.Click on custom dates with today input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on today");
		test.info("EXPECTED RESULT ::  It should search given data & It should display the users & groups ");
		String a=driver.findElement(By.xpath("//span[@data-type='1']")).getAttribute("data-name");
		assertEquals("maneesh", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching given data & It is displaying the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("36");
	}
	@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("37.Click on custom dates with today input with invalid data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : aaaa");
		test.info("Click on custom dates");
		test.info("Click on today");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("37");
	}
	@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("38.Click on close button with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on today");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("39.Click on close button without input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on today");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("39");
	}
	//yesterday
	@Test
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("40.Click on custom dates with Yesterday without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on yesterday");
		test.info("EXPECTED RESULT ::  It should click on Yesterday ");
		String a=driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[2]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("41.Click on custom dates with yesterday input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on yesterday");
		test.info("EXPECTED RESULT ::  It should search given data & It should display the users & groups ");
		String a=driver.findElement(By.xpath("//span[@data-type='1']")).getAttribute("data-name");
		assertEquals("maneesh", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching given data & It is displaying the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("41");
	}
	@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("42.Click on custom dates with yesterdays input with invalid data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : aaaa");
		test.info("Click on custom dates");
		test.info("Click on yesterday");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("42");
	}
	@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("43.Click on close button with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on yesterday");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("43");
	}
	//@Test
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("44.Click on close button without input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on yesterday");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("44");
	}
	//Last 7 days
	//@Test
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("45.Click on custom dates with last 7 days without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should click on Last 7 days ");
		String a=driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[3]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("46.Click on custom dates with Last 7 days input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should search given data & It should display the users & groups ");
		String a=driver.findElement(By.xpath("//span[@data-type='1']")).getAttribute("data-name");
		assertEquals("maneesh", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching given data & It is displaying the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("46");
	}
	@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("47.Click on custom dates with Last 7 days input with invalid data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : aaaa");
		test.info("Click on custom dates");
		test.info("Click on Last 7 days");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("47");
	}
	//@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("48.Click on close button with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on Last 7 days");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("48");
	}
	//@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("49.Click on close button without input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on Last 7 days");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("49");
	}
	//Last 30 days
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("50.Click on custom dates with Last 30 days without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should click on Last 30 days ");
		String a=driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[4]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("50");
	}
	//@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("51.Click on custom dates with Last 30 days input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@data-name='test']")).getAttribute("data-name");
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching and displaying the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("51");
	}
	//@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("52.Click on custom dates with Last 30 days input with invalid data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : aaaa");
		test.info("Click on custom dates");
		test.info("Click on Last 30 days");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("53.Click on close button with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on Last 30 days");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("53");
	}
	//@Test
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("54.Click on close button without input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on Last 30 days");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("54");
	}
	//This month
	//@Test
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("55.Click on custom dates with This month without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should click on This month ");
		String a=driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[5]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("55");
	}
	@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("56.Click on custom dates with This month with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@data-name='maneesh']")).getAttribute("data-name");
		assertEquals("maneesh", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching & displaying the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("56");
	}
	//@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("57.Click on custom dates with This month input with invalid data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : aaaa");
		test.info("Click on custom dates");
		test.info("Click on This month");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("57");
	}
	//@Test
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("58.Click on close button with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on This month");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("58");
	}
	@Test
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("59.Click on close button without input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on This month");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("59");
	}
	//This year
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("60.Click on custom dates with This year without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should click on This year ");
		String a=driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[6]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("61.Click on custom dates with This year with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on this year");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@data-name='sharath']")).getAttribute("data-name");
		assertEquals("sharath", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching & displaying the users & groups ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("62.Click on custom dates with This year input with invalid data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : aaaa");
		test.info("Click on custom dates");
		test.info("Click on This year");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("62");
	}
	@Test
	public void test63() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("63.Click on close button with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on This Year");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("63");
	}
	@Test
	public void test64() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("64.Click on close button without input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on This Year");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("64");
	}
	//Last year
	@Test
	public void test65() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("65.Click on custom dates with Last year without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should click on Last year ");
		String a=driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[7]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("65");
	}
	@Test
	public void test66() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("66.Click on custom dates with Last year with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("66");
	}
	@Test
	public void test67() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("67.Click on custom dates with Last year input with invalid data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : aaaa");
		test.info("Click on custom dates");
		test.info("Click on Last year");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("68.Click on close button with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on Last year");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("68");
	}
	@Test
	public void test69() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("69.Click on close button without input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on Last year");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("69");
	}
	//All dates
	@Test
	public void test70() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='8']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("70.Click on custom dates with All dates without any input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on All dates");
		test.info("EXPECTED RESULT ::  It should click on All dates ");
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Enter minimum 3 characters to search ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("70");
	}
	@Test
	public void test71() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='8']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("72.Click on custom dates with All dates with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on All dates");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@data-name='test']")).getAttribute("data-name");
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching & displaying the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("72");
	}
	@Test
	public void test73() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='8']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("73.Click on custom dates with All dates input with invalid data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : aaaa");
		test.info("Click on custom dates");
		test.info("Click on All dates");
		test.info("EXPECTED RESULT ::  It should search given msg ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("73");
	}
	@Test
	public void test74() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='8']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("74.Click on close button with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on All dates");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("74");
	}
	@Test
	public void test75() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='8']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("75.Click on close button without input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on All dates");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("75");
	}
	//Date range
	@Test
	public void test76() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='customDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("76.Click on date range apply button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on date range");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should click on apply button in date range ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("76");
	}
	@Test
	public void test77() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[9]")).click();
		driver.findElement(By.xpath("//input[@id='customDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("77.Click on date range with only from date ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on date range");
		test.info("Select from date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select to date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select to date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("77");
	}
	@Test
	public void test78() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[9]")).click();
		driver.findElement(By.xpath("//input[@id='customDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("78.Click on date range with only to date");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on date range");
		test.info("Select to date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select from date", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select from date ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("78");
	}
	@Test
	public void test79() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[13]")).click();
		driver.findElement(By.xpath("//input[@id='customDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("79.Click on date range with from & to dates without input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on date range");
		test.info("Select from date");
		test.info("Select to date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display the msgs in btw that dates ");
		String a1=driver.findElement(By.xpath("//span[@class='search-messages-info-text']")).getText();
		assertEquals("Enter minimum 3 characters to search", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the msgs in btw date range ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("79");
	}
	@Test
	public void test80() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[13]")).click();
		driver.findElement(By.xpath("//input[@id='customDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("80.Click on date range with from & to dates with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on date range");
		test.info("Select from date");
		test.info("Select to date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT ::  It should display the msgs in btw that dates ");
		String a=driver.findElement(By.xpath("//span[@data-name='test']")).getAttribute("data-name");
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the msgs in btw date range ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("80");
	}
	@Test
	public void test81() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[13]")).click();
		driver.findElement(By.xpath("//input[@id='customDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("81.Click on close button without input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Click on custom dates");
		test.info("Click on date range");
		test.info("Select from date");
		test.info("Select to date");
		test.info("Click on apply");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("81");
	}
	@Test
	public void test82() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-value='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterFrom")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customDateRangeFilterTo")).click();
		driver.findElement(By.xpath("(//tr//td[@class='day'])[13]")).click();
		driver.findElement(By.xpath("//input[@id='customDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearRecentUserSearch']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("82.Click on close button with input data");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Enter Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent chat search");
		test.info("Enter text : test");
		test.info("Click on custom dates");
		test.info("Click on date range");
		test.info("Select from date");
		test.info("Select to date");
		test.info("Click on apply");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should display all users & groups ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("82");
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
