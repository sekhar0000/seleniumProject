package dataDriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingData {

	public static void main(String[] args) throws IOException {
		// FileInputStream>>>>>>File output stream
		// XSSFworkbook>>Xssf worksheet>>XSSFROW>>XSSF cell

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\dataFile\\write.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("data");

		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("java");
		row1.createCell(1).setCellValue(15);
		row1.createCell(2).setCellValue("Automation");

		XSSFRow row2 = sheet.createRow(1);
		row1.createCell(0).setCellValue("python");
		row1.createCell(1).setCellValue(12);
		row1.createCell(2).setCellValue("Automation");

		/*
		 * 
		 * XSSFRow row3= sheet.createRow(2); row1.createCell(0).setCellValue("tosca");
		 * row1.createCell(1).setCellValue(120);
		 * row1.createCell(2).setCellValue("Automation");
		 */

		workbook.write(file);

		workbook.close();

		file.close();

		System.out.println("file is created");
	}

}
