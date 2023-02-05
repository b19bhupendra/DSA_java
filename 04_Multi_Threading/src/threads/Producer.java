package threads;

public class Producer extends Thread
{
	Company c;
	//producer method call krne k liye we need a object of company 
	//so we will declare a variable Company c and then that object c will be pass pass in a constructor 
	/// and then 
	Producer(Company c) // creating constructor to call the producer method 
	{
		this.c=c;
		
	}
	public void run()
	{
		int item =1;
		
		while(true)  //produceing infinite item
		{
			this.c.produce_item(item);
			try
			{
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
			item++;
		}
	}

}
