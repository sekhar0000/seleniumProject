package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingData {

	public static void main(String[] args) throws IOException {

		// FileInputStream>>>>>>File output stream
		// XSSFworkbook>>Xssf worksheet>>XSSFROW>>XSSF cell

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\dataFile\\read.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1"); // XSSFSheet sheet=workbook.getSheetAt(0);

		// find out no of rows and cell

		int totalRows = sheet.getLastRowNum();

		int totalCells = sheet.getRow(1).getLastCellNum();

		System.out.println("No of rows: " + totalRows);
		System.out.println("No cells are :" + totalCells);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		// rows are counting from zero and cells are counting from 1

		for (int r = 0; r <= totalRows; r++) { // rows for loop

			XSSFRow currentRow = sheet.getRow(r); // 1st get the row and then we can get cell

			for (int c = 0; c < totalCells; c++) { // as per java cells also counting from zero so that y we add zero

				XSSFCell cell = currentRow.getCell(c);
				// cell.toString(); //this method actuall get the data

				// System.out.println(cell.toString());

				System.out.print(cell.toString() + "\t"); // >>>>>it give one tab space in headers
			}

			System.out.println();
		}

		workbook.close();
		file.close();
	}

}
