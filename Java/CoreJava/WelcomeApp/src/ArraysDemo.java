
public class ArraysDemo {

	public static void main(String[] args) {

//		int acb[];
//		int xyz[] = {1,2,34,5,67,8,9,0,9,23,56,88};
//		System.out.println("retreive the value using the loop");
//		System.out.println("Size of an array : " + xyz.length);
//		
////		simple Loop
//		
//		for(int i=0; i < xyz.length; i++) {
//			System.out.println("Value using loop : " + xyz[i]);
//		}
//		
////		forEach Loop  (Enhancement Loop)
//		
//		/*
//		 *    forEach(data type vafiable Name :
//		 * 
//		 */
//		
//		System.out.println( " For Each Loop used");
//		
//		for (int n : xyz) {
//		    System.out.println("Value using forEach loop: " + n);
//		}
//
		
		
//
		
		int abc[] =  new int[10];
		System.out.println("Size of an Array " + abc.length);
		System.out.println(abc[0]);
		System.out.println(abc[9]);
		abc[0] = 100;
		abc[1]= 200;
		System.out.println("0th index value is : " + abc[0]);
		System.out.println("1th index value is : " + abc[1]);
	}

}
