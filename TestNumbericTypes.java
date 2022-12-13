import java.text.NumberFormat;

public class TestNumbericTypes {

	public static void main(String[] args) {
		//Integral Type: (char) byte short int long
		byte quantity = 0137; //8進位
		System.out.println(quantity); //print: 95
		
		byte quantity2 = 0x10; //16進位
		System.out.println(quantity2); //print: 16
		
		short stock = 0b10_0000;
		System.out.println(stock); //print: 32
		
		int salary = 2_1000_0000;
		System.out.println(salary);
		int age = 100;
		
		long ageMS = age * 365L * 24 * 60 * 60 * 1000;
		System.out.println(ageMS);
		
		//Floating Point Types: float double, IEEE 754
		float price1 = 1.0F;
		double price2 = 1.0;
		
		System.out.println(price1-0.8f);
		System.out.println(price2-0.8);
		
		System.out.println(0.1f+0.1f+0.1f);
		System.out.println(0.1+0.1+0.1);
		
		NumberFormat nf = NumberFormat.getNumberInstance();		
		nf.setMaximumFractionDigits(4);
		nf.setMinimumFractionDigits(2);
		
		System.out.println(nf.format(price1-0.8f));
		System.out.println(nf.format(price2-0.8));
	}
}