package webdriversessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownPart3 {

	private static WebDriver driver;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/tiago/Drivers/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		String ano = "year";
		String mes = "month";
		String dia = "day";
		
		
		selectDropDownValue(ano, "1992");
		selectDropDownValue(mes, "Jan");
		selectDropDownValue(dia, "3");
		
		
//		driver.quit();
	}
	
	public static void selectDropDownValue(String xpath, String value) {
		List<WebElement> mesLista = driver.findElements(By.xpath("//select[@id='" + xpath + "']//option"));
		System.out.println(mesLista.size());
		
		for(WebElement a : mesLista) {			
			System.out.println(a.getText());
			if(a.getText().equals(value)) {
				a.click();
				break;
			}
		}
		
	}

}
