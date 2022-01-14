package ex1;

public class MyList {
	private Cell firstCell ;
	private int size ;
	
	public MyList() {
		size =  0 ;
	}
	
	public void add(String str) {
		if(str == null) {
			throw new NullPointerException();
		}
		else if(firstCell == null) {
			firstCell = new Cell(str);
			size ++ ;
		}
		else {
			firstCell = new Cell(str,firstCell);
			size++;
		}
	}
	
	public void add(String str, int index) {
		if(index > size) {
			throw new IllegalArgumentException() ;
		}
		Cell c ;
		c = firstCell ;
		if (index == 0) {
			firstCell = new Cell(str, firstCell) ;
			size ++ ;
		}
		else {
			for(int i = 0 ; i <= index ; i ++) {

				if( i == index - 1) {
					
					c.setSuccessor(new Cell(str,c.getSuccessor()));
					size ++ ;
					break;
				}
				else if(i != index) {
					c = c.getSuccessor() ;
				}
			}
		}

		
	}
	
	public void addLast(String str) {
		if(str == null) {
			throw new NullPointerException();
		}
		Cell c ;
		c = firstCell ;
		if(c == null) {
			add(str);
		}
		else {
			while(true) {
				if(c.getSuccessor() == null) {
					c.setSuccessor(new Cell (str));
					this.size ++ ;
					break ;
				}
				c = c.getSuccessor() ;
				
			}
		}

	}
	
	public int size() {
		return size;
	
	}
	
	@Override
	public String toString() {
		Cell c ;
		c = firstCell ;
		StringBuffer strb = new StringBuffer();
		while(true) {
			if(c.getSuccessor() != null) {
				strb.append(c.getValue() + ", ");
				c = c.getSuccessor();
			}
			else {
				strb.append(c.getValue());
				break ;
			}
		}
		return strb.toString();
	}
	
	public String get(int i) {
		
		if(i >= size || size == 0 || i < 0) {
			throw new IllegalArgumentException() ;
		}
		Cell c ;
		c = firstCell ;
		
		for(int j = 0 ; j <= i ; j ++) {
				if( i == j ) {
					return c.getValue();
				}
				c = c.getSuccessor() ;
		}
		return null ;
	}
	
	public int sumLetter() {
		int sum = 0 ;
		Cell c ;
		c = firstCell ;
		while(true) {
			if(c.getSuccessor() != null) {
				sum += c.getValue().length();
				c = c.getSuccessor();
				
			}
			else {
				sum += c.getValue().length();
				break ;
			}
		}
		return sum ;
		
	}
	
}