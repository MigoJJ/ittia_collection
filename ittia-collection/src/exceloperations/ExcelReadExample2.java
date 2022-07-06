package exceloperations;

import java.io.FileInputStream;	
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.collections4.Get;
import org.apache.poi.xssf.usermodel.*;

public class ExcelReadExample2 {
	public static void main(String[] args) throws IOException {
		String excelFilePath = "/home/migowj/git/ittia_collection/ittia-collection/src/array1234/Thyroidpe.xlsx";
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook =  new XSSFWorkbook(inputstream) ;
		XSSFSheet sheet = workbook.getSheetAt(2); //XSSFSheet sheet = new workbook.getSheet("Sheet");
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();

		ArrayList<String> thyoridList = new ArrayList<>(Arrays.asList());
		
		try {
			for(int r=0; r<=rows; r++) {
			  System.out.print("[rows]  : " + rows);
				XSSFRow row = sheet.getRow(r);// 0
					XSSFCell cell = row.getCell(1);
					
					if (cell != null) {
					switch(cell.getCellType()) {
						case STRING:
							String getrc = (cell.getStringCellValue()+ "\t");
							thyoridList.add(getrc);
							  System.out.print(thyoridList);
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
			
			  System.out.print(thyoridList);
			  
		
			  for(String i : thyoridList) {

	            System.out.println("thyoridList   : " + i);
	            
	        }
			  
			  
			  
			  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static void addArrayListMethod(ArrayList<String> thyoridList)
    {
        ArrayList<String> arrayList = new ArrayList<>();        arrayList.addAll(thyoridList);
        for(String i : arrayList) {
//            System.out.println("arrayList 값 : " + i );
            
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList2.add(i);
            System.out.println("arrayList2" + arrayList2);
            
        }
    }

//----------------------------------------------------------
}
