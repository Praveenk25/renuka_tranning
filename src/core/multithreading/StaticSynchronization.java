package multithreading;
class Test{
	synchronized static void printable(int n)
	{ for(int i=1;i<6;i++)
	{ System.out.println(n*i);
	try { Thread.sleep(1000);
	}
	catch(InterruptedException e) { System.out.println(e);}
	}
}
}

class Mythread1 extends Thread{
	public void run()
	{ Test.printable(1);
}
}

class Mythread2 extends Thread{
	public void run()
	{ Test.printable(10);
	}
}

class Mythread extends Thread{
	public void run()
	{ Test.printable(100);
}
}

public class StaticSynchronization {
	public static void main(String args[])
	{ Mythread1 t1=new Mythread1();
	  Mythread2 t2=new Mythread2();
	  Mythread t3=new Mythread();
	  t1.start();
	  t2.start();
	  t3.start();

}
}
