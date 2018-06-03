import java.util.Scanner;

enum ChessType{
    CROSS,
    CIRCLE,
    BLANK
}
class opsiInfo{
    public int x;
    public int y;
}
public class triChess{
    
    private static ChessType map[][] = new ChessType[3][3];
    
    private static boolean gameing = true;
    
    private static boolean genRuning = false;
    
    public static void main (String[] args){
        //init
        for(int i = 0;i<map.length;i++){
            for (int j = 0;j<map[i].length;j++){
                map[i][j] = ChessType.BLANK;
            }
            
        }
        
        ChessType turn = ChessType.CIRCLE;
        Scanner input = new Scanner (System.in);
        while(gameing){
            display();
            System.out.print("line and cross you want to set Circle: ");
            int line = input.nextInt()-1;
            int cross = input.nextInt()-1;
            setChess(line,cross,ChessType.CIRCLE);
            
            oppoTurn();
            nextGen();//machine learning
            try{
                while(genRuning)
                {Thread.sleep(300);
                System.out.print(".");}
                System.out.println();
            }catch(InterruptedException e){}
            
            cls();
        }
        
    }
    private static void oppoTurn(){
        nextGen();
    }
    /*private static boolean nextGen(){
        for(int i = 0;i<map.length;i++){
            for (int j = 0;j<map[i].length;j++){
                if(map[i][j]==ChessType.BLANK){
                    map[i][j] = ChessType.CIRCLE;
                    if(judge(ChessType.CIRCLE)){
                        map[i][j] = ChessType.BLANK;
                        setChess(i,j,ChessType.CROSS);
                        return true;
                    }else{
                        map[i][j] = ChessType.BLANK;
                    }
                }
            }
        }
        for(int i = 0;i<map.length;i++){
            for (int j = 0;j<map[i].length;j++){
                if(map[i][j]==ChessType.BLANK){
                    map[i][j] = ChessType.CROSS;
                    if(judge(ChessType.CROSS)){
                        map[i][j] = ChessType.BLANK;
                        setChess(i,j,ChessType.CROSS);
                        return true;
                    }else{
                        map[i][j] = ChessType.BLANK;
                    }
                }
            }
        }
        for(int i = 0;i<map.length;i++){
            for (int j = 0;j<map[i].length;j++){
                if(map[i][j]==ChessType.BLANK){
                    
                    map[i][j] = ChessType.CROSS;
                    for(int m = 0;m<map.length;m++){
                        for (int k = 0;k<map[m].length;k++){
                            if(map[i][j])
                            
                        }
                        
                    }
                    if(nextGen()){
                        return true;
                    }
                    else
                    
                    
                    
                    
                }
            }
        }
        
        return false;
    }*/
    private static void setChess(int line,int cross,ChessType type){
        if (line<map.length&&cross<map.length&&map[line][cross]==ChessType.BLANK){
            //set
            map[line][cross] = type;
            //check winner
            gameing = !judge(type);
            if (!gameing){
                display();
                System.out.println("Game End, winner: "+type);
            }
        }else{
            System.out.print("the place you select is not blank...");
        }
    }
    private static boolean judge(ChessType type){
        //linear
        for(int i = 0; i<3;i++){
            if((map[i][0]==type
            &&  map[i][1]==type
            &&  map[i][2]==type)
            || (map[0][i]==type
            &&  map[1][i]==type
            &&  map[2][i]==type)){
                return true;
            }
        }
        //cross
        if((map[0][0]==type
        &&  map[1][1]==type
        &&  map[2][2]==type)
        || (map[0][2]==type
        &&  map[1][1]==type
        &&  map[2][0]==type)){
            return true;
        }
        return false;
    }
    private static void display(){
        for(int i = 0;i<map.length;i++){
            System.out.print(" | ");
            for (int j = 0;j<map[i].length;j++){
                String bu;
                switch(map[i][j]){
                    case CROSS:
                        bu="X";
                        break;
                    case CIRCLE:
                        bu="O";
                        break;
                    default:
                        bu=" ";
                }
                System.out.print(bu+" | ");
            }
            System.out.println();
        }
    }
    private static void cls(){
        try{
            String os = System.getProperty("os.name");
            if(os.contains("Windows")){
                Runtime.getRuntime().exec("cls");
            }else{
                Runtime.getRuntime().exec("clear");
            }
        }catch(Exception e){System.out.println(e);}
    }
}