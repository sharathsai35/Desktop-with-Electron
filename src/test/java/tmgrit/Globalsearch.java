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

public class Globalsearch {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("Globalsearch1.html");
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
		driver.findElement(By.id("unreadMessageFilterBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("3.Click on unread msg with users/groups ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on unread msgs");
		test.info("EXPECTED RESULT ::  It should display the unread msgs of users & groups ");
		String a=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("title");
		assertEquals("Unread Messages", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("class");
		assertEquals("unread-count active", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@data-name='test01']")).getAttribute("data-name");
		assertEquals("test01", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the unread msgs of users & groups ");
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
		driver.findElement(By.id("unreadMessageFilterBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("4.Click on unread msg with recent user search with valid data ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on unread msgs");
		test.info("Click on recent user search");
		test.info("Enter valid text : test");
		test.info("EXPECTED RESULT ::  It should display the unread msgs of users & groups ");
		String a=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("title");
		assertEquals("Unread Messages", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("class");
		assertEquals("unread-count active", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@data-name='test01']")).getAttribute("data-name");
		assertEquals("test01", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the unread msgs of users & groups ");
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
		driver.findElement(By.id("unreadMessageFilterBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaa");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("5.Click on unread msg with recent user search with invalid data ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on unread msgs");
		test.info("Click on recent user search");
		test.info("Enter invalid text : aaaa");
		test.info("EXPECTED RESULT ::  It should not display the unread msgs of users & groups ");
		String a=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("title");
		assertEquals("Unread Messages", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("class");
		assertEquals("unread-count active", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("unreadMessageFilterBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("6.Click on unread msg with empty msgs ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on unread msgs");
		test.info("EXPECTED RESULT ::  It should highlight the unread msgs ");
		String a=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("title");
		assertEquals("Unread Messages", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("class");
		assertEquals("active", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//div[@class='no-unread-contacts-section']")).getText();
		assertEquals("All caught up", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is highlighting the unread msgs ");
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
		driver.findElement(By.id("unreadMessageFilterBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("unreadMessageFilterBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("7.Click on active unread msg ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on unread msgs");
		test.info("Again click on unread msgs");
		test.info("EXPECTED RESULT ::  It should display all the users & groups ");
		String a=driver.findElement(By.id("unreadMessageFilterBtn")).getAttribute("title");
		assertEquals("Unread Messages", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("7");
	}
	//favourites
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
		driver.findElement(By.id("favouriteUserFilterBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("8.Click on favourite with users");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on favourites");
		test.info("EXPECTED RESULT ::  It should highlight the favourites icon ");
		String a=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("title");
		assertEquals("Favourite Users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("class");
		assertEquals("active", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@data-name='test01']")).getAttribute("data-name");
		assertEquals("test01", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is highlighted the favourites icon ");
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
		driver.findElement(By.id("favouriteUserFilterBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("recentUserSearch")).sendKeys("test");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("9.Click on favourites with recent user search with valid data ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on favourites");
		test.info("Click on recent user search");
		test.info("Enter valid text : test");
		test.info("EXPECTED RESULT ::  It should display the favourite users & groups ");
		String a=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("title");
		assertEquals("Favourite Users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("class");
		assertEquals("active", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@data-name='test01']")).getAttribute("data-name");
		assertEquals("test01", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the favourite users & groups ");
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.id("favouriteUserFilterBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("recentUserSearch")).sendKeys("aaaa");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("10.Click on favourite with recent user search with invalid data ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on favourite");
		test.info("Click on recent user search");
		test.info("Enter invalid text : aaaa");
		test.info("EXPECTED RESULT ::  It should not display the favourite users & groups ");
		String a=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("title");
		assertEquals("Favourite Users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("class");
		assertEquals("active", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='user-favourite-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("favouriteUserFilterBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("11.Click on favourite without users");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on favourites");
		test.info("EXPECTED RESULT ::  It should not display the users & groups ");
		String a=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("title");
		assertEquals("Favourite Users", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("class");
		assertEquals("active", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//span[@class='no-recent-results-text']")).getText();
		assertEquals("No Data", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No Data ");
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
		driver.findElement(By.id("favouriteUserFilterBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("favouriteUserFilterBtn")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("12.Click on active favourite ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on favourites");
		test.info("Again click on favourite");
		test.info("EXPECTED RESULT ::  It should display All the users & groups ");
		String a=driver.findElement(By.id("favouriteUserFilterBtn")).getAttribute("title");
		assertEquals("Favourite Users", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is display all the users & groups ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("12");
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
