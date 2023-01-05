package remaningImpProgram;

public final class ImmnutableDemo {

	private int i;
	
	ImmnutableDemo(int i){
		this.i=i;
	}
	public String toString() {
		return ""+i;
	}


	public ImmnutableDemo modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}else
		{
			return new ImmnutableDemo(i);
		}
	}
	
	public static void main(String[] args) {
		ImmnutableDemo t=new ImmnutableDemo(10);
		ImmnutableDemo modify = t.modify(100);
		ImmnutableDemo modify2 = t.modify(10);
		System.out.println(t);
		System.out.println(t==modify);
		System.out.println(t==modify2);
	
	}
}
