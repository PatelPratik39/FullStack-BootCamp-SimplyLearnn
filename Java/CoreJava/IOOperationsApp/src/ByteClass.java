import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class ByteClass {

	public static void main(String[] args) {
		System.out.println("Welcom");
		try{
//		PrintStream ps = System.out;
//		ps.println("Welcome to Java");
//		InputStream is = System.in;
		
		// source --> keyboard, target --> console 
//		DataInputStream dis = new DataInputStream(System.in);
//		PrintStream ps = System.out;
//		ps.println("Enter the name");
//		String name = dis.readLine();
//		ps.println("name is "+name);
		
		// source --> keyboard, target --> file 
//		DataInputStream dis = new DataInputStream(System.in);
//		FileOutputStream fos = new FileOutputStream("abc.txt",true);
//		System.out.println("Enter the data");
//		int ch;
//		while((ch=dis.read()) != '@') {
//			System.out.println(ch+" "+(char)ch);
//			fos.write(ch);
//		}
//		fos.close();
//		System.out.println("Data stored...");
		
		// source --> file, target --> file or console
		
		// Source --> file, target --> file or console
        FileInputStream fis = new FileInputStream("/Users/pratikpatel/Desktop/demo1.docx"); // Provide a valid file path
        FileOutputStream fos = new FileOutputStream("demo1.docx");
        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.print((char)ch); // Printing to console
            fos.write(ch);
        }
        fis.close();
        fos.close();
        System.out.println("\nData copied...");
        
    } catch (IOException e) {
        System.out.println("An error occurred: " + e.getMessage());
        e.printStackTrace();
    }

	}

}
