package Project;

public class UtilityClass {
	private int value;
	 
	private String[][] matrix;
	public static int total; 
	public UtilityClass() {
		
	}
	public UtilityClass(String[][] matrix, int value) {
		this.matrix= matrix;
		this.value= value; 
		
	}
	
	public void setValue(int val) {
		this.value= val;
	}
	public int getValue() {
		return this.value;
	}
	
	public double getPercentage() {
		return value*100/total;
	}
	public void setMatrix(String[][] matrix) {
		this.matrix= matrix;
	}
	public String[][] getMatrix(){
		return this.matrix;
	}
	
	public static String traduceMatrix(String mat[][]) {
		
		String result = ""; 
		for(int i = 0; i< mat.length; i++) {
		for(int j = 0; j<mat[0].length; j++) {
			
			if(j ==1 || j== 2 || j== 4 || j==6 && mat[i][j] != null) {
				result += (mat[i][j]+ " ");
			} 
			else if(j == 7 && mat[i][j] != null) {
				
				result += (mat[i][j]+ "\n");
			}
		}
			
		}
		
		return result; 
		
	}
	
}