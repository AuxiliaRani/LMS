package utilities;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class testexcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExcelReader er = new ExcelReader();
		
		try {
			List<Map<String,String>> Lm = er.getData(".\\src\\test\\resources\\Exceldata\\LMSTestData.xlsx", "Batch");
			System.out.println(Lm.size());
			for ( Map<String,String> sudha     : Lm) {
	System.out.println("+++++++++FROMMAP+++++++++++"+sudha.get("BatchName"));			
	String noofClass = sudha.get("NumberofClasses");
	System.out.println("orginal nubmer of class"+sudha.get("NumberofClasses"));
	System.out.println("nooFClasswithout Qyotes "+noofClass.replaceAll("\"", ""));
			}
		} catch (InvalidFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
