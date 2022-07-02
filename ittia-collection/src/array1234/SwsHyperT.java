package array1234;

import java.io.FileWriter;		
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SwsHyperT {
	 public static void main(String[] args) throws Exception {
		 String[] als = {
				 "anxiety & depression", 
				 "irritability & nervousness",
				 "Insomnia", 
				 "Losing weight",
				 "muscle weakness & tremors",
				 "irregular menstrual periods or stop",
				 "sensitive to heat", 
				 "vision problems or eye irritation"
				 }; 
		 String[] als1 = {
				 "fever", "Febrile sense", "Myalgia","cough",
				 "sputum", "sneezing", "sore throat"
				 };
		ArrayList<String> sympt = new ArrayList<>(Arrays.asList(als));
		System.out.println(sympt.toString());
		
		System.out.println("\n>>>>>>>>> inset the number >>>>>>>>>> ");
		for (int i = 0; i < sympt.size(); i++) {
			int ii=i+1;
			System.out.print( "\n\t"+ii+" ☐ " + sympt.get(i)+"\n");
			}
		
		String inputNo;
		//		while(sc.hasNextLine() && !(input = sc.nextLine()).equals("")) {
		try(Scanner sc = new Scanner(System.in)) {
			while(!(inputNo = sc.nextLine()).equals("")) {
				System.out.println("\n........... inset the number ...> ");
				int number = (Integer.parseInt(inputNo)-1);
			
				if (number <= sympt.size()+1) {
				
					String s = sympt.get(number);
	//				sympt.remove(number);
					sympt.set(number,s);	
					 System.out.print( " √ " + "positive Sx...>");
	
					for (int i = 0; i < sympt.size(); i++) {
						 if (i!=number) {
	//					 System.out.print( "\t " +i+ "☐ " + sympt.get(i)+"\n");
						 }else {
						 System.out.print( " " + "√ " + sympt.get(i)+"\n");
						 String slschoice = ("√  " + sympt.get(i));
//						 ArrayList<String>  fruits = new ArrayList<String> (); // new ArrayList<>() 도 가능
//						 fruits.add(slschoice);
//						 String fts = fruits.toString();
						 writelinera("/home/migowj/git/Exercise/Array/src/array1234/sls.txt",slschoice);
						 }
					}
			
				}//-----if
			
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	public static void writelinera(String writef, String fts) throws IOException {
	    try {
	      FileWriter myWriter = new FileWriter(writef, true);
	      
	      myWriter.write("\t"+fts+"\r");
	      myWriter.close();
//		  System.out.println("   ...Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
	 //---------------------------------------------------------	 
}