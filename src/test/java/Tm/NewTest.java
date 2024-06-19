package Tm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class NewTest {
	WebDriver driver;
	ExtentHtmlReporter HtmlReporter;
	ExtentReports extent;

	@BeforeSuite
	public void Starttest() {
		HtmlReporter = new ExtentHtmlReporter("home.html");
		extent = new ExtentReports();
		extent.attachReporter(HtmlReporter);
	}
	@Test
	public void testcase49() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver-v9.0.1-linux-x64/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("maneesh");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(200);
		
		//click on profile
		driver.findElement(By.xpath("//div[@data-name='read receipt']")).click();
		Thread.sleep(400);
		
		
		String actual = driver.findElement(By.xpath("//div[@data-name='read receipt']")).getText();
		Assert.assertEquals("Read Receipt", actual);
		Thread.sleep(400);
	
	//click on three dots
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		
		//click on search
		
		String a1 = driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).getText();
		Assert.assertEquals("Search", a1);	
		Thread.sleep(400);
		
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		

		//select users
		
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		
		
		String a2 = driver.findElement(By.xpath("//div[@data-username='Akhil']")).getAttribute("data-username");
		Assert.assertEquals("Akhil", a2);
		
		driver.findElement(By.xpath("//div[@data-username='Akhil']")).click();
		
		Thread.sleep(500);
		
		
		String a3 = driver.findElement(By.xpath("//div[@data-username='Akshay']")).getAttribute("data-username");
		Assert.assertEquals("Akshay", a3);
		
		driver.findElement(By.xpath("//div[@data-username='Akshay']")).click();
		
		Thread.sleep(500);
		
		
		String a4 = driver.findElement(By.xpath("//div[@data-username='Hari']")).getAttribute("data-username");
		Assert.assertEquals("Hari", a4);
		
		driver.findElement(By.xpath("//div[@data-username='Hari']")).click();
		
		Thread.sleep(500);
		
		//select date range
		
				driver.findElement(By.xpath("//div[@class='single-conversation-custom-date-filter-wrapper']")).click();
				
				Thread.sleep(500);
				driver.findElement(By.xpath("//*[@id=\"singleConversationCustomDateRangeFilterFrom\"]")).click();
				
				
				Thread.sleep(500);

				
				// from last year
					driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[2]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath("/html/body/div[7]/div[2]/table/thead/tr[2]/th[1]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath("/html/body/div[7]/div[2]/table/tbody/tr/td/span[7]")).click();
					
					
					driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[1]")).click();
					Thread.sleep(500);
					
					driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[5]/td[4]")).click();
					Thread.sleep(500);
					
					
					//to date
					driver.findElement(By.xpath("//*[@id=\"singleConversationCustomDateRangeFilterTo\"]")).click();
					
					Thread.sleep(500);
					
					driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[6]/td[1]")).click();
					
					Thread.sleep(400);
					
					//apply
					
					driver.findElement(By.xpath("//input[@id='singleConversationCustomDateRangeFilterApply']")).click();
					Thread.sleep(400);
			
			Thread.sleep(400);
	String a5 = driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
	Assert.assertEquals("Bhai", a5);
	
	Thread.sleep(400);
	
	
		ExtentTest test= extent.createTest("Select multiple users & select previous year 2021 to 2022");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("username:maneesh");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Group: Click on read receipt");
		test.info("Three dots: Click on three dots");
		test.info("Search: Click on search");
		test.info("All users: Click on all users");
		test.info("Select: users Akhil, Akshay & Hari");
		test.info("Custom dates: Click on custom dates");
		test.info("Month: Select april");
		test.info("Date: 2021-04-20");
		
		test.info("Date range: Click on to date");
		test.info("Month: Select may");
		
		test.info("To date: 2022-05-30");
		
		
		test.info("EXPECTED RESULT:: It should display msgs for particular users");
		test.log(Status.PASS, actual);
		test.log(Status.PASS, a1);

		test.log(Status.PASS, a2);
		test.log(Status.PASS, a3);
		test.log(Status.PASS, a4);
		test.log(Status.PASS, a5);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the msgs for particular users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
	driver.close();
	}
	
	
	@Test
	public void testcase50() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("maneesh");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(200);
		
		//click on profile
		driver.findElement(By.xpath("//div[@data-name='read receipt']")).click();
		Thread.sleep(400);
		
		
		String actual = driver.findElement(By.xpath("//div[@data-name='read receipt']")).getText();
		Assert.assertEquals("Read Receipt", actual);
		Thread.sleep(400);
	
	//click on three dots
		driver.findElement(By.xpath("//div[@class='conversation-header-options-btn']")).click();
		
		//click on search
		
		String a1 = driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).getText();
		Assert.assertEquals("Search", a1);	
		Thread.sleep(400);
		
		driver.findElement(By.xpath("//div[@class='conversation-header-option conversation-filter-search-icon']")).click();
		

		//select users
		
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		
		
		String a2 = driver.findElement(By.xpath("//div[@data-username='Akhil']")).getAttribute("data-username");
		Assert.assertEquals("Akhil", a2);
		
		driver.findElement(By.xpath("//div[@data-username='Akhil']")).click();
		
		Thread.sleep(500);
		
		
		String a3 = driver.findElement(By.xpath("//div[@data-username='Akshay']")).getAttribute("data-username");
		Assert.assertEquals("Akshay", a3);
		
		driver.findElement(By.xpath("//div[@data-username='Akshay']")).click();
		
		Thread.sleep(500);
	
	String a4 = driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
	Assert.assertEquals("Bhai", a4);
	
	Thread.sleep(500);
	
	String a5 = driver.findElement(By.xpath("//span[@class='senderSelectedText']")).getText();
	Assert.assertEquals("2 Selected", a5);
	
	Thread.sleep(400);
	
		ExtentTest test= extent.createTest("Select multiple users");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("username:maneesh");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Group: Click on read receipt");
		test.info("Three dots: Click on three dots");
		test.info("Search: Click on search");
		test.info("All users: Click on all users");
		test.info("Select: users Akhil & Akshay");
		
		
		test.info("EXPECTED RESULT:: It should display msgs for particular users");
		test.log(Status.PASS, actual);
		test.log(Status.PASS, a1);

		test.log(Status.PASS, a2);
		test.log(Status.PASS, a3);
		test.log(Status.PASS, a4);
		test.log(Status.PASS, a5);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the msgs for particular users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
	driver.close();
	}
	@Test 
	public void testcase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.125:9200/admin-login/login");
		
		driver.findElement(By.xpath("//input[@id='adminEmail']")).sendKeys("admin@edscan.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@href='/admin/edit-platforms/cGxhdGZvcm1MaXN0PTI2']")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//svg[@class='svg-inline--fa fa-trash ms-2 delete-category tras-btn']")).click();
		Thread.sleep(300);
		
		//click on group
		
		
	}
  @AfterSuite
  public void endTest() {
	  extent.flush();
  }
}
