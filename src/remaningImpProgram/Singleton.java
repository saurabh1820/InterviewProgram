package remaningImpProgram;

public class Singleton extends MyClone{

	//SingletonDesignPattern
	private Singleton(){
		
	}
	
	private static Singleton instance;
	
	public static Singleton getInstance()
	{
		if(instance==null)
		{
			return instance=new Singleton();
		}else
		{
			return instance;
		}
	}
	//Calling from another class Test
	//We Can Break the Singleton Pattern By Clone Method or Serialization or Reflection
	//Create Class to break (MyClone)
}
