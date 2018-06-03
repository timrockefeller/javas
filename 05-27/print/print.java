public class print {
    public static void main (String[]args){
        String s = "something to Print";
        print (s,new ColorPrinter());
        System.out.println();
        print (s,new BinaryPrinter());
    }
    
    public static void print (String s,Printer printer){
        printer.print(s);
    }
}


interface Printer {
    public void print (String s);
}

class ColorPrinter implements Printer {
    @Override
    public void print(String s){
        System.out.println ("Using ColorPrinter");
        System.err.print (s);
    }
}

class BinaryPrinter implements Printer {
    @Override
    public void print(String s){
        System.out.println ("Using BinaryPrinter");
        System.out.print (s);
    }
}