import java.util.Scanner;

public class calendar{
    public static void main (String [] args){
        Scanner input= new Scanner (System.in);
        
        System.out.print("Year  : ");
        int year = input.nextInt();
        System.out.print("Month : ");
        int mon = input.nextInt();
        
        int daysPassed = 0;
        for(int iy = 1970;iy<year;iy++)daysPassed+=iy%4==0&&iy%100!=0||iy%400==0?366:365;
        for(int im = 1;im<mon;im++)daysPassed+=getMonth(im,year);
        
        System.out.println(daysPassed+" " + (daysPassed%7));
        
        //print
        
        int starDay = daysPassed % 7;
        int monthDay = getMonth(mon,year);
        for(int is = 0;is<7;is++)System.out.print((is+1)+"\t");
        System.out.println("\n");
        for(int id = 0;id<starDay;id++)System.out.print("\t");
        while (monthDay-->0){
            if(starDay>=6){
                System.out.print((getMonth(mon,year)-monthDay)+"\t");
                System.out.println();
                starDay-=7;
            }else{
                 System.out.print((getMonth(mon,year)-monthDay)+"\t");
            }
            starDay++;
        }
    }
    
    static int getMonth(int m,int y){
        switch (m) {
            
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;
            case 2:
                return y%4==0&&y%100!=0||y%400==0?29:28;
            default:return 30;
        }
    }
}