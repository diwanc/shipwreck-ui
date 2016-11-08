package com.autoframework.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
private static XSSFSheet ExcelWSheet;
private static HSSFSheet XLWorkSheet;
private static XSSFWorkbook ExcelWBook;
private static HSSFWorkbook XLWorkBook;
//private static XSSFCell Cell;
private static HSSFCell Cell;

//private static XSSFRow Row;

private static HSSFRow Row;


//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
public static void setExcelFile(String Path,String SheetName) throws Exception {
			try {
   			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);
			System.out.println("path of xl:"+Path);
			// Access the required test data sheet
			//ExcelWBook = new XSSFWorkbook(ExcelFile);
			XLWorkBook = new HSSFWorkbook(ExcelFile);
			
			//ExcelWSheet = ExcelWBook.getSheet(SheetName);
			XLWorkSheet = XLWorkBook.getSheet(SheetName);
			} catch (Exception e){
				throw (e);
			}
	}

	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

    public static String getCellData(int RowNum, int ColNum) throws Exception{

			try{

  			//Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			Cell = XLWorkSheet.getRow(RowNum).getCell(ColNum);
  			String CellData = Cell.getStringCellValue();
  			return CellData;

  			}catch (Exception e){

				return"";

  			}

    }

	//This method is to write in the Excel cell, Row num and Col num are the parameters

	public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

			try{

  			//Row  = ExcelWSheet.getRow(RowNum);
			Row  = XLWorkSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

			if (Cell == null) {

				Cell = Row.createCell(ColNum);

				Cell.setCellValue(Result);

				} else {

					Cell.setCellValue(Result);

				}

  // Constant variables Test Data path and Test Data file name

  				FileOutputStream fileOut = new FileOutputStream(Constants.Path_TestData);
  				ExcelWBook.write(fileOut);
  				fileOut.flush();
				fileOut.close();
				}catch(Exception e){
					throw (e);
			}

		}

	
	

}
