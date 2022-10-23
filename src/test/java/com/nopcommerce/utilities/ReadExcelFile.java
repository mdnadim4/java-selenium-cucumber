package com.nopcommerce.utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Excel_Data {

    @DataProvider(name="registerData")
    public String[][] getData() throws IOException {

            File file = new File("src/testData/registration.xlsx");
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("registration");
            int noOfRows = sheet.getPhysicalNumberOfRows();
            int noOfCols = sheet.getRow(0).getLastCellNum();

            String[][] data = new String[noOfRows - 1][noOfCols];
            for (int i = 1; i < noOfRows - 1; i++) {
                for (int j = 0; j < noOfCols; j++) {
                    DataFormatter df = new DataFormatter();
                    data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
                }
                System.out.println();
            }

            workbook.close();
            fis.close();

            for (String[] dataArr : data) {
                System.out.println(Arrays.toString(dataArr));
            }
        return data;
    }
}
