Feature: Admin Delete Batch

@TC_Add_Delete_Batch_01
Scenario: Validate row level delete icon   in batch page for Delete
Given The delete icon on row level in data table is enabled in Delete Batch page
When Admin clicks the delete icon in  Batch page
Then Alert appears with yes and No option

@TC_Add_Delete_Batch_02
Scenario: Validate accept alert  in batch page for Delete
Given Admin clicks the delete icon to verify Yes option in Delete Batch page
When Admin click yes option in Batch page
Then Batch deleted alert pops and batch is no more available in data table

@TC_Add_Delete_Batch_03
Scenario: Validate reject alert   in batch page for Delete
Given Admin clicks the delete icon to verify No option in Delete Batch page
When Admin click No option in Batch page
Then Batch is still listed in data table