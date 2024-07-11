package Pages;

// Import necessary classes from Selenium and TestNG
import org.openqa.selenium.*;
import org.testng.Assert;

import static ObjectsPath.TestHome.*; // Import all static fields (locators) from TestHome class

// Define the TestPages class
public class TestPages {
    WebDriver driver = null; // Declare WebDriver instance variable

    // Constructor to initialize WebDriver instance
    public TestPages(WebDriver driver) {
        this.driver = driver; // Assign WebDriver instance from parameter to local driver variable
    }

    // Method to open GitHub homepage
    public void OpenUrl() {
        driver.get("https://tuwaiq.edu.sa/"); // Navigate to GitHub URL
    }

    public void ChangeLanguage() {
        WebElement EnglishLanguage = driver.findElement(Language); // Find login button element
        EnglishLanguage.click(); // Click on the login button
    }

    public void ClickOnBootCampsAndCourses() {
        WebElement Courses = driver.findElement(BootCampsAndCourses);
        Courses.click();
    }

    public void ClickOnFilterIcon() {
        WebElement Filter = driver.findElement(FilterIcon);
        Filter.click();
    }

    public void ClickOnSearchInFilter() {
        WebElement searchBox = driver.findElement(SearchFieldInFilter); // Replace with actual ID or selector
        searchBox.sendKeys("علم");
        //  driver.findElement(SearchFieldInFilter).sendKeys("علم"); // Search for data

    }

    public void RegionFilterField() {
        WebElement Region = driver.findElement(RegionFilter);
        Region.click();
    }

    public void SelectFromRegion() {
        WebElement SelectRegion = driver.findElement(RiyadhRegion);
        SelectRegion.click();
    }

    public void SelectCategory() {
        WebElement Category = driver.findElement(SelectCategoryProgarms);
        Category.click();

    }
    public void ScrollToPosition(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0], arguments[1]);", x, y);
    }
}








//    //    // Method to click on the Business
//    public void BusinessList() {
//        WebElement Business = driver.findElement(BusinessElement); // Find login button element
//        Business.click(); // Click on the login button
//    }
//
//    public void BusinessListSelect() {
//        WebElement BusinessSelect = driver.findElement(OptionInBusinessElement); // Find login button element
//        BusinessSelect.click(); // Click on the login button
//    }
//
//
//    // Method to click on the login button on the home page
//    public void SearchBar() {
//        WebElement SearchIcon = driver.findElement(SearchBarElement); // Find login button element
//        SearchIcon.click(); // Click on the login button
//}


//    // Method to enter login credentials and verify login
//    public void SearchData() throws InterruptedException {
//        driver.findElement(SearchInputBar).sendKeys("data"); // Search for data
//        //Thread.sleep(1000); // Pause execution for 3000 milliseconds (not recommended; use explicit waits instead)
//        driver.findElement(SearchInputBar).sendKeys(Keys.ENTER); // Find password field and enter password
//        //driver.findElement(signInBtn).click(); // Click on sign-in button

        //  boolean homepageview = driver.findElement(assertionUponLogin).isDisplayed(); // Check if assertion element is displayed
        // Assert.assertTrue(homepageview, "home page is not displayed!"); // Assert that homepageview is true
  //


