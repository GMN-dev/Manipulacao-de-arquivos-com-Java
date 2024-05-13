import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		File file = new File("C:\\temp\\teste.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}	
			sc.close();
		}
		catch(Exception err) {
			System.out.println(err);
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
		
			
	}
}
