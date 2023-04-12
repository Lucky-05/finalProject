package Project;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;

public class ReaderClass {
	public static final int columns = 3; 
	
	public static String ReadArchive(String route) {
		File file = new File(route);
		String result = ""; 
		int counter = 0;
		String[] temporal;
		String[][] user;
		
		

		try (BufferedReader buffered = new BufferedReader(new FileReader(file))){
			String line; 
			
			while((line = buffered.readLine()) != null) {
				counter ++;
			}
			
			user = new String[3][counter];
			
			for(int i = 0; i<counter; i++) {
				line = buffered.readLine();
				 temporal = line.split(" ");
				for(int j = 0; j< temporal.length; j++) {
					 user[j][i] = temporal[j];
					
				}
			}
			
			
			buffered.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		return result; 
		
	}
}
