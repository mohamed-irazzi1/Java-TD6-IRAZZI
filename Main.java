package ex1;

public class Main {

	public static void main(String[] args) {
		
		MyList l = new MyList ();

        l.add("Ronaldo");
        l.add("Messi");
        
        l.addLast("Salah");
        System.out.println(l.toString());
        l.add("Benzema", 3);
        
        System.out.println(l.size());

        System.out.println(l.toString());

	}

}