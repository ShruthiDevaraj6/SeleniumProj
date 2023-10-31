package com.caloriecalc.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static void ReadExcelData(String filepath, String filename, String sheetname) throws IOException {
		FileInputStream inputStream = new FileInputStream(new File(filepath + "/" + filename));
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet(sheetname);
		int rowcount = sheet.getLastRowNum();
		System.out.println("Rowcount :" + rowcount);
		for(int r=0;r<rowcount+1;r++) {
			Row row = sheet.getRow(r);
		for (int c=0;c<row.getLastCellNum();c++) {
			Cell cell= row.getCell(c);
		System.out.print(cell.getRichStringCellValue() + "\t");
	}
		System.out.println(" ");
		}}
	//return a 2-dimensional object array,you can add additional rows to the excel
	public static Object[][] ReadExcelDataToObjArr(String filepath, String filename, String sheetname) throws IOException {
		FileInputStream inputStream = new FileInputStream(new File(filepath + "/" + filename));
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet(sheetname);
		int rowcount = sheet.getLastRowNum();
		System.out.println("Rowcount :" + rowcount);
		Object[][] data = new Object[rowcount][1];
		//first get the keyrow i.e. age sex
		Row keyrow = sheet.getRow(0);
		//keyrow is 0 and data row is 1
		Hashtable<String,String> rec = null;
		for(int r=1;r<rowcount+1;r++) {
			rec=new Hashtable<String,String>();
			Row datarow = sheet.getRow(r);
		for (int c=0;c<datarow.getLastCellNum();c++) {
			Cell cell= datarow.getCell(c);
			String key = keyrow.getCell(c).getStringCellValue();
			String value = datarow.getCell(c).getStringCellValue();
			rec.put(key, value);	
	}
		data[r-1][0]=rec;
		
		}
		return data;
		}
	
	public static void main(String[] args) throws IOException {
		String filepath = System.getProperty("user.dir") + "/src/com/caloriecalc/testdata";
		String filename = "CalorieTestData.xlsx";
		String sheetname = "CalorieTestSet";
		ExcelReader.ReadExcelData(filepath, filename, sheetname);

	}

}
