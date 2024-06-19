package Tm;

import static org.junit.Assert.assertEquals;

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

public class Addgroup {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("addgroup1.html");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		ExtentTest test=extent.createTest("Click on add button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("EXPECTED RESULT ::  It should display add user & add group ");
		String a=driver.findElement(By.xpath("//div[@class='add-group-btn']")).getText();
		assertEquals("ADD GROUP", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying add user & add group ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on add group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("createGroupSubmitBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on create in group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Click on create button");
		test.info("EXPECTED RESULT ::  It should not create the group ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please enter group name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter group name ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupNameInput")).sendKeys("aaa");
		driver.findElement(By.id("createGroupSubmitBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on create by adding only group name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : aaa");
		test.info("Click on create button");
		test.info("EXPECTED RESULT ::  It should not create the group ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please select members for group", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please select members for group ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupNameInput")).sendKeys("aaa");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-userid='30']")).click();
		//driver.findElement(By.id("createGroupSubmitBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on create by adding group name & members");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : aaa");
		test.info("Add members to selected members");
		test.info("Click on create button");
		test.info("EXPECTED RESULT ::  It should create the group ");
		//String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		//assertEquals("Group created!", a);
		//test.pass(a);
		//System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Group created! ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupNameInput")).sendKeys("aaabb");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-userid='30']")).click();
		driver.findElement(By.id("createGroupSubmitBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on create by adding group name & members");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : aaa");
		test.info("Add members to selected members");
		test.info("Click on create button");
		test.info("EXPECTED RESULT ::  It should create the group ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please use different Group Name!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please use different Group Name! ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupUsersSearch")).sendKeys("aaabb");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on add group in that search invalid user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group search : aaabb");
		test.info("EXPECTED RESULT ::  It should search the user ");
		String a=driver.findElement(By.xpath("//div[@class='no-results-found']")).getAttribute("class");
		assertEquals("no-results-found", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  No results found ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupUsersSearch")).sendKeys("abc");
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on add group in that search valid user");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group search : abc");
		test.info("EXPECTED RESULT ::  It should search the user ");
		String a=driver.findElement(By.xpath("//div[@data-userid='30']")).getAttribute("data-username");
		assertEquals("abc", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It should display the username ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupUsersSearch")).sendKeys("abc");
		driver.findElement(By.id("clearGroupUsersSearch")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on add group in that search & clear the name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group search : abc");
		test.info("Click on close button in search ");
		test.info("EXPECTED RESULT ::  It should close the searched user name ");
		String a=driver.findElement(By.xpath("//input[@id='groupUsersSearch']")).getAttribute("placeholder");
		assertEquals("Add Members", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is closing the searched username ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupNameInput")).sendKeys("aaabbb");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-userid='30']")).click();
		WebElement e=driver.findElement(By.xpath("//span[@class='group-member-admin']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e).build().perform();
		driver.findElement(By.xpath("//span[@class='remove-selected-group-user']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on close button in selected members");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : aaa");
		test.info("Add members to selected members");
		test.info("Deselect the added member");
		test.info("EXPECTED RESULT ::  It should deselect the users in selected members ");
		String a=driver.findElement(By.xpath("//span[@id='addGroupSelectedMembersCount']")).getText();
		assertEquals("(1)", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is deselecting the user in selected members ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupNameInput")).sendKeys("aaabbb");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-userid='30']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Add the user in selected member");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : aaa");
		test.info("Add members to selected members");
		test.info("EXPECTED RESULT ::  It should add the user in selected members ");
		String a=driver.findElement(By.xpath("//span[@id='addGroupSelectedMembersCount']")).getText();
		assertEquals("(2)", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is adding the user in selected members ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupNameInput")).sendKeys("aaabbb");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-userid='30']")).click();
		driver.findElement(By.xpath("//span[@class='group-member-admin']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on admin to user in creating group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : aaa");
		test.info("Add members to selected members");
		test.info("Select admin to user");
		test.info("EXPECTED RESULT ::  It should select admin in creating group ");
		String a=driver.findElement(By.xpath("//span[@class='group-member-admin active']")).getAttribute("class");
		assertEquals("group-member-admin active", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is selecting admin to user in selected members ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupNameInput")).sendKeys("aaabbb");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-userid='30']")).click();
		driver.findElement(By.xpath("//span[@class='group-member-moderator']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on moderator to user in creating group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : aaa");
		test.info("Add members to selected members");
		test.info("Select moderator to user");
		test.info("EXPECTED RESULT ::  It should select moderator in creating group ");
		String a=driver.findElement(By.xpath("//span[@class='group-member-moderator active']")).getAttribute("class");
		assertEquals("group-member-moderator active", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is selecting moderator to user in selected members ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupNameInput")).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-userid='30']")).click();
		driver.findElement(By.xpath("//span[@class='group-member-moderator']")).click();
		driver.findElement(By.id("createGroupSubmitBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on user to selected member without group name & create");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : ");
		test.info("Add members to selected members");
		test.info("Click on create button");
		test.info("EXPECTED RESULT ::  It should not create the group ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please enter group name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter group name ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupNameInput")).sendKeys("");
		driver.findElement(By.id("groupDescriptionInput")).sendKeys("abcd");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-userid='30']")).click();
		driver.findElement(By.xpath("//span[@class='group-member-moderator']")).click();
		driver.findElement(By.id("createGroupSubmitBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Enter description without group name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : ");
		test.info("Enter Description : abcd");
		test.info("Add members to selected members");
		test.info("Click on create button");
		test.info("EXPECTED RESULT ::  It should not create the group ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Please enter group name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter group name ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupNameInput")).sendKeys("");
		driver.findElement(By.id("groupDescriptionInput")).sendKeys("12345678901234567890");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-userid='30']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Enter description & Check with characters");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : ");
		test.info("Enter Description : 12345678901234567890");
		test.info("Add members to selected members");
		test.info("EXPECTED RESULT ::  It should display left characters ");
		String a=driver.findElement(By.xpath("//span[@id='groupDescriptionInputCharactersCount']")).getText();
		assertEquals("Characters Left 60", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying left characters ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupAttachment")).sendKeys("/home/tvisha/Documents/Automation Taskyou consent.png");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on group icon & add the image");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Click on group icon");
		test.info("Add the image");
		test.info("EXPECTED RESULT ::  It should display group image ");
		String a=driver.findElement(By.id("groupAttachment")).getAttribute("name");
		assertEquals("groupImage", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying group image ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupAttachment")).sendKeys("/home/tvisha/Documents/Automation Taskyou consent.png");
		Thread.sleep(1000);
		driver.findElement(By.id("removeCreateGroupIcon")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Remove the group icon");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Click on group icon");
		test.info("Add the group icon");
		test.info("Remove the group icon");
		test.info("EXPECTED RESULT ::  It should not display group image ");
		String a=driver.findElement(By.id("removeCreateGroupIcon")).getAttribute("id");
		assertEquals("removeCreateGroupIcon", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying group image ");
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
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupNameInput")).sendKeys("bbb");
		driver.findElement(By.id("groupDescriptionInput")).sendKeys("12345678901234567890");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-userid='30']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='airtimeGroupCheckbox']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("createGroupSubmitBtn")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Create airtime group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on add button ");
		test.info("Click on add group");
		test.info("Enter group name : bbb");
		test.info("Enter Description : 12345678901234567890");
		test.info("Add members to selected members");
		test.info("Click on checkbox of airtime group");
		test.info("Click on create button");
		test.info("EXPECTED RESULT ::  It should display Airtime group ");
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		assertEquals("Group created!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Group created! ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("19");
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
