package java1_8features;

import java.io.Serializable;
//We can implement a method from Java 1.8 using default keyword
interface MethodImpl{
	void methodOne();
	//If we give public/private instead of default below,we will get a CTE
	default void methodTwo(){
		System.out.println("In method two");
	}
}
public class MethodImplementation_In_Interface_USing_DefaultKeyword {

	public static void main(String[] args) {
		MethodImpl m = new MethodImpl() {
							public void methodOne(){
								System.out.println("In Method One");
							}
						};
		m.methodOne();
		m.methodTwo();

	}

}
