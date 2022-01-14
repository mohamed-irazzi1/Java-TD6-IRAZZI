package ex2;

public class Cell<T> {
	
	private T value ;
	private Cell<T> successor ;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Cell<T> getSuccessor() {
		return successor;
	}
	public void setSuccessor(Cell<T> successor) {
		this.successor = successor;
	}
	public Cell(T value) {
		this(value, null);
	}
	
	public Cell(T s, Cell<T> successor) {
		this.value = s ;
		this.successor = successor ;
	}
	
}