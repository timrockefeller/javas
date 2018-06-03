public class pets {
    
    public static void main (String[]args){
        Pet mk = new Monkey("King");
        mk.print ();
        ((Monkey)mk).eat();
    }
    
}

abstract class Pet{
    
    public String name;
    
    public void print(){
        System.out.println("Abstract Pet Class , print()");
    }
    
}

class Monkey extends Pet {
    
    public Monkey(String a){
        this.name = a;
    }
    
    @Override
    public void print (){
        System.out.println("Monkey "+this.name+"!!");
    }
    
    public void eat (){
        System.out.println("Eatin~~");
    }
    
}