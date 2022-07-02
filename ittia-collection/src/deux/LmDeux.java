package deux;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LmDeux {

	public static void main(String[] args) {
		String s = LmDeux.readfiler("/home/migowj/GDS_chart/Ex/Line Merge/src/deux/7OBJ");
		System.out.println(s.trim());
		String	delims = "[.....................................]+";
		String[] tokens = s.split(delims);
//		for (int i = 0; i < tokens.length; i++)
//		    System.out.println(tokens[i]);
		for (int i = 0; i < tokens.length; i++)
		    System.out.println(tokens[i]);
	}
	
	public static String readfiler(String readf) {
		String finalString="";
		try{
			File textDirName = new File(readf); 
				Scanner myReader = new Scanner(textDirName);
				StringBuilder stringBuilder = new StringBuilder();
				while (myReader.hasNextLine()) {
						String data = myReader.nextLine().trim();
						stringBuilder.append(data);
				}
				finalString = stringBuilder.toString();
				System.out.println(finalString);
	       myReader.close();
		}catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return finalString;
    }
}
