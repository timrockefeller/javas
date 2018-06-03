interface Person {
    String getName();
}

interface BizAgent extends Person{
    void giveBizSpeech();
}

interface Programmer extends Person{
    void writeProgram();
}

public class SoftEngineer implements BizAgent,Programmer{
    public void giveBizSpeech(){}
    
    public void writeProgram(){}
    
    public  String getName(){
        return "fasidfhasdha";
    }
    public String name;
    public SoftEngineer (String name){
        this.name = name;
    }
    
    
}