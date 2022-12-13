
public class TestPromotionCasting {

	public static void main(String[] args) {
		byte stock = 10;
		
		int totalStock = stock; //promotion		
		
		char charStock = (char)stock; //casting, 無實際需求
		
		System.out.println(stock); //10
		System.out.println(totalStock); //10
		System.out.println(charStock); // \n
		
		int unitPrice = 10; //產品定價
		int discount = 25; //25% off, 75折
		
		double price = unitPrice; //promotion	
		price = price * (100-discount) / 100;
		System.out.println(price); //7.5

		price = unitPrice * (100-discount) / 100;
		System.out.println(price); //7.0		
		
		price = (double)unitPrice * (100-discount) / 100; //casting
		System.out.println(price); //7.5
	
	}

}
