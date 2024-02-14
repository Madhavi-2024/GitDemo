package org.example;
//import org.jetbrains.annotations.NotNull;
import io.opentelemetry.sdk.metrics.data.Data;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
public class excelData
{
    @Test
    public void writeData1(String excelPath, String sheetName, int rowNumber, int colNumber, String Data)
    {
        try
        {
            try
            {
                File file = new File(excelPath);
                FileInputStream fis = new FileInputStream(file);
                XSSFWorkbook wb = new XSSFWorkbook(fis);
                XSSFSheet sheet1 = wb.getSheet(sheetName);
                XSSFRow row1 = sheet1.createRow(rowNumber);
                XSSFCell cell = row1.getCell(colNumber, Row.RETURN_BLANK_AS_NULL);
                row1.createCell(colNumber).setCellValue(Data);
                if (cell == null)
                {
                    row1.createCell(colNumber);
                    cell.setCellValue(Data);
                }
                else
                {
                    cell.setCellValue(Data);
                }
                FileOutputStream fio = new FileOutputStream(excelPath);
                wb.write(fio);
            }
            catch (IOException io)
            {
                io.printStackTrace();
            }
        }
            catch (NullPointerException e)
            {
                e.printStackTrace();
        }
    }
    public static <webelement, Set> void main(String[] args) throws ParseException, IOException
    {
        WebDriver wd;
        System.setProperty("webdriver.chrome.Driver", "C:\\WebDrivers\\chrome.exe");
        wd = new ChromeDriver();
        wd.get("https://demo.guru99.com/test/web-table-element.php");
        wd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //No.of Columns
        List<webelement> col = (List<webelement>) wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " + col.size());

        //No.of rows
        List<webelement> rows = (List<webelement>) wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("No of rows are : " + rows.size());

        //Read data from  the Columns
        String column = ".//*[@id=\"leftcontainer\"]/table/thead/tr/th";
        int colData = wd.findElements(By.xpath(column)).size();
        System.out.println(colData);

        //Read data from the Rows
        String row = ".//*[@id='leftcontainer']/table/tbody/tr/td[1]";
        int rowData = wd.findElements(By.xpath(row)).size();
        System.out.println(rowData);

        //To prinit all the data from the table
        //*[@id="leftcontainer"]/table/tbody/tr[2]/td[1]

        String fristPart = "//*[@id=\"leftcontainer\"]/table/tbody/tr[";
        String secondPart = "]/td[";
        String thirdPart = "]";

        for (int i = 1; i < rowData; i++)
        {
            for (int j = 1; j < colData; j++)
            {
                String finalPart = fristPart + i + secondPart + j + thirdPart;
                //System.out.println(finalPart);
                System.out.print(wd.findElement(By.xpath(finalPart)).getText());
                excelData ed = new excelData();
                String excelPath ="C:\\SeleniumTraining\\Test3.xlsx";
                String data1 =wd.findElement(By.xpath(finalPart)).getText();
                ed.writeData1(excelPath, "Test3",i,j,data1);

            }
            System.out.println();

        }
        wd.close();
    }

    }

