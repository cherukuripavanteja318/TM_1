package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCellData {

	public static void main(String[] args) throws IOException {
		File src=new File("C:\\Users\\S3\\Desktop\\p1.xlsx");
		FileInputStream fis = new FileInputStream(src);		 
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		wb.close();
	}

}
