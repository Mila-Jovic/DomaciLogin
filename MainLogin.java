import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainLogin {
    /* Domaći:
Otići na https://www.stealmylogin.com/demo.html, uneti bilo koje kredencijale za login, prisisnuti dugme.
Izvršiti proveru da je, nakon logina, URL promenjen na https://example.com/ kroz grananje. Ako jeste, štampati “Nice”.
Ako nije, štampati “Not nice.”
Sve elemente koji se koriste smestiti u intuitivno imenovane promenljive.
Kod na git, screen recording puštanja i izvršavanja testa na Drive.*/
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mila-\\Desktop\\EXE file\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.stealmylogin.com/demo.html");
        WebElement userName = driver.findElement(By.xpath("/html/body/form/input[1]"));
        userName.click();
        userName.sendKeys("jaSamJasna");

        WebElement password = driver.findElement(By.xpath("/html/body/form/input[2]"));
        password.click();
        password.sendKeys("asdfasdf");

        WebElement login = driver.findElement(By.xpath("/html/body/form/input[3]"));
        login.click();
        String currentURL = driver.getCurrentUrl();
        String expectedUrl = "https://example.com/";
        if (currentURL.equals(expectedUrl)) {
            System.out.println("Nice!");
        } else {
            System.out.println("Not nice!" + " "+ currentURL);

        }


    }
}
