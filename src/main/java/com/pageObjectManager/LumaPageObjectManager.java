package com.pageObjectManager;

import com.PageObjectModel.LoginPagePOM;
import com.PageObjectModel.ProductPagePOM;
import com.PageObjectModel.ShippingPagePOM;
import com.PageObjectModel.confirmationPagePOM;
import com.propertyFiles.LumaDataReader;

public class LumaPageObjectManager {
	private LumaDataReader reader;
	private LoginPagePOM login;
	private ProductPagePOM product;
	private ShippingPagePOM address;
	private confirmationPagePOM confirm;
	//pdr
	
	
  public LoginPagePOM getloginPageManager() {
	  
	  
	  if(login == null)
	  {
		  login = new LoginPagePOM();
	  }
	  
	  return login;
  }
	
	
	
  public LumaDataReader getFileReaderManager() {
	  
	  
	  if(reader == null)
	  {
		  reader = new LumaDataReader();
	  }
	  
	  return reader;
  }
	
public ShippingPagePOM getShippingPageManager() {
	  
	  
	  if(address == null)
	  {
		  address = new ShippingPagePOM();
	  }
	  
	  return address;
  }
	
  
  
	
  public ProductPagePOM getProductPage() {
	  
	  
	  if(product == null)
	  {
		  product = new ProductPagePOM();
	  }
	  
	  return product;
  }
public confirmationPagePOM getConfirmPageManager() {
	  
	  
	  if(confirm == null)
	  {
		  confirm = new confirmationPagePOM();
	  }
	  
	  return confirm;
  }
	
  
  
  
  
  

}
