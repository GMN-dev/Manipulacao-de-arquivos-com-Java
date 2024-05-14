import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	public static void main(String[] args)  {

//		=-=-=-=-=-=-==-=-=-=- Usando Scanner com File 
		
//		File file = new File("C:\\temp\\teste.txt");
//		Scanner sc = null;
//		try {
//			sc = new Scanner(file);
//			while(sc.hasNext()) {
//				System.out.println(sc.nextLine());
//			}	
//		}
//		catch(Exception err) {
//			System.out.println(err);
//		}finally {
//			if(sc != null) {
//				sc.close();
//			}
//		}
		
		
//		-=-=-=-=--=-=-=-=- FileReader/BufferedReader SEM try-with-resources
		
//		String stringPath = "C:\\temp\\teste.txt";
//		
//		FileReader file = null;
//		BufferedReader buff = null;
//		
//		try {
//			file = new FileReader(stringPath);
//			buff = new BufferedReader(file);
//			
//			String line = buff.readLine();
//			
//			while(line != null){
//					System.out.println(line);
//					line = buff.readLine();
//			}
//			
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}finally {
//			if(file != null && buff != null) {
//				try {
//					file.close();
//					buff.close();
//				}catch(Exception e) {
//					System.out.println(e.getMessage());
//				}
//			}
//		}
		
		
//		-=-=-=-=-=-=-=-=-=-=-=-=- FileReader/BufferedReader COM try-with-resources
		
//		String stringPath = "C:\\temp\\teste.txt";
//		
//		
//		try(BufferedReader buff = new BufferedReader(new FileReader(stringPath))){
//			String line = buff.readLine();
//			
//			while(line != null){
//					System.out.println(line);
//					line = buff.readLine();
//			}
//			
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
	} 
}
