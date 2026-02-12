//package mainPage;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class AgencyDetailsPage {
//    private WebDriver driver;
//    private By agencyNameField = By.xpath("private WebDriver driver;");
//    private By roleField = By.xpath("//input[@name='role_in_agency']");
//    private By emailField =By.xpath("//input[@type='email']");
//    private By websiteField = By.xpath("//input[@name='agency_website']");
//    private By agencyAddress = By.xpath("//input[@name='agency_address']");
//    private By regionOfOperation = By.xpath("//span[text()='Select Your Region of Operation']");
//    private By australia = By.xpath("//div[contains (@class,'cursor-pointer')][.//span='Australia']");
//    public AgencyDetailsPage(WebDriver driver){
//
//        this.driver=driver;
//    }
//    public void enterAgencyName(String Name){
//        driver.findElement(agencyNameField).sendKeys(Name);
//    }
//    public void enterRoleInAgency(String Role){
//        driver.findElement(roleField).sendKeys(Role);
//    }
//    public void enterEmail(String Email){
//        driver.findElement(emailField).sendKeys(Email);
//    }
//    public void enterWebsite(String Website){
//        driver.findElement(websiteField).sendKeys(Website);
//    }
//    public void enterWebsiteAddress(String Address){
//        driver.findElement(agencyAddress).sendKeys(Address);
//    }
//    public void clickOnRegionOfOperation(){
//        driver.findElement(regionOfOperation).click();
//    }
//    public void clickOnAustralia(){
//        driver.findElement(australia).click();
//    }
//
//
//}
