public class employing {
    public static void main (String [] args){
        
    }
}

abstract class Employee {
    /**
     * 名字
    */
    public String name;
    
    /**
     * 出生月份
    */
    public int bornMonth;
    
    /**
     * 获取结果
    */
    public abstract double getSalaryByMonth(int month);
}

class SalariedEmployee extends Employee {
    
    public SalariedEmployee(){
        this.monthlySalary = 2000.0;
    }
    public SalariedEmployee(double _monthlySalary){
        this.monthlySalary = _monthlySalary;
    }
    
    /**
     * 月薪
    */
    public double monthlySalary;
    
    @Override
    public double getSalaryByMonth(int month){
        return monthlySalary * month;
    }

}

class HourlyEmployee extends Employee {
    public HourlyEmployee(){
        this.hourlySalary = 14.0;
    }
    public HourlyEmployee (double _hourlySalary){
        this.hourlySalary = _hourlySalary;
    }
    public double hourlySalary;
    
    public double workedHour;
    
    @Override
    public double getSalaryByMonth(int month){
        return this.getSalaryByHour(this.workedHour);//unable to use
    }
    
    public double getSalaryByHour (double hour ){
        return this.hourlySalary*(hour>160?160:hour)+hour>160?(hour-160)*1.5*this.hourlySalary:0;
    }
}

class SalesEmployee extends Employee{
    public SalesEmployee(){
        this.rate = 0.2;
    }
    public SalesEmployee(double _rate){
        this.rate = _rate;
    }
    public double rate;
    public double saleAmount;
    
    @Override
    public double getSalaryByMonth(int month){
        return this.saleAmount * rate;
    }
}

class BasePlusSalesEmployee extends SalesEmployee{
    public BasePlusSalesEmployee(){
        super ();
        this.baseSalary = 1000;
    }
    public double baseSalary;
    
    @Override
    public double getSalaryByMonth (int month){
        return this.baseSalary + this.rate * this. saleAmount;
    }
}