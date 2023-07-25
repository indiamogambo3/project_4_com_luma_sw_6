package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OvernightDufflePage extends Utility {

    private static final Logger log = LogManager.getLogger(OvernightDufflePage.class.getName());

    public OvernightDufflePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Overnight Duffle')]")
    WebElement overnightDuffle;
    @CacheLookup
    @FindBy(id = "qty")
    WebElement quantity;
    @CacheLookup
    @FindBy(id = "product-addtocart-button")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind = 'html: $parent.prepareMessageForHtml(message.text)']")
    WebElement duffleBagAddedToShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLink;

    public String verifyOvernightDuffleText() {
        log.info("Verifying overnight duffle text: " + overnightDuffle.toString());
        return getTextFromElement(overnightDuffle);
    }

    public void clearQuantity() {
        log.info("Clearing the quantity: ");
        driver.findElement(By.id("qty")).clear();
    }

    public void inputQuantity(String number) {
        log.info("Inputing quantity: " + quantity.toString());
        sendTextToElement(quantity, number);
    }

    public void clickOnAddToCartButton() {
        log.info("Clicking on add to cart button: " + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String verifyDuffleBagAddedToCartText() {
        log.info("Verifying duffle bag added to cart text: " + duffleBagAddedToShoppingCart.toString());
        return getTextFromElement(duffleBagAddedToShoppingCart);
    }

    public void clickOnShoppingCartLinkInMessage() {
        log.info("Clicking on shopping cart link in message: " + shoppingCartLink.toString());
        clickOnElement(shoppingCartLink);
    }

}
