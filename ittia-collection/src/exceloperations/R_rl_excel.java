package exceloperations;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class R_rl_excel {
     public static void main(String[] args) {
         try {
     		String excelFilePath = "/home/migoey/git/ApacheExcel/src/datafiles/Lab2007.xlsx";
    		FileInputStream inputstream = new FileInputStream(excelFilePath); 
            XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
 
            int rowindex=0;
            int columnindex=0;
            //시트 수 (첫번째에만 존재하므로 0을 준다)
            //만약 각 시트를 읽기위해서는 FOR문을 한번더 돌려준다
            XSSFSheet sheet=workbook.getSheetAt(0);
            //행의 수
            int rows=sheet.getPhysicalNumberOfRows();
            for(rowindex=0;rowindex<rows;rowindex++){
                System.out.println(".....................................");
            	//행을읽는다
                XSSFRow row=sheet.getRow(rowindex);
                if(row !=null){
                    //셀의 수
                    int cells=row.getPhysicalNumberOfCells();
                    
                    for(columnindex=0; columnindex<=cells; columnindex++){
                        //셀값을 읽는다
                        XSSFCell cell=row.getCell(columnindex);
                        String value="";
                        //셀이 빈값일경우를 위한 널체크
                        if(cell==null){
                            continue;
                        }else{
                            //타입별로 내용 읽기
                        	switch(cell.getCellType()) {
    						case STRING:System.out.print(cell.getStringCellValue() + "\t"); break;
    						case NUMERIC:System.out.print(cell.getNumericCellValue() + "\t"); break;
    						case BOOLEAN:System.out.print(cell.getBooleanCellValue() + "\t"); break;
    					default:
    						break;
    					}
                        }
                        System.out.println("\t" + rowindex+"번 행 : "+columnindex+"번 열 값은: "+value);
                    }
 
                }
            }
 
        }catch(Exception e) {
            e.printStackTrace();
        }
 
    }
} 
