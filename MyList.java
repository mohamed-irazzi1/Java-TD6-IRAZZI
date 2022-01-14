package ex2;

public class MyList<T> {
	private Cell<T> firstCell ;
	private int size ;
	
	
	
	public MyList() {
		size =  0 ;
	}
	public void add(T s) {
		if(s == null) {
			throw new NullPointerException();
		}
		if(firstCell == null) {
			firstCell = new Cell<>(s);
			size ++ ;
		}
		else {
			firstCell = new Cell<>(s,firstCell);
			size++;
		}
	}
	
	public void add(T s, int index) {
		if(index > size) {
			throw new IllegalArgumentException() ;
		}
		Cell<T> c = firstCell ;
		if (index == 0) {
			firstCell = new Cell<>(s, firstCell) ;
			size ++ ;
		}
		else {
			for(int i = 0 ; i <= index ; i ++) {
				

				if( i == index - 1) {
		
					c.setSuccessor(new Cell<>(s,c.getSuccessor()));
					size ++ ;
					break;
				}
				else if(i != index) {
					c = c.getSuccessor() ;
				}
			}
		}

		
	}
	
	public void addLast(T s) {
		if(s == null) {
			throw new NullPointerException();
		}
		Cell<T> c = firstCell ;
		if(c == null) {
			add(s);
		}
		else {
			while(true) {
				if(c.getSuccessor() == null) {
					c.setSuccessor(new Cell<> (s));
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
		StringBuffer sb = new StringBuffer();
		Cell<T> c  = firstCell ;
		while(true) {
			if(c.getSuccessor() != null) {
				sb.append(c.getValue() + ", ");
				c = c.getSuccessor();
			}
			else {
				sb.append(c.getValue());
				break ;
			}
		}
		return sb.toString();
	}
	
	public T get(int i) {
		if(i >= size || size == 0 || i < 0) {
			throw new IllegalArgumentException() ;
		}
		Cell<T> c = firstCell ;
		
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
		Cell<T> c ;
		c = firstCell ;
		while(true) {
			if(c.getSuccessor() != null) {
				sum += ((String) c.getValue()).length();
				c = c.getSuccessor();	
			}
			else {
				sum += ((String) c.getValue()).length();
				break ;
			}
		}
		return sum ;
		
	}
	
	public boolean contrain(T value) {
		if(firstCell == null) {
			throw new IllegalStateException() ;
		}
		else if(value == null) {
			throw new NullPointerException() ;
		}
		Cell<T> c ;
		c = firstCell ;
		while(c.getSuccessor() != null) {
			if(c.getValue().equals(value)) {
				return true ;
			}
			c = c.getSuccessor();	
		}
		return false ;
	}
	
}