package Project;



import javax.swing.*;
import javax.swing.filechooser.*;

public class FileChooserConfig {

	
	public void Main(String args[]) {	
	}
	
	
	public static String getRoute(){
		
		String route = "";
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Comma separated","csv");
		chooser.setFileFilter(filter);
		
		int response = chooser.showOpenDialog(chooser);
		
		switch (response){
		case JFileChooser.APPROVE_OPTION: 
			route = chooser.getSelectedFile().getPath();
			break;
		case JFileChooser.CANCEL_OPTION:
			route =  "Cancelled";
			break;
		case JFileChooser.ERROR_OPTION:
			route = "Error";
			break; 
		default:
			route =  "Select document";
			
		}
		
		return route; 
		
		
	}
	
	
	
	
	

}
