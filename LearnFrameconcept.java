package week4day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnFrameconcept {

	public static void main(String[] args) throws InterruptedException {
	
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Thread.sleep(3000);
		String text2 = driver.findElement(By.xpath("(//button[text()='Hurray! You Clicked Me.'])")).getText();
		System.out.println(text2);
		
		
	}

}
