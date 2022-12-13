public class TestCharBoolean {
	public static void main(String[] args){
		//character type: char 
		char gender = 'M'; //'M':男
		char c1 = '1';
		char chA = 'A';
		char chUUU = '恆'; // \u6046		
		System.out.println(chUUU);
		char chJP = '\u00a5';
		System.out.println(chJP); //print: ¥
		
		char chPHI = '\u03a6';
		System.out.println(chPHI); //print: Φ

		char chPI = '\u03C0';
		System.out.println(chPI); //print: π
	
		char chCAFE = '\ucafe';
		System.out.println(chCAFE); //print: 쫾
		
		char chNEWLINE = '\n';
		System.out.println(chNEWLINE);
		
		char chTAB = '\t';
		System.out.println(chTAB);
		
		char chBackSlash = '\\'; //  \的逃脫字元
		System.out.println(chBackSlash);
		
		char chSingleQuote = '\''; //  '的逃脫字元
		System.out.println(chSingleQuote);
		
		//logical type: boolean
		boolean married = true;
		System.out.println("已婚狀態: " + married);
	}

}
