package exceloperation;

import java.io.FileInputStream;	
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import org.apache.commons.collections4.Get;
import org.apache.poi.xssf.usermodel.*;

public class ErcThyroidGoiterPickup {
	public static void main(int sheeNo, int columNo, int rowNo) throws IOException {
		String excelFilePath = ("/home/migoey/git/ittia_collection/ForuGate/src/datafile/ThyroidMenuList.xlsx");
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook =  new XSSFWorkbook(inputstream) ;
		XSSFSheet sheet = workbook.getSheetAt(sheeNo); //XSSFSheet sheet = new workbook.getSheet("Sheet");
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();

		ArrayList<String> thyoridList = new ArrayList<>(Arrays.asList());
		
		try { int r= rowNo;
//			for(int r=0; r<=rows; r++) {
//			  System.out.print("[rows]  : " + rows);
				XSSFRow row = sheet.getRow(r);// 0
					XSSFCell cell = row.getCell(columNo);
					
					if (cell != null) {
						
												
						
						switch(cell.getCellType()) {
							case STRING:
								String getrc = (cell.getStringCellValue()+ "\t");
								thyoridList.add(getrc);
//								  System.out.print(thyoridList);
								break;
							case NUMERIC:System.out.print(cell.getNumericCellValue()+ "\t"); break;
							case BOOLEAN:System.out.print(cell.getBooleanCellValue()+ "\t"); break;
							default:
								break;
							}
					}
					System.out.println();
//			}  //---col

			iwbtList(thyoridList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void iwbtList(ArrayList<String> thyoridList) throws IOException {
		int r=0;
		for(String i : thyoridList) {
			System.out.printf(" %s \n",i);
			System.out.println(">>> insert code ...");

		    byte b[]=new byte[8];
		    System.in.read(b);
		    String s =new String(b);
		    System.out.println(s);		
			
			r= r+1;
        }
    }
//----------------------------------------------------------
}
