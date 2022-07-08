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

public class ErcThyroidGoiterProc {
	public void main(int sheeNo, int columNo) throws IOException {
		String excelFilePath = ("/home/migoey/git/ittia_collection/ForuGate/src/datafile/ThyroidMenuList.xlsx");
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook =  new XSSFWorkbook(inputstream) ;
		XSSFSheet sheet = workbook.getSheetAt(sheeNo); //XSSFSheet sheet = new workbook.getSheet("Sheet");
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		ArrayList<String> thyoridList = new ArrayList<>(Arrays.asList());
		try {
			for(int r=0; r<=rows; r++) {
//			  System.out.print("[rows]  : " + rows);
				XSSFRow row = sheet.getRow(r);// 0
					XSSFCell cell = row.getCell(columNo);
					if (cell != null) {
						switch(cell.getCellType()) {
							case STRING:
								String getrc = (cell.getStringCellValue()+ "\t");
								thyoridList.add(getrc);
								break;
							case NUMERIC:System.out.print(cell.getNumericCellValue()+ "\t"); break;
							case BOOLEAN:System.out.print(cell.getBooleanCellValue()+ "\t"); break;
							default:
								break;
							}
					}
					System.out.println();
			}  //---col
			iwbtList(thyoridList);
			System.out.println(thyoridList);
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

	        Scanner sc = new Scanner(System.in);
	        int str = sc.nextInt();
	        System.out.println("User input: " + str);	
		    ErcThyroidGoiterPickup.main(1,0,str);
			r= r+1;
        }
    }
//----------------------------------------------------------
}
