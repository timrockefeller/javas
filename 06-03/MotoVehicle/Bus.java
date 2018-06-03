public class Bus extends MotoVehicle {
    public Bus (){
        this.name = "Bus";
        this.rent = 140;
    }
    public Bus (String name ){
        this.name = name ;
        this.rent = 140;
    }
    @Override 
    public float getPrice () {
        if (this.time > 160 ){
            return this.rent * ((this.time - 160 )*1.5f + 160);
        }
        return this.rent * this.time ; 
    }
    
}