Feature: Magento E-commerce Website Testing 


Background: 
	Given User Launch the Browser 
	
	
	
Scenario Outline: Purchase a Jacket 
	Given  User Launch the Url 
	When User click the Homepage SingIn Button 
	Then User navigates to the login page "Customer Login" 
	When  User enters Username "<Username>" in the Username Field 
	And  User enters password "<password>"  in the Password Field 
	And  User clicks on the signIn button 
	Then   User should be redirected to  the dashboard  "Welcome, Velan Velli!"
	When User select the Mens top Jacket Selection 
	And  User selects the "Montana Wind Jacket" 
	And  User Select L size  
	And  User Select  Red Color  
	And  User adds the jacket to the cart 
	And User click the Shoping Cart 
	And  User proceeds to checkout 
	When User fills in the mandatory shipping address with the following details
	And  User selects the standard shipping method 
	And  User places the order 
	Then  User should see a success message "Thank you for your purchase!" 
	And  User should print the order number
	#And User Terminate the Browser 
	Examples: 
		| Username         | password    | 
#		|vellivelan@gmail.comg | 123455 | 
		|velandg10@gmail.com | Velan@1995 |
	
	
Scenario Outline: Purchase a Womens Tshirt  
	Given  User Launch the Url 
	When User click the Homepage SingIn Button 
	Then User navigates to the login page "Customer Login" 
	When  User enters Username "<Username>" in the Username Field 
	And  User enters password "<password>"  in the Password Field 
	And  User clicks on the signIn button 
	Then   User should be redirected to  the dashboard  "Welcome, Velan Velli!"
	When User select the Mens top Jacket Selection 
	And  User selects the "Montana Wind Jacket" 
	And  User Select L size  
	And  User Select  Red Color  
	And  User adds the jacket to the cart 
	And User click the Shoping Cart 
	And  User proceeds to checkout 
	When User fills in the mandatory shipping address with the following details
	And  User selects the standard shipping method 
	And  User places the order 
	Then  User should see a success message "Thank you for your purchase!" 
	And  User should print the order number
	#And User Terminate the Browser 
	Examples: 
		| Username         | password    | 
#		|vellivelan@gmail.comg | 123455 | 
		|velandg10@gmail.com | Velan@1995 |
	