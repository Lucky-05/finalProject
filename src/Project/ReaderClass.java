package Project;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;

public class ReaderClass {
	public static final int columns = 38; 
	private String route;
	
	public ReaderClass(String route) {
		this.route = route;
	}
	
	public String[][] ReadArchive() {
		File file = new File(route);
		 
		int counter = 0;
		String[] temporal;
		String text[][]= new String[214463][40];
		
		

		try (BufferedReader buffered = new BufferedReader(new FileReader(file))){
			
			String line; 
			
			while(counter<80000) {
				
				counter ++;
				
				line = buffered.readLine();
				temporal = line.split(",");
				for(int i = 0; i< temporal.length; i++) {
					text[counter][i]= temporal[i];
					
				}
				 
			}

			UtilityClass.total = counter;
			
			return text;
			
			
		}
		
		
		catch(IOException e){
			e.printStackTrace();
		}
		
	
		return null;
		
	}
}
