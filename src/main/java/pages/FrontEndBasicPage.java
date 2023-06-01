package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.*;

public class FrontEndBasicPage {
    @FindBy(className = "course-descriptor_header-text")
    private WebElement pageTitle;

    @FindBy(className = "course-rating")
    private WebElement courseRating;

    @FindBy(className = "introduction-info_content")
    private WebElement courseDescription;


    @FindBy(className = "coach-card_name")
    private List<WebElement> coachesListNames;

    @FindBy(className = "block-profession_group")
    private WebElement blockProfession;


    @FindBy(className = "coaches_show")
    private WebElement coachesShowButton;

    public WebElement getPageTitle() {
        return pageTitle;
    }

    public WebElement getBlockProfession() {
        return blockProfession;
    }

    public WebElement getCoachesShowButton() {
        return coachesShowButton;
    }

    public String getCourseTitleText() {
        return pageTitle.getText();
    }

    public String getCourseRatingText() {
        return courseRating.getText();
    }

    public String getCourseDescription() {
        return courseDescription.getText();
    }

    public WebElement getFirstCoache() {
        return coachesListNames.get(0);
    }

    public List<String> getCoachesList() {
        List<String> coaches = new LinkedList<String>();
        for (WebElement coache : coachesListNames) {
            coaches.add(coache.getText());
        }
        return coaches;
    }
}


