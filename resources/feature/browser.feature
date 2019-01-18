Feature: Browser Test
	Scenario: Search qTest Launch
	    Given  I am on the QASymphony website
		When I search for "qTest Launch"
		Then I should see qTest Launch item on the Search page