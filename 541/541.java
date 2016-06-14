
import java.util.*;

class Main {

    int size, numR = 0, numC = 0;
    int row, sumRow = 0;
    int col, sumCol = 0;
    boolean loop = true;
    Scanner scn = new Scanner(System.in);

    void Solution() {
        while (loop) {
            size = Integer.parseInt(scn.nextLine());

            if (size == 0) {
                System.exit(0);
            }
            int[][] mat = new int[size][size];

            for (int i = 0; i < size; i++) {
                String str = scn.nextLine();
                String[] temp = str.split("\\s");
                for (int j = 0; j < size; j++) {
                    mat[i][j] = Integer.parseInt(temp[j]);

                }

            }
            numR=0;
            numC=0;
            for (int i = 0; i < size; i++) {
                 sumRow = 0;
                for (int j = 0; j < size; j++) {

                    sumRow += mat[i][j];
                }

                if ((sumRow % 2) != 0) {
                    numR++;
                    row = i + 1;

                }
            }
            for (int i = 0; i < size; i++) {
                 sumCol = 0;
                for (int j = 0; j < size; j++) {

                    sumCol += mat[j][i];
                }

                if ((sumCol % 2) != 0) {
                    numC++;
                    col = i + 1;

                }
            }

            if (numC == 0 & numR == 0) {
                System.out.println("OK");
            }

            if (numC == 1 & numR == 1) {
                System.out.println("Change bit (" + row + "," + col + ")");
            }

            if (numC > 1 || numR > 1) {
                System.out.println("Corrupt");

            }

        }

    }

    public static void main(String... args) {
        Main obj = new Main();
        obj.Solution();
    }
}
