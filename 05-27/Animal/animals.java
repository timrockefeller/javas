public class animals{
    public static void main(String [] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.eat();
        cat.eat();
    }
}

abstract class  Animal {
    public abstract void eat ();
}

class Dog extends Animal {
    @Override
    public void eat (){
    System.out.print("Dog is eating \n");
    }
}
class Cat extends Animal {
    @Override
    public void eat (){
    System.out.print("Cat is eating \n");
    }
}