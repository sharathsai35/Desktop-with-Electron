package Tm;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
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

@RunWith(JUnit4.class)
public class loginpage {
		static WebDriver driver = null;
		static ExtentHtmlReporter HtmlReporter;
		static ExtentReports extent;
		@BeforeClass
		static public void starttest() {
			System.out.println("start test");
			HtmlReporter = new ExtentHtmlReporter("loginTM.html");
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
			Thread.sleep(1000);
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities);
			System.out.print("line executed");
			Thread.sleep(3000);
		}

		@Test
		public void test00() throws InterruptedException {
			Thread.sleep(3000);
			for (String handle : driver.getWindowHandles())
			{
				driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
			}
			//driver.findElement(By.id("hostInput")).sendKeys("http://192.168.2.55:8081");
			//driver.findElement(By.id("submitBtn")).click();
			//System.out.print("driver.findElements(By.id(\"submitBtn\")).size()"+ driver.findElements(By.id("submitBtn")).size());
			Thread.sleep(1000);
			driver.findElement(By.id("loginBtn")).click();
			System.out.print("line executed");
			Thread.sleep(1000);
			ExtentTest test=extent.createTest("Click on login without using data");
			test.log(Status.INFO, "Desktop application launching Successfully");
			test.info("Navigate to login ");
			test.info("Email: ");
			test.info("Password: ");
			test.info("Login:click on login");
			test.info("EXPECTED RESULT ::  It should display error msg ");
			String a=driver.findElement(By.id("error")).getText();
			assertEquals("Please enter username", a);
			test.pass(a);
			System.out.println(a);
			test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter username ");
			test.pass("Test Case:: TestCase PASSED");
			//driver.close();
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
			driver.findElement(By.id("loginBtn")).click();
			System.out.print("line executed");
			Thread.sleep(1000);
			ExtentTest test=extent.createTest("Click on login with only username");
			test.log(Status.INFO, "Desktop application launching Successfully");
			test.info("Navigate to login ");
			test.info("Email: sharath@trends.com");
			test.info("Password: ");
			test.info("Login:click on login");
			test.info("EXPECTED RESULT ::  It should display error msg ");
			String a=driver.findElement(By.id("error")).getText();
			assertEquals("Password is required!", a);
			test.pass(a);
			System.out.println(a);
			test.log(Status.PASS ,"ACTUAL RESULT ::  Password is required! ");
			test.pass("Test Case:: TestCase PASSED");
			//driver.close();
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
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.id("loginBtn")).click();
			System.out.print("line executed");
			Thread.sleep(1000);
			ExtentTest test=extent.createTest("Click on login with only password");
			test.log(Status.INFO, "Desktop application launching Successfully");
			test.info("Navigate to login ");
			test.info("Email: ");
			test.info("Password: 123456");
			test.info("Login:click on login");
			test.info("EXPECTED RESULT ::  It should display error msg ");
			String a=driver.findElement(By.id("error")).getText();
			assertEquals("Please enter username", a);
			test.pass(a);
			System.out.println(a);
			test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter username ");
			test.pass("Test Case:: TestCase PASSED");
			//driver.close();
			System.out.println("2");
		}
		@Test
		public void test03() throws InterruptedException {
			for (String handle : driver.getWindowHandles())
			{
				driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
			}
			Thread.sleep(1000);
			driver.findElement(By.id("username")).sendKeys("aaaa@gmail.com");
			driver.findElement(By.id("password")).sendKeys("89765");
			driver.findElement(By.id("loginBtn")).click();
			System.out.print("line executed");
			Thread.sleep(1000);
			ExtentTest test=extent.createTest("Click on login with invalid username & password");
			test.log(Status.INFO, "Desktop application launching Successfully");
			test.info("Navigate to login ");
			test.info("Email: aaaa@gmail.com");
			test.info("Password: 987654");
			test.info("Login:click on login");
			test.info("EXPECTED RESULT ::  It should not login into the account ");
			String a=driver.findElement(By.id("error")).getText();
			assertEquals("Invalid Credentials", a);
			test.pass(a);
			System.out.println(a);
			test.log(Status.PASS ,"ACTUAL RESULT ::  Invalid Credentials ");
			test.pass("Test Case:: TestCase PASSED");
			//driver.close();
			System.out.println("3");
		}
		@Test
		public void test04() throws InterruptedException {
			for (String handle : driver.getWindowHandles())
			{
				driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
			}
			Thread.sleep(1000);
			driver.findElement(By.id("username")).sendKeys("aaaa@gmail.com");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.id("loginBtn")).click();
			System.out.print("line executed");
			Thread.sleep(1000);
			ExtentTest test=extent.createTest("Click on login with invalid username & valid password");
			test.log(Status.INFO, "Desktop application launching Successfully");
			test.info("Navigate to login ");
			test.info("Email: aaaa@gmail.com");
			test.info("Password: 123456");
			test.info("Login:click on login");
			test.info("EXPECTED RESULT ::  It should not login into the account ");
			String a=driver.findElement(By.id("error")).getText();
			assertEquals("Invalid Credentials", a);
			test.pass(a);
			System.out.println(a);
			test.log(Status.PASS ,"ACTUAL RESULT ::  Invalid Credentials ");
			test.pass("Test Case:: TestCase PASSED");
			//driver.close();
			System.out.println("4");
		}
		@Test
		public void test05() throws InterruptedException {
			for (String handle : driver.getWindowHandles())
			{
				driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
			}
			Thread.sleep(1000);
			driver.findElement(By.id("username")).sendKeys("sharath@trends.com");
			driver.findElement(By.id("password")).sendKeys("abcdef");
			driver.findElement(By.id("loginBtn")).click();
			System.out.print("line executed");
			Thread.sleep(1000);
			ExtentTest test=extent.createTest("Click on login with valid username & invalid password");
			test.log(Status.INFO, "Desktop application launching Successfully");
			test.info("Navigate to login ");
			test.info("Email: sharath@trends.com");
			test.info("Password: abcdef");
			test.info("Login:click on login");
			test.info("EXPECTED RESULT ::  It should not login into the account ");
			String a=driver.findElement(By.id("error")).getText();
			assertEquals("Invalid Credentials", a);
			test.pass(a);
			System.out.println(a);
			test.log(Status.PASS ,"ACTUAL RESULT ::  Invalid Credentials ");
			test.pass("Test Case:: TestCase PASSED");
			//driver.close();
			System.out.println("5");
		}
		@Test
		public void test06() throws InterruptedException {
			for (String handle : driver.getWindowHandles())
			{
				driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
			}
			Thread.sleep(1000);
			driver.findElement(By.id("username")).sendKeys("sharath12@trends.com");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.id("loginBtn")).click();
			System.out.print("line executed");
			Thread.sleep(1000);
			ExtentTest test=extent.createTest("Click on login with username with numeric & password");
			test.log(Status.INFO, "Desktop application launching Successfully");
			test.info("Navigate to login ");
			test.info("Email: 3412@trends.com");
			test.info("Password: 123456");
			test.info("Login:click on login");
			test.info("EXPECTED RESULT ::  It should not login into the account ");
			String a=driver.findElement(By.id("error")).getText();
			assertEquals("Invalid Credentials", a);
			test.pass(a);
			System.out.println(a);
			test.log(Status.PASS ,"ACTUAL RESULT ::  Invalid Credentials ");
			test.pass("Test Case:: TestCase PASSED");
			//driver.close();
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
			driver.findElement(By.id("username")).sendKeys("sharath @trends.com");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.id("loginBtn")).click();
			System.out.print("line executed");
			Thread.sleep(1000);
			ExtentTest test=extent.createTest("Click on login with username with spaces & password");
			test.log(Status.INFO, "Desktop application launching Successfully");
			test.info("Navigate to login ");
			test.info("Email: sharath @trends.com");
			test.info("Password: 123456");
			test.info("Login:click on login");
			test.info("EXPECTED RESULT ::  It should not login into the account ");
			String a=driver.findElement(By.id("error")).getText();
			assertEquals("Invalid Credentials", a);
			test.pass(a);
			System.out.println(a);
			test.log(Status.PASS ,"ACTUAL RESULT ::  Invalid Credentials ");
			test.pass("Test Case:: TestCase PASSED");
			//driver.close();
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
			driver.findElement(By.id("username")).sendKeys("SHARATH@TRENDS.COM");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.id("loginBtn")).click();
			System.out.print("line executed");
			Thread.sleep(5000);
			ExtentTest test=extent.createTest("Click on login with username(uppercase letter) & password");
			test.log(Status.INFO, "Desktop application launching Successfully");
			test.info("Navigate to login ");
			test.info("Email: SHARATH@TRENDS.COM");
			test.info("Password: 123456");
			test.info("Login:click on login");
			test.info("EXPECTED RESULT ::  It should login into the account ");
			test.log(Status.PASS ,"ACTUAL RESULT ::  Login successfull ");
			test.pass("Test Case:: TestCase PASSED");
			//driver.close();
			System.out.println("08");
		}
		@Test
		public void test09() throws InterruptedException {
			Thread.sleep(3000);
			for (String handle : driver.getWindowHandles())
			{
				driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
			}
			Thread.sleep(1000);
			driver.findElement(By.id("username")).sendKeys("SHARATH@trends.com");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.id("loginBtn")).click();
			System.out.print("line executed");
			Thread.sleep(5000);
			ExtentTest test=extent.createTest("Click on login with username(uppercase & lowercase letter) & password");
			test.log(Status.INFO, "Desktop application launching Successfully");
			test.info("Navigate to login ");
			test.info("Email: SHARATH@trends.com");
			test.info("Password: 123456");
			test.info("Login:click on login");
			test.info("EXPECTED RESULT ::  It should login into the account ");
			test.log(Status.PASS ,"ACTUAL RESULT ::  Login successfull ");
			test.pass("Test Case:: TestCase PASSED");
			//driver.close();
			System.out.println("09");
		}
		@Test
		public void test10() throws InterruptedException {
			Thread.sleep(3000);
			for (String handle : driver.getWindowHandles())
			{
				driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
			}
			Thread.sleep(1000);
			driver.findElement(By.id("username")).sendKeys("SHArath@trends.com");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.id("loginBtn")).click();
			System.out.print("line executed");
			Thread.sleep(5000);
			ExtentTest test=extent.createTest("Click on login with username(uppercase & lowercase letter) & password");
			test.log(Status.INFO, "Desktop application launching Successfully");
			test.info("Navigate to login ");
			test.info("Email: SHArath@trends.com");
			test.info("Password: 123456");
			test.info("Login:click on login");
			test.info("EXPECTED RESULT ::  It should login into the account ");
			test.log(Status.PASS ,"ACTUAL RESULT ::  Login successfull ");
			test.pass("Test Case:: TestCase PASSED");
			//driver.close();
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
			driver.findElement(By.id("loginBtn")).click();
			System.out.print("line executed");
			Thread.sleep(5000);
			ExtentTest test=extent.createTest("Click on login with username & password");
			test.log(Status.INFO, "Desktop application launching Successfully");
			test.info("Navigate to login ");
			test.info("Email: sharath@trends.com");
			test.info("Password: 123456");
			test.info("Login:click on login");
			test.info("EXPECTED RESULT ::  It should login into the account ");
			test.log(Status.PASS ,"ACTUAL RESULT ::  Login successfull ");
			test.pass("Test Case:: TestCase PASSED");
			//driver.close();
			System.out.println("11");
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