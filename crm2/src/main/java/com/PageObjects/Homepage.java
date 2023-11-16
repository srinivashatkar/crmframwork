package com.PageObjects;

import org.apache.xmlbeans.UserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;
import com.utils.Utils;

public class Homepage extends Testbase {

public Homepage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//i[contains(@class,'fa-houzz')]")
	WebElement Inventory;
	@FindBy(xpath="//ul[@class='treeview-menu']/li/a[text()='All Inventory']")
	WebElement AllInventory;
	@FindBy(xpath="//ul[@class='treeview-menu']/li/a[contains(text(),'Move Stock')]")
	WebElement Movestock;
	@FindBy(xpath="//i[contains(@class,'fa-database')]")
	WebElement master; 
		@FindBy(xpath="//a[@href='/Master/Usertypes']")
		WebElement usertype;
		private WebElement customer;
		private WebElement addcustomer;
		private WebElement allcustomer;
		private WebElement location;
    public Homepage(WebDriver driver)throws Throwable
    {
    	PageFactory.initElements(driver,this);
    }
    public  Inventory inventory() throws Throwable
    {
    	Utils.moveToElement(Inventory);
    	AllInventory.click();	 
		return  new Inventory();
	}

    public   Movestock movestock() throws Throwable
    {
    	Utils.moveToElement(Inventory);
    	Movestock.click();
		return new Movestock();
		 
    
		
	}
	public Holidays holidays()throws Throwable {
		// TODO Auto-generated method stub
		
		
			Utils.moveToElement(master);
			Holidays.click();
			return new Holidays();
			
	}
	public void usertype() {
		Utils.moveToElement(master);
    	usertype.click();
		 
		
	}
	public void addcustomer() {
		// TODO Auto-generated method stub
		Utils.moveToElement(customer);
		addcustomer.click();
	}
	public void editcustomer() {
		// TODO Auto-generated method stub
		Utils.moveToElement(customer);
		allcustomer.click();
	
	}
	//public Location location() {
	
	//		Utils.moveToElement(master);
	//		location.click();
//			return  new Location();
	//	}
	public Location location() throws Throwable {
		
			Utils.moveToElement(master);
			location.click();
			return  new Location();
		}
	
        
	}
 
	
 
 
  
   
	

		
	
 

	
	


