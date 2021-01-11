#Author: Arshi Tilath
## This feature file is for AO automation test feature
## 2 parameters - Brand and Colour are being passed from here as string parameters

Feature: Perform search for washing machines of a particular brand on AO.com and filter out product results based on colour feauture

Scenario: Search for washing machines of a particular brand and verify the results are filtered based on colour feature
    Given User navigates to AO.COM Site
    When User enters washing machine in search products edit box and clicks on search icon
    Then Verify that user is on washing machines results page    
    When User clicks on a "Hotpoint" brand under the shop for top brands list
    Then Verify if the user is navigated to the lister page of selected brand
    When User uses filter navigation on the left to filter products by "White" colour feature   
    Then Verify the results are successfully filtered based on selected colour
    And Close browsers
    


    
    


	
		