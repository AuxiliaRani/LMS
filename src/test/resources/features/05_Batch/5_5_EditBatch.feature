Feature: Admin Edit Batch

@TC_Edit_Batches_01
Scenario: Validate row level edit icon in batch page for edit
Given The edit icon on row level in data table is enabled in batch page
When Admin clicks the edit icon in batch page
Then A new pop up with Batch details appears in batch page

@TC_Edit_Batches_02
Scenario Outline: Check if the fields are updated in batch page for edit
Given Admin clicks the edit icon to Update valid values "<Name>" , "<Description>" , "<Program Name>", "<Number of classes>" ,"<Status"> of in batch page
When Update the fields with valid values and click save in batch page
Then The updated batch details should appear on the data table in batch page with updated value "<Name>"

Examples:    
     |Name     | Description             | Program Name   | Number of classes     | Status |
     |Admin    | SDET       | Jan20_NinjaSurvivour_5_SDET_09    | 6                     | Active |
     
@TC_Edit_Batches_03
Scenario Outline: Check if the update throws error with invalid valued in batch page for edit

Given Admin clicks the edit icon to Update invalid values  as "<Name>" , "<Description>" , "<Program Name>", "<Number of classes>" ,"<Status"> in batch page
When Update the fields with invalid values and click save in batch page
Then Error message should appear "<error msg>" invaild values in batch page

Examples:    
     |Name     | Description            | Program Name                            | Number of classes     | Status | error msg  |                       
     | Admin   | SDET                   | 123                                     | 5                     | Active | invaild values,enter a valid value|
     |User     | Sale force             | Jan20_NinjaSurvivour_5_SDET_09          | 3                    | InActive | invaild values,enter a valid value|

@TC_Edit_Batches_04
Scenario: Check if you get error message when mandatory fields are erased in batch page for edit
Given Admin clicks the edit icon to erase data from mandatory field in batch page
When Erase data from mandatory field in batch page
Then Error message should appear for dwlwting manadatory field in batch page

@TC_Edit_Batches_05
Scenario: Check if description field is optional in update in batch page for edits
Given Admin clicks the edit icon to erase data from description field in batch page
When Erase data from description field in batch page
Then The updated batch details should appear on the data table in batch page

