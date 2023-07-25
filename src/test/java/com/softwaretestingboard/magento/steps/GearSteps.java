package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OvernightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.softwaretestingboard.magento.browserfactory.ManageBrowser.driver;

public class GearSteps {
    @When("I mouse hover on gear menu")
    public void iMouseHoverOnGearMenu() throws InterruptedException {
        new HomePage().mouseHoverOnGearMenu();
    }

    @And("I click on bags")
    public void iClickOnBags() throws InterruptedException {
        new HomePage().clickOnBags();
    }

    @And("I click on product name overnight duffle")
    public void iClickOnProductNameOvernightDuffle() {
        new BagsPage().clickOnOvernightDuffle();
    }

    @And("I verify the text overnight duffle")
    public void iVerifyTheTextOvernightDuffle() {
        Assert.assertEquals(new OvernightDufflePage().verifyOvernightDuffleText(), "Overnight Duffle", "Unable to verify text.");
    }

    @And("I change the quantity to three")
    public void iChangeTheQuantityToThree() {
        new OvernightDufflePage().clearQuantity();
        new OvernightDufflePage().inputQuantity("3");
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new OvernightDufflePage().clickOnAddToCartButton();
    }

    @And("I verify the text You added Overnight Duffle to your shopping cart.")
    public void iVerifyTheTextYouAddedOvernightDuffleToYourShoppingCart() {
        Assert.assertEquals(new OvernightDufflePage().verifyDuffleBagAddedToCartText(), "You added Overnight Duffle to your shopping cart.", "Unable to verify text.");
    }

    @And("I verify the product name overnight duffle")
    public void iVerifyTheProductNameOvernightDuffle() {
        Assert.assertEquals(new ShoppingCartPage().verifyProductName(), "Overnight Duffle", "Unable to verify name.");
    }

    @And("I verify the quantity is three")
    public void iVerifyTheQuantityIsThree() {
        String actualQuantity = driver.findElement(By.xpath("//div[@class = 'control qty']//input[@type= 'number']")).getAttribute("value");
        Assert.assertEquals(actualQuantity, "3", "Unable to verify quantity.");
    }

    @And("I verify the product price is {string}")
    public void iVerifyTheProductPriceIs(String amount) {
        Assert.assertEquals(new ShoppingCartPage().verifyTotalPrice(), "$135.00", "Unable to verify price.");
    }

    @And("I change quantity to five")
    public void iChangeQuantityToFive() {
        new ShoppingCartPage().clearQuantity();
        new ShoppingCartPage().inputQuantity("5");
    }

    @And("I click on update shopping cart button")
    public void iClickOnUpdateShoppingCartButton() {
        new ShoppingCartPage().clickOnUpdateShoppingCartButton();
    }

    @Then("I verify the updated product price is {string}")
    public void iVerifyTheUpdatedProductPriceIs(String amount) throws InterruptedException {
        Assert.assertEquals(new ShoppingCartPage().verifyTotal(), "$225.00", "Unable to verify price.");
    }

}
