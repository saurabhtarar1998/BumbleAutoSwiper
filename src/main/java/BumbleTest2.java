import org.openqa.selenium.By;
import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BumbleTest2 {
    public static void main(String[] args) throws InterruptedException {
        // Set the path of the GeckoDriver executable
       // System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tarar\\Downloads\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
       System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tarar\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");

        // Create a new FirefoxDriver instance
        WebDriver driver = new FirefoxDriver();

        // Navigate to bumble.com
        driver.get("https://bumble.com/");
        driver.manage().window().maximize();
        // Quit the driver
       WebElement Sign_In = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/a"));
       Sign_In.click();
       WebElement Use_cell_phone_number = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/main/div/div[3]/form/div[3]/div/span/span/span"));
       Use_cell_phone_number.click();
       WebElement Cell_phone_Input = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
       Thread.sleep(1500);
       Cell_phone_Input.sendKeys("9767213626");
       System.out.println("Number Entered");
//     Thread.sleep(5000);
//     WebElement continue_buttuon = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/main/div/div[3]/form/div[4]/button"));
//     continue_buttuon.click();
       System.out.println("Count Down 30 Sec");
       Thread.sleep(60000);
       System.out.println("Entered For Loop");
       //WebElement Swipe_right = driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div[2]/div/div/span/div[2]/div/div[2]/div/div[3]/div/div[1]/span"));
       
       for(int i=0; i < 150; i++) {
    	   WebElement Swipe_right = driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div[2]/div/div/span/div[2]/div/div[2]/div/div[3]/div/div[1]/span"));
    	   WebElement Swipe_left = driver.findElement(By.xpath("/html/body/div/div/div[1]/main/div[2]/div/div/span/div[2]/div/div[2]/div/div[1]/div/div[1]/span"));
           
    	   Random random = new Random();
    	   Random random2 = new Random();
    	   int randomnum2 = random2.nextInt(2001) + 2500;
           // Generate a random integer between 0 and 100 (inclusive)
    	   
           int randomNumber = random.nextInt(101);
           if (randomNumber % 2 == 0) {
        	   System.out.println("Waiting "+ randomnum2/1000 + " to Swipe right");
        	   Thread.sleep(randomnum2);
        	   Swipe_right.click();
           }
           if (randomNumber % 2 != 0) {
        	   System.out.println("Waiting "+ randomnum2/1000 + " to Swipe left");
        	   Thread.sleep(randomnum2);
        	   Swipe_left.click();
           }
           Thread.sleep(2000);
       }
       
       Thread.sleep(2000);
              
       
    }
}
