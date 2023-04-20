package Project;

public class ActiveClass {
	
	/*
	 * Todos los arreglos/matrices son ragged 
	 * La última fila solo tiene una columna que sirve para el counter 
	 * Por eso es ragged y creo que es una buena solución
	*/
	
	
	

	public String[][] searchClass(String key, String[][] matrix){
        int counter = 0;
    

    for (int i = 0; i < matrix.length; i++) {
        if(matrix[i][6].equalsIgnoreCase(key)){
        counter++;
        }
    }

    String[][] result = new String[counter][matrix[0].length];
    result = new String[counter+1][0];

    for (int i = 0; i < result.length; i++) {
       
        if(matrix[i][6].equalsIgnoreCase(key)){
            for (int j = 0; j < result[i].length; j++) {
              result[i][j] = matrix[i][j]; 
            }
            }
    }


    result[result.length-1][0] = Integer.toString(counter);
    
    return result;
    }
	
	
	
	public String[][] searchEdad(int key0, String[][] matrix){
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
	    result = new String[counter+1][0];

	    for (int i = 0; i < result.length; i++) {
	       
	        if(matrix[i][20].equalsIgnoreCase(key)){
	            for (int j = 0; j < result[i].length; j++) {
	              result[i][j] = matrix[i][j]; 
	            }
	            }
	    }


	    result[result.length-1][0] = Integer.toString(counter);
	    
	    return result;
		
	}

	
	public String[][] searchLocation(String key, String[][] matrix){
		int counter = 0;
	    
		
		
	    for (int i = 0; i < matrix.length; i++) {
	        if(matrix[i][20].equalsIgnoreCase(key)){
	        counter++;
	        }
	    }

	    String[][] result = new String[counter][matrix[0].length];
	    result = new String[counter+1][0];

	    for (int i = 0; i < result.length; i++) {
	       
	        if(matrix[i][20].equalsIgnoreCase(key)){
	            for (int j = 0; j < result[i].length; j++) {
	              result[i][j] = matrix[i][j]; 
	            }
	            }
	    }


	    result[result.length-1][0] = Integer.toString(counter);
	    
	    return result;
		
	}
	
	
	public String[][] searchDisease(String key, String[][] matrix){
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
	    result = new String[counter+1][0];

	    for (int i = 0; i < result.length; i++) {
	       
	        if(matrix[i][7].equalsIgnoreCase(key)){
	            for (int j = 0; j < result[i].length; j++) {
	              result[i][j] = matrix[i][j]; 
	            }
	            }
	    }


	    result[result.length-1][0] = Integer.toString(counter);
	    
	    return result;
		
	}
	
	
}
