package ooadp;

public class latte extends coffeedecorator {
     
	latte(beverage mybeverage){
		super(mybeverage);
	}
	
	public String getdescription() {
		return super.getdescription() + " With latte";
	}
	
	public int getprice() {
		return super.getprice() + 60;
	}
	
}
