public class lamps {
    
    public static void main (String [] args){
        Lamp lamp = new Lamp();
        lamp.turn();
    }
}


class Lamp {
    public Lamp(){
        this.buble = new RedBuble();
    }
    
    public void turn(){
        System.out.print ("  ---\n  ");
        this.buble.on();
        System.out.print (" |\n    |\n    |\n-----");
    }
    
    Buble buble;
    
}

abstract class Buble {
    public abstract void on ();
}

class RedBuble extends Buble{
    @Override
    public void on (){
        System.err.print("0");
    }
}
class WhiteBuble extends Buble{
    @Override
    public void on (){
        System.out.print("0");
    }
}