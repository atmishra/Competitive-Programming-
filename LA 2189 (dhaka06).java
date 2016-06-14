import java.util.Scanner;

class Main{
	int n;
	BigInt num;
	static Scanner scn = new Scanner(System.in);
	void input(){
		n= scn.nextInt();
		if(n==0)
			exit(0);
	}

	public static void main(String[] args) {
		
		Main obj = new Main();
		obj.input();
	}
}