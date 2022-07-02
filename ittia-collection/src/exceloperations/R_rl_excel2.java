package exceloperations;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class R_rl_excel2 {
     public static void main (String[]args) {
    	 R_rl_excel_point(1,0,1);
    	 R_rl_excel_point(0,1,1);
    	 R_rl_excel_point(0,5,0);
     }
	
     static void R_rl_excel_point(int rowindex, int columnindex, int sheetno) {
         try {
     		String excelFilePath = "/home/migoey/git/ApacheExcel/src/datafiles/Lab2007.xlsx";
    		FileInputStream inputstream = new FileInputStream(excelFilePath); 
            XSSFWorkbook 	workbook = 	new XSSFWorkbook(inputstream);
            XSSFSheet 		sheet = 	workbook.getSheetAt(sheetno);
            int rows=sheet.getPhysicalNumberOfRows();
                System.out.println(".....................................");
                XSSFRow row=sheet.getRow(rowindex);
            int cells=row.getPhysicalNumberOfCells();
                XSSFCell cell=row.getCell(columnindex);
                String value="";
               	switch(cell.getCellType()) {
					case STRING:System.out.print(cell.getStringCellValue() + "\t"); break;
					case NUMERIC:System.out.print(cell.getNumericCellValue() + "\t");
		               	double cellV= cell.getNumericCellValue();
		                System.out.println("\t" + cellV+"---> cellV"); break;
					case BOOLEAN:System.out.print(cell.getBooleanCellValue() + "\t"); break;
				default:
					break;
				}
        System.out.println("\t" + rowindex+"번 행 row : "+columnindex+"번 열 cloumn 값: "+value);

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
} 