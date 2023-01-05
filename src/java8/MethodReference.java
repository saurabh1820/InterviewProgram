package java8;

public class MethodReference{

	public static void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args) {
		
		MethodReference m=new MethodReference();
	//	Runnable r=m::m1;	//For Instance Method
		Runnable r=MethodReference::m1;//For Static Method
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
	}
}
