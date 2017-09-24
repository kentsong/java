package note.pattern.creational.FactoryMethod.sample_2016.document;

import java.util.Calendar;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		System.out.println("cal = "+cal.hashCode());
		System.out.println("cal2 = "+cal2.hashCode());
		
		System.out.println(Runtime.getRuntime().hashCode());
		System.out.println(Runtime.getRuntime().hashCode());
		System.out.println(Runtime.getRuntime().freeMemory());
		
		//Calendar.get
	}

}
