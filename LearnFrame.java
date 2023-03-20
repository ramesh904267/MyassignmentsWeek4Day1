package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println(text);
	    alt.accept();
		String text2 = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		System.out.println(text2);
	}

}
