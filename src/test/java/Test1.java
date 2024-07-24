import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    private WebDriver driver;

    public void setUp() {
        // Укажите путь к драйверу Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

}
