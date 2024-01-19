package Selenium_maven.ADINA;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest 
{
    
    @Test
    public void test()
    {
    	ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
	        driver.get("https://qa.adiglobaldistribution.pr/");
	        driver.close();
    	 System.out.println("completed");
    }
    
    public static void main(String []args)
    {
        
        
        AppTest obj= new AppTest();
        obj.test();
    }
}
