package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JacketsPage extends Utility {

    private static final Logger log = LogManager.getLogger(JacketsPage.class.getName());

    public JacketsPage() {
        PageFactory.initElements(driver, this);
    }

    public ArrayList jacketNameListBefore;
    public ArrayList jacketNameListAfter;
    public ArrayList jacketPriceListBefore;
    public ArrayList jacketPriceListAfter;

    public void sortByFilterProductName() {

        log.info("Sorting by filter product namme: ");

        //* Select Sort By filter “Product Name” and Verify the products name display in alphabetical order

        List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }

        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Product Name");

        jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListAfter = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());

            jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);
        }

    }

    public void sortByFilterPrice() {

        log.info("Sorting by filter price low to high: ");

        //* Select Sort By filter “Price” and Verify the products price display in Low to High

        List<WebElement> jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }

        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Price");

        jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }

        Collections.sort(jacketsPriceListBefore);
    }

}
