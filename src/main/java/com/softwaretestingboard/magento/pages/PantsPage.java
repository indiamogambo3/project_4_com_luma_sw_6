package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PantsPage extends Utility {

    private static final Logger log = LogManager.getLogger(PantsPage.class.getName());

    public PantsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "option-label-size-143-item-175")
    WebElement size32;
    @CacheLookup
    @FindBy(id = "option-label-color-93-item-49")
    WebElement colorBlack;
    @CacheLookup
    @FindBy(xpath = "//li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind = 'html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyAddedToCart;
    @CacheLookup
    @FindBy(xpath = "//a[(text() = 'shopping cart')]")
    WebElement clickOnCartInMessage;

    public void mouseHoverAndClickOnSize32() {
        log.info("Mouse hovering and clicking on size 32: " + size32.toString());
        mouseHoverToElementAndClick(size32);
    }

    public void mouseHoverAndClickOnBlack() {
        log.info("Mouse hovering and clicking black: " + colorBlack.toString());
        mouseHoverToElementAndClick(colorBlack);
    }

    public void mouseHoverAndClickOnAddToCartButton() {
        log.info("Mouse hovering and clicking on add to cart button: " + addToCart.toString());
        mouseHoverToElementAndClick(addToCart);
    }

    public String verifyAddedToCartText() {
        log.info("Verifying added to cart text: " + verifyAddedToCart.toString());
        return getTextFromElement(verifyAddedToCart);
    }

    public void clickOnShoppingCartInMessage() {
        log.info("Clicking on shopping cart link in message: " + clickOnCartInMessage.toString());
        clickOnElement(clickOnCartInMessage);
    }

}
