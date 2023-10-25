package com.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Base.Test_base;

public class Utils extends Test_base {
	public Utils() {
		super();

	}

	public static Object[][] ReadDataFromExcel(String sheetname) throws Throwable {
		File file = new File("./src/main/java/com/testdata/crm (1).xlsx");

		FileInputStream stream = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(stream);

		XSSFSheet sheet = workbook.getSheet(sheetname);

		int rownum = sheet.getPhysicalNumberOfRows();

		int cellnum = sheet.getRow(1).getLastCellNum();

		Object[][] data = new Object[rownum - 1][cellnum];

		for (int i = 0; i < rownum - 1; i++) {

			for (int j = 0; j < cellnum; j++) {

				DataFormatter df = new DataFormatter();

				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));

			}

		}
		return data;
	}
}
