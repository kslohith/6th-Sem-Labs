package ooadp;

public abstract class coffeedecorator implements beverage {
	private beverage mybeverage;
	coffeedecorator(beverage mybeverage){
		this.mybeverage = mybeverage;
	}
	
	@Override
	public String getdescription() {
		return mybeverage.getdescription();
	}
	
	public int getprice() {
		return mybeverage.getprice();
	}
	   

}
