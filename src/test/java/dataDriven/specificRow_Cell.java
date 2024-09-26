package dataDriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class specificRow_Cell {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\dataFile\\specificRowCell.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("spceific");
		
	XSSFRow row=	sheet.createRow(3);
	XSSFCell cell=	row.createCell(4);
	
	cell.setCellValue("Hello rajsekhar");
	
	 workbook.write(file);
     workbook.close();
     file.close();
     
     System.out.println("file is creadted >>>>>>");

	}

}
