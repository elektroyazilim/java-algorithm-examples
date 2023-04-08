package elektroyazilim;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class ExcelUtils{
    public static String getDataXRowYCell(String fileName, String sheetName, int rowCount, int cellCount) throws IOException {


        Sheet sheet = getExcel(fileName).getSheet(sheetName);
        Row row = sheet.getRow(rowCount);
        Cell cell = row.getCell(cellCount);


        return cell.toString();
    }

    public static ArrayList<String> getDataXRow(String fileName, String sheetName, String rowName) throws IOException {

        Sheet sheet = getExcel(fileName).getSheet(sheetName);

        int i = 0;
        for (Row row : sheet) {
            String rname = row.getCell(0).getStringCellValue();

            if (rname.equalsIgnoreCase(rowName)) {
                break;
            }
            i++;
        }

        int lastCellNum = sheet.getRow(i).getLastCellNum();
        ArrayList<String> datalistFromExcel = new ArrayList<>();
        for (int j = 1; j < lastCellNum; j++) {
            datalistFromExcel.add(sheet.getRow(i).getCell(j).toString());
        }
        return datalistFromExcel;

    }

    public static ArrayList<String> getDataYCells(String fileName, String sheetName, String columnName) throws IOException // all row in particular cell
    {
        Sheet sheet = getExcel(fileName).getSheet(sheetName);
        int cellCount = sheet.getRow(0).getLastCellNum();

        int whichCell = -1;
        for (int i = 0; i < cellCount; i++) {
            String cellName = sheet.getRow(0).getCell(i).getStringCellValue();
            if (cellName.equalsIgnoreCase(columnName)) {
                whichCell = i;
                break;
            }
        }

        int rowCount = sheet.getLastRowNum(); // index olarak

        ArrayList<String> dataList = new ArrayList<>();
        for (int i = 1; i <= rowCount; i++) {
            dataList.add(sheet.getRow(i).getCell(whichCell).toString());
        }
        return dataList;

    }

    private static boolean isString(Cell ce)  // check number or string
    {
        boolean isNumber = false;
        if (ce.getCellType() == CellType.STRING) {
            System.out.println("String");
        } else // CellType can be NUMERIC, BOOLEAN, ERROR
        {
            //String newType = NumberToTextConverter.toText(ce.getNumericCellValue());
            isNumber = true;
        }

        return isNumber;
    }

    private static Workbook getExcel(String fileName) throws IOException {
        String path = "src/test/resources/" + fileName; // "src/test/resources/data.xlsx"

        FileInputStream file = new FileInputStream(path);
        Workbook excel = new XSSFWorkbook(file);
        return excel;
    }
}
public class ExcelReader {
    public static void main(String[] args) throws IOException {
        ArrayList<String> liste = ExcelUtils.getDataXRow("data/data.xlsx","Sayfa1", "Login");
        // liste = ExcelUtils.getDataYCells("data/data.xlsx","Sayfa1", "Data2");
        System.out.println(liste);
    }
}
