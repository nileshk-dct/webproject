package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class First {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://www.flipkart.com/");
		driver.getTitle();
		
		String acttitle=driver.getTitle();
		
		if(acttitle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!"))
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		driver.close();
	}

	
}
