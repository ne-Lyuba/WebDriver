package Hometask12;

import configuration.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeTask extends BaseClass {
    static private final String mainURL = "https://ithillel.ua//";


    public static void main(String[] args) throws InterruptedException {
        driver.get(mainURL);
        // search the consultation button and  click on it
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"btn-consultation-hero\"]"));
        searchButton.click();
        Thread.sleep(1000);

        // Enter the name on form
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"input-name-consultation\"]"));
        userName.sendKeys("Test Name");
        Thread.sleep(1000);

        // Enter email
        WebElement userEmail = driver.findElement(By.xpath("//*[@id=\"input-email-consultation\"]"));
        userEmail.sendKeys("testmail@gmail.com");
        Thread.sleep(1000);

        // Enter phone number
        WebElement userPhone = driver.findElement(By.xpath("//*[@id=\"input-tel-consultation\"]"));
        userPhone.sendKeys("666666620");
        Thread.sleep(1000);

        // Choose the telegram button
        WebElement socailInput = driver.findElement(By.xpath("//*[@id=\"field-messenger-consultation\"]/div/div/div/div[2]/button[1]"));
        socailInput.click();
        Thread.sleep(1000);

        // Enter telegram account
        WebElement telegramInput = driver.findElement(By.xpath("//*[@id=\"field-messenger-consultation\"]/div/div/div/div[1]/div/div[2]/input"));
        telegramInput.sendKeys("https://t.me/test");
        Thread.sleep(1000);

        // Click on courses dropdown list
        WebElement schoolCousrse = driver.findElement(By.xpath("//*[@id=\"listbox-btn-input-course-consultation\"]"));
        schoolCousrse.click();
        WebElement courseSearch = driver.findElement(By.xpath("//*[@id=\"container-input-course-consultation\"]/div/div/input"));
        courseSearch.click();
        Thread.sleep(1000);

        // Search by phrase
        courseSearch.sendKeys("QA Automation ");
        Thread.sleep(1000);

        // Click on chosen variant
        WebElement qaAutomation = driver.findElement(By.xpath("//*[@id=\"container-input-course-consultation\"]/div/ul"));
        qaAutomation.click();
        Thread.sleep(1000);

        // Agree with privacy policy
        WebElement agreeCheckmark = driver.findElement(By.xpath("//*[@id=\"form-consultation\"]/div[1]/footer/div[1]/label/span"));
        agreeCheckmark.click();

        Thread.sleep(2000);
        driver.quit();
    }

}
