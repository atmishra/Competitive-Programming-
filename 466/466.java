import java.util.*;

class Main {

    int test;
    String str1;
    Scanner scn = new Scanner(System.in);

    void Solution() {

        ArrayList<Integer> per = new ArrayList<Integer>();
        ArrayList<String> values = new ArrayList<String>();
        test = Integer.parseInt(scn.nextLine());
       
        while (test > 0) {

            scn.nextLine();
            str1 = scn.nextLine();

            for (String temp : str1.split("\\s")) {

                per.add((Integer.parseInt(temp)) - 1);

            }
            for (int i = 0; i < per.size(); i++) {
                
                values.add(null);
            }
            String str2 = scn.nextLine();
            String []arr = str2.split("\\s");
            for (int i = 0; i < per.size(); i++) {
               // System.out.println(scn.next());
                values.set(per.get(i), arr[i]);
            }
            if (test != 0) {
                System.out.println("");
            }

            for (String s : values) {
                System.out.println(s);
            }
            test--;
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.Solution();

    }

}
