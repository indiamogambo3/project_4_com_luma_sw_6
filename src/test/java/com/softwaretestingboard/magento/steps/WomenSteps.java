package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class WomenSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on women menu")
    public void iMouseHoverOnWomenMenu() throws InterruptedException {
        new HomePage().mouseHoverOnWomenMenu();
    }

    @And("I mouse hover on tops")
    public void iMouseHoverOnTops() throws InterruptedException {
        new HomePage().mouseHoverOnTops();
    }

    @And("I click on jackets")
    public void iClickOnJackets() throws InterruptedException {
        new HomePage().clickOnJackets();
    }

    @And("I select sort by filter product name")
    public void iSelectSortByFilterProductName() {
        new JacketsPage().sortByFilterProductName();
    }

    @Then("Verify the products name is displayed in alphabetical order")
    public void verifyTheProductsNameIsDisplayedInAlphabeticalOrder() {
        Assert.assertEquals(new JacketsPage().jacketNameListAfter, new JacketsPage().jacketNameListBefore, "Unable to verify order.");
    }

    @And("I select sort by filter price")
    public void iSelectSortByFilterPrice() {
        new JacketsPage().sortByFilterPrice();
    }

    @Then("Verify the products price is displayed in low to high")
    public void verifyTheProductsPriceIsDisplayedInLowToHigh() {
        Assert.assertEquals(new JacketsPage().jacketPriceListAfter, new JacketsPage().jacketPriceListBefore, "Unable to verify order");
    }

}
