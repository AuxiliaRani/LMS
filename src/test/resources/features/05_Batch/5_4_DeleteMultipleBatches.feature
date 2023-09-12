Feature:Admin Delete multiple batches 


@TC_Add_Delete_multiple_Batches_01
Scenario: Validate the delete icon below the header in batch page for delete
Given None of the checkboxes in data table are selected in batch page
Then The delete icon under the Manage Batch header should be disabled in batch page


@TC_Add_Delete_multiple_Batches_02
Scenario: Check for single row delete in batch page for delete
Given One of the checkbox/ row is selected in batch page
When Click delete icon below Manage Batch header to verify single row in batch page
Then The respective single row in the data table is deleted in batch page

@TC_Add_Delete_multiple_Batches_03
Scenario: Check for multi row delete  in batch page for delete
Given Two or more checkboxes/row is selected in batch page
When Click delete icon below Manage Batch header  to verify multi row in batch page
Then The respective multi row in the data table is deleted in batch page

