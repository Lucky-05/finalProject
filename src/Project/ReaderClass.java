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
		String result = ""; 
		int counter = 0;
		String[] temporal;
		String text[][] = null;
		
		

		try (BufferedReader buffered = new BufferedReader(new FileReader(file))){
			String line; 
			
			while((line = buffered.readLine()) != null) {
				counter ++;
			}
			
			text= new String[counter][38];
			
			for(int i = 0; i<counter; i++) {
				line = buffered.readLine();
				 temporal = line.split(",");
				for(int j = 0; j< temporal.length; j++) {
					 text[i][j] = temporal[j];
					
				}
			}
			
			
			buffered.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		return text ;
		
	}
}
