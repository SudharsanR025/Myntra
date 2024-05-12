package org.pommyntra;

import org.basemyntra.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_AddtoBag extends BaseClass {
	
	public POM_AddtoBag(WebDriver driver) {
		 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//div[@class='size-buttons-size-buttons']//child::p)[2]")
	private WebElement size;
	@FindBy(xpath = "//div[@class='size-buttons-tipAndBtnContainer']")
	private WebElement size1;
	@FindBy(xpath = "//div[text()='ADD TO BAG']")
	private WebElement addtoBag;
	@FindBy(xpath = "//span[@data-reactid='904']")
	private WebElement bag;
	@FindBy(xpath = "//span[text()='GO TO BAG']")
	private WebElement gotoBag;
	@FindBy(xpath = "//div[@class='itemComponents-base-quantity']")
	private WebElement qty;
	@FindBy(xpath = "(//div[@class='dialogs-base-qtyList']//child::div)[2]")
	private WebElement noofQty;
	@FindBy(xpath = "//button[@class='css-cilza6']")
	private WebElement done;
	@FindBy(xpath="(//span[@class='priceDetail-base-redesignRupeeTotalIcon']//parent::span)[1]")
	private WebElement totalAmount;
	@FindBy(xpath = "//header[@id='desktop-header-cnt']//child::input")
	private WebElement searchBox;
	@FindBy(xpath = "//a[@class='desktop-submit']")
	private WebElement submitButton;
	@FindBy(xpath = "(//label[@class='common-customCheckbox'])[4]")
	private WebElement checkBox;
	@FindBy(xpath = "(//div[@id='desktopSearchResults']//child::img)[1]")
	private WebElement product;
	public WebElement getSearchBox() {
		return searchBox;
	}
	public WebElement getProduct() {
		return product;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getGotoBag() {
		return gotoBag;
	}
	public WebElement getQty() {
		return qty;
	}
	public WebElement getNoofQty() {
		return noofQty;
	}
	public WebElement getDone() {
		return done;
	}
	public WebElement getTotalAmount() {
		return totalAmount;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getAddtoBag() {
		return addtoBag;
	}
	public WebElement getBag() {
		return bag;
	}
	public WebElement getSize1() {
		
		return size1;
	}

}
