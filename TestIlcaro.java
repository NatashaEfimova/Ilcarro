import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.testng.annotations.BeforeMethod;

public class TestIlcaro {
}


public class StartTest {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro-1578153671498.web.app/search");
    }
}