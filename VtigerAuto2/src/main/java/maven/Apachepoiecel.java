package maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Apachepoiecel {

	public static void main(String[] args) {
		File fil=new File("C:\\Users\\Admin\\Desktop//shivmani.xlsx");
		try {
			InputStream obj=new FileInputStream(fil);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
