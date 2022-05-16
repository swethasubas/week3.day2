package week3Day2JavaCollections;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectionsAjio {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        
        //1.Launch URL "https://www.ajio.com/"
        driver.get("https://www.ajio.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        //2.In the search box, type as "bags" and press enter
        driver.findElement(By.xpath("//input[@name ='searchVal']")).sendKeys("bags", Keys.ENTER);
        
        //3.To the left  of the screen under " Gender" click the "Men"
        driver.findElement(By.xpath("//label[@for='Men']")).click();
        
        //4.Under "Category" click "Fashion Bags"
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[@for ='Men - Fashion Bags']")).click();
        
        //5.Print the count of the items Found
        Thread.sleep(2000);
        String Countofitems = driver.findElement(By.xpath("(//div[@class = 'filter']/div)[1]")).getText();
        System.out.println("Number of items : " + Countofitems);
        
        //6.Get the list of brand of the products displayed in the page and print the list
        //List<String> brandname = new ArrayList<String>();
        List<WebElement> brandnamelist = driver.findElements(By.xpath("//div[@class = 'brand']"));
        for(WebElement brand: brandnamelist)
        {
        	 System.out.println("List of Brand :" +brand.getText());
        }
        
        //7.Get the list of names of the bags and print it
        List<WebElement> bagnamelist = driver.findElements(By.xpath("//div[@class = 'nameCls']"));
        for(WebElement bag: bagnamelist)
        {
        	 System.out.println("List of Bag :" +bag.getText());
        }
        driver.quit();
     }
}
