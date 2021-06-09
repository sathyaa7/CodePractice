import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CodingChallengeA {
    @Test
    public void challenge1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.zoopla.co.uk/");
        driver.manage().window().maximize();
        WebElement accept=driver.findElement(By.xpath("//button[contains(@class,\"accept\")]"));
        if(accept.isDisplayed())
            accept.click();
        driver.findElement(By.xpath("//input[@id=\"search-input-location\"]")).sendKeys("London");
//        WebElement dd=driver.findElement(By.xpath("//ul/li[@data-value=\"London\"]/a/em"));
//        System.out.println(dd.isDisplayed());
//        Thread.sleep(3000);
//        Actions act=new Actions(driver);
//        act.moveToElement(dd).click();
        driver.findElement(By.xpath("//button[@id=\"search-submit\"]")).click();
        List<WebElement> amount=new LinkedList<>();
        LinkedList<String> rates=new LinkedList<>();
        amount=driver.findElements(By.xpath("(//div[contains(@class,\"PriceContainer\")]/p[last()])"));
        for(WebElement we:amount)
            rates.add(we.getText());
        System.out.println(rates);
        Collections.sort(rates);
        Collections.reverse(rates);
        System.out.println(rates);
        WebElement prop5=driver.findElement(By.xpath("(//div[contains(@id,\"listing\")])[5]"));
//        Actions act=new Actions(driver);
//        act.click(prop5);
        prop5.click();
        WebElement agentName=driver.findElement(By.xpath("//div[contains(@class,AgentHeader)]//h3[contains(@class,\"AgentHeading\")]"));
        String agentLogo=driver.findElement(By.xpath("//img[contains(@src,\"logo\")]")).getAttribute("alt");
        String agentNumber=driver.findElement(By.xpath("//div[contains(@class,\"AgentCall\")]/a")).getText();
        System.out.println(agentName.getText() +" " +agentLogo +" " +agentNumber);
        driver.findElement(By.xpath("//img[contains(@src,\"logo\")]")).click();
        WebElement header=driver.findElement(By.xpath("//h1[@class=\"bottom-half\"]"));
        System.out.println(header.getText());
        driver.quit();
    }
}
