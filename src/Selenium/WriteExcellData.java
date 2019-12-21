package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcellData {
	
	public static void writeExcell() throws IOException{
		File src=new File("D:\\pavan.xlsx");
		FileInputStream fis = new FileInputStream(src);
		 
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		try{
		sheet.getRow(1).createCell(1).setCellValue("pavan");
		sheet.getRow(2).createCell(1).setCellValue("Guntur");
		sheet.getRow(3).createCell(1).setCellValue("mechanical");
		}
		catch(Exception e){
			System.out.println(e.getStackTrace());
		}
		
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
		wb.close();	
		
	}

	public static void main(String[] args) throws IOException  {
		writeExcell();
		
	}

}
