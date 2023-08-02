package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/reg");
	   
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
	    driver.findElement(By.name("firstname")).sendKeys("Ganesh");
	    driver.findElement(By.name("lastname")).sendKeys("Tale");
        Thread.sleep(3000);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    driver.findElement(By.xpath("//a[text()='Already have an account?']")).click();

	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
	    System.out.println("user is on loginpage");
	}
}
