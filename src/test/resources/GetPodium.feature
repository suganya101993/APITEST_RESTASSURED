@UserJourney:mortgage_details

Feature:Podium Test
  As a user
  I want to
  submit and retrieve the mortgage details

  Scenario:Get mortgage details
    When I retrieve mortgage details https://podium-slns-interview.getsandbox.com/products
    Then I should successfully be able to view the retrieved mortgage details
      | data.id               | 1                                 |
      | data.name             | 5 yr fixed                        |
      | data.lender.name      | Lender A                          |
      | data.lender.logo      | https://via.placeholder.com/80x55 |
      | data.monthlyRepayment | 567                               |
      | data.interestRate     | 4.3                               |
      | data.minAge           | 18                                |
      | data.maxAge           | 70                                |
      | data.loanToValue      | 0.8                               |
      | data.type             | fixed                             |
      | data.initialTerm      | 5                                 |

  Scenario:submit mortgage applicant details
    Given I am a new mortgage applicant
    When I submit my mortgage application
    Then I should be able  to successfully submit my mortgage application
#    returning 400 as product iD in the URI is invalid(need valid product id)
