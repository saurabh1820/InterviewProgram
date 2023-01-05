package remaningImpProgram;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		//Singleton
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1);
		System.out.println(instance2);
		
		//break singleton
		Singleton instance = Singleton.getInstance();
		Singleton clone = (Singleton)instance.clone();
		System.out.println(instance);
		System.out.println(clone);
		
		
	}
}
