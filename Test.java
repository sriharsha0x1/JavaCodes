class VarDemo
  {
	
		int x;
		static int y;
		void display()
		{
			int z=0;
			System.out.println("Instance variable x :"+ ++x);
			System.out.println("Static var y :"+ ++y);
			System.out.println("Local var z :"+ ++z);
		}
	
}
class Test
{
	public static void main(String args[])
	{
		VarDemo v=new VarDemo();
		System.out.println("Calling display() using first object");
		v.display();
		VarDemo v1=new VarDemo();
		System.out.println("Calling display() using second object");
		v1.display();                                                                                                                                                    	
	}
}