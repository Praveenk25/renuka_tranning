
public class Multi extends Thread{ 
	public void run() {
		for(int i=0;i<5;i++) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(currentThread().isDaemon());
	}
		System.out.println(Thread.currentThread().getState());
	}
	
	public static void main(String args[])
	{ System.out.println(Thread.currentThread().getName());
 Multi t1=new Multi();
 Multi t2=new Multi();
 t1.start();
 System.out.println(Thread.currentThread().getState());
 t2.setDaemon(true);
 t2.start();
 t1.setPriority(2);
 t1.setName("RENUKA");
 t2.setName("SHEKHAWAT");
 
}
}