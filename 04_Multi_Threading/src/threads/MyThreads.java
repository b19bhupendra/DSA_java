package threads;
// Creating our thread using Runnable Interface
public class MyThreads implements Runnable
{ 
	public void run()// when we implement any interface in class then we have to override its all the methods of that class so here 
	{ // is a run method so we we are overriding it and we will give body for it 
		// Task for thread
		for(int i =1;i<=10;i++)
		{
			System.out.println("Value of i is "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
	} // this is a blueprint
	
	public static void main(String [] args)
	{
		//create object of MyThread class
		
		MyThreads t1= new MyThreads();
		
		//object of another thread 
		
		Type2 t2 = new Type2();
		t2.start();
		
		//t1.start(); this will give error because Runnable class dont have 
		// start method so for that we have to create a obj of helper class
		//whos name is thread
		
		Thread thr = new Thread(t1);// apne thread ka referance pass kr denge yhn pe i.e t1
		//now thr has a responsbility to start the tread
		
		thr.start() ;
		
		
	
		
	}

}
