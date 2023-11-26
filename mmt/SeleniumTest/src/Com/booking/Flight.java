package Com.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Flight {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com");
        driver.manage().window().maximize();

        // Use JavaScript to click on the "From" label
        WebElement fromLabel = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='From']")));
        
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fromLabel);

        // Find the input field after the "From" label is clicked
        WebElement fromInput = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='From']")));

        // Type "Sydney" into the input field
        fromInput.sendKeys("Sydney");

        // Wait for the suggestion dropdown to appear (adjust the wait time as needed)


        Thread.sleep(2000);

        // Simulate pressing Arrow Down
        fromInput.sendKeys(Keys.ARROW_DOWN);

        // Wait for the suggestion to be highlighted (adjust the wait time as needed)
        Thread.sleep(2000);

        // Simulate pressing Enter
        fromInput.sendKeys(Keys.ENTER);

        // Wait for a moment (adjust the wait time as needed)
        Thread.sleep(2000);

        // Use JavaScript to click on the "To" label
        WebElement toLabel = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='To']")));
        
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", toLabel);

        // Find the input field after the "To" label is clicked
        WebElement toInput = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='To']")));
        toInput.sendKeys("New Delhi");

        // Wait for the suggestion dropdown to appear (adjust the wait time as needed)
        Thread.sleep(2000);

        // Simulate pressing Arrow Down
        toInput.sendKeys(Keys.ARROW_DOWN);

        // Wait for the suggestion to be highlighted (adjust the wait time as needed)
        Thread.sleep(2000);

        // Simulate pressing Enter
        toInput.sendKeys(Keys.ENTER);

        // Wait for a moment (adjust the wait time as needed)
        Thread.sleep(2000);
        
                
        

        WebElement searchButton = driver.findElement(By.className("widgetSearchBtn"));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", searchButton);

        // Perform other actions as needed
      //*[@id="root"]/div/div[2]/div/div/div/div[2]/p/a
        // Close the browser
        driver.quit();
        
    
    }}

