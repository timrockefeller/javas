public class Car extends MotoVehicle {
    
    public Car (){
        this.name = "Car";
        this.rent = 10;
    }
    public Car (String name ){
        this.name = name ;
        this.rent = 10;
    }
    @Override 
    public float getPrice(){
        return this.time * this.rent;
    }
}

