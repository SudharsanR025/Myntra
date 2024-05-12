package org.stepdefenitionmyntra;

import java.time.Duration;

import org.basemyntra.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pommyntra.POM_HotCoupon;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class StepDefeMyntraCoup extends BaseClass {
	

@Given("the User lands on the Myntra homepage")
public void the_user_lands_on_the_myntra_homepage() {
   launchBrowser();
   launchUrl("https://www.myntra.com/");
   maxWindow();
   impWait();
}

@When("the User clicks on the Hot Coupons section")
public void the_user_clicks_on_the_hot_coupons_section() {
   hc = new POM_HotCoupon(driver);
   WebElement hotCoupon = hc.getHotCoupon();
   clickElement(hotCoupon);
}

@When("the User navigates to the product listing page")
public void the_user_navigates_to_the_product_listing_page() {
	String title = getPageTitle();
	Assert.assertEquals("Online Fashion Store - India's Largest Online Fashion Store - Myntra", title);
}

@When("the User selects a product")
public void the_user_selects_a_product() {
	 hc = new POM_HotCoupon(driver);
     WebElement product = hc.getProduct();
     clickElement(product);
}

@Then("the selected product opens in a new window")
public void the_selected_product_opens_in_a_new_window() {
	switchWindow(1);   
   }
    


@When("the User adds the product to the shopping bag")
public void the_user_adds_the_product_to_the_shopping_bag() {
	hc = new POM_HotCoupon(driver);
	WebElement addToBag = hc.getAddToBag();
	clickElement(addToBag);
}

@When("proceeds to checkout")
public void proceeds_to_checkout() {
	hc = new POM_HotCoupon(driver);
	WebElement goToBag = hc.getGoToBag();
	clickElement(goToBag);
}

@When("the User attempts to apply a coupon code for newly registered users")
public void the_user_attempts_to_apply_a_coupon_code_for_newly_registered_users() {
	hc = new POM_HotCoupon(driver);
	WebElement apply = hc.getApply();
	apply.click();
	WebElement couponInput = hc.getCouponInput();
	sendValues(couponInput, "MYNTRA200");
	WebElement couponApply = hc.getCouponApply();
	clickElement(couponApply);
	
}

@Then("an error message should be displayed indicating that the coupon code is only valid for newly registered users")
public void an_error_message_should_be_displayed_indicating_that_the_coupon_code_is_only_valid_for_newly_registered_users() {
	hc = new POM_HotCoupon(driver);
	WebElement couponErrorMessage = hc.getCouponErrorMessage();
	boolean elementDisplay = elementDisplay(couponErrorMessage);
	Assert.assertTrue(elementDisplay);
	closeBrowser();
}




}
