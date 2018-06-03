import java.util.*;
import com.*;

public class month {
    
    public static void main (String [] args){
        
        
        Scanner input = new Scanner (System.in);
        System.out.println("input Year:");
        int y = (int)input.nextInt();
        System.out.println("input Month:");
        int m = (int)input.nextInt();
        switch (m) {
            
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                System.out.println(31);
            break;
            case 2:
                System.out.println(y%4==0&&y%100!=0||y%400==0?29:28);
            break;
            default:System.out.println(30);
        }
    }
}