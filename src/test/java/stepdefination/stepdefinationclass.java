package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;
import junit.framework.Assert;

public class stepdefinationclass {
	
	WebDriver driver = hooksclass.driver;
	
	
	@Given("User navigates to facebook application")
	public void user_navigates_to_facebook_application() {
	   System.out.println("user is navigating to the facebook application");
	   
	   driver.get("https://www.facebook.com/");
	}
	
	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
	   
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
	    
	}

	@When("user enters invalid credentials")
	public void user_enters_invalid_credentials() {
	   
	}

	@Then("user gets validation message")
	public void user_gets_validation_message() {
		//String 
		String actualResult=driver.findElement(By.xpath("//p[text()='An email has been sent to help you remember your login and password.']")).getText();
		Assert.assertEquals("An email has been sent to help you remember your login and password.", actualResult);
		System.out.println("Test completed successfully");
	    
	}
	
	@When("user enter {string} username and {string} password")
	public void user_enter_username_and_password(String username, String pass) {
	    driver.findElement(By.id("email")).sendKeys(username);
	    driver.findElement(By.id("pass")).sendKeys(pass);
	    driver.quit();
	}
	
	@Given("User navigates to elearning application")
	public void user_navigates_to_elearning_application() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user is navigating to the elearning application");
		   
		   driver.get("http://elearningm1.upskills.in/index.php");
		   driver.manage().window().maximize();
	}

	@When("user clicks on Submit button")
	public void user_clicks_on_ok_button() throws InterruptedException {
		driver.findElement(By.name("submit")).click();
		Thread.sleep(8000);
	    
	}
	
	@Then("User clicks on Signup button")
	public void user_clicks_on_Signup_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   driver.findElement(By.xpath("//a[text()=' Sign up! ']")).click();
		   Thread.sleep(3000);
	}
	
	@When("user enter {string} FirstName and {string} lastname and {string} email and {string} Code and {string} Username and {string} Pass and {string} Confirmpassword")
	public void user_enter_FirstName_and_lastname_and_email_and_Code_and_Username_and_Pass_and_Confirmpassword(String FirstName, String lastname, String email, String Code, String Username, String Pass, String Confirmpassword) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("firstname")).sendKeys(FirstName);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("official_code")).sendKeys(Code);
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("pass1")).sendKeys(Pass);
		driver.findElement(By.name("pass2")).sendKeys(Confirmpassword);
		Thread.sleep(8000);
	
	
	}
	@When("user enter {string} Username and {string} Pass")
	public void user_enter_Username_and_Pass(String Username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("login")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_Login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("submitAuth")).click();
		Thread.sleep(5000);
	}

	@Then("user clicks on Inbox and compose button")
	public void user_clicks_on_Inbox_button() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@title='Inbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Compose message']")).click();
	   
	}
	
	@Then("user enter mail details {string} as sendTo {string} as Subject {string} as Message and mail body and send it successfully")
	public void user_enter_mail_details_as_sendTo_as_Subject_as_Message_and_mail_body_and_send_it_successfully(String sendTo, String Subject, String Message) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(sendTo);
		driver.findElement(By.xpath("//input[@type='search']")).click();
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(Subject);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@name='compose']")).click();
	
		Thread.sleep(5000);}




	

}
