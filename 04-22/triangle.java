import java.util.Scanner;

public class triangle {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        
        int ma = input.nextInt();
        
        /**
         * just a delta
         */
        for (int i = 0; i < ma; i++) {
            for(int j = 0;  j <= ma - i;  j ++) System.out.print(" ");
            for(int j = 0;  j <= i * 2;   j ++) System.out.print("*");
            System.out.println();
        }
        
        /**
         * fish
         */
         System.out.println("\n---------\n");
        int mb = (int) (ma / 2.0f + 0.5);
        int mc = (int) (mb / 2.0f + 0.5);
        for (int m = 0 ; m <= ma * 2; m++) {
            int i = ma-Math.abs(m - ma);
            for (int j = 0;  j < ma - i;                         j++) System.out.print(" ");
            for (int j = 0;  j < i + 1;                          j++) System.out.print("*");
            for (int j = 0;  j < ma - i - mc;                    j++) System.out.print(" ");
            for (int j = 0;  j < Math.min(i - ma + mb + 1, mc);  j++) System.out.print("*");
            System.out.println();
        }
        
        /**
         * Xmas tree
         */
         System.out.println("\n---------\n");
        for (int i = 0;      i < mc;  i++) { //first stick
            for (int j = 0;  j <= ma - i;               j++) System.out.print(" ");
            for (int j = 0;  j <= i * 2;                j++) System.out.print("*");
            System.out.println();
        }
        for (int i = mc / 2; i < mb;  i++) { //second stick
            for (int j = 0;  j <= ma - i;               j++){ System.out.print(" ");
            for (int j = 0;  j <= i * 2 ;               j++){ System.out.print("*");
            System.out.println();
        }
        for (int i = mb / 2; i < ma;  i++) { //third stick
            for (int j = 0;  j <= ma - i;               j++) System.out.print(" ");
            for (int j = 0;  j <= i * 2;                j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 0;      i < mc;  i++) { //root
            for (int j = 0;  j <= ma - mc / 2;          j++) System.out.print(" ");
            for (int j = 0;  j <= (2 * mc + 0.5f) / 2;  j++) System.out.print("*");
            System.out.println();
        }
        
    }
    
}