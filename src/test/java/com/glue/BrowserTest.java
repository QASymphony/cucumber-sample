package com.glue;
import com.utils.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BrowserTest {
    private WebDriver driver;

    @Given("^I am on the QASymphony website$")
    public void navigateToQASymphonySite() {
        driver = TestUtil.openChromeBrowser("https://www.qasymphony.com/");
    }

    @When("^I search for \"(.*)\"$")
    public void searchFor(String query) {
        WebElement searchIconElement = driver.findElement(By.xpath("//*[@id=\"page\"]/header/div/div[2]/div/div/div[3]/div/div/form/button"));
        searchIconElement.click();
        WebElement searchInputElement = driver.findElement(By.xpath("//*[@id=\"page\"]/header/div/div[2]/div/div/div[3]/div/div/form/label/input"));

        searchInputElement.sendKeys(query);
        searchInputElement.submit();
    }

    @Then("^I should see qTest Launch item on the Search Result page$")
    public void checkSearchResult() {
        final WebElement qTestLaunchBoxElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/article[5]/a]"));
        new WebDriverWait(driver,10L).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return qTestLaunchBoxElement.isDisplayed();
            }
        });
        driver.quit();
    }
}
