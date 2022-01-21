import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class SimpleTest {
	
   @Test
   public void checkHeader() {   
       System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");   
       WebDriver driver = new FirefoxDriver();
       String baseURL = "https://br.yahoo.com/";
       String expectedTitle = "Yahoo Brasil: Email, notícias, finanças, esportes, entretenimento";
       String actualTitle = "";
       
       // launch driver
       driver.get(baseURL);
       
       // get actual title
       actualTitle = driver.getTitle();
       
       // compare
       
       if(actualTitle.contentEquals(expectedTitle)){
    	   System.out.println("Test Passed!");
       }else {
    	   System.out.println("Test Failed!");
       }
       driver.close();
   }
}