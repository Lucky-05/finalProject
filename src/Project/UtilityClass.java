package Project;

public class UtilityClass {
	private int value;
	private String[][] matrix;
	
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
	
	public void setMatrix(String[][] matrix) {
		this.matrix= matrix;
	}
	public String[][] getMatrix(){
		return this.matrix;
	}
	
}
