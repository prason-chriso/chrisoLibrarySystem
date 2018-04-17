/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.controller;

import java.awt.Desktop;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;

/**
 *
 * @author Amit
 */
public class MarksheetDAO {

    public Map<String, Object[]> loadMarksheet(String filePath) {
        //now here we try to get the value of all the sperad sheet of the current xls file and 
        //store it as tthe Map class object
        int keyCounter = 0;
        Map<String, Object[]> map = new TreeMap<String, Object[]>();

        try {
            FileInputStream fis = new FileInputStream(new File(filePath)); //can generate file not found        
            try { //nesteed try

//        Workbook workbook = WorkbookFactory.create(fis);//new HSSFWorkbook(fis);
                Workbook workbook = new XSSFWorkbook(fis);
        //    Sheet sheet = workbook.getSheetAt(0); //can generate sheet not available exception 
                //         HSSFSheet sheet = (HSSFSheet)workbook.getSheetAt(0);
                XSSFSheet sheet = (XSSFSheet) workbook.getSheetAt(0);
                LinkedList node = new LinkedList();

                for (Iterator<Row> row = sheet.rowIterator(); row.hasNext();) {
                    XSSFRow r = (XSSFRow) row.next();
//                HSSFRow r =(HSSFRow) row.next();
                    for (Iterator<Cell> cell = r.cellIterator(); cell.hasNext();) {
    //                  HSSFCell c = (HSSFCell)cell.next();
                        XSSFCell c = (XSSFCell) cell.next();
                        node.add(c.getRichStringCellValue());
                    }//end of inner for each loop
                       map.put("rec" + keyCounter++, node.toArray());
                }//end of for loop 
            }//end of nested try
            catch (Exception ex) { //nested catch block 
                return null;
            }//end of the nested catch block ;

        }//end of the outter try block 
        catch (Exception ex) {
            System.out.println(ex);
        }//end of the outer catch block 
        return map;

    }//end of load marksheet block

    public void createMarksheet() {
    }

    public void saveMarksheet() {
    }

    public void deleteMarksheet() {
    }

    public void printMarksheet() {
    }

}
