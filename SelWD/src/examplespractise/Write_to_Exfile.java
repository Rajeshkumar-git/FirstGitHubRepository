package examplespractise;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Write_to_Exfile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		int i=10;
		int b=20;
		int c=i*b;
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\rgundla\\Desktop\\Qshore\\InputFiles\\tempo.xls");
		WritableWorkbook wb=Workbook.createWorkbook(fo);
		WritableSheet ws1=wb.createSheet("One", 0);
		
		Label l1=new Label(0, 0, "C value is" +c);
		ws1.addCell(l1);
		wb.write();wb.close();

	}

}
