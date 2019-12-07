package com.Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	
	
	
	public FileInputStream fileInput;
	public FileOutputStream fileOutput;
	public XSSFWorkbook workbook;
	public XSSFSheet worksheet;
	public XSSFRow row;
	public XSSFCell cell;
	
	
	public void SetFilePath(String path, String Xlsheet) throws IOException
	{
		fileInput = new FileInputStream(path);
		workbook = new XSSFWorkbook(fileInput);
		worksheet = workbook.getSheet(Xlsheet);
		
		fileInput.close();
		workbook.close();
		
			
	}
	
	public int getRowCount(String path, String Xlsheet) throws IOException
	{
		fileInput = new FileInputStream(path);
		workbook = new XSSFWorkbook(fileInput);
		worksheet = workbook.getSheet(Xlsheet);
		int rowCount = worksheet.getLastRowNum();
		
		return rowCount;
		
	}
	
	public int getColCount(String path, String Xlsheet, int rownum) throws IOException
	{
		
		fileInput = new FileInputStream(path);
		workbook = new XSSFWorkbook(fileInput);
		worksheet = workbook.getSheet(Xlsheet);
	    int colCount = worksheet.getRow(rownum).getLastCellNum();
	   
		return colCount;
				
	}
	
	public String getCellData(String path, String Xlsheet, int rowcount, int cellCount) throws IOException
	{
		fileInput = new FileInputStream(path);
		workbook = new XSSFWorkbook(fileInput);
		worksheet = workbook.getSheet(Xlsheet);
		row = worksheet.getRow(rowcount);
		cell = row.getCell(cellCount);
		
		DataFormatter formatter = new DataFormatter();
		String Celldata = formatter.formatCellValue(cell);
		
		return Celldata;
		
	}

	
	

}
