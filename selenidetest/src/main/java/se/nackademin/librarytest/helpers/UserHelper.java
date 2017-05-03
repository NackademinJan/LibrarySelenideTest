/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.helpers;

import static com.codeborne.selenide.Selenide.page;
import se.nackademin.librarytest.pages.AddUserPage;
import se.nackademin.librarytest.pages.EditMyProfilePage;
import se.nackademin.librarytest.pages.MenuPage;
import se.nackademin.librarytest.pages.MyProfilePage;
import se.nackademin.librarytest.pages.SignInPage;

/**
 *
 * @author testautomatisering
 */
public class UserHelper {
    
    public static void createNewUser(String username, String password){
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToAddUser();
        
        AddUserPage addUserPage = page(AddUserPage.class);
        addUserPage.setUsername(username);
        addUserPage.setPassword(password);
        addUserPage.clickAddUserButton();
    }
    public static void logInAsUser(String username, String password){
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToSignIn();
        
        SignInPage signInPage = page(SignInPage.class);
        signInPage.setUsername(username);
        signInPage.setPassword(password);
        signInPage.clickLogin();
    }
    
    public static void logInAsAdmin(){
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToSignIn();
        
        SignInPage signInPage = page(SignInPage.class);
        signInPage.setUsername("admin");
        signInPage.setPassword("1234567890");
        signInPage.clickLogin();
    }
    
    public static void editCurrentUserProfileEmail(String email){
        MyProfilePage myProfilePage = page(MyProfilePage.class);
        myProfilePage.navigateToMyProfile();
        myProfilePage.clickEditUserButton();
        
        EditMyProfilePage editMyProfilePage = page(EditMyProfilePage.class);
        editMyProfilePage.setUserEmail(email);
        editMyProfilePage.clicksaveUserButton();
    }
    
    /* This method is commented out because only the admin account can remove users and can only remove themselves in the current UI, this is not something we want to do as part of a test
    public static void removeCurrentUserProfile(){
        MyProfilePage myProfilePage = page(MyProfilePage.class);
        myProfilePage.navigateToMyProfile();
        
        myProfilePage.clickDeleteUserButton();
        
    }
    */
}
