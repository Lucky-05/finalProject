package Project;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;

public class ReaderClass {
	
	public static String ReadArchive(String route) {
		File file = new File(route);
		String result = ""; 
		
		try (BufferedReader buffered = new BufferedReader(new FileReader(file))){
			String line; 
			
			while((line = buffered.readLine()) != null) {
				result = line+ "\n";
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		return result; 
		
	}
}
