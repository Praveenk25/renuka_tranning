
public class MainThread extends Thread{
public void run()
{ System.out.println("Entering Into Deadlock");

}
public static void main(String args[])
{ Thread t1=new Thread();
t1.start();
try {
t1.currentThread().join();
}
catch(InterruptedException e)
{ System.out.println(e);
}
}
}
