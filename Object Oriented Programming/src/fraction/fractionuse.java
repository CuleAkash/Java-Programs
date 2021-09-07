package fraction;

public class fractionuse {

	public static void main(String[] args) {
		fraction f1= new fraction(4,6);
		f1.print();
		f1.setNumerator(8);
		System.out.println(f1.getNumerator());
		f1.increment();
		f1.print();
		fraction f2= new fraction(2,3);
		f2.print();
		f2.setNumerator(7);
		System.out.println(f2.getNumerator());
		//f1.add(f2);
		f1.print();
		fraction f3= fraction.add(f1,f2);
		f3.print();
		fraction f4= fraction.subtract(f1, f2);
		f4.print();
		fraction f5= fraction.multiply(f1, f2);
		f5.print();
		fraction f6= fraction.divide(f1, f2);
		f6.print();
		
		
		

	}

}
