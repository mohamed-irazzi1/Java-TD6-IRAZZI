package ex1;

import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;

public class MyListTest1 {

	@Test
	public void sizeList() {
		MyList l = new MyList();
		l.add("voiture");
		l.add("moto");
		assertEquals(2, l.size());
	}
	
	@Test
	public void sizeList2() {
		MyList l = new MyList();
		l.addLast("dernier");
		l.add("toto");
		l.add("tata");
		l.addLast("last");
		
		assertEquals(4, l.size());
	}
	
	@Test
	public void printList() {
		MyList l = new MyList();
		l.add("chaise");
		l.add("table");
		l.add("bureau");
		assertEquals("table, table, table", l.toString());
	}
	
	

	@Test
	public void addList() {
		MyList l = new MyList();
		l.add("toto");
		l.add("tata");
		l.add("titi");
		l.addLast("papa");
		l.addLast("popo");
		l.add("pepe");
		assertEquals("pepe, titi, toto, toto, papa, popo", l.toString());
	}
	

	@Test
	public void addList2() {
		MyList l = new MyList();
		l.addLast("totoLast");
		l.add("toto");
		l.add("titi");
		l.addLast("papa");
		l.addLast("popo");
		l.add("pepe");
		assertEquals("pepe, titi, toto, toto2, papa, popo", l.toString());
	}
	
	@Test
	public void getList1() {
		MyList l = new MyList();
		l.addLast("toto2");
		l.add("toto");
		l.add("titi");
		l.addLast("bla");
		l.addLast("bli");
		l.add("doh");
		assertEquals("doh", l.get(0));
	}
	
	@Test
	public void getList2() {
		MyList l = new MyList();
		l.addLast("toto2");
		l.add("toto");
		l.add("titi");
		l.addLast("bla");
		l.addLast("bli");
		l.add("doh");
		assertEquals("toto", l.get(2));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void getInvalid() {
		MyList l = new MyList();
		l.addLast("toto2");
		l.get(-1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void getInvalid2() {
		MyList l = new MyList();
		l.addLast("toto2");
		l.get(10);
	}
	
	@Test
	public void sumLetterTest() {
		MyList l = new MyList();
		l.addLast("totoo");
		l.add("toto");
		l.add("titi");
		assertEquals(13, l.sumLetter());
	}
	
	@Test(expected=NullPointerException.class)
	public void addNull() {
		MyList l = new MyList();
		l.addLast("totoo");
		l.add(null);
	}
	
	@Test(expected=NullPointerException.class)
	public void addNull2() {
		MyList l = new MyList();
		l.addLast("totoo");
		l.addLast(null);
	}
	
	@Test(expected=NullPointerException.class)
	public void sumNull() {
		MyList l = new MyList();
		l.add("totoo");
		l.add(null);
		assertEquals(5, l.sumLetter());
	}
	
	@Test(timeout=1000)
	public void toStringSpeed() {
		MyList l = new MyList();
		for(int i=0;i<100000;i++) {
			l.add(Integer.toString(i));
		}
		l.toString();		
	}
	

}