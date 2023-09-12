package utilities;

import java.io.IOException;

import baseClass.BaseTest;
import pageObjects.BatchModule;
import pageObjects.ProgramModule;



public class TestContextSetup {
	
	
	public BaseTest basetest;
	public BatchModule batch;
	public ProgramModule pm;
	
	
	
	public TestContextSetup() throws InterruptedException, IOException{
		
		basetest=new BaseTest();
		batch=new BatchModule(basetest.driverlaunchApp());
		 pm = new ProgramModule(basetest.driverlaunchApp());
		 
		
		
		
	}
}
