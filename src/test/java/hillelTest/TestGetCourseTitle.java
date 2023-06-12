package hillelTest;

import configuration.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.FrontEndBasicPage;
import java.time.Duration;
import java.util.List;

public class TestGetCourseTitle extends BaseClass {
    static FrontEndBasicPage frontEndPage = null;

    @BeforeClass
    public static void startSite() {
        driver.get("https://kyiv.ithillel.ua/courses/front-end-basic");
        frontEndPage = PageFactory.initElements(driver, FrontEndBasicPage.class);
        preparePage();
    }

    @Test
    public void getCourseTitle() {
        String courseTitle = frontEndPage.getCourseTitleText();
        System.out.println("Course Title: " + courseTitle);
    }

    @Test
    public void getCourseRate() {
        String courseRate = frontEndPage.getCourseRatingText();
        System.out.println("Course Rate: " + courseRate);
    }

    @Test
    public void getCourseDescription() {
        String courseDescriptionText = frontEndPage.getCourseDescription();
        System.out.println("Course description: " + courseDescriptionText);
    }

    @Test
    public void getListCoachesNames() {
        List<String> coachesNames = frontEndPage.getCoachesList();
        for (String name : coachesNames) {
            System.out.println("Coach Name: " + name);
        }

    }

    private static void preparePage() {
        scrollToElement(frontEndPage.getBlockProfession());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        scrollToElement(frontEndPage.getFirstCoache());
        frontEndPage.getCoachesShowButton().click();
    }

    private static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}



