import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BumbleTest {
    public static void main(String[] args) {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tarar\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

        // Create a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to bumble.com
        driver.get("https://bumble.com/");

        // Quit the driver
       
    }
}
