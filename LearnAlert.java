package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert simple = driver.switchTo().alert();
		String text = simple.getText();
		System.out.println(text);
		simple.accept();
		 String text2 = driver.findElement(By.xpath("//span[text()='You have successfully clicked an alert']")).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();		
		Alert confirm = driver.switchTo().alert();
	    confirm.dismiss();
		String text3 = driver.findElement(By.xpath("//span[text()='User Clicked : Cancel']")).getText();
		System.out.println(text3);
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert prompt = driver.switchTo().alert();
		String text4 = prompt.getText();
		System.out.println(text4);
		prompt.sendKeys("Testleaf");
		prompt.accept();
	    String text5 = driver.findElement(By.xpath("//span[text()='User entered name as: Testleaf']")).getText();
		System.out.println(text5);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
		
		
		
		}

}
