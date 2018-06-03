public class Manage {
    public static void main (String [] asdj){
        MotoVehicle bus1 = new Bus("bus1");
        MotoVehicle car1 = new Car("car1");
        
        bus1.borrow(10);
        car1.borrow(42);
        car1.borrow(50);
        bus1.turnBack(510);
    }
}