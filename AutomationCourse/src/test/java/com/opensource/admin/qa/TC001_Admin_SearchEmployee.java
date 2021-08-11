package com.opensource.admin.qa;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TC001_Admin_SearchEmployee {
 
  @BeforeTest
  public void beforeTest() {
  
  }
 @Test
 public void TC001_Admin_SearchEmployee_Script() {
	 
	 //Step 1
	 Reporter.log("Open Browser \"OrangeHRM\" Web page"); //Nos genera el log del paso
	 System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe"); //Driver del browser
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  //Step 2
	  Reporter.log("Enter Username and Password"); //Nos genera el log del paso
	  //driver.findElement(By.id("txtUsername")).sendKeys("Admin"); by using ID
	  
	  //by using xpath, si no tiene CSS, class, sirve para cualquier tipo de objeto
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin"); //find elements: encuentra el elemento ID 
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123"); // SendKeys: La acción que se requiere - click
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  //Step 3
	  Reporter.log("Validate that you have logged in successfully"); //Nos genera el log del paso
	  WebDriverWait wait = new WebDriverWait(driver, 30); //El script espera por 30 segundos
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='OrangeHRM']"))); //Busca este objeto, si no lo encuentra, aparece un error
	  
	  //Step 4
	  Reporter.log("Click Admin - Go to the admin page");
	  driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click(); //click en el menu "admin"
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //espera por 5 segundos
	  
	  //Step 5
	  Reporter.log("Search username in field Username");
	  driver.findElement(By.xpath("//input[@id=\"searchSystemUser_userName\"]")).sendKeys("admin"); //busca "admin" en el campo username
	  
	  //Step 6
	  Reporter.log("Click Search"); 
	  driver.findElement(By.xpath("//input[@id='searchBtn']")).click(); //acción de dar click en el boton search
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); //espera por 2 segundos
	  
	  //Step 7
	  Reporter.log("Verify username exist in table"); 
	  String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText(); //obtener el valor  actual despues de la busqueda en la tabla
	  Assert.assertEquals(actualValue, "Admin"); //Hard Assertion: compara el string de actualValue obtenido en el paso anterior con el valor esperado (El paso más importante) si esta validación no concuerda, detiene la ejecución
	  
	  SoftAssert soft = new SoftAssert();
	  soft.assertEquals(actualValue, "Admon"); //Soft Assertion; compara el string de actualValue obtenido en la linea 66 pero no detiene la prueba
	  
	  //Step 8
	  Reporter.log("Log out"); 
	  driver.findElement(By.xpath("//a[@id='welcome']")).click(); //acción de click en welcome
	  driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click(); //acción de click en logout, se uso contains porque el objeto solo tenia una propiedad
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //espera por 5 segundos
	  
	  //Step 9
	  Reporter.log("Close Browser"); 
	  driver.close(); //cierra el browser
	  
	  soft.assertAll(); //Es el que detiene el soft assert, hace triage de los punteros que se obtuvieron en el script 
	  
}

  @AfterTest
  public void afterTest() { 
  }

}
