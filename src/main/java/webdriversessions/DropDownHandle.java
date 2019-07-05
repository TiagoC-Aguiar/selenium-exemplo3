package webdriversessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/tiago/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		WebElement dia = driver.findElement(By.id("day"));
		WebElement mes = driver.findElement(By.id("month"));
		WebElement ano = driver.findElement(By.id("year"));
		
//		Select select = new Select(dia);
//		select.selectByVisibleText("11");
//
//		Select select1 = new Select(mes);
//		select1.selectByValue("8");
//
//		Select select2 = new Select(ano);
//		select2.selectByVisibleText("1990");
		
		String dob = "13-10-1992";
		String dobArr[] = dob.split("-");
		
		selectValueDropDown(dia, dobArr[0]);
		selectValueDropDown(mes, dobArr[1]);
		selectValueDropDown(ano, dobArr[2]);
	}
	
	public static void selectValueDropDown(WebElement elemento, String valor) {
		Select select = new Select(elemento);
		select.selectByValue(valor);
	}
}
