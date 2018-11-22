package trial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class createSheet {
	HSSFWorkbook workbook = new HSSFWorkbook();
	HSSFSheet sheet = workbook.createSheet("myDatabase");
	HSSFRow rowName;
	HSSFCell cellName;
	private String sheetName;
	private int rowNum=1;
	private int cellNum; 
	public createSheet(String sheetName) {
		this.setSheetName(sheetName);
	}
	public String getSheetName() {
		return sheetName;
	}

	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}
	public int getRowNum() {
		return rowNum;
	}
	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}	
	
	public int getCellNum() {
		return cellNum;
	}
	public void setCellNum(int cellNum) {
		this.cellNum = cellNum;
	}
	
	public void createCell(int cellNum,String cellValue) throws FileNotFoundException, IOException {
//		this.rowName = sheet.createRow(rowNum);
		this.cellName = rowName.createCell(cellNum);
		this.cellName.setCellValue(cellValue);
		this.setCellNum(cellNum);
		System.out.println("Cells: "+this.getCellNum());
		workbook.write(new FileOutputStream("xyz.csv"));
		workbook.close();
	}
	
	public void createRow(int theRownumber) {
		this.rowName = sheet.createRow(theRownumber);
		this.rowNum = theRownumber;
		this.rowNum++;
//		System.out.println(this.getRowNum());
		
	}
	
	public void createCell() {
		this.rowName= sheet.createRow(1);
	}
	
	public void getCell(HSSFCell cellName) {
		this.cellName = cellName;
	}
	
	public HSSFCell getCell() {
		return cellName;
	}
	
	public void setRowName(HSSFRow rowName) {
		this.rowName = rowName;
	}
	
	public HSSFRow getRow() {
		return rowName;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		createSheet mySheet = new createSheet("creditentials");
//		for (int i=0; i<10; i++) {
//			mySheet.createRow(1);
//			for(int b = 0; b<10; b++) {
//				
//				mySheet.createCell( 1, "lo");
//			}	
//		}
//		
		
		// Mine		
		String fileName="xyz.csv";
		File file=new File(fileName); 
		try {
			Scanner inputStream= new Scanner(file);
			// In case; you want to ignore the fist line. 
			// inputStream.next();   
			while(inputStream.hasNext()) {
				String data=inputStream.next();  // you get the all line
				// String [] values=data.split(",");  
				System.out.println(data+"  "); 
				//System.out.println(values[3]);
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
