/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.pages;

import static com.codeborne.selenide.Selenide.sleep;
import com.codeborne.selenide.SelenideElement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.support.FindBy;
import se.nackademin.librarytest.helpers.NavigationHelper;

/**
 *
 * @author testautomatisering
 */
public class MenuPage extends PageBase{
    private static final Logger LOG =  Logger.getLogger(MenuPage.class.getName());
    @FindBy(css = "#side-menu-link-add-user")
    private SelenideElement addUser;
    @FindBy(css = "#side-menu-link-sign-in")
    private SelenideElement signIn;
    @FindBy(css = "#side-menu-link-my-profile")
    private SelenideElement myProfile;
    @FindBy(css ="#side-menu-link-browse-books")
    private SelenideElement browseBooks;
    @FindBy(css ="#side-menu-link-browse-authors")
    private SelenideElement browseAuthors;
    @FindBy(css ="#side-menu-link-add-author")
    private SelenideElement addAuthor;
    
    
    public void navigateToBrowseBooks(){
        clickButton("the browse books link", browseBooks);
        sleep(500);
    }
    
    public void navigateToBrowseAuthors(){
        clickButton("the browse authors link", browseAuthors);
        sleep(500);
    }
    
    public void navigateToAddUser(){
        clickButton("the add user link", addUser);
        sleep(500);
    }
    
    public void navigateToSignIn(){
        clickButton("the sign in link", signIn);
        sleep(500);
    }
    
    public void navigateToMyProfile(){
        clickButton("the my profile link", myProfile);
        sleep(500);
    }
    
    public void navigateToAddAuthor(){
        clickButton("the add author link", addAuthor);
        sleep(500);
    }
    
    public void navigateToBook(String bookTitle){
        LOG.log(Level.INFO, "Navigating to the bookpage for book titled: {0}", bookTitle);
        NavigationHelper.goToBook(bookTitle);
        sleep(500);
    }
    
    public void navigateToAuthor(String authorFullName){
        LOG.log(Level.INFO, "Navigating to the authorpage for author named: {0}", authorFullName);
        NavigationHelper.goToAuthor(authorFullName);
        sleep(500);
    }
    
}
