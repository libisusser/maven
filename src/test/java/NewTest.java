import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  
	@Test(groups = { "Sanity"})
  
  public void test_1() 
  {
	  
	  System.setProperty ("webdriver.chrome.driver" , "C://Automation/Selenium Driver/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().setSize(new Dimension(1366, 768));
	  long id = Thread.currentThread().getId();
	  System.out.println(" test_1 Thread id is   " + id);
	  driver.quit();
	  
	  	  
	  
  }
  
	@Test(groups = { "Sanity"})
	
  public void test_2() 
  {
	  
	  System.setProperty ("webdriver.chrome.driver" , "C://Automation/Selenium Driver/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().setSize(new Dimension(1366, 768));
	  long id = Thread.currentThread().getId();
	  System.out.println(" test_2 Thread id is   " + id);
	  driver.quit();
	  
	  	  
	  
  }
  
	@Test(groups = { "Sanity"})
	
  public void test_3() 
  {
	  
	  System.setProperty ("webdriver.chrome.driver" , "C://Automation/Selenium Driver/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().setSize(new Dimension(1366, 768));
	  long id = Thread.currentThread().getId();
	  System.out.println(" test_3 Thread id is   " + id);
	  driver.quit();
	  
	  	  
	  
  }
  
	@Test
  public void test_4() 
  {
	  
	  System.setProperty ("webdriver.chrome.driver" , "C://Automation/Selenium Driver/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().setSize(new Dimension(1366, 768));
	  long id = Thread.currentThread().getId();
	  System.out.println(" test_4 Thread id is   " + id);
	  driver.quit();
	  
	  	  
	  
  }
  
	@Test
  public void test_5() 
  {
	  
	  System.setProperty ("webdriver.chrome.driver" , "C://Automation/Selenium Driver/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().setSize(new Dimension(1366, 768));
	  long id = Thread.currentThread().getId();
	  System.out.println(" test_5 Thread id is   " + id);
	  driver.quit();
	  
	  	  
	  
  }
}
