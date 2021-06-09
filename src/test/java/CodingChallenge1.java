import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CodingChallenge1 {

    @Test
    public void challenge1()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.worldometers.info/world-population/");
        driver.manage().window().maximize();
        WebElement currentWorldPopulation=driver.findElement(By.xpath("//div[@class='maincounter-number']"));
        WebElement birthsToday=driver.findElement(By.xpath("//div[text()=\"Today\"]//following::div/span[@rel=\"births_today\"]"));
        WebElement deathsToday=driver.findElement(By.xpath("//div[text()=\"Deaths today \"]//following::div/span[@rel=\"dth1s_today\"]"));
        WebElement populationGrowthToday=driver.findElement(By.xpath("//div[text()=\"Population Growth today \"]//following::div/span[@rel=\"absolute_growth\"]"));
        WebElement birthsThisYear=driver.findElement(By.xpath("//div[text()=\"Births this year \"]//following::div/span[@rel=\"births_this_year\"]"));
        WebElement deathsThisYear=driver.findElement(By.xpath("//div[text()=\"Deaths this year \"]//following::div/span[@rel=\"dth1s_this_year\"]"));
        WebElement populationGrowthThisYear=driver.findElement(By.xpath("//div[text()=\"Population Growth this year \"]//following::div/span[@rel=\"absolute_growth_year\"]"));
        LocalDateTime then = LocalDateTime.now();
        while(true) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Current world population-----------------------" + currentWorldPopulation.getText());
            System.out.println("Births today-----------------------" + birthsToday.getText());
            System.out.println("Deaths today-----------------------" + deathsToday.getText());
            System.out.println("Population growth today-----------------------"+populationGrowthToday.getText());
            System.out.println("Births this year-----------------------" + birthsThisYear.getText());
            System.out.println("Deaths this year-----------------------" + deathsThisYear.getText());
            System.out.println("Population growth this year-----------------------"+populationGrowthThisYear.getText());
            if (ChronoUnit.SECONDS.between(then, LocalDateTime.now()) >= 30) break;
        }
        driver.quit();
    }
}
