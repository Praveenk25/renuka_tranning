package InnerClass;

public class LInner {
 private int i=10;
 void display()
 { class Inner{
	 void msg()
	 { System.out.println("data is "+i);
	  } 
} Inner l=new Inner();
l.msg();
 }
 
 public static void main(String args[])
 { LInner l1=new LInner();
 l1.display();
}
}
