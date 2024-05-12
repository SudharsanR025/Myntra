package org.basemyntra;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pommyntra.POM_AddtoBag;
import org.pommyntra.POM_HotCoupon;

public class BaseClass {
	

	public WebDriver driver ;
	public POM_HotCoupon hc ;
	public POM_AddtoBag ab ;
	
	public void launchBrowser() {
		driver =  new ChromeDriver();
	}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public void clickElement(WebElement element) {
		element.click();
	}
	public void sendValues(WebElement element , String value) {
		element.sendKeys(value);
	}
	public void captureScreenshot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(location);
		FileHandler.copy(src, trg);
	}
	public void maxWindow() {
		driver.manage().window().maximize();
	}
	public void impWait() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public void expWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void switchWindow(int id) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<>();
		list.addAll(windowHandles);
		driver.switchTo().window(list.get(id));
	}
	public void closeBrowser() {
		driver.quit();
	}
	public boolean elementDisplay(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;

	}
	public String getElementText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
	}

}
