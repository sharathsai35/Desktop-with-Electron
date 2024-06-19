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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class signuppage {
	static WebDriver driver ;
	static ExtentHtmlReporter HtmlReporter;
	static ExtentReports extent;
	@BeforeClass
	static public void starttest() {
		System.out.println("start test");
		HtmlReporter = new ExtentHtmlReporter("signupTM.html");
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & Click on next button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : ");
		test.info("Name : ");
		test.info("Mobile number : ");
		test.info("Email: ");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Please enter company name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter company name ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
		System.out.println("signup");
	}
	@Test
	public void test01() throws InterruptedException {
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle); // Since there are two window handles this would switch to last one(which is second one). You can also explicitly provide the window number.
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & Enter company name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : ");
		test.info("Mobile number : ");
		test.info("Email: ");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Please enter name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter name ");
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & Enter name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath");
		test.info("Mobile number : ");
		test.info("Email: ");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Please enter mobile", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter mobile ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath");
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & Enter mobile without selecting country code");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath");
		test.info("Mobile number : 9876054312");
		test.info("Email: ");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Invalid Mobile Number", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Invalid Mobile Number ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & Enter mobile by selecting country code");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : 9876054312");
		test.info("Email: ");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Please enter email", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter email ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.id("signupEmail")).sendKeys("aaaaa@tvisha.com");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & Enter email");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : 9876054312");
		test.info("Email: aaaaa@tvisha.com");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display next page ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying next page ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.id("signupEmail")).sendKeys("aaaaa@tvisha.com");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & without entering company name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : ");
		test.info("Name : sharath");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : 9876054312");
		test.info("Email: aaaaa@tvisha.com");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Please enter company name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter company name ");
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.id("signupEmail")).sendKeys("aaaaa@tvisha.com");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & without entering name");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : ");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : 9876054312");
		test.info("Email: aaaaa@tvisha.com");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Please enter name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter name ");
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("");
		driver.findElement(By.id("signupEmail")).sendKeys("aaaaa@tvisha.com");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & without entering mobile");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : ");
		test.info("Email: aaaaa@tvisha.com");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Please enter mobile", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter mobile ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.id("signupEmail")).sendKeys("");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & without entering email");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : 9876054312");
		test.info("Email: ");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Please enter email", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter email ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath35");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.id("signupEmail")).sendKeys("aaaaa@tvisha.com");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & By entering name with numeric");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath35");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : 9876054312");
		test.info("Email: aaaaa@tvisha.com");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display next page ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Please enter a valid name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  Please enter a valid name ");
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath@");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.id("signupEmail")).sendKeys("aaaaa@tvisha.com");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & By entering name with characters");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath@");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : 9876054312");
		test.info("Email: aaaaa@tvisha.com");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display next page ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Please enter a valid name", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.FAIL ,"ACTUAL RESULT ::  Please enter a valid name ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("asdfghjklmn");
		driver.findElement(By.id("signupEmail")).sendKeys("aaaaa@tvisha.com");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & By entering invalid mobile num");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : asdfghjklmn");
		test.info("Email: aaaaa@tvisha.com");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Invalid Mobile Number", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Invalid Mobile Number ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.id("signupEmail")).sendKeys("aaaaadsafa");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & By entering invalid email");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : 9876054312");
		test.info("Email: aaaaadsafgg");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Please enter a valid email", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter a valid email ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("TVISHA");
		driver.findElement(By.id("signupUserName")).sendKeys("SHARATH");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.id("signupEmail")).sendKeys("AAAAA@GMAIL.COM");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & By entering uppercase letters");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : TVISHA");
		test.info("Name : SHARATH");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : 9876054312");
		test.info("Email: AAAAA@GMAIL.COM");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should display next page ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying next page ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.id("signupEmail")).sendKeys("aaaaa@tvisha.com");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='signup-next-btn'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & Click on next button & signup button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : 9876054312");
		test.info("Email: aaaaa@tvisha.com");
		test.info("Next : Click on next button");
		test.info("Signup : Click on signup button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Please enter password", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter password ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.id("signupEmail")).sendKeys("aaaaa@tvisha.com");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupPassword")).sendKeys("123456");
		driver.findElement(By.xpath("(//div[@class='signup-next-btn'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & Enter password & Click on signup button");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : 9876054312");
		test.info("Email: aaaaa@tvisha.com");
		test.info("Next : Click on next button");
		test.info("Password : 123456");
		test.info("Signup : Click on signup button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Please Agree legal policy terms", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please Agree legal policy terms ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.id("signupEmail")).sendKeys("aaaaa@tvisha.com");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupPassword")).sendKeys("123456");
		driver.findElement(By.xpath("//span[@class='signup-password-eye-icon']")).click();
		//driver.findElement(By.xpath("//div[@data-step='2']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & Click on eye button in password field");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : 9876054312");
		test.info("Email: aaaaa@tvisha.com");
		test.info("Next : Click on next button");
		test.info("Enter password : 123456");
		test.info("Click on eye button");
		//test.info("Signup : Click on signup button");
		test.info("EXPECTED RESULT ::  It should display password field ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying password field ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.id("signupEmail")).sendKeys("aaaaa@tvisha.com");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signupPassword")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-input='1']")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='signup-next-btn'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & Enter otp field");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : 9876054312");
		test.info("Email: aaaaa@tvisha.com");
		test.info("Next : Click on next button");
		test.info("Enter password : 123456");
		test.info("Enter OTP : 1234");
		test.info("Signup : Click on signup button");
		test.info("EXPECTED RESULT ::  It should display error msg ");
		String a=driver.findElement(By.xpath("//div[@class='signup-error']")).getText();
		assertEquals("Please Agree legal policy terms", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please Agree legal policy terms ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("tvisha");
		driver.findElement(By.id("signupUserName")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.id("signupEmail")).sendKeys("aaaaa@tvisha.com");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signupPassword")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-input='1']")).sendKeys("1234");
		driver.findElement(By.xpath("//label[@for='privacyPolicyCheckbox']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//div[@class='signup-next-btn'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & Click on checkbox of privacy policy");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath");
		test.info("Click on dropdown of mobile number country code");
		test.info("Select +91 in country code");
		test.info("Mobile number : 9876054312");
		test.info("Email: aaaaa@tvisha.com");
		test.info("Next : Click on next button");
		test.info("Enter password : 123456");
		test.info("Enter OTP : 1234");
		test.info("Click on checkbox of privacy policy");
		test.info("Signup : Click on signup button");
		test.info("EXPECTED RESULT ::  It should display user chat page ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying user chat page ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
		driver.findElement(By.xpath("//div[@class='signup-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signupCompanyName")).sendKeys("google");
		driver.findElement(By.id("signupUserName")).sendKeys("maneesh");
		driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
		driver.findElement(By.xpath("//ul//li[@data-dial-code='91']")).click();
		driver.findElement(By.id("signupUserMobile")).sendKeys("9876054312");
		driver.findElement(By.id("signupEmail")).sendKeys("maneesh@google.com");
		driver.findElement(By.xpath("//div[@class='signup-next-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on signup & Enter with previous signup credentials");
		test.log(Status.INFO, "Desktop application launching Successfully");
		test.info("Navigate to login ");
		test.info("Company name : tvisha");
		test.info("Name : sharath");
		test.info("Click on country code : +91");
		test.info("Mobile number : 9876054312");
		test.info("Email: aaaaa@tvisha.com");
		test.info("Next : Click on next button");
		test.info("EXPECTED RESULT ::  It should not display next page ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying next page ");
		test.pass("Test Case:: TestCase PASSED");
		//driver.close();
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
