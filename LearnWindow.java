package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class LearnWindow {

	public static Duration windowList;

	public static void main(String[] args) {
		//	Switch to the Flights window
		//	Print the Title of the Flights window
			//Close the Flights window alone
		//	Print the Train search window title (First window)
       EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
          System.out.println(driver.getTitle());
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> handles=new ArrayList<String>(windowHandles );
	driver.switchTo().window(handles.get(1));
	System.out.println(driver.getTitle());
	driver.close();
	driver.switchTo().window(handles.get(0));
	System.out.println(driver.getTitle());
	driver.quit();
	
	
	
	
	
	
	
	
	}

}
