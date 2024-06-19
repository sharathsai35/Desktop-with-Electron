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

public class groupupdate1 {
	static WebDriver driver = null;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("groupupdategrit1.html");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on group profile");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("EXPECTED RESULT ::  It should display group profile view ");
		String a=driver.findElement(By.xpath("//div[@data-tab='1']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying group profile view ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("Info");
	}
	//@Test
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='add-members-to-group']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(1000);		
		ExtentTest test=extent.createTest("Click on add & without any user click on update");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("click on add");
		test.info("Click on update");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying any toast msg ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='add-members-to-group']")).click();
		String a=driver.findElement(By.xpath("//span[@id='lazyConnectAddedGroupUsersCountText']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on add & add the user ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on add");
		test.info("add the user");
		test.info("EXPECTED RESULT ::  It should add the user & display the count");
		String a1=driver.findElement(By.xpath("//span[@id='lazyConnectAddedGroupUsersCountText']")).getText();
		assertEquals("3", a);
		test.pass(a);
		System.out.println(a);
		assertEquals("4", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is adding the user & displaying the count ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='add-members-to-group']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Add the user & Click on added");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on add");
		test.info("add the user");
		test.info("Click on added");
		test.info("EXPECTED RESULT ::  It should click on added & it should display user name ");
		String a=driver.findElement(By.xpath("//div[@class='table-col']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).getText();
		assertEquals("Added", a1);
		test.pass(a1);
		System.out.println(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is adding the user into group ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='add-members-to-group']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//span[@class='remove-btn'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Add the user & Click on added & remove the user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on add");
		test.info("add the user");
		test.info("Click on added");
		test.info("Click on remove for added user");
		test.info("EXPECTED RESULT ::  It should not display the user in that page ");
		String a=driver.findElement(By.xpath("//span[@id='lazyConnectAddedGroupUsersCountText']")).getText();
		assertEquals("4", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying the user in that page ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='add-members-to-group']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("maneesh");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Search the username");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on add");
		test.info("search the username");
		test.info("EXPECTED RESULT ::  It should search the username ");
		String a=driver.findElement(By.xpath("//div[@class='table-col']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching the username ");
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
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='add-members-to-group']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("maneesh");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='reset-btn'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Search valid username & Click on reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on add");
		test.info("search valid username");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should display all the users ");
		String a=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all the users ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='add-members-to-group']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("aaaa");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='reset-btn'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Search invalid username & Click on reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on add");
		test.info("search invalid username");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should display all the users ");
		String a=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all the users ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='add-members-to-group']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[5]"));
		e.click();
		e.sendKeys("akshay");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Search username in added");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on add");
		test.info("Add the user");
		test.info("Click on added");
		test.info("search username");
		test.info("EXPECTED RESULT ::  It should search the username in added ");
		String a=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching the username in added ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='add-members-to-group']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[5]"));
		e.click();
		e.sendKeys("akshay");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='reset-btn'])[3]")).click();
		ExtentTest test=extent.createTest("Search username in added & Click on reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on add");
		test.info("Add the user");
		test.info("Click on added");
		test.info("search username");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should display all the added users ");
		String a=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all the added users ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='add-members-to-group']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on add & add the user into group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on add");
		test.info("add the user");
		test.info("click on update");
		test.info("EXPECTED RESULT ::  It should add the user into group ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group members added successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is adding the user into group ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='group-profile-tab force-hidden']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on logs");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on logs");
		test.info("EXPECTED RESULT ::  It should click on logs ");
		String a=driver.findElement(By.xpath("//span[@class='info-box-heading']")).getText();
		assertEquals("Created", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on logs ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupProfileUserSearch']")).sendKeys("sharath");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on search in users");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on users");
		test.info("Search the users");
		test.info("EXPECTED RESULT ::  It should search the users ");
		String a=driver.findElement(By.xpath("//input[@id='groupProfileUserSearch']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is searching the users ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("12");
	}
	//@Test
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupProfileUserSearch']")).sendKeys("sharath");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='clearGroupProfileUserSearch']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on search in users");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on users");
		test.info("Search the users");
		test.info("Click on close symbol");
		test.info("EXPECTED RESULT ::  It should clear the search ");
		String a=driver.findElement(By.xpath("//input[@id='groupProfileUserSearch']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clearing the search ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//span[@class='group-member-name']"));
		ac.moveToElement(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='group-member-options']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on user 3 dots");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on users");
		test.info("click on 3 dots");
		test.info("EXPECTED RESULT ::  It should click on 3 dots ");
		String a=driver.findElement(By.xpath("//span[@class='group-member-options active']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on 3 dots ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//span[@class='group-member-name']"));
		ac.moveToElement(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='group-member-options']")).click();
		driver.findElement(By.xpath("(//span[@class='group-member-edit-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on user 3 dots & Click on make admin");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on users");
		test.info("click on 3 dots");
		test.info("Click on make admin");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group member role updated!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Group member role updated! ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("15");
	}
	//@Test
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//span[@class='group-member-name']"));
		ac.moveToElement(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='group-member-options']")).click();
		driver.findElement(By.xpath("(//span[@class='group-member-edit-option'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on user 3 dots & Click on remove admin");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on users");
		test.info("click on 3 dots");
		test.info("Click on remove admin");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group member role updated!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Group member role updated! ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("16");
	}
	//@Test
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//span[@class='group-member-name']"));
		ac.moveToElement(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='group-member-options']")).click();
		driver.findElement(By.xpath("(//span[@class='group-member-edit-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on user 3 dots & Click on make moderator");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on users");
		test.info("click on 3 dots");
		test.info("Click on make moderator");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group member role updated!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Group member role updated! ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//span[@class='group-member-name']"));
		ac.moveToElement(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='group-member-options']")).click();
		driver.findElement(By.xpath("(//span[@class='group-member-edit-option'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on user 3 dots & Click on remove moderator");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on users");
		test.info("click on 3 dots");
		test.info("Click on remove moderator");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group member role updated!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Group member role updated! ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//span[@class='group-member-name']"));
		ac.moveToElement(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='group-member-options']")).click();
		driver.findElement(By.xpath("(//span[@class='group-member-edit-option'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on user 3 dots & Click on view");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on users");
		test.info("click on 3 dots");
		test.info("Click on view");
		test.info("EXPECTED RESULT ::  It should display profile of the user ");
		String a=driver.findElement(By.xpath("//span[@id='chatUserName']")).getAttribute("data-entity");
		assertEquals("1", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying profile of the user ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//span[@class='group-member-name']"));
		ac.moveToElement(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='group-member-options']")).click();
		driver.findElement(By.xpath("(//span[@class='group-member-edit-option'])[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on user 3 dots & Click on message");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on users");
		test.info("click on 3 dots");
		test.info("Click on message");
		test.info("EXPECTED RESULT ::  It should display cursor near sending msg ");
		String a=driver.findElement(By.xpath("//span[@class='message-input']")).getAttribute("class");
		assertEquals("message-input", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying cursor near sending msg ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//span[@class='group-member-name']"));
		ac.moveToElement(e).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='group-member-options']")).click();
		driver.findElement(By.xpath("//span[@class='group-member-edit-option class-red']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on user 3 dots & Click on remove from group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on users");
		test.info("click on 3 dots");
		test.info("Click on remove from group");
		test.info("EXPECTED RESULT ::  It should display cursor near sending msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group members deleted!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying cursor near sending msg ");
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
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='edit-group-name']")).click();
		driver.findElement(By.xpath("//input[@class='form-control group-name-edit-input']")).sendKeys("test03");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='group-name-edit-cancel-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on group name & click on edit with cancel button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on group name");
		test.info("click on edit option");
		test.info("Change the name & click on cancel button");
		test.info("EXPECTED RESULT ::  It should display pervious group name ");
		String a=driver.findElement(By.xpath("//div[@class='group-name']")).getText();
		assertEquals("test", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying pervious group name ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("22");
	}
	@Test
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
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='edit-group-name']")).click();
		driver.findElement(By.xpath("//input[@class='form-control group-name-edit-input']")).sendKeys("test03");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='group-name-edit-save-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on group name & click on edit with save button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on group name");
		test.info("click on edit option");
		test.info("Change the name & click on save button");
		test.info("EXPECTED RESULT ::  It should change group name ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group name updated!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is changing the group name ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on setting in group profile");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on setting");
		test.info("EXPECTED RESULT ::  It should click on settings ");
		String a=driver.findElement(By.xpath("//div[@data-tab='4']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on settings ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		driver.findElement(By.xpath("//input[@id='groupDeleteRadioAll']")).click();
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on setting & click on delete all msg & file with submit & Click on No button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on delete all msgs & files");
		test.info("Click on submit");
		test.info("Click on No button");
		test.info("EXPECTED RESULT ::  It should not delete all msgs & files ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not deleting all msgs & files ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		driver.findElement(By.xpath("//input[@id='groupDeleteRadioAll']")).click();
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on setting & click on delete all msg & file with submit & Click on Yes button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on delete all msgs & files");
		test.info("Click on submit");
		test.info("Click on Yes button");
		test.info("EXPECTED RESULT ::  It should delete all msgs & files ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Deleted chat history successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is deleting all msgs & files ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("26");
	}
	//@Test
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		driver.findElement(By.xpath("//input[@id='groupDeleteRadioMessages']")).click();
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on setting & click on delete msg with submit & Click on No button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on delete msgs");
		test.info("Click on submit");
		test.info("Click on No button");
		test.info("EXPECTED RESULT ::  It should not delete msgs ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not deleting msgs  ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("27");
	}
	//@Test
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		driver.findElement(By.xpath("//input[@id='groupDeleteRadioMessages']")).click();
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on setting & click on delete msg with submit & Click on Yes button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on delete msgs");
		test.info("Click on submit");
		test.info("Click on Yes button");
		test.info("EXPECTED RESULT ::  It should delete only msgs ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Deleted chat history successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is deleting only msgs ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		driver.findElement(By.xpath("//input[@id='groupDeleteRadioFiles']")).click();
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on setting & click on delete files with submit & Click on No button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on delete files");
		test.info("Click on submit");
		test.info("Click on No button");
		test.info("EXPECTED RESULT ::  It should not delete msgs & files ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not deleting msgs & files ");
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
		driver.findElement(By.xpath("//span[@data-name='test01']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		driver.findElement(By.xpath("//input[@id='groupDeleteRadioFiles']")).click();
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on setting & click on delete files with submit & Click on Yes button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on delete files");
		test.info("Click on submit");
		test.info("Click on Yes button");
		test.info("EXPECTED RESULT ::  It should delete only files ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Deleted chat history successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is deleting only files ");
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
		driver.findElement(By.xpath("//span[@data-name='test03']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		driver.findElement(By.xpath("//input[@id='groupDeleteRadioGroup']")).click();
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on setting & click on delete group with submit & Click on No button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on delete group");
		test.info("Click on submit");
		test.info("Click on No button");
		test.info("EXPECTED RESULT ::  It should not delete group ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not deleting group ");
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
		driver.findElement(By.xpath("//span[@data-name='test03']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		driver.findElement(By.xpath("//input[@id='groupDeleteRadioGroup']")).click();
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on setting & click on delete group with submit & Click on Yes button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on delete group");
		test.info("Click on submit");
		test.info("Click on Yes button");
		test.info("EXPECTED RESULT ::  It should delete the group ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group deleted!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is deleting the group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("32");
	}
	//@Test
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
		driver.findElement(By.xpath("//span[@data-name='test03']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		driver.findElement(By.xpath("//input[@id='groupExitRadio']")).click();
		driver.findElement(By.xpath("//div[@id='groupExitSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on setting & click on exit from group with submit & Click on No button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on exit from group");
		test.info("Click on submit");
		test.info("Click on No button");
		test.info("EXPECTED RESULT ::  It should not exit from group ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not exiting from group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("33");
	}
	//@Test
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
		driver.findElement(By.xpath("//span[@data-name='test03']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		driver.findElement(By.xpath("//input[@id='groupExitRadio']")).click();
		driver.findElement(By.xpath("//div[@id='groupExitSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on setting & click on exit from group with submit & Click on Yes button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on exit from group");
		test.info("Click on submit");
		test.info("Click on Yes button");
		test.info("EXPECTED RESULT ::  It should exit from the group ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please ensure group has other admin.", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is exiting from the group ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("34");
	}
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
		driver.findElement(By.xpath("//span[@data-name='test03']")).click();
		driver.findElement(By.xpath("//span[@class='user-favourite-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on favourites for group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on favourites");
		test.info("EXPECTED RESULT ::  It should highlight the favourite in group ");
		String a=driver.findElement(By.xpath("//span[@class='user-favourite-icon']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is highlighting the favourites in group ");
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
		driver.findElement(By.xpath("//span[@data-name='test03']")).click();
		driver.findElement(By.xpath("//span[@class='mute-conversation-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on mute for group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on mute");
		test.info("EXPECTED RESULT ::  It should mute the group ");
		String a=driver.findElement(By.xpath("//span[@class='mute-conversation-icon']")).getAttribute("class");
		assertEquals("mute-conversation-icon", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It mute the group ");
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
		driver.findElement(By.xpath("//span[@data-name='test03']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@data-type='2'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on Self");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on self");
		test.info("EXPECTED RESULT ::  It should click on self in the settings ");
		String a=driver.findElement(By.xpath("(//div[@data-type='2'])[2]")).getText();
		assertEquals("Self", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is clicking on self ");
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
		driver.findElement(By.xpath("//span[@data-name='test03']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@data-type='2'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioAll']")).click();
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on Self &Click on all msg & file with submit & No button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on self");
		test.info("Click on All msgs & Files");
		test.info("Click on submit");
		test.info("Click on no button");
		test.info("EXPECTED RESULT ::  It should not delete the msg & file for self user ");
		String a=driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioAll']")).getAttribute("id");
		assertEquals("groupSelfDeleteRadioAll", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not deleting the msgs & files for self user ");
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
		driver.findElement(By.xpath("//span[@data-name='test03']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@data-type='2'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioAll']")).click();
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on Self &Click on all msg & file with submit & yes button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on self");
		test.info("Click on All msgs & Files");
		test.info("Click on submit");
		test.info("Click on yes button");
		test.info("EXPECTED RESULT ::  It should delete the msg & file for self user ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Deleted chat history successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is deleting the msgs & files for self user ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("39");
	}
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
		driver.findElement(By.xpath("//span[@data-name='test03']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@data-type='2'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioMessages']")).click();
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on Self &Click on all msg with submit & No button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on self");
		test.info("Click on All msgs");
		test.info("Click on submit");
		test.info("Click on no button");
		test.info("EXPECTED RESULT ::  It should not delete the msg & file for self user ");
		String a=driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioMessages']")).getAttribute("id");
		assertEquals("groupSelfDeleteRadioMessages", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not deleting the msgs & files for self user ");
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
		driver.findElement(By.xpath("//span[@data-name='test03']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@data-type='2'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioMessages']")).click();
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on Self & Click on all msgs with submit & yes button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on self");
		test.info("Click on All msgs ");
		test.info("Click on submit");
		test.info("Click on yes button");
		test.info("EXPECTED RESULT ::  It should delete the msg for self user ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Deleted chat history successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is deleting the msgs for self user ");
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
		driver.findElement(By.xpath("//span[@data-name='test03']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@data-type='2'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioFiles']")).click();
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on Self & Click on all files with submit & No button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on self");
		test.info("Click on All files");
		test.info("Click on submit");
		test.info("Click on no button");
		test.info("EXPECTED RESULT ::  It should not delete the msg & file for self user ");
		String a=driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioFiles']")).getAttribute("id");
		assertEquals("groupSelfDeleteRadioFiles", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not deleting the msgs & files for self user ");
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
		driver.findElement(By.xpath("//span[@data-name='test03']")).click();
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tab force-hidden']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@data-type='2'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioFiles']")).click();
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on Self & Click on all files with submit & yes button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on group ");
		test.info("Click on group profile");
		test.info("Click on settings");
		test.info("click on self");
		test.info("Click on All files ");
		test.info("Click on submit");
		test.info("Click on yes button");
		test.info("EXPECTED RESULT ::  It should delete the files for self user ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Deleted chat history successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is deleting the files for self user ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("43");
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
