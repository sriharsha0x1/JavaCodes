class VarDemo
  {
	
		int x;
		static int y;
		void display();
		{
			System.out.print("Instance variable x :"+ ++x);
			System.out.print("Static var y :"+ ++y);
			System.out.print("Local var z :"+ ++z);
		}
	
}
class Test
{
	public static void main(String args[])
	{
		VarDemo v=new VarDemo();
		System.out.print("Calling display() using first object");
		v.display();
		VarDemo v1=new VarDemo();
		System.out.print("Calling display() using second object");
		v1.display();                                                                                                                                                    	
	}
}