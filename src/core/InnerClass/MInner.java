package InnerClass;

public class MInner { 
	private int data=10;
	 class Inner{
		void msg() {
		System.out.println("Data is "+data);
	}
	}
	
public static void main(String args[])
{ MInner m1=new MInner();
MInner.Inner in=m1.new Inner();
in.msg();
}
}
