package Launching;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class MyPage {

	static EdgeOptions options;

	static WebDriver driver;

//	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub


	@Before
	public void launchBrownser() throws InterruptedException {

		System.setProperty("webdriver.edge.driver", ".\\driver\\msedgedriver.exe");


		options = new EdgeOptions();
		
		driver = new EdgeDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		
		
		


	}

	
	public void Login() throws InterruptedException {
//		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.name("username")).sendKeys("testeOne");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		Thread.sleep(5000);
	}

	@After
	public void tearDown() {
		driver.close();
	}

	
	public void registration() throws InterruptedException {
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("customer.firstName")).sendKeys("Serge");
		driver.findElement(By.name("customer.lastName")).sendKeys("Tester");
		driver.findElement(By.name("customer.address.street")).sendKeys("4515 Fuder dr");
		driver.findElement(By.name("customer.address.city")).sendKeys("Plano");
		driver.findElement(By.name("customer.address.state")).sendKeys("Texas");
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("75070");
		driver.findElement(By.name("customer.phoneNumber")).sendKeys("524786524");
		driver.findElement(By.name("customer.ssn")).sendKeys("756-865-2255");
		driver.findElement(By.name("customer.username")).sendKeys("testeOne");
		driver.findElement(By.name("customer.password")).sendKeys("Test@1234");
		driver.findElement(By.name("repeatedPassword")).sendKeys("Test@1234");
		driver.findElement(By.className("button")).click();
		Thread.sleep(5000);
	}

	public void Login_null() {

		driver.findElement(By.name("username")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.xpath("//input[contains(@value, 'Log In']")).click();
	}

	@Test
	public void lookup() throws InterruptedException {

		driver.findElement(By.linkText("Forgot login info?")).click();
		Thread.sleep(5000);
	
	}
	
	

}
