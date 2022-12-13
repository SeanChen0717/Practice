public class TestLocalVariable {	
	public static void main(String[] args){			
		//System.out.println(price * stock); //price, stock皆尚未宣告為變數，無法編譯
		
		int stock;
		stock = 0b10; //將0b10指派給宣告為int型態的區域變數stock
		//System.out.println(price * stock);//price尚未宣告為變數，無法編譯
		System.out.println(stock= 0b10);//println: 2
		
		stock = stock+1;
		System.out.println(stock);//println: 3		

		double price = 48;//將48.0指派給宣告為double型態的區域變數price
		System.out.println(price * stock); //價格*庫存:  144.0

		char gender = 'M';
		char female = 'F';
		boolean subscribed = true;		
		
//		System.out.println(1.0f-0.8f); //0.2f, IEEE 754
//		System.out.println(1.0-0.8); //0.2, IEEE 754		
		
		//以下為assign的測試
		int a, b, c;
		a = 100; //將100指派給a
		System.out.println(a); //100
		b = a;   //將變數a指派給變數b
		System.out.println(b); //100
		c = a + b; //將a+b的結果指派給變數c
		System.out.println(c);	 //200
		
		//int stock = 10;
		System.out.println(stock);
	}	
}
