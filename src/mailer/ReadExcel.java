package mailer;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public String ExcelExtractor(String address){
		String email="";

        try
        {
            FileInputStream file = new FileInputStream(new File("E:/tribhuvan/excels"+address));
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 String info="";
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) 
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext()) 
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) 
                    {
                       /* case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "     ");
                            break;*/
                        case Cell.CELL_TYPE_STRING:
                           info=info+"@@@@"+cell.getStringCellValue(); 
                            break;
                           
                    }
               
                }
              // System.out.println("Done");
            }
           // System.out.println(info);
            email=info;
            file.close();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       
		return email;
	}
}
