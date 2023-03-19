package com.qa.opencart.pages;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.Constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class ProductInfoPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private Map<String, String> productinfoMap; // class level

	private By productHeader = By.tagName("h1");
	private By productImages = By.cssSelector("ul.thumbnails img");// change this
    private By productMetaData=By.xpath("(//div[@id='content']//ul[@class='list-unstyled'])[1]/li");
    private By productMetaPriceData=By.xpath("(//div[@id='content']//ul[@class='list-unstyled'])[2]/li");

    private By Quantity=By.xpath("//input[@id='input-quantity']");
    private By addToCart=By.xpath("//button[@id='button-cart']");
	private By cartSuccessMessg = By.cssSelector("div.alert.alert-success");

	public ProductInfoPage(WebDriver driver) {
		
		this.driver=driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public String getProductHeaderValue() {
		String productHeaderVal = eleUtil.doElementGetText(productHeader);
		System.out.println("product header: " + productHeaderVal);
		return productHeaderVal;
	}
	
	public int getProductImagesCount() {
		int imagesCount = eleUtil.waitForElementsVisible(productImages, AppConstants.DEFAULT_SHORT_TIME_OUT).size();
		System.out.println("product images count: " + imagesCount);
		return imagesCount;
	}
	
	// fetching meta data info
//	0Brand: 1Apple
//	Product Code: Product 16
//	Reward Points: 600
//	Availability: In Stock
	public Map<String, String> getProductInfo() {
		//productinfoMap = new HashMap<String, String>();
		//header
		productinfoMap = new LinkedHashMap<String, String>();

		productinfoMap.put("productname", getProductHeaderValue());
		getProductMetaData();
		getPriceData();
		System.out.println(productinfoMap);
		
		return productinfoMap;
	}
	
	private void getProductMetaData() {
	//Map<String,String> productinfoMap= new HashMap<String,String>();//2
	List<WebElement> metalist=	eleUtil.getElements(productMetaData);//1
	
	   for(WebElement e :metalist) {
		String meta=e.getText(); // brand: apple
		String metainfo[]=meta.split(":");
		String key=metainfo[0].trim();
		String value=metainfo[1].trim();
		productinfoMap.put(key, value); // stores in key value pairs format
	}
	}
	
//	$602.00
//	Ex Tax: $500.00
	
	private void getPriceData() {
		List<WebElement> priceList = eleUtil.getElements(productMetaPriceData);
		String price = priceList.get(0).getText();
		String exTax = priceList.get(1).getText();
		String extaxVal = exTax.split(":")[1].trim();

		productinfoMap.put("productprice", price);
		productinfoMap.put("exTax",extaxVal);
	
	}
	
	public void enterQuantity(int qty) {
		System.out.println("quanity...."+qty);
		eleUtil.doSendKeys(Quantity, String.valueOf(qty)); // parsing into string
		
	}
	
	public String clickonAddToCart() {
		eleUtil.doClick(addToCart);
		String successMessg = eleUtil.waitForElementVisible(cartSuccessMessg, AppConstants.DEFAULT_MEDIUM_TIME_OUT).getText();
		StringBuilder sb = new StringBuilder(successMessg);// why string builder
		String mesg = sb.substring(0, successMessg.length()-1).replace("\n", "").toString();
		
		System.out.println("Cart Success Mesg: " + mesg);
		return mesg;
	}
	
	

}
