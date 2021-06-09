import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.List;

public class CodingChallengeB {

    @Test
    public void makeMyTrip()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        new Actions(driver).click();
       WebElement flights= driver.findElement(By.xpath("//ul/li[@data-cy=\"menu_Flights\"]/a"));
       flights.click();
        driver.findElement(By.xpath("//ul/li[@data-cy=\"roundTrip\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"From\"]")).click();
        driver.findElement(By.xpath("//input[contains(@class,\"react-autosuggest\")]")).sendKeys("Delhi");
        WebElement from=driver.findElement(By.xpath("//ul[@role=\"listbox\"]/li/div/div/p[text()=\"Delhi, India\"]"));
        from.click();
        driver.findElement(By.xpath("//span[text()=\"To\"]")).click();
        driver.findElement(By.xpath("//input[contains(@class,\"react-autosuggest\")]")).sendKeys("Bangalore");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement to=driver.findElement(By.xpath("//ul[@role=\"listbox\"]/li/div/div/p[text()=\"Bengaluru, India\"]"));
        to.click();
        driver.findElement(By.xpath("//span[text()=\"DEPARTURE\"]")).click();
        LocalDate date=LocalDate.now();
        int today =date.getDayOfMonth();
        driver.findElement(By.xpath("//div[@class=\"dateInnerCell\"]/p[text()=\""+today+"\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"dateInnerCell\"]/p[text()=\""+today+"\"]")).click();

        driver.findElement(By.xpath("//span[text()=\"RETURN\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"dateInnerCell\"]/p[text()=\""+(today+1)+"\"]")).click();
        //driver.findElement(By.xpath("//div[@class=\"dateInnerCell\"]/p[text()=\""+(today+1)+"\"]")).click();
        driver.findElement(By.xpath("//p[@data-cy=\"submit\"]/a")).click();
        List<WebElement> fromCount=driver.findElements(By.xpath("(//div[@class=\"paneView\"])[1]//div[@class=\"listingCard\"]"));
        List<WebElement> toCount=driver.findElements(By.xpath("(//div[@class=\"paneView\"])[2]//div[@class=\"listingCard\"]"));
        System.out.println(fromCount.size() +" " +toCount.size());
    driver.findElement(By.xpath("(//div[@class=\"paneView\"])[1]//div[@class=\"listingCard\"]//div[2]//div[2]//span")).click();
        driver.quit();

    }
}
