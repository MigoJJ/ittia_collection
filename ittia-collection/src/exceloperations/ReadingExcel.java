package exceloperations;

import java.io.FileInputStream;	
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;

public class ReadingExcel {
	public static void main(String[] args) throws IOException {
		String excelFilePath = "/home/migoey/git/ApacheExcel/src/datafiles/Lab2007.xlsx";
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook =  new XSSFWorkbook(inputstream) ;
		XSSFSheet sheet = workbook.getSheetAt(0); //XSSFSheet sheet = new workbook.getSheet("Sheet");
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();

		try {
			for(int r=0; r<=rows; r++) 
			{
				XSSFRow row = sheet.getRow(r);// 0
				
				for(int c=0; c< cols;c++) {
					XSSFCell cell = row.getCell(c);
					
					if (cell != null) {
					
					switch(cell.getCellType()) {
						case STRING:System.out.print(cell.getStringCellValue()+ "\t"); break;
						case NUMERIC:System.out.print(cell.getNumericCellValue()+ "\t"); break;
						case BOOLEAN:System.out.print(cell.getBooleanCellValue()+ "\t"); break;
					default:
						break;
					}
					
					}
				}
				System.out.println();
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}