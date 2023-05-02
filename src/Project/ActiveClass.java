package Project;

public class ActiveClass {
	
	
	
	//proteger todos los metodos de null
	

	public UtilityClass searchClass(String key, String[][] matrix){
        int counter = 0;
    
    for (int i = 2; i < matrix.length; i++) {
    
    		if(matrix[i][6] != null) {
    			if(matrix[i][6].equalsIgnoreCase(key)){
    		        counter++;
    		        
    		        }	
    		}
    		
    		
        
       
    }
    System.out.println(counter);
    String[][] result = new String[counter][matrix[0].length];

    

    for (int i = 0; i < result.length; i++) {
    	if(matrix[i][6] != null){
        if(matrix[i][6].equalsIgnoreCase(key)){
            for (int j = 0; j < result[i].length; j++) {
              result[i][j] = matrix[i][j];
              
            }
            }
    }
        
    }

    UtilityClass utility = new UtilityClass(result, counter);

    
    return utility;
    }
	
	
	
	public UtilityClass searchEdad(int key0, String[][] matrix){
		int counter = 0;
	    String key = "";
		if(key0<50) {
			key = "Overall";
		}
		else if(key0>= 50 && key0<65) {
			key = "50-64 years";
		}
		else if(key0>=65) {
			key = "65 years or older";
		}
		
		
	    for (int i = 0; i < matrix.length; i++) {
	        if(matrix[i][20].equalsIgnoreCase(key)){
	        counter++;
	        }
	    }

	    String[][] result = new String[counter][matrix[0].length];
	 

	    for (int i = 0; i < result.length; i++) {
	       
	    	System.out.println(matrix[i][20]);
	        if(matrix[i][20].equalsIgnoreCase(key)){
	            for (int j = 0; j < result[i].length; j++) {
	              result[i][j] = matrix[i][j]; 
	            }
	            }
	    }


	    UtilityClass utility = new UtilityClass(result, counter);

	    
	    return utility;
		
	}

	
	public UtilityClass searchLocation(String key, String[][] matrix){
		int counter = 0;
	    
		
		
	    for (int i = 0; i < matrix.length; i++) {
	        if(matrix[i][4].equalsIgnoreCase(key)){
	        counter++;
	        }
	    }

	    String[][] result = new String[counter][matrix[0].length];
	

	    for (int i = 0; i < result.length; i++) {
	       
	        if(matrix[i][4].equalsIgnoreCase(key)){
	            for (int j = 0; j < result[i].length; j++) {
	              result[i][j] = matrix[i][j]; 
	            }
	            }
	    }

	    UtilityClass utility = new UtilityClass(result, counter);

	    
	    return utility;
		
	}
	
	
	public UtilityClass searchDisease(String key, String[][] matrix){
		int counter = 0;
	   
		
		
	    for (int i = 0; i < matrix.length; i++) {
	    	String temporal[] = matrix[i][7].split(" ");
	    	
	    	for(int j = 0; j< temporal.length; j++) {
	    		if(temporal[j].equalsIgnoreCase(key)){
	    	        counter++;
	    	        }
	    	}
	        
	    }

	    String[][] result = new String[counter][matrix[0].length];
	   

	    for (int i = 0; i < result.length; i++) {
	       
	    	
 	String temporal[] = matrix[i][7].split(" ");
	    	
	    	for(int j = 0; j< temporal.length; j++) {
	    		if(temporal[j].equalsIgnoreCase(key)){
	    			for (int k = 0; k < result[i].length; k++) {
	  	              result[i][k] = matrix[i][k]; 
	  	            }
	    	        }
	    	}
	    	
	    	
	    }

	    UtilityClass utility = new UtilityClass(result, counter);

	    
	    return utility;
		
	}
	
	
}
