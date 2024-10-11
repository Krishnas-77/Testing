import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    @Test
    public void testGoogleSearch() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");

        // Create a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Open Google's website
        driver.get("https://www.google.com");

        // Verify the title of the page
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Google"));

        // Close the browser
        driver.quit();
    }
}