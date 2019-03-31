package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours_AutomatedTest {
	
	//VARIABLES GLOBALES
	private WebDriver driver;
	By registerLinkLocater = By.linkText("REGISTER");
	By registerPageLocator = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");
	
	By usernameLocator = By.id("email");
	By passwordLocator = By.name("password");
	By confirmPasswordLocator = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input");

	By registerBtnLocator = By.name("register");
	
	By userLocator = By.name("userName");
	By passLocator = By.name("password");
	By signBtnLocator = By.name("login");
	By confirmSign = By.xpath("//img[@src=\"/images/masts/mast_flightfinder.gif\"]");
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	/*PASOS:
	 * 1. CLICK REGISTER
	 * 2. COMPLETAR CAMPOS
	 * 3. CONFIRMAR MENSAJE USUARIO REGISTRADO
	 */

	@Test
	public void registerUser() throws InterruptedException {
		
		driver.findElement(registerLinkLocater).click();
		Thread.sleep(2000);
		if (driver.findElement(registerPageLocator).isDisplayed()) {
			
			driver.findElement(usernameLocator).sendKeys("PRUEBATEST");
			driver.findElement(passwordLocator).sendKeys("TEST");
			driver.findElement(confirmPasswordLocator).sendKeys("TEST");
			
			driver.findElement(registerBtnLocator).click();
			
		}
		
		else {
			System.out.println("Register pages was not found");
		}
		
		java.util.List<WebElement> fonts = driver.findElements(By.tagName("font"));
		
		assertEquals("Note: Your user name is PRUEBATEST.", fonts.get(5).getText());
		
	}
	/* 1. AUTENTIFICARSE CON EL USUARIO CREADO
	 * 2. COMPLETAR CAMPOS DE USER Y PASS
	 */
	@Test
	public void signIn() throws InterruptedException {
		
		if(driver.findElement(userLocator).isDisplayed()) {
			driver.findElement(userLocator).sendKeys("PRUEBATEST");
			driver.findElement(passLocator).sendKeys("TEST");
			driver.findElement(signBtnLocator).click();
			Thread.sleep(2000);
			assertTrue(driver.findElement(confirmSign).isDisplayed());
		}
			
			else {
				System.out.println("username testbox was not present");
			}
			
			
		}
	}
	


