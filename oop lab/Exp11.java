class One extends Thread
{
  public void run()
  {
    for(int i=1;i<=10;i++)
	{
	 System.out.print(i + " ");
	 try
	 {
	  Thread.sleep(1000);
	 }
	 catch(InterruptedException e)
	 {
	  System.out.println(e);
	 }
    }
   }
}
class Two extends Thread
{
  public void run()
  {
   for(int i=1;i<=10;i++)
   {
    System.out.print(i*i + " ");
	try
    {
	 Thread.sleep(1100);
	}
	catch(InterruptedException e)
	{
	 System.out.println(e);
	}
   }
  }
}
class Exp11
{
 public static void main(String args[])
 {
  One oe = new One();
  oe.start();
  Two to = new Two();
  to.start();
 }
} 
