
/*Write a program to assign the current thread to t1. Change the name of the thread to MyThread. 
Display the changed name of the thread. Also it should display the current time. 
Put the thread to sleep for 10 seconds and display the time again.*/
package Assigment;
public class Thread1 extends Thread{

	public void run() {
	System.out.println("Thread running!!!");
	}
	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
	Thread1 thread1= new Thread1();
	thread1.start();
	System.out.println("Current thread name: "+currentThread().getName());
	thread1.setName("MyThread");
	System.out.println("After changed: "+thread1.getName());
	System.out.println("Current time: "+System.currentTimeMillis());
	try
	{
	thread1.sleep(1000);
	} 
	catch (InterruptedException e)
	{
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	System.out.println("After 10sec current time: "+System.currentTimeMillis());

	}
}