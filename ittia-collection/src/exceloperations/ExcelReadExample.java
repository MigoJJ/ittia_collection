package exceloperations;

import java.io.FileInputStream;	
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.collections4.Get;
import org.apache.poi.xssf.usermodel.*;

public class ExcelReadExample {
	public static void main(String[] args) throws IOException {
		String excelFilePath = "/home/migowj/git/ittia_collection/ittia-collection/src/array1234/Thyroidpe.xlsx";
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook =  new XSSFWorkbook(inputstream) ;
		XSSFSheet sheet = workbook.getSheetAt(2); //XSSFSheet sheet = new workbook.getSheet("Sheet");
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		try {
			for(int r=0; r<=rows; r++) {
				
				  System.out.print("[rows]  : " + rows);
				
				
				XSSFRow row = sheet.getRow(r);// 0
//				XSSFRow row = sheet.getRow(0);// 0

				
//				for(int c=0; c< cols;c++) {
//					XSSFCell cell = row.getCell(c);
					XSSFCell cell = row.getCell(1);

					
					if (cell != null) {
					
					switch(cell.getCellType()) {
						case STRING:
//							System.out.print(cell.getStringCellValue()+ "\t"); 
							String getrc = (cell.getStringCellValue()+ "\t");
							  ArrayList<String> thyoridList = new ArrayList<>(Arrays.asList(getrc));
							  System.out.print(thyoridList);
//							  thyoridList.add(getrc);
//							  thyoridList.set(r, getrc);
							  System.out.print(thyoridList);
							  
//							  doSomething(getrc);
//							System.out.print(doSomething(getrc));
							
							break;
						case NUMERIC:System.out.print(cell.getNumericCellValue()+ "\t"); break;
						case BOOLEAN:System.out.print(cell.getBooleanCellValue()+ "\t"); break;
					default:
						break;
					}
					
					}
//				}
				System.out.println();
				
			}  //---col
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
//    private static String[] doSomething(String getrc) {
//	
//		  System.out.println(getrc);
//    	 
//        return getrc;
//    }
	
	
	
//----------------------------------------------------------
}
