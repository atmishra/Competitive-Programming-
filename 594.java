import java.util.Scanner;

class Main {

    int num, newnum = 0;

    Scanner scn = new Scanner(System.in);
    int[] bin = new int[32];

    void Solution() {
        while (scn.hasNext()) {
            num = Integer.parseInt(scn.nextLine());
            //binary();
            String str = Integer.toBinaryString(num);
            for (int i = 0; i <str.length(); i++) {
                bin[i] = ((str.charAt(i)) - '0');
            }
            
            if (num < 0) {
                bin[31] = 1;
            } else {
                bin[31] = 0;
            }

            for (int i = 0; i <= 7; i++) {
                int temp = bin[i];
                bin[i] = bin[31 - i];
                bin[31 - i] = temp;
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

    /*void binary() {
        int j = 0;
        for (int i = ; i > 0; i = i / 2) {
            (num & i) ? bin[j++] = 1 : bin[j++] = 0;
        }

        if (num < 0) {
            bin[j] = 1;
        } else {
            bin[j] = 0;
        }
    }*/

    public static void main(String... args) {
        Main obj = new Main();
        obj.Solution();
    }
}
