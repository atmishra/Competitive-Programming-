import java.util.Scanner;

class Main {

    int num, newnum = 0;

    Scanner scn = new Scanner(System.in);
   

    void Solution() {
        while (scn.hasNext()) {
            num = Integer.parseInt(scn.nextLine());
            //binary();
             int[] bin = new int[32];
            String str = Integer.toBinaryString(num);
            for (int i = 0; i <str.length(); i++) {
                bin[i] = ((str.charAt(i)) - '0');
            }
            
            if (num < 0) {
                bin[31] = 1;
            } else {
                bin[31] = 0;
            }

            for (int i = 0; i <=7; i++) {
                int temp = bin[i];
                bin[i] = bin[24+i];
                bin[24 + i] = temp;
            }

            for (int i = 8; i <=15; i++) {
                int temp = bin[i];
                bin[i] = bin[8+i];
                bin[8 + i] = temp;
            }


            newnum = 0;
            for (int i = 0; i <= 30; i++) {
                newnum += (bin[i] * Math.pow(2, i));

            }
            if (bin[31] == 0) {
                System.out.println(num + " converts to " + newnum);
            } else {
                System.out.println(num + " converts to -" + newnum);
            }

        }
    }

    

    public static void main(String... args) {
        Main obj = new Main();
        obj.Solution();
    }
}
