
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println(a);  // primitive value
		
//		Integer b = new Integer(a);
//		Integer b = a;
		Integer b = 100;		// auto-boxing : converting primitive to object 
		System.out.println(b);// it consider as object 
		
		// converting to object to primitive 
		
		int c = b.intValue();
		float d = b.floatValue();
		
		int e = b;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

}
