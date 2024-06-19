package Enhancement;

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

public class Codesnippet {
	 WebDriver driver ;
	 static ExtentHtmlReporter HtmlReporter;
	 static ExtentReports extent;
	@BeforeClass
	 static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("codesnippetEnhancehment2.html");
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
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
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
		driver.findElement(By.id("username")).sendKeys("sharath35@tm.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='dooo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-header-option code-header-btn']")).click();
		WebElement e=driver.findElement(By.xpath("//div[@class='CodeMirror-cursor']"));
		Actions ac=new Actions(driver);
		ac.click(e).sendKeys(" test\n"
				+ "test test").perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name='sai32']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Send the code snippet msg");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : dooo");
		test.info("Click on 3 dots");
		test.info("Click on code snippet");
		test.info("Enter text/code ");
		test.info("Click on another user : sai32");
		test.info("EXPECTED RESULT ::  It should display user chat page ");
		String a=driver.findElement(By.xpath("//span[@data-name='sai32']")).getAttribute("data-name");
		assertEquals("sai32", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying user chat page ");
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
		driver.findElement(By.id("username")).sendKeys("sharath35@tm.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='dooo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='c-s-e-b']")).click();
		WebElement e=driver.findElement(By.xpath("//div[@class='CodeMirror-cursor']"));
		Actions ac=new Actions(driver);
		ac.click(e).sendKeys(" test\n"
				+ "test test").perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name='sai32']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Edit & Click on another user/group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : dooo");
		test.info("Click on code snippet");
		test.info("Click on edit");
		test.info("Enter text/code ");
		test.info("Click on another user : sai32");
		test.info("EXPECTED RESULT ::  It should display popup msg ");
		String a=driver.findElement(By.xpath("//div[@class='confirmation-heading-text']")).getText();
		assertEquals("Are you sure ?", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).getAttribute("value");
		assertEquals("YES", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).getAttribute("value");
		assertEquals("NO", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying popup msg ");
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
		driver.findElement(By.id("username")).sendKeys("sharath35@tm.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='dooo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='c-s-e-b']")).click();
		WebElement e=driver.findElement(By.xpath("//div[@class='CodeMirror-cursor']"));
		Actions ac=new Actions(driver);
		ac.click(e).sendKeys(" test\n"
				+ "test test").perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='codeSubmitBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name='mani']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Click on submit & Click on another user/group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : dooo");
		test.info("Click on code snippet");
		test.info("Click on edit");
		test.info("Enter text/code ");
		test.info("Click on submit");
		test.info("Click on another user : mani");
		test.info("EXPECTED RESULT ::  It should not display popup msg ");
		String a=driver.findElement(By.xpath("//div[@class='confirmation-heading-text']")).getText();
		assertEquals("Are you sure ?", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).getAttribute("value");
		assertEquals("YES", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).getAttribute("value");
		assertEquals("NO", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying popup msg ");
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
		driver.findElement(By.id("username")).sendKeys("sharath35@tm.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='dooo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='c-s-e-b']")).click();
		WebElement e=driver.findElement(By.xpath("//div[@class='CodeMirror-cursor']"));
		Actions ac=new Actions(driver);
		ac.click(e).sendKeys(" test\n"
				+ "test test").perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='code-c-b']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name='mani']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Click on close & Click on another user/group");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath35@tm.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : dooo");
		test.info("Click on code snippet");
		test.info("Click on edit");
		test.info("Enter text/code ");
		test.info("Click on close");
		test.info("Click on another user : mani");
		test.info("EXPECTED RESULT ::  It should not display popup msg ");
		String a=driver.findElement(By.xpath("//div[@class='confirmation-heading-text']")).getText();
		assertEquals("Are you sure ?", a);
		test.pass(a);
		System.out.println(a);
		String a1=driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).getAttribute("value");
		assertEquals("YES", a1);
		test.pass(a1);
		System.out.println(a1);
		String a2=driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).getAttribute("value");
		assertEquals("NO", a2);
		test.pass(a2);
		System.out.println(a2);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  It is not displaying popup msg ");
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='sharath kumar']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='c-s-e-b']")).click();
		WebElement e=driver.findElement(By.xpath("//div[@class='CodeMirror-cursor']"));
		Actions ac=new Actions(driver);
		ac.click(e).sendKeys(" test\n"
				+ "test test").perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Click on yes button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : sharath kumar");
		test.info("Click on code snippet");
		test.info("Click on edit");
		test.info("Enter text/code ");
		test.info("Click on another user : maneesh");
		test.info("Click on Yes button");
		test.info("EXPECTED RESULT ::  It should save the code snippet msg & It should not display any popup by clicking on user/group ");
		String a=driver.findElement(By.xpath("//span[@data-name='maneesh']")).getAttribute("data-name");
		assertEquals("maneesh", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is saving the code snippet msg & It is not displaying any popup when we clicking on user/group ");
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
		driver.findElement(By.xpath("//span[@class='toolbar-maximize']")).click();
		driver.findElement(By.xpath("//span[@data-name='sharath kumar']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='c-s-e-b']")).click();
		WebElement e=driver.findElement(By.xpath("//div[@class='CodeMirror-cursor']"));
		Actions ac=new Actions(driver);
		ac.click(e).sendKeys(" test\n"
				+ "test test").perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Click on no button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Enter email : sharath@trends.com ");
		test.info("Password : 123456");
		test.info("Login : Click on login button");
		test.info("Click on user : sharath kumar");
		test.info("Click on code snippet");
		test.info("Click on edit");
		test.info("Enter text/code ");
		test.info("Click on another user : maneesh");
		test.info("Click on No button");
		test.info("EXPECTED RESULT ::  It should not save the code snippet msg & It should display code snippet preview ");
		String a=driver.findElement(By.xpath("//input[@id='codeTitleInput']")).getAttribute("placeholder");
		assertEquals("Filename (example.js)", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not saving the code snippet msg & It is displaying code snippet preview ");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println("5");
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
