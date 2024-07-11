package ObjectsPath;

// Import necessary classes from Selenium
import org.openqa.selenium.By;


// Define the TestHome class
public class TestHome {

    public static final By Language= By.xpath("/html/body/main/div/nav[2]/div[2]/button[1]");

    public static final By BootCampsAndCourses= By.xpath("//a[contains(text(),'Bootcamps and Courses')]");

    public static final By FilterIcon= By.xpath("//img[@src=\"/img/filter.svg\"]");

    public static final By SearchFieldInFilter = By.xpath("//input[@type='search']");

    public static final By RegionFilter = By.xpath("//select[@id='regionSelect']");

    public static final By RiyadhRegion = By.xpath("//option[text()='الرياض']");

    public static final By SelectCategoryProgarms = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[2]/button[2]/span[2]");


    //for udacity

//    //  Locator for the email address input field in the login form
//    public static final By SearchInputBar = By.xpath("//*[@class='chakra-input__left-element css-1vkhotd']//following::input[@role='searchbox'][2]");
//
//    //Locator for the password input field in the login form
//
//
//    // Locator for the sign in button in the login form
//    public static final By OptionInBusinessElement = By.xpath("//*[@href='https://www.udacity.com/enterprise/overview']");
//
//    //Locator for an element to assert upon successful login

}
