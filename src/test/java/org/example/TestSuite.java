package org.example;


import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage= new RegisterPage();
    RegisterResultPage registerResultPage= new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    Electronics electronics = new Electronics();
    CameraAndPhoto cameraAndPhoto = new CameraAndPhoto();
    LeicaTMirrorlessDigitalCamera leicaTMirrorlessDigitalCamera=new LeicaTMirrorlessDigitalCamera();
    ProductEmailAFriend productEmailAFriend =new ProductEmailAFriend();
    BuildYourownComputer buildYourownComputer = new BuildYourownComputer();
    ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void verifyusershouldbeabletoregistersuccessfully() {
        //click on Register button
        homePage.clickonregisterbutton();
        //Enter Registration Details
        registerPage.registrationDetails();
        //Verify user Register successfully
        registerResultPage.userRegisteredSuccessfully();
    }

    @Test
    public void verifyregisteredusershouldbeablereferaproducttofriendbyemail(){
        //click on Register button
        homePage.clickonregisterbutton();
        //Enter Registration Details
        registerPage.registrationDetails();
        //Verify user Register successfully
        registerResultPage.userRegisteredSuccessfully();
        //click On Electronics
        homePage.clickOnElectronics();
        //Click On Camera & Photo
        electronics.clickOnCameraAndPhoto();
        //Click On Product
        cameraAndPhoto.ClickOnProduct();
        //Click On Email A Friend
        leicaTMirrorlessDigitalCamera.clickOnEmailAFriend();
        //Refer A Product To friend By Email
        productEmailAFriend.productReferAFriend();
    }
    @Test
    public void veryfyuesrshouldbeabletoaddtocartprodut(){
        //Select a product
        homePage.clickOnFeaturedproducts();
        //build your own computer
        buildYourownComputer.custmiseYourComputer();
        //verify correct product added
        shoppingCart.addtocartproduct();

    }

}

