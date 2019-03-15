package ooadp;

public class mocha extends coffeedecorator {
    
	mocha(beverage mybeverage){
		super(mybeverage);
	}
	
	public String getdescription() {
		return super.getdescription() + " With mocha";
	}
	
	public int getprice() {
		return super.getprice() + 80;
	}
	
}