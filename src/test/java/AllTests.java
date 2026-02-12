import basePage.BaseClass;
import mainPage.SignUp;
import org.testng.annotations.Test;
import java.lang.Thread;
public class AllTests extends BaseClass {
  @Test
    public void Login(){
      SignUp spg= new SignUp(driver);
      spg.clickOnLoginButton();
      spg.clickOnSignUpButton();
      spg.setTickButton();
      spg.clickOnContinueButton();
      spg.enterFirstName("Shruti");
      spg.enterLastName("Gupta");
      spg.enterEmail("qa98241@gmail.com");
      spg.enterPhoneNumber("9840030389");
      spg.enterPassword("aBc12345@");
      spg.enterConfirmPassword("aBc12345@");
      spg.clickOnNextButton();
      try {
      Thread.sleep(60000);
        } catch (InterruptedException e) {
      e.printStackTrace();
    }
      spg.enterAgencyName("ABC company");
      spg.enterRoleInAgency("QA");
      spg.enterEmailId("abc123@gmail.com");
      spg.enterWebsite("google.com");
      spg.enterWebsiteAddress("Kathmandu");
      spg.clickOnRegionOfOperation();
      spg.clickOnAustralia();
      spg.clickOnNextButton();
      try {
          Thread.sleep(1000);
          }
      catch (InterruptedException e)
      {
         e.printStackTrace();
      }
      spg.clickOnYearsOfExperience();
      spg.enterRecruitedStudents("20");
      spg.enterFocusedArea("Undergraduate admission to aus");
      spg.enterSuccessMetrices("90");
      spg.tickService();
      spg.clickOnNextIcon();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
      spg.enterBusinessRegNum("0419874655777");
      spg.clickOnPreferredCountries();
      spg.clickOnUSA();
      spg.chooseInstitute();
      spg.enterCertificationDetails("ICEF Certified QA");
      spg.uploadDocument("C://Users//absolute//IdeaProjects//project_vrit//QAFile.pdf");
      spg.clickOnSubmit();






  }

}
