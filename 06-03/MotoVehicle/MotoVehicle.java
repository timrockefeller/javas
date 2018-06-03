
public abstract class MotoVehicle implements BorrowAction{
    protected boolean isBorrowed = false;
    
    protected String name;
    
    protected float rent;
    //@Override
    public void borrow(int date ){
        if (!this.isBorrowed){
            System.out.println(this.name + " succesfully borrowed!");
            this.isBorrowed = true;
            this.time = date;
        }else{
            System.out.println ("faied ! Already Borrowed!");
        }
    };
    //@Override
    public void turnBack (int date ){
        if(this.isBorrowed){
            System.out.println(this.name + " succesfully returned!");
            this.isBorrowed = false;
            this.time = date - this.time;
            System.out.println("trip costs "+ this.getPrice()+" dollars..");
        }else {
            System.out.println("faied ! Already Returned!");
        }
    }
    
    
    protected int time;
    
    public abstract float getPrice();
}



