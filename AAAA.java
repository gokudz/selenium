package aaaa;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AAAA {


	@Test(priority = 1)
	public void login()
	{
		System.out.println("sinda");
	}
	@Test(priority = 2)
	public void home()
	{
		
		System.out.println("chiko");
	}
	@Test(priority = 3)
	public void profile()
	{
		System.out.println("pika");
	}
	@Test(priority = 4)
	public void logout()
	{
		System.out.println("toto");
	}
	@Test(priority = 5)
	public void close()
	{
		System.out.println("sindaa");
	}
	
	
	public Object[][] TestDataProcess() throws BiffException, IOException
	{
		
		// Open file
		File f=new File("D:\\MygmailData.xls");
		
		
		// get Workbook
		Workbook wb=Workbook.getWorkbook(f);
		
		
		// Get Sheet
		Sheet sh=wb.getSheet(0);
		
		
		
		// Get Row count
		int rcount=sh.getRows();
		int ccount=sh.getColumns();
		
		
		System.out.println("No.of Rows : "+rcount);
		System.out.println("No.of Columns : "+ccount);

}
