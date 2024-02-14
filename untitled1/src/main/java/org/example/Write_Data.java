package org.example;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Write_Data
{
        @Test
        // any exceptions need to be caught
        public void Test() throws Exception
        {
            // workbook object
            XSSFWorkbook workbook = new XSSFWorkbook();

            // spreadsheet object
            XSSFSheet spreadsheet
                    = workbook.createSheet(" Student Data ");

            // creating a row object
            XSSFRow row;

            // This data needs to be written (Object[])
            Map<String, Object[]> studentData
                    = new TreeMap<String, Object[]>();

            studentData.put(
                    "1",
                    new Object[] { "Grade", "First Name", "Last Name" });

            studentData.put("2", new Object[] { "Fourth", "Shreyansh",
                    "Paspunoori" });

            studentData.put(
                    "3",
                    new Object[] { "Third", "Shresta", "Paspunoori" });

            studentData.put("4", new Object[] { "Second", "Shiva",
                    "Kumar" });

            studentData.put("5", new Object[] { "First", "Madhu",
                    "Jaini" });

            studentData.put("6", new Object[] { "Fifth", "Shankar",
                    "Kumar" });

            Set<String> keyid = studentData.keySet();

            int rowid = 0;

            // writing the data into the sheets...

            for (String key : keyid) {

                row = spreadsheet.createRow(rowid++);
                Object[] objectArr = studentData.get(key);
                int cellid = 0;

                for (Object obj : objectArr) {
                    Cell cell = row.createCell(cellid++);
                    cell.setCellValue((String)obj);
                }
            }

            // .xlsx is the format for Excel Sheets...
            // writing the workbook into the file...
            FileOutputStream out = new FileOutputStream(
                    new File("C:\\SeleniumTraining\\StudentData.xlsx"));

            workbook.write(out);
            out.close();
        }
    }

