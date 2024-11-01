package New_automation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;



public class Properties_file_readwrite {
	public static void main(String[] args) throws IOException {
	Properties pro = new Properties();
	FileInputStream inputstream= new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\First\\src\\test\\resources\\repository\\Repo.properties");

	pro.load(inputstream);
	System.out.println(pro.getProperty("brosers"));
	System.out.println(pro.getProperty("url"));
	FileOutputStream outputstream= new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\First\\src\\test\\resources\\repository\\Repo.properties");

	pro.setProperty("testdata", "12456");
	pro.store(outputstream,null);
}
}