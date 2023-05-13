package hillelTest;

import configuration.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class HomeTask13 extends BaseClass {
//    static private final String mainURL = "https://ithillel.ua//";

    @BeforeClass
    public static void startSite() {
        driver.get("https://ithillel.ua//");
        driver.manage().window().maximize();
    }

    @Test
    public void testGettingListOfFETeachers() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]/button")).click();

        clickOnCoursesDropdown();
        Thread.sleep(2000);
        chooseFrontEndCourse();
        selectFrontEndLevel();
        printTeachersBlock();
    }


    private void clickOnCoursesDropdown() {
        WebElement programmingButton = driver.findElement(By.cssSelector("button[data-category=\"programming\"]"));
        programmingButton.click();
    }

    private void chooseFrontEndCourse() {
        WebElement courseButton = driver.findElement(By.cssSelector("button[data-value=\"front-end\"]"));
        courseButton.click();

    }

    private void selectFrontEndLevel() {
        WebElement searchedCourse = driver.findElement(By.cssSelector("ul[data-id=\"front-end\"]"));
        List<WebElement> courseLevels = searchedCourse.findElements(By.className("course-list_item"));
        for (WebElement li : courseLevels) {
            if (li.getText().equals("Front-end Basic\nBASIC")) {
                li.click();
                break;
            }
        }
    }

    private void printTeachersBlock() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.className("cookie-ntf_agreement")).click();

        WebElement teachersBlock1 = driver.findElement(By.id("programmeHeader"));
        Actions actions = new Actions(driver);
        actions.moveToElement(teachersBlock1);
        actions.perform();
        Thread.sleep(3000);

        WebElement teachersBlock = driver.findElement(By.id("coachesSection"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(teachersBlock);
        actions1.perform();

        WebElement showAllButton = driver.findElement(By.id("coachesShowAllButton"));
        showAllButton.click();


        List<WebElement> teachersList = teachersBlock.findElements(By.className("coach-card_name"));
        for (WebElement teacher : teachersList) {
            System.out.println(teacher.getText());

        }


    }

}


