Feature: Pagination In Manage Class For Next Page Verification

Background: Admin click +Add New Class button after reaching to Manage class page
Given  Admin is in add class details popup window

@TC_PaginationNextPage_01
Scenario: Verify next page is enabled for manage class page
When Admin creates 6 new class in manage class page
Then If total class entries above 5 next page is enabled ( On multiples of 5 new page will be enabled)

@TC_PaginationNextPage_02
Scenario: Verify next page is disabled
When Admin creates less than or equal to 5 new class in manage class page
Then If total class entries  5 or below next page is disabled
