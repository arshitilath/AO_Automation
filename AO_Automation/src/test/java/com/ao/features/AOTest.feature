Feature: Perform search for washing machines of a particular brand on AO.com and filter out product results based on users feauture choice

Scenario: Search for washing machine
    Given User navigates to AO.COM Site
    When User enters washing machine in search products edit box and clicks on search icon
    Then Verify that user is on washing machines results page    
    When User clicks on a brand under shop for top brands
    Then Verify if the user is navigated to the lister page of that brand 
    When User uses filter navigation on the left to filter products by a feature   
    Then Verify the results are successfully filtered based on users selection criteria
    And Close browsers
    
    


	
		