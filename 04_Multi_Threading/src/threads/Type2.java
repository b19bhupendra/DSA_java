package threads;
//Creating thread using class
public class Type2 extends Thread
{
	public void run()
	{
		//task
		for(int i =10;i>=1;i--)
		{
			System.out.println("Another thread"+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
		}
	}

}
