import java.util.Scanner;
class Main{
	 static Scanner scn = new Scanner(System.in);
	 static String input,revInput;
	 static String []word;
	 static StringBuffer rev;
	  public static void main(String[] args) {
		Main obj = new Main();
		while(scn.hasNext()){
			input= scn.nextLine();
			 word= input.split("\\s+");
			 for(int i=0;i<word.length;i++)
			 {
			 	rev= new StringBuffer(word[i]);
			 	rev=rev.reverse();
			 	revInput=rev.toString();
			 	if(i==word.length-1)
			 		System.out.print(revInput);
			 	else
			 	   System.out.print(revInput+" ");
			 }
			 System.out.println();

			
			
		}
	}
}