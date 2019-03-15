package ooadp;

public class mainshop {
	public static void main(String args[]) {
		mybeverages basebeverage = new mybeverages();
		System.out.println(basebeverage.getdescription());
		System.out.println(basebeverage.getprice());
		
		beverage b = new latte(new mybeverages());
		System.out.println(b.getdescription());
		System.out.println(b.getprice());
		
		beverage b1 = new mocha(new mybeverages());
		System.out.println(b1.getdescription());
		System.out.println(b1.getprice());
	}

}
