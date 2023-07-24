package steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {


	@Given("user calculated {int}\\/{int}")
	public void user_calculated(Integer int1, Integer int2) {
		int i = 1/0;
		System.out.println(i);
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.out.println("login the app");
	
	
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
		
		//create an object of chrome driver
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.amazon.in/");
	
	
	
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		
		System.out.println("login successfully");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	}

	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
	}

	@Then("error message is displayed - Invalid Credentials")
	public void error_message_is_displayed_Invalid_Credentials() {
	}


}
