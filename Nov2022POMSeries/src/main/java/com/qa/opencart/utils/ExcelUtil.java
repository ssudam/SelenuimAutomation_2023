package com.qa.opencart.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	public static final String TEST_DATA_SHEET_PATH="/Nov2022POMSeries/src/test/resources/TestData/opencarttestdata.xlsx";


	private static Workbook book;
	private static Sheet sheet; // tommorrow if you craete another method you can use from here so thats why using at class level

	public static Object[][] getTestData(String sheetName) { // to 

		System.out.println("reading data from sheet: " + sheetName);

		Object data[][] = null; // 2d array as we have rows ,cols

		try {
			FileInputStream ip = new FileInputStream(TEST_DATA_SHEET_PATH); // give file path and creates connection to read data
			book = WorkbookFactory.create(ip); // workbook is class
			sheet = book.getSheet(sheetName); // sheet name 

			
			// read data - 2 d arrays - 2 for loops 
			// last row + firt row and get last cell ( column count) 
			data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

			
			/**
			 * first j will increment until its last cols then i will increment until last row
			 */
			for (int i = 0; i < sheet.getLastRowNum(); i++) { // i second - it will start
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) { //j first it will fisnih its loop
					data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		}

		return data;

	}
}
