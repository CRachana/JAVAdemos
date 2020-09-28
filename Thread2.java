
/*Rewrite the earlier program so that, now the class DemoThread1 instead of implementing from Runnable interface
will now extend from Thread class.*/
package Assigment;
public class Thread2 extends Thread {
	int counter=5;
	public Thread2() {
	new Thread() {
	@Override
	public void run()
	{
	for (counter = 0; counter < 5; counter++)
	{
	System.out.println("running child Thread in loop : "+counter);
	try {
	Thread.sleep(1000);
	}
	catch (InterruptedException e)
	{
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
  }
}
}
	.start();
	}
	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
	Thread2 t1=new Thread2();
	Thread2 t2=new Thread2();
	Thread2 t3=new Thread2();
	}
}