package array1234;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListStart {
	  public static void main(String[] args) {
		  String[] als = {"Volvo","BMW","Ford","Mazda"};
//		  ArrayList<String> cars = new ArrayList<String>();
		  ArrayList<String> cars = new ArrayList<>(Arrays.asList(als));
		  System.out.println(cars);
 //		  
		  cars.add("Hyundai");		    
//		    cars.get(0);
		    cars.set(0, "Opel");
//		    cars.remove(0);
//		    cars.clear();
//		    cars.size();    

		  for (int i = 0; i < cars.size(); i++) {
			  System.out.print( "√ " + "☑ " + "⯀  " + cars.get(i));
//		    	System.out.println(cars.remove(i));
//		    	System.out.println(cars);
		    }
	  }
}
