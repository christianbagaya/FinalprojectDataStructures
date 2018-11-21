package trial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class csvReaderWriter {
	
	private String csvPath = "C:\\Users\\Christian Bagaya\\eclipse-workspace\\Practice\\Final Project\\src\\trial";
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		User christian =  new User();
		christian.setName("Christian");
		christian.setPassword("22199855chris");
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("creditential sheet");
		
		HSSFRow names = sheet.createRow(0);
		HSSFCell cell = names.createCell(0);
		cell.setCellValue("Name");
		names.createCell(1).setCellValue("Password");
		
		HSSFRow userName = sheet.createRow(1);
		HSSFCell creditent = userName.createCell(0);
		
		creditent.setCellValue(christian.getName());
		userName.createCell(1).setCellValue(christian.getPassword());
		
		
		workbook.write(new FileOutputStream("dataBase.csv"));
		workbook.close();
	}
}
