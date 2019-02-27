
public class Multi2 {
	void Printtable(int n)
	{  for(int i=0;i<5;i++)
		System.out.println(n*i);
	try {
	Thread.sleep(400);
	}
	catch(Exception e)
	{System.out.println(e);
	}
	}
class Testcase extends Thread
{  Multi2 m1;
  Testcase(Multi2 m1)
  { this.m1=m1;
  }
   public void run()
   { m1.Printtable(5);
	}
}
class Testcase2 extends Thread
{ Multi2 m2;
Testcase2(Multi2 m2)
{ this.m2=m2;
}
public void run()
{ m2.Printtable(100);
}
}
public static void main(String args[])
{ Multi2 m=new Multi2();

}
}
	
