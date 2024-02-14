package org.example;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class EmployeesDetail
{
    @Test
    public void Test() throws IOException
    {
//Create an object of File class to open xlsx file
        File file = new File("C:\\SeleniumTraining\\EmployeeData.xls");

        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        //Creating workbook instance that refers to .xls file
        HSSFWorkbook wb = new HSSFWorkbook(inputStream);

        //Creating a Sheet object using the sheet Name
        HSSFSheet sheet = wb.getSheet("EmployeeData");

        //get all rows in the sheet
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

        //print all the data in the row
        for (int i = 0; i <= rowCount; i++)
        {

            //get cell count in a row
            int cellcount = sheet.getRow(i).getLastCellNum();

            //print each value of the cell
            System.out.println("Row" + i + " data is :");

            for (int j = 0; j < cellcount; j++)
            {
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + ",");
            }
            System.out.println();
        }
    }

    public static class webTable {
    }
}
