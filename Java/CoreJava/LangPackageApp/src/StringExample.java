
public class StringExample {
	
	public static void main(String[] args) {
//		String str1 = "Welcome to Java Training";
//		String str2 = new String ("Welcome to Java Training");
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str1.charAt(0));
//		System.out.println(str2.toLowerCase());
//		System.out.println(str2.toUpperCase());
//		System.out.println(str1.charAt(0));
//		System.out.println(str1.indexOf('c'));
//		System.out.println(str1.substring(9, 12));
//		
//		
//		String str3 = "Chaman";
//		String str4 = "Chaman";
//		String str5 = new String("Chucha Singh");
//		String str6 = new String("Dagdu Seth");
//		
//		if(str5.equals(str4)) {
//			System.out.println("Equal");
//		} else {
//			System.out.println("Not Equal");
//		}
		
		
		String msg = "Hello Lasan lala";  // new memory created
		System.out.println(msg);
		System.out.println(msg.toLowerCase());
		
		msg = msg + ", Hello chandu, You are Chandu";
		System.out.println(msg);
		
		System.out.println(" ---------  ");
		
		StringBuffer sb = new StringBuffer("Hello Ranjan Matre");
		System.out.println(sb);
		System.out.println(sb.append(" ---- Your name should be Ranjan Chaman Uddin Bhajiya Singh"));
		System.out.println(sb);
	}

}
