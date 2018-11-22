package trial;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class User {
	private String name;
	private String password;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	createSheet mySheet = new createSheet("creditentials");
	public void signUp(String name, String password) {
		this.setName(name);
		this.setPassword(password);
		
		System.out.println(mySheet.getRowNum());
		mySheet.createRow(mySheet.getRowNum());
		try {
			mySheet.createCell(0, this.getName());
			mySheet.createCell(1,this.getPassword());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		User christian = new User();
		christian.setName("Christian");
		christian.setPassword("22199855");
		christian.signUp("Christian", "1235");
		christian.signUp("Oscar Owayo", "14535");
		christian.signUp("Tony Chisenga", "123864");
		christian.signUp("John Nyagaka", "1238645");
//		christian.writeName();
//		christian.writePassword();

	}
}
