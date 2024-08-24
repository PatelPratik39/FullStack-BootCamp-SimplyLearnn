package com;

public interface InterfaceDemo {
	void dis1(); // Abstract method

    default void dis2() {
        System.out.println("dis2 default Method");
    }

    default void dis3() {
        System.out.println("dis3 default Method");
    }

    static void dis4() {
        System.out.println("dis4 static Method in Interface");
    }
}
