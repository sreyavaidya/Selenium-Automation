package demo;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailAutomation {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

WebDriverWait wait = new WebDriverWait(driver, 10);

driver.get("https://mail.google.com/mail/u/0/#inbox");

driver.findElement(By.id("identifierId")).sendKeys("testing123@gmail.com");

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));

wait.until(ExpectedConditions.elementToBeClickable(password));

password.sendKeys("Abc123@");

driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();

driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
driver.findElement(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/textarea[1]")).sendKeys("testing123@gmail.com");
driver.findElement(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("Testing");
driver.findElement(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]")).sendKeys("This is simply a testing operation.");
driver.findElement(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[1]")).click();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
System.out.println("success");
//driver.quit();
}
}


