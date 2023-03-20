package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Window {

	public static void main(String[] args) {
		
		 EdgeDriver driver=new EdgeDriver();
			driver.get("https://leafground.com/window.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.findElement(By.xpath("//span[text()='Open']")).click();
		    //print the active window handle
            String windowHandle = driver.getWindowHandle();
            System.out.println(windowHandle);
            //   verify the window
            System.out.println(driver.getTitle());
            //how can print second window  title
            //step1 
            Set<String> windowHandles = driver.getWindowHandles();
            //step2 convert set into list
            List<String>listwindow=new ArrayList<String>(windowHandles);
	        driver.switchTo().window(listwindow .get(1));
	        //verify the window present in second window
	       System.out.println(driver.getTitle());
        	//close the current open window
	        driver.close();
	        //swtich back the window
	        driver.switchTo().window(listwindow.get(0));
	        System.out.println(driver.getTitle());
	        //close all the open window
	
	
	}

}
