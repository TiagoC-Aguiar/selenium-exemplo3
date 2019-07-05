package webdriversessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPart2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/tiago/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		WebElement dia = driver.findElement(By.id("day"));
		WebElement mes = driver.findElement(By.id("month"));
		WebElement ano = driver.findElement(By.id("year"));
		
		Select select = new Select(dia);
		select.selectByIndex(1);
		
		Select select1 = new Select(mes);
		select1.selectByIndex(1);
		
		Select select2 = new Select(ano);
		select2.selectByIndex(1);
		
		System.out.println(select.isMultiple());
		
		List<WebElement> listaDias = select.getOptions();
		System.out.println(listaDias.size());
		int totalDias = listaDias.size() - 1;
		System.out.println("total de dias: " + totalDias);
		
	}
}
