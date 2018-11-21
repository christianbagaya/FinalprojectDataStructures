package trial;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class User {
	private String name;
	private String password;
	private int col;
	private int r;
	private int cel;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}
	public void writeName() {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("creditential sheet");
		HSSFRow row = sheet.createRow(r);
		HSSFCell cell = row.createCell(cel);
		cell.setCellValue(this.getName());
		row.createCell(1).setCellValue(this.getPassword());
		r++;
		cel++;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
//		HSSFSheet sheet = workbook.createSheet("creditential sheet");
	}
//	public void writePassword() {
//		HSSFRow row = sheet.createRow(r);
//		HSSFCell cell = row.createCell(cel);
//		cell.setCellValue(this.getPassword());
//		row.createCell(1).setCellValue(this.getPassword());
//		r++;
//		cel++;
//	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		User christian = new User();
		christian.setName("Christian");
		christian.setPassword("22199855");
		
		christian.writeName();
//		christian.writePassword();

	}
}
