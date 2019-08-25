package TestCases;

import Config.config;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ActionPage.dashboardAction;
import ActionPage.donationFormAction;
import ActionPage.summaryPageAction;

/**
 * Created by IT040817 on 8/23/2019.
 */
public class testcase extends config {

    dashboardAction da;
    donationFormAction dfa;
    summaryPageAction spa;

    @BeforeTest
    public void startUp(){
        initialize();
        da = new dashboardAction();
        dfa = new donationFormAction();
        spa = new summaryPageAction();

    }
    
    @Test
    public void donationBNITrf() throws InterruptedException {

       
       da.scrolltoBanner();
       //da.clickFirstCampaign();
       da.clickNonOrganizationCampaign();
       da.clickBtnDonasi();

       dfa.typeTxtBoxAmmount();
       dfa.clickPaymentMethod();
       dfa.clickTrfBNI();
       dfa.txtBoxName();
       dfa.clickEmailOrWa();
       
    try{
       if(dfa.isRelationDisplayed()){
           System.out.println("Masuk Ke sini");
           dfa.RelationCampaign(); 
           
       }
       dfa.clickBtnPayment();
       Assert.assertEquals(spa.valPembayaran(), "Instruksi Pembayaran", "Fail!"); 
    
    }
    catch(Exception e){
        System.out.println("Lari ke Catch");
    }
        
       
    }

    


    @AfterTest
    public void quit(){
        DriverQuit();
    }

}
