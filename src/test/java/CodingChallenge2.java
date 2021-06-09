import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.plugin2.message.JavaScriptBaseMessage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CodingChallenge2 {

    @Test
    public void shoppingSite() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.noon.com/uae-en/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        List<String> headers = Arrays.asList("Recommended For You", "Save big on mobiles & tablets", "Top picks in electronics");
        //List<WebElement> headers = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy
        // (By.xpath("//div[@class=\"sc-gsTCUz bhdLno\"]//h3[text()="+headerText+"]")));
        //List<WebElement> swipers = driver.findElements(By.xpath("//div[contains(@class,\"swiper-button-next custom\")]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // AtomicInteger i = new AtomicInteger(0);
        System.out.println("headers ------" + headers.size());
        int loop = 1;
        for (int headerValue = 0; headerValue < headers.size(); headerValue++) {
            WebElement header = driver.findElement(By.xpath("//div[@class=\"sc-gsTCUz bhdLno\"]//h3[text()='" + headers.get(headerValue) + "']"));
            jse.executeScript("arguments[0].scrollIntoView()", header);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement swiper;
            if (headerValue + 1 == headers.size())
                swiper = driver.findElement(By.xpath("(//div[@class=\"sc-gsTCUz bhdLno\"]//h3)[" + (headerValue + 1) + "]//following::div[contains(@class,\"swiper-button-next custom\")]"));
            else
                swiper = driver.findElement(By.xpath("(//div[@class=\"sc-gsTCUz bhdLno\"]//h3)[" + (headerValue + 2) + "]//preceding::div[contains(@class,\"swiper-button-next custom\")][1]"));

            while (true) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                List<WebElement> products;
                if (headerValue + 1 == headers.size())
                    products = driver.findElements(By.xpath("(//div[@class=\"sc-gsTCUz bhdLno\"]//h3)[" + (headerValue + 1) + "]//following::div[@class=\"sc-3751lm-2 kqiyzi large\"]"));
                else {
                    List<WebElement> list1 = driver.findElements(By.xpath("(//div[@class=\"sc-gsTCUz bhdLno\"]//h3)[" + (headerValue + 1) + "]//following::div[@class=\"sc-3751lm-2 kqiyzi large\"]"));
                    List<WebElement> list2 = driver.findElements(By.xpath("(//div[@class=\"sc-gsTCUz bhdLno\"]//h3)[" + (headerValue + 2) + "]//preceding::div[@class=\"sc-3751lm-2 kqiyzi large\"]"));
                    list2.retainAll(list1);
                    products=list2;
                }
                    System.out.println(products.size());

                for (WebElement product : products) {

                    if (product.isDisplayed())
                        System.out.println(product.getText()+headers.get(headerValue));
                }
                System.out.println(loop + "is done-------------------------");
                if (swiper.isDisplayed())
                    swiper.click();
                else {
                    break;
                }
                loop++;
            }

            //   i.getAndIncrement();
            // System.out.println(i.get());
        }

    }

}
