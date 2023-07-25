package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Women')]")
    WebElement hoverOnWomenMenu;
    @CacheLookup
    @FindBy(id = "ui-id-9")
    WebElement hoverOnTops;
    @CacheLookup
    @FindBy(id = "ui-id-11")
    WebElement jackets;
    @CacheLookup
    @FindBy(id = "ui-id-5")
    WebElement menMenu;
    @CacheLookup
    @FindBy(id = "ui-id-18")
    WebElement bottoms;
    @CacheLookup
    @FindBy(id = "ui-id-23")
    WebElement pants;
    @CacheLookup
    @FindBy(xpath = "//span[(text() = 'Gear')]")
    WebElement hoverOnGear;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Bags')]")
    WebElement selectBags;

    public void mouseHoverOnWomenMenu() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Mouse hovering on women menu: " + hoverOnWomenMenu.toString());
        mouseHoverToElement(hoverOnWomenMenu);
    }

    public void mouseHoverOnTops() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Mouse hovering on tops: " + hoverOnTops.toString());
        mouseHoverToElement(hoverOnTops);
    }

    public void clickOnJackets() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Clicking on jackets: " + jackets.toString());
        clickOnElement(jackets);
    }

    public void mouseHoverOnMenMenu() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Mouse hovering on men menu: " + menMenu.toString());
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottoms() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Mouse hovering on bottoms: " + bottoms.toString());
        mouseHoverToElement(bottoms);
    }

    public void clickOnPants() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Clicking on pants: " + pants.toString());
        clickOnElement(pants);
    }

    public void mouseHoverOnGearMenu() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Mouse hovering on gear menu: " + hoverOnGear.toString());
        mouseHoverToElement(hoverOnGear);
    }

    public void clickOnBags() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Clicking on bags: " + selectBags.toString());
        clickOnElement(selectBags);
    }

}
