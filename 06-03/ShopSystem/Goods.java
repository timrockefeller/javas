import java.util.Date;

public class Goods{
    
    public Goods(){}
    public Goods(String _0,float _1,float _2, Date _3,String _4){
        this.goodsName = _0;
        this.goodsNum = _1;
        this.goodsPrice = _2;
        this.goodsDate = _3;
        this.goodType = _4;
    }
    
    
    private String goodsName;
    private float goodsNum;
    private float goodsPrice;
    private Date goodsDate;
    private String goodType;
    

}