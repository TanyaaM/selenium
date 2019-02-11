package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException{
		
		//Make aconnection with your excel file
		FileInputStream excelfile =new FileInputStream("G:\\Selenium\\data.xlsx");

		XSSFWorkbook excelWBook =new XSSFWorkbook(excelfile);
		
		XSSFSheet excelWSheet =excelWBook.getSheet("TestData");
		
		XSSFRow R=excelWSheet.getRow(0);
		XSSFCell C=excelWSheet.getRow(0).getCell(3);
		
		System.out.println(C);
		
		int LRow=excelWSheet.getLastRowNum();//get TOTAL NUMBER OF ROWS
		int LCol=excelWSheet.getRow(0).getLastCellNum();//get total number of column
		int FRow=excelWSheet.getFirstRowNum();
		int FCol=excelWSheet.getRow(0).getFirstCellNum();
		
		System.out.println(LRow);
		System.out.println(LCol);
		
		for(int i=FRow;i<=LRow;i++)
		{
			for(int j=FCol;j<LCol;j++)
			{
				System.out.print("---------"+excelWSheet.getRow(i).getCell(j));
			}
			System.out.println();
		}
		
		
		
	}

}
