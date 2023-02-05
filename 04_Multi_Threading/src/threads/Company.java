package threads;

public class Company
{
	int n ; // int me agr value agyi to produce hogya
	boolean f=false;
	//if f=false then chance: producer
	// if f = true thne chance of consumer 
	synchronized public void produce_item(int n )
	{
		if(f)
		{
			try
			{
			wait();
			}
			catch(Exception e)
			{}
		}
		this.n=n; // producer data layega vo yhn n me ajyega 
		System.out.println("Produced : "+this.n);
		f=true;
		notify();
		
	}
	
	synchronized public int consume_item()
	{
		if(!f) // f agr false h to vo producer ka chance h or agr consumer ko mill
		       //	gya to consumer wait krega
		{  //f true to ye if ni chlta
			try
			{
			wait();
			}
			catch(Exception e)
			{}
		}
		System.out.println("Consumed : "+this.n); // true to consumer item ko consume krega
		f=false; // q ki ye ture pe niche aya tha to ye ab isko false kr dega 
		// q ki ab chance h producer ka 
		notify();// and it will notify also
		return this.n;
		
	}

}
