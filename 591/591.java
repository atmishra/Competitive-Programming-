import java.util.Scanner;
 
 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T;
        int Kase =1;
        while ((T = in.nextInt()) != 0) {
            int[] w = new int[T];
            int avg = 0;
            while (T-- != 0) {
                w[T] = in.nextInt();
                avg += w[T];
            }
            avg /= w.length;
            int carried = 0;
            for (int n : w) {
                if (n > avg)
                    carried += n - avg;
            }
            System.out.println("Set #"+ Kase++);
            System.out.println("The minimum number of moves is "+carried+".");
            System.out.println("");
        }
    }
}