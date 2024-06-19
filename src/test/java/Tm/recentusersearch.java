package Tm;

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

public class recentusersearch {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("recentusersearch.html");
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
		ExtentTest test=extent.createTest("Click on login");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("EXPECTED RESULT ::  It should display chat page ");
		String a=driver.findElement(By.xpath("//div[@id='recentUsersChatList']")).getAttribute("id");
		assertEquals("recentUsersChatList", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying chat page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("login");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("sharath");;
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Search with valid user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Search with user : sharath ");
		test.info("EXPECTED RESULT ::  It should display user name in the list ");
		String a=driver.findElement(By.xpath("//span[@data-type='1']")).getAttribute("data-name");
		assertEquals("sharath kumar", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying username in the list ");
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaaa");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Search with invalid user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("search the user : aaaaaa");
		test.info("EXPECTED RESULT ::  It should not display the user ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying the user ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("2");
	}
	@Test
	public void test03() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaaa");
		driver.findElement(By.id("clearRecentUserSearch")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on close button in recent search user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("search the user : aaaaaa");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  It should click on close button ");
		String a=driver.findElement(By.id("recentUserSearch")).getAttribute("placeholder");
		assertEquals("Ctrl + M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on close button ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("3");
	}
	@Test
	public void test04() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on recent user search filters");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
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
		System.out.println("4");
	}
	@Test
	public void test05() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		String a=driver.findElement(By.xpath("//div[@class='recent-users-search-filter-text active']")).getText();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-text active']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on All members & group in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
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
		System.out.println("5");
	}
	@Test
	public void test06() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("uppi");
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-text active']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on All members & group in filter & search with valid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : uppi ");
		test.info("Click on filter in recent user search");
		test.info("Click on All members & groups");
		test.info("EXPECTED RESULT ::  It should display that particular user search names in  All members & group ");
		String a=driver.findElement(By.xpath("//span[@data-type='1']")).getAttribute("data-name");
		assertEquals("uppi", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying that particular user search names in  All members & group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("6");
	}
	@Test
	public void test07() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("qqqqq");
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-text active']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on All members & group in filter & search with invalid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : test ");
		test.info("Click on filter in recent user search");
		test.info("Click on All members & groups");
		test.info("EXPECTED RESULT ::  It should display No data ");
		String a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying No data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("7");
	}
	@Test
	public void test08() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		String a=driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[1]")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[1]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on members in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
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
		System.out.println("8");
	}
	@Test
	public void test09() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("uppi");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[1]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on members in filter & search with valid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : uppi");
		test.info("Click on filter in recent user search");
		test.info("Click on members");
		test.info("EXPECTED RESULT ::  It should display particular members in recent user list ");
		String a=driver.findElement(By.xpath("//span[@data-type='1']")).getAttribute("data-name");
		assertEquals("uppi", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying particular members in recent user list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("9");
	}
	@Test
	public void test10() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[1]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on members in filter & search with invalid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
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
		System.out.println("10");
	}
	@Test
	public void test11() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		String a=driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[2]")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[2]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on groups in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
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
		System.out.println("11");
	}
	@Test
	public void test12() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aa");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[2]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on groups in filter & search with valid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaa");
		test.info("Click on filter in recent user search");
		test.info("Click on groups");
		test.info("EXPECTED RESULT ::  It should display particular group name in recent user list ");
		String a=driver.findElement(By.xpath("//span[@data-type='2']")).getAttribute("data-name");
		assertEquals("aaabb", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying particular group name in recent user list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("12");
	}
	@Test
	public void test13() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[2]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on groups in filter & search with invalid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
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
		System.out.println("13");
	}
	@Test
	public void test14() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		String a=driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[3]")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[3]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on orange members in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
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
		System.out.println("14");
	}
	@Test
	public void test15() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("abcd");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[3]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on orange members in filter & search with valid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : abcd");
		test.info("Click on filter in recent user search");
		test.info("Click on orange members");
		test.info("EXPECTED RESULT ::  It should display particular orange members in recent user list ");
		String a=driver.findElement(By.xpath("//span[@data-type='1']")).getAttribute("data-name");
		assertEquals("abcd", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying particular orange members in recent user list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("15");
	}
	@Test
	public void test16() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[3]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on orange members in filter & search with invalid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
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
		System.out.println("16");
	}
	@Test
	public void test17() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		String a=driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[4]")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[4]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on Deactivated users in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("Click on Deactivated users");
		test.info("EXPECTED RESULT ::  It should display only deactivated users in recent user list ");
		assertEquals("De-Activated User", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying only deactivated users in recent user list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("17");
	}
	@Test
	public void test18() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("user");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[4]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on deactivated users in filter & search with valid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : user");
		test.info("Click on filter in recent user search");
		test.info("Click on deactivated users");
		test.info("EXPECTED RESULT ::  It should display particular deactivated user name in recent user list ");
		String a=driver.findElement(By.xpath("//span[@data-type='1']")).getAttribute("data-name");
		assertEquals("user b", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying particular deactivated user name in recent user list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("18");
	}
	@Test
	public void test19() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[4]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on deactivated users in filter & search with invalid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaaaa");
		test.info("Click on filter in recent user search");
		test.info("Click on deactivated users");
		test.info("EXPECTED RESULT ::  It should display No data ");
		/*
		 * String
		 * a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).
		 * getText(); assertEquals("No Data", a); test.pass(a); System.out.println(a);
		 */
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying No data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("19");
	}
	@Test
	public void test20() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).click();
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		String a=driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[5]")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[5]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on Deleted/Exited Groups in filter");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search ");
		test.info("Click on filter in recent user search");
		test.info("Click on Deleted/Exited Groups");
		test.info("EXPECTED RESULT ::  It should display Deleted/Exited Groups in recent user list ");
		assertEquals("Deleted/Exited Groups", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Deleted/Exited Groups in recent user list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("20");
	}
	@Test
	public void test21() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("ds");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[5]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on Deleted/Exited Groups in filter & search with valid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : ds");
		test.info("Click on filter in recent user search");
		test.info("Click on Deleted/Exited Groups");
		test.info("EXPECTED RESULT ::  It should display particular Deleted/Exited Groups ame in recent user list ");
		String a=driver.findElement(By.xpath("//span[@data-type='2']")).getAttribute("data-name");
		assertEquals("dsaf", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying particular Deleted/Exited Groups name in recent user list ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("21");
	}
	@Test
	public void test22() throws InterruptedException {
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
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaaa");;
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[5]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on Deleted/Exited Groups in filter & search with invalid name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on recent user search : aaaaa");
		test.info("Click on filter in recent user search");
		test.info("Click on Deleted/Exited Groups");
		test.info("EXPECTED RESULT ::  It should display No data ");
		/*
		 * String
		 * a=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).
		 * getText(); assertEquals("No Data", a); test.pass(a); System.out.println(a);
		 */
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying No data ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("22");
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
