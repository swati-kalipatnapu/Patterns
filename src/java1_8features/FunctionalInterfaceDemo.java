package java1_8features;
/* functional Interface is an interface Which has only one abstract method*/
@FunctionalInterface
interface FunctionalInterfaceEx{
	void initi();
	//void move(); if we give functional interface annotation this interface should have only one abstract method.
}

 
 
public class FunctionalInterfaceDemo {
	public static void main(String args[]) {
	FunctionalInterfaceEx f = new FunctionalInterfaceEx() {
		  						public void initi() {
		  								System.out.println("init implemented"); 
		  						}
								};
	f.initi();
}
}
	
