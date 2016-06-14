
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Atul Mishra
 */
public class Main {

   // Scanner scn = new Scanner(System.in);
     BufferedReader scn=new BufferedReader(new InputStreamReader(System.in));
    int max, diff, first, next, flag = 0;

    public void run() {
        try {
            while (scn.hasNextLine()) {
                max = scn.nextInt();
                flag = 0;
                if (max == 1) {
                    System.out.println("Jolly");
                } else {

                    int[] arr = new int[max];
                    first = scn.nextInt();
                    for (int i = 1; i < max; i++) {

                        next = scn.nextInt();
                        diff = Math.abs(next - first);
                        if (diff > max - 1) {
                            System.out.println("Not jolly");
                            flag = 1;
                            break;
                        }
                        arr[diff] = 1;
                        first = next;
                    }
                    if (flag == 0) {
                        for (int i = 1; i < max; i++) {
                            if (arr[i] == 0) {
                                System.out.println("Not jolly");
                                break;
                            }
                            if (i == max - 1) {
                                System.out.println("Jolly");
                            }
                        }

                    }

                }
            }
        } catch (Exception e) {
            System.out.println("caught error");
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.run();
    }
}
