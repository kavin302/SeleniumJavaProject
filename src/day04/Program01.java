package day04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class Program01 {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new EdgeDriver();
        driver.get("https://www.instagram.com/");
        
        driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
}
}