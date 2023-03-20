package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingAlert {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Alert sweet= driver.switchTo().alert();
		sweet.dismiss();
		String text = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[4]")).getText();
		System.out.println(text);
		

	}

}
