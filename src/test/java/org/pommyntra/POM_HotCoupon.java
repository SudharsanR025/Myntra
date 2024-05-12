package org.pommyntra;

import org.basemyntra.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_HotCoupon extends BaseClass {
	
	public POM_HotCoupon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//img[@class='image-image undefined image-hand'])[2]")
	private WebElement hotCoupon;
	@FindBy(xpath = "(//div[@id='desktopSearchResults']//child::img)[1]")
	private WebElement product;
	@FindBy(xpath="//div[text()='ADD TO BAG']")
	private WebElement addToBag;
	@FindBy(xpath="//p[@class='size-buttons-unified-size']")
	private WebElement size;
	@FindBy(xpath="//span[text()='GO TO BAG']")
	private WebElement goToBag;
	@FindBy(xpath="//button[@class='css-15k6cs5']")
	private WebElement apply;
	@FindBy(id="coupon-input-field")
	private WebElement couponInput;
	@FindBy(xpath="//div[text()='CHECK']")
	private WebElement couponApply;
	@FindBy(xpath="//div[@class='couponsForm-base-errorMessage']")
	private WebElement couponErrorMessage;
	public WebElement getSize() {
		return size;
	}
	public WebElement getHotCoupon() {
		return hotCoupon;
	}
	public WebElement getProduct() {
		return product;
	}
	public WebElement getAddToBag() {
		return addToBag;
	}
	public WebElement getGoToBag() {
		return goToBag;
	}
	public WebElement getApply() {
		return apply;
	}
	public WebElement getCouponInput() {
		return couponInput;
	}
	public WebElement getCouponApply() {
		return couponApply;
	}
	public WebElement getCouponErrorMessage() {
		return couponErrorMessage;
	}
	

}
