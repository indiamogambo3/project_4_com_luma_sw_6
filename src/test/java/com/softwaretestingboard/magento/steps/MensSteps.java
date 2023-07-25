package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MensSteps {
    @When("I mouse hover on men menu")
    public void iMouseHoverOnMenMenu() throws InterruptedException {
        new HomePage().mouseHoverOnMenMenu();
    }

    @And("Mouse hover on bottoms")
    public void mouseHoverOnBottoms() throws InterruptedException {
        new HomePage().mouseHoverOnBottoms();
    }

    @And("I click on pants")
    public void iClickOnPants() throws InterruptedException {
        new HomePage().clickOnPants();
    }

    @And("I mouse hover on product name Cronus Yoga Pant and click on size {int}")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSize(int number) {
        new PantsPage().mouseHoverAndClickOnSize32();
    }

    @And("I mouse hover on product name Cronus Yoga Pant and click on colour black")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new PantsPage().mouseHoverAndClickOnBlack();
    }

    @And("I mouse hover on product name Cronus Yoga Pant and click on add to cart button")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new PantsPage().mouseHoverAndClickOnAddToCartButton();
    }

    @And("I verify the text You added Cronus Yoga Pant to your shopping cart.")
    public void iVerifyTheTextYouAddedCronusYogaPantToYourShoppingCart() {
        Assert.assertEquals(new PantsPage().verifyAddedToCartText(), "You added Cronus Yoga Pant to your shopping cart.", "Unable to verify text.");
    }

    @And("I click on shopping cart link in the message")
    public void iClickOnShoppingCartLinkInTheMessage() {
        new PantsPage().clickOnShoppingCartInMessage();
    }

    @And("I verify the text shopping cart")
    public void iVerifyTheTextShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().verifyShoppingCartText(), "Shopping Cart", "Unable to verify text.");
    }

    @And("I verify the product name Cronus Yoga Pant")
    public void iVerifyTheProductNameCronusYogaPant() {
        Assert.assertEquals(new ShoppingCartPage().verifyProductName(), "Cronus Yoga Pant", "Unable to verify name.");
    }

    @And("I verify the product size {int}")
    public void iVerifyTheProductSize(int number) {
        Assert.assertEquals(new ShoppingCartPage().verifyProductSize32(), "32", "Unable to verify size.");
    }

    @Then("I verify the product colour black")
    public void iVerifyTheProductColourBlack() {
        Assert.assertEquals(new ShoppingCartPage().verifyColourBlack(), "Black", "Unable to verify colour");
    }

}
