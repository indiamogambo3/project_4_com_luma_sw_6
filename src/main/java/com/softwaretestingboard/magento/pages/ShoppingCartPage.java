package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class = 'base']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//td[1]/div[1]/strong[1]/a[1]")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size32;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement colourBlack;
    @CacheLookup
    @FindBy(xpath = "/div[@class = 'control qty']//input[@type= 'number']")
    WebElement totalQuantity;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/span[1]/span[1]/span[1]")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/label[1]/input[1]")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@class = 'action update']")
    WebElement updateCart;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[4]/span[1]/span[1]/span[1]")
    WebElement updateTotal;

    public String verifyShoppingCartText() {
        log.info("Verifying shopping cart text: " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public String verifyProductName() {
        log.info("Mouse product name: " + productName.toString());
        return getTextFromElement(productName);
    }

    public String verifyProductSize32() {
        log.info("Verifying product size 32: " + size32.toString());
        return getTextFromElement(size32);
    }

    public String verifyColourBlack() {
        log.info("Verifying colour black: " + colourBlack.toString());
        return getTextFromElement(colourBlack);
    }

    public String verifyTotalPrice() {
        log.info("Verifying total price: " + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    public void clearQuantity() {
        log.info("Clearing quantity: ");
        driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/label[1]/input[1]")).clear();
    }

    public void inputQuantity(String number) {
        log.info("Inputting quantity: " + quantity.toString());
        sendTextToElement(quantity, number);
    }

    public void clickOnUpdateShoppingCartButton() {
        log.info("Clicking on update shopping cart button: " + updateCart.toString());
        clickOnElement(updateCart);
    }

    public String verifyTotal() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Verifying total: " + updateTotal.toString());
        return getTextFromElement(updateTotal);
    }

}
