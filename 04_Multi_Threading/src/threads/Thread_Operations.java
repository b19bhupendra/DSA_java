package threads;

public class Thread_Operations 
{
	public static void main(String []args)
	{
		System.out.println("Program Started");
		
		int x= 34+44;
		System.out.println("sum is "+x);
		// Thread Name ...
		
		Thread t =Thread.currentThread();
		String tname=t.getName();
		System.out.println("Current running thread is "+tname);
		
		//setname 
		t.setName("Myname");
		System.out.println("New name "+t.getName());
		
		try // method sleep throws exception so we use try and catch
		{ 
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
		}
		System.out.println("id "+t.getId()) ;
		
		
		System.out.println("Program ended");
		
		//going to start user defined thread
			UserThread thr = new UserThread();
			thr.start();
		
		
	}

}
class UserThread extends Thread
{
	public void run()
	{
		//task for thread..
		System.out.println("This is user defined thread");
	}
}
