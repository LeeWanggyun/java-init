package p01;

public class StringCondition {

	public static void main(String[] args) {
		String s1 = "123";
		if(s1 == "123") {
			System.out.println("s1은 123");
		}else {
			System.out.println("s1은 123이 아님");
		}
		String s2 = new String("123");
		if(s2 == "123") {
			System.out.println("s2는 123");
		}else {
			System.out.println("s2는 123이 아님");
		}//한줄주석
		
		/*
		 * 여러줄 주석
		 */
		String s3 = "";
		System.out.println(s3.equals(" ")); //false
		
		String s4 = "  123 ";
		System.out.println(s4); //   123  
		System.out.println(s4.trim().equals("123"));//123
		
		String s5 = new String("1");
		System.out.println("1".equals(s5));
		System.out.println(s5.equals("1")); //이방법은 지양함.
		
		String s6 = null;
		System.out.println("1".equals(s6)); // false
		System.out.println(s6.equals("1")); // error
	}
}