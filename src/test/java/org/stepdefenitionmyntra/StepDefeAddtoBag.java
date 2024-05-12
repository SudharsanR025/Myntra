package org.stepdefenitionmyntra;

import java.io.IOException;

import org.basemyntra.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pommyntra.POM_AddtoBag;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class StepDefeAddtoBag extends BaseClass{
	
	public POM_AddtoBag ab;
//	POM_AddtoBag ab = new POM_AddtoBag(driver);
	@Given("User is on product page")
	public void user_is_on_product_page() {
	    launchBrowser();
	    launchUrl("https://www.myntra.com/shirts/locomotive/locomotive-men-opaque-checked-casual-shirt/28121264/buy");
	    maxWindow();
	    impWait(); }
	@When("User enters Size of the product")
	public void user_enters_size_of_the_product() {
	   ab = new POM_AddtoBag(driver);
	   WebElement size = ab.getSize();
	   clickElement(size); }
	@When("User click add to bag button")
	public void user_click_add_to_bag_button() {
	    ab = new POM_AddtoBag(driver);
	    WebElement addtoBag = ab.getAddtoBag();
	    clickElement(addtoBag);}
	@Then("User should able to see the product added to the bag")
	public void user_should_able_to_see_the_product_added_to_the_bag() throws InterruptedException {
	   ab = new POM_AddtoBag(driver);
	   WebElement bag = ab.getBag();
	   Thread.sleep(2000);
	   Assert.assertEquals(getElementText(bag), "1");}
	@Then("close the browser")
	public void close_the_browser() {
	   closeBrowser();}
	@When("User select the quantity of the product")
	public void user_select_the_quantity_of_the_product() {
		 ab = new POM_AddtoBag(driver);
		 WebElement gotoBag = ab.getGotoBag();
		 clickElement(gotoBag);
		 WebElement totalAmount = ab.getTotalAmount();
		 String before = getElementText(totalAmount);
		 System.out.println(before);
		 WebElement qty = ab.getQty();
		 clickElement(qty);
		 WebElement noofQty = ab.getNoofQty();
		 clickElement(noofQty);
		 WebElement done = ab.getDone();
		 clickElement(done);
		 
	}
	@Then("User should see the quantity is added to the bag")
	public void user_should_see_the_quantity_is_added_to_the_bag() throws IOException {
		ab = new POM_AddtoBag(driver);
		WebElement totalAmount = ab.getTotalAmount();
		String Text = getElementText(totalAmount);
		System.out.println(Text);
		captureScreenshot("D:\\Selenium\\Framework\\myntr.png");
	}
	

	@Given("User lands on myntra home page")
	public void user_lands_on_myntra_home_page() {
	    launchBrowser();
	    launchUrl("https://www.myntra.com/");
	    maxWindow();
	    impWait();
	    ab = new POM_AddtoBag(driver);
	}
	@When("user search for specific product")
	public void user_search_for_specific_product() {
		ab = new POM_AddtoBag(driver);
		WebElement searchBox = ab.getSearchBox();
		sendValues(searchBox, "Mens Casual Shirts");
		WebElement submitButton = ab.getSubmitButton();
		clickElement(submitButton);}
	@When("apply colour as a filter")
	public void apply_colour_as_a_filter() {
		scrollDown();
		ab = new POM_AddtoBag(driver);
		WebElement checkBox = ab.getCheckBox();
		clickElement(checkBox);	}
	@Then("User should see the products related to the colour")
	public void user_should_see_the_products_related_to_the_colour() throws IOException {
	   captureScreenshot("D:\\Selenium\\Framework\\greenproduct.png");}
	@When("User select a product from the list")
	public void user_select_a_product_from_the_list() {
		ab = new POM_AddtoBag(driver);
		WebElement product = ab.getProduct();
		clickElement(product);
		switchWindow(1);}
	@When("add size and add the product to the bad")
	public void add_size_and_add_the_product_to_the_bad() {
		ab = new POM_AddtoBag(driver);
		WebElement size = ab.getSize1();
		clickElement(size);
		WebElement addtoBag = ab.getAddtoBag();
		clickElement(addtoBag);}
	@Then("product shoiuld be added to the bag")
	public void product_shoiuld_be_added_to_the_bag() throws InterruptedException {
		 ab = new POM_AddtoBag(driver);
		   WebElement bag = ab.getBag();
		   Thread.sleep(2000);
		   Assert.assertEquals(getElementText(bag), "1");
	}









}
