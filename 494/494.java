import java.util.Scanner;
//import java.util.*;

class Main{
	 static Scanner scn = new Scanner(System.in);
	 static String input;
	  
	public static void main(String[] args) {
		Main obj = new Main();
		
		while(scn.hasNext()){
			input= scn.nextLine();
			input= input.replaceAll("[^A-Za-z]", " ");
			//System.out.println(input);
			String[] words = input.trim().split("\\s+");
			System.out.println(words.length);
		}

			
	}

}