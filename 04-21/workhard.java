//import java.util.Scanner;
public class workhard{
    public static void main(String[]arsaddzddadasd){
        int i=0;
        int sum = 0;
        
        //while
        while (i <=50){
            sum+=i;
            i+=2;
        }
        System.out.println(sum);
        
        //for
        sum = 0;
        for (int m = 0;m<=50;m+=2){
            sum += m;
        }
        System.out.println(sum);
        
        //loop
        i=0;
        sum=0;
        do{
            i+=2;
            sum+=i;
        }while(i<50);
        System.out.println(sum);
    }
}