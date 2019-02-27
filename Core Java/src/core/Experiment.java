
class Adder{
	static int m(int a,int b)
	{ return a+b;
}
	 static float m(int a,int b,int c)
	 { return a+b+c;
}
}

public class Experiment{ 
public static void main(String args[])
{ System.out.println(Adder.m(11,11));
System.out.println(Adder.m(11,11,11));
}
}