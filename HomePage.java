package org.makeMyTrip;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends UtilityClass {
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='fromCity']")
	private WebElement from;
	
	public WebElement getFrom() {
		return from;
	}


	public WebElement getTo() {
		return to;
	}

    public WebElement getDate() {
		return date;
	}


	public WebElement getDep() {
		return dep;
	}


	

	public WebElement getBtn() {
		return btn;
	}

	@FindBy(xpath="//input[@id='toCity']")
	private WebElement to;

	@FindBy(xpath="//*[@for='departure']")
	private WebElement dep ;

	@FindBy(xpath="//div[@aria-label='Wed Sep 16 2020']")
	private WebElement date ;

    
	@FindBy(xpath="//a[text()='Search']")
	private WebElement btn;


	








}
