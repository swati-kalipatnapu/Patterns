package java1_8features;
/*
 * Lambda Expression can be achieved only through functional Interface(Which has only one abstract method)
 */
@FunctionalInterface
interface Initializer{
	void init();
	//void move(); if we give functional interface annotation this interface should have only one abstract method.
}


public class LambdaExpression {
	
	
	public static void main(String[] args) {
		Initializer le = () -> System.out.println("init implemented using lambda exp");
		le.init();
				
				/* new LambdaExpression() {
			 public void init() {
				 System.out.println("init implemented");
			 }*/
		

	}

}
