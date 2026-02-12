package mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
    private WebDriver driver;
    private By loginButton = By.xpath("//p[text()='Login']");
    private By signUpButton = By.xpath("//a[@class='text-primary hover:underline']");
    private By tickButton = By.xpath("//button[@type='button']");
    private By continueButton = By.xpath("//button[text()='Continue']");
    private By firstNameField = By.xpath("//input[@name='firstName']");
    private By lastNameField = By.xpath("//input[@name='lastName']");
    private By emailField =By.xpath("//input[@type='email']");
    private By numberField = By.xpath("//input[@name='phoneNumber']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By confirmPasswordField = By.xpath("//input[@name='confirmPassword']");
    private By nextButton = By.xpath("//button[@type='submit']");
    private By agencyNameField = By.xpath("//input[@name='agency_name']");
    private By roleField = By.xpath("//input[@name='role_in_agency']");
    private By emailFieldd =By.xpath("//input[@type='email']");
    private By websiteField = By.xpath("//input[@name='agency_website']");
    private By agencyAddress = By.xpath("//input[@name='agency_address']");
    private By regionOfOperation = By.xpath("//span[text()='Select Your Region of Operation']");
    private By australia = By.xpath("//div[contains (@class,'cursor-pointer')][.//span='Australia']");
    private By yearsOfExperience = By.xpath("//button[@role='combobox']");
    private  By threeYear = By.xpath("//option[text()='3 years']");
    private By recruitedStudents = By.xpath("//input[@name='number_of_students_recruited_annually']");
    private By focusArea = By.xpath("//input[@name='focus_area']");
    private By successMetrices = By.xpath("//input[@name='success_metrics']");
    private By servicesProvided = By.xpath("(//button[@role='checkbox'])[1]");
    private By nextButtonn = By.xpath("//button[text()='Next']");
    private By businessRegNum = By.xpath("//input[@placeholder='Enter your registration number']");
    private By preferredCountries = By.xpath("//button[@data-state='closed']");
    private By unitedStates=By.xpath("//span[text()='United States of America']");
    private By institute = By.xpath("(//button[@role='checkbox'])[1]");
    private By certificationDetails = By.xpath("//input[@name='certification_details']");
    private By uploadInput = By.xpath("(//input[@type='file'])[1]");
    private By submitButton = By.xpath("//button[text()='Submit']");









    public SignUp(WebDriver driver){

        this.driver = driver;
    }
    public void clickOnLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void clickOnSignUpButton(){

        driver.findElement(signUpButton).click();
    }
    public void setTickButton(){

        driver.findElement(tickButton).click();
    }
    public void clickOnContinueButton(){

        driver.findElement(continueButton).click();
    }
    public void enterFirstName(String FirstName){

        driver.findElement(firstNameField).sendKeys(FirstName);
    }
    public void enterLastName(String LastName){

        driver.findElement(lastNameField).sendKeys(LastName);
    }
    public void enterEmail(String Email){

        driver.findElement(emailField).sendKeys(Email);
    }
    public void enterPhoneNumber(String PhoneNumber){

        driver.findElement(numberField).sendKeys(PhoneNumber);
    }
    public void enterPassword(String Password){

        driver.findElement(passwordField).sendKeys(Password);
    }
    public void enterConfirmPassword(String ConfirmPassword){
        driver.findElement(confirmPasswordField).sendKeys(ConfirmPassword);
    }
    public void clickOnNextButton(){

        driver.findElement(nextButton).click();
    }
    public void enterAgencyName(String Name){

        driver.findElement(agencyNameField).sendKeys(Name);
    }
    public void enterRoleInAgency(String Role){

        driver.findElement(roleField).sendKeys(Role);
    }
    public void enterEmailId(String Email){

        driver.findElement(emailFieldd).sendKeys(Email);
    }
    public void enterWebsite(String Website){

        driver.findElement(websiteField).sendKeys(Website);
    }
    public void enterWebsiteAddress(String Address){

        driver.findElement(agencyAddress).sendKeys(Address);
    }
    public void clickOnRegionOfOperation(){

        driver.findElement(regionOfOperation).click();
    }
    public void clickOnAustralia(){

        driver.findElement(australia).click();
    }
    public void clickOnYearsOfExperience() {
        driver.findElement(yearsOfExperience).click();
        driver.findElement(threeYear).click();
    }
    public void enterRecruitedStudents(String Number){
        driver.findElement(recruitedStudents).sendKeys(Number);
    }
    public void enterFocusedArea(String Focusarea){
        driver.findElement(focusArea).sendKeys(Focusarea);
    }
    public void enterSuccessMetrices(String Percent){
        driver.findElement(successMetrices).sendKeys(Percent);
    }
    public void tickService(){
        driver.findElement(servicesProvided).click();
    }
    public void clickOnNextIcon(){
        driver.findElement(nextButtonn).click();
    }
    public void enterBusinessRegNum(String Regnumber){
        driver.findElement(businessRegNum).sendKeys(Regnumber);
    }
    public void chooseInstitute(){
        driver.findElement(institute).click();
    }
    public void enterCertificationDetails(String Details){
        driver.findElement(certificationDetails).sendKeys(Details);
    }
    public void clickOnPreferredCountries(){
        driver.findElement(preferredCountries).click();
    }

    public void clickOnUSA() {
        driver.findElement(unitedStates).click();
    }

    public void uploadDocument(String filePath) {
        driver.findElement(uploadInput).sendKeys(filePath);
    }
    public void clickOnSubmit(){
        driver.findElement(submitButton).click();
    }
}
