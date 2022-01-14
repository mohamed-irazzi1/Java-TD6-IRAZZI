package ex1;

public class Cell {
	
	private String value ;
	private Cell successor ;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Cell getSuccessor() {
		return successor;
	}
	public void setSuccessor(Cell successor) {
		this.successor = successor;
	}
	public Cell(String value) {
		this(value, null);
	}
	
	public Cell(String str, Cell successor) {
		this.value = str ;
		this.successor = successor ;
	}
}