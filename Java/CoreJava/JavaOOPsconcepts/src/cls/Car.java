package cls;

public class Car {

//		 lets add properties for the class
		int wheel;
		String color;
		float price;
		
		Car(){
			System.out.println("Object is created..");
			wheel = 4;
			color = "Red";
			price = 3000;
		}
		Car(int wheel, String color,float price) {			// parameterized constructor 
			System.out.println("object created with parameter");
			this.wheel=wheel;
			this.color=color;
			this.price=price;			// parameterized constructor 
		}
		void setCarInfo(int wheel, String color, float price) {
			this.wheel = wheel;
			this.color = color;
			this.price = price;
		}
		
		
		void start() {
			System.out.println(" Car started ");
		}
		
		void appliedGear() {
			System.out.println(" Applied Gear");
		}
		
		void moving() {
			System.out.println(" Car is moving");
		}
		
		void stop() {
			System.out.println(" Car stopped");
		}
		
		void carInfo(String name) {
			String info="Car details "+name;		// local variable.
			System.out.println(info);
			System.out.println("wheel "+wheel);
			System.out.println("colour "+color);
			System.out.println("price "+price);
			
		}



}
