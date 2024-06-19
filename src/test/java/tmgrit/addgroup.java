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
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class addgroup {
	static WebDriver driver = null;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("addgroupgrit.html");
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
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(capabilities);
		System.out.print("line executed");
		Thread.sleep(3000);
	}
	public void sample() throws InterruptedException {
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8083");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("sharath");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on add group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("EXPECTED RESULT ::  It should display add new group page ");
		String a=driver.findElement(By.xpath("//div[@id='addNewUsersModal']")).getAttribute("id");
		assertEquals("addNewUsersModal", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying add new group page ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("Add group");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on create in add group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Click on create");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please enter group name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter group name ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Enter group name ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on create");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Minimum 2 users are required for creating a group!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Minimum 2 users are required for creating a group! ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("asdfghjklasdfghjklqwerqwerqwertyuityuiopopmnbvcxzzxcvbnm");
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Enter group name with more than 50 characters ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add for users");
		test.info("Click on create");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group Name should be maximum of 50 characters", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Group Name should be maximum of 50 characters ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control description-input']")).sendKeys("asdfghjklasdfghjklqwerqwerqwertyuityuiopopmnbvcxzzxcvbnm");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Enter description ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter description name : test");
		test.info("EXPECTED RESULT ::  It should display count of the characters ");
		String a=driver.findElement(By.xpath("//span[@class='info-text']")).getText();
		assertEquals("Characters Left : 24", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Characters Left : 24 ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control description-input']")).sendKeys("asdfghjklasdfghjklqwerqwerqwertyuityuiopopmnbvcxzzxcvbnm");
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Enter only description & Click on create ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter description name : test");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please enter group name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter group name ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test01");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//input[@class='form-control description-input']"));
		e.sendKeys("aaa");
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Enter group name & description & Click on create ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Enter description : dsafdsaf");
		test.info("Click on add for users");
		test.info("Click on create");
		test.info("EXPECTED RESULT ::  It should display toast msg ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group created successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Group created successfully ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("maneesh");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Search valid username in add group ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add to users");
		test.info("Search the valid username ");
		test.info("EXPECTED RESULT ::  It should display particular username ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying particular username ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("aaaaa");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Search invalid username in add group ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add to users");
		test.info("Search the invalid username");
		test.info("EXPECTED RESULT ::  It should display particular username ");
		String a=driver.findElement(By.xpath("//div[@class='no-results-found']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No results Found! ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("aaaaa");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='reset-btn'])[2]")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Search invalid username & Click on reset button ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add to users");
		test.info("Search the invalid username");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should display all the users ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying all the users ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Add the users in add group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add to users");
		test.info("Click on added");
		test.info("EXPECTED RESULT ::  It should display added user count ");
		String a=driver.findElement(By.xpath("//span[@id='lazyConnectAddedGroupUsersCountText']")).getText();
		assertEquals("3", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying added user count ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on added");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add to users");
		test.info("Click on added");
		test.info("EXPECTED RESULT ::  It should display added usernames ");
		String a=driver.findElement(By.xpath("//span[@id='lazyConnectAddedGroupUsersCountText']")).getText();
		assertEquals("3", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying added usernames ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='remove-btn'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='remove-btn'])[1]")).click();
		ExtentTest test=extent.createTest("Click on added & Click on remove the users");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add to users");
		test.info("Click on added");
		test.info("Click on cross symbol to users");
		test.info("EXPECTED RESULT ::  It should not display the added usernames ");
		String a=driver.findElement(By.xpath("//span[@id='lazyConnectAddedGroupUsersCountText']")).getText();
		assertEquals("1", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying the added usernames ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("maneesh");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Search username & click on add");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Search username : maneesh");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("EXPECTED RESULT ::  It should display the added username ");
		String a=driver.findElement(By.xpath("//div[@class='table-col']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the added username ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("13");
	}
	@Test
	public void test14() throws InterruptedException {
		sample();
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("maneesh");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		WebElement e1=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[5]"));
		e1.click();
		e1.sendKeys("maneesh");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Search valid username in added");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Search username : maneesh");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Search with valid username");
		test.info("EXPECTED RESULT ::  It should display particular username ");
		String a=driver.findElement(By.xpath("//div[@class='table-col']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying particular username ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("maneesh");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		WebElement e1=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[5]"));
		e1.click();
		e1.sendKeys("aaaaa");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Search invalid username in added");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Search username : maneesh");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Search with invalid username");
		test.info("EXPECTED RESULT ::  It should not display any username ");
		String a=driver.findElement(By.xpath("//div[@class='no-results-found']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No results Found! ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("15");
	}
	@Test
	public void test16() throws InterruptedException {
		sample();
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("maneesh");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		WebElement e1=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[5]"));
		e1.click();
		e1.sendKeys("aaaaa");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Search invalid username in added & Click on reset button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Search username : maneesh");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Search with invalid username");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT ::  It should display username ");
		String a=driver.findElement(By.xpath("//div[@class='table-col']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the username ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[3]"));
		e.click();
		e.sendKeys("maneesh");
		driver.findElement(By.xpath("(//span[@class='enter-btn'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		WebElement e1=driver.findElement(By.xpath("(//input[@class='form-control search-input'])[5]"));
		e1.click();
		e1.sendKeys("maneesh");
		driver.findElement(By.xpath("(//div[@data-tab='1'])[15]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Search username & add & Search username in added & Click on new");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Search username : maneesh");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Search username : maneesh");
		test.info("Click on new");
		test.info("EXPECTED RESULT ::  It should display username & it should click on new ");
		String a=driver.findElement(By.xpath("//div[@class='tab active']")).getText();
		assertEquals("", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the username & it is clicking on new");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test02");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		driver.findElement(By.xpath("(//span[@class='admin-btn'])[1]")).click();
		String a=driver.findElement(By.xpath("//span[@class='admin-btn active']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on admin to users ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Click on admin to one user");
		test.info("Click on create");
		test.info("EXPECTED RESULT ::  It should display admin to username ");
		assertEquals("A", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying admin to username ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("18");
	}
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test03");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='add-btn'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		driver.findElement(By.xpath("(//span[@class='moderator-btn'])[2]")).click();
		String a=driver.findElement(By.xpath("//span[@class='moderator-btn active']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn submit-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on moderator to users ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Click on moderator to one user");
		test.info("Click on create");
		test.info("EXPECTED RESULT ::  It should display moderator to username ");
		assertEquals("M", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying moderator to username ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		driver.findElement(By.xpath("(//span[@class='moderator-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='remove-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='1'])[15]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='add-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-tab='2'])[12]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on admin/moderator to user & remove the user & add the same user ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Click on moderator to one user");
		test.info("Click on remove the user");
		test.info("Click on new");
		test.info("Add the same user");
		test.info("Click on added");
		test.info("EXPECTED RESULT ::  It should not display moderator to username ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying moderator to username ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control name-input']")).sendKeys("test");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//div[@class='group-avatar'])[2]"));
		e.click();
		driver.findElement(By.linkText("/home/tvisha/Pictures/Screenshot from 2022-05-20 11-09-25.png"));
		//driver.findElement(By.xpath("//div[@data-avatar='airtime2.png']"));
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on admin/moderator to user & remove the user & add the same user ");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to server url ");
		test.info("Enter server url : http://192.168.2.55:8083");
		test.info("Click on submit");
		test.info("Username : sharath ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : test");
		test.info("Click on add user");
		test.info("Click on added");
		test.info("Click on moderator to one user");
		test.info("Click on remove the user");
		test.info("Click on new");
		test.info("Add the same user");
		test.info("Click on added");
		test.info("EXPECTED RESULT ::  It should not display moderator to username ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying moderator to username ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("20");
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
