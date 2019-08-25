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
    
    //@Test
    //Test Scenario BNI
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
           dfa.RelationCampaign(); 
           
       }
       dfa.clickBtnPayment();
       Assert.assertEquals(spa.valPembayaran(), "Instruksi Pembayaran", "Fail!"); 
    
        }
    catch(Exception e){
    }
    }

    //Test Scenario BRI
    public void donationBRITrf() throws InterruptedException {
        da.scrolltoBanner();
        //da.clickFirstCampaign();
        da.clickNonOrganizationCampaign();
        da.clickBtnDonasi();
 
        dfa.typeTxtBoxAmmount();
        dfa.clickPaymentMethod();
        dfa.clickTrfBRI();
        dfa.txtBoxName();
        dfa.clickEmailOrWa();
        
     try{
        if(dfa.isRelationDisplayed()){
            dfa.RelationCampaign(); 
            
        }
        dfa.clickBtnPayment();
        Assert.assertEquals(spa.valPembayaran(), "Instruksi Pembayaran", "Fail!"); 
     
     }
     catch(Exception e){
     }
         
        
     }


     //Test Scenario BCA
     public void donationBCATrf() throws InterruptedException {
        da.scrolltoBanner();
        //da.clickFirstCampaign();
        da.clickNonOrganizationCampaign();
        da.clickBtnDonasi();
 
        dfa.typeTxtBoxAmmount();
        dfa.clickPaymentMethod();
        dfa.clickTrfBCA();
        dfa.txtBoxName();
        dfa.clickEmailOrWa();
        
     try{
        if(dfa.isRelationDisplayed()){
            dfa.RelationCampaign(); 
            
        }
        dfa.clickBtnPayment();
        Assert.assertEquals(spa.valPembayaran(), "Instruksi Pembayaran", "Fail!"); 
     
     }
     catch(Exception e){
     }
         
        
     }


    //Test Scenario Mandiri     
     public void donationMandiriTrf() throws InterruptedException {
        da.scrolltoBanner();
        //da.clickFirstCampaign();
        da.clickNonOrganizationCampaign();
        da.clickBtnDonasi();
 
        dfa.typeTxtBoxAmmount();
        dfa.clickPaymentMethod();
        dfa.clickTrfMandiri();
        dfa.txtBoxName();
        dfa.clickEmailOrWa();
        
     try{
        if(dfa.isRelationDisplayed()){
            dfa.RelationCampaign(); 
            
        }
        dfa.clickBtnPayment();
        Assert.assertEquals(spa.valPembayaran(), "Instruksi Pembayaran", "Fail!"); 
     
     }
     catch(Exception e){
     }
         
        
     }
    @Test
        //Test Scenario Mandiri     
        public void donationBNISTrf() throws InterruptedException {
            da.scrolltoBanner();
            //da.clickFirstCampaign();
            da.clickNonOrganizationCampaign();
            da.clickBtnDonasi();
     
            dfa.typeTxtBoxAmmount();
            dfa.clickPaymentMethod();
            dfa.clickTrfBNIS();
            dfa.txtBoxName();
            dfa.clickEmailOrWa();
            
         try{
            if(dfa.isRelationDisplayed()){
                dfa.RelationCampaign(); 
                
            }
            dfa.clickBtnPayment();
            Assert.assertEquals(spa.valPembayaran(), "Instruksi Pembayaran", "Fail!"); 
         
         }
         catch(Exception e){
         }
             
            
         } 


    @AfterTest
    public void quit(){
        DriverQuit();
    }

}
