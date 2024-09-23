import java.util.*;
class StuDemo
{
	Scanner s=new Scanner(System.in);
	String name;
	int rollno,chem,phy,math;
	static int i=0;
	void stuRead(){
		i++;
		System.out.println("Enter student"+i+"rollno and name ");
		rollno=s.nextInt();
		name=s.next();
		System.out.println("Enter chem,phy and math marks of student "+i);
		chem=s.nextInt();
		phy=s.nextInt();
		math=s.nextInt();
		
	}
	void  stuDisplay(){
		int total=chem+phy+math;
		float avg;
		avg=total/3;
		System.out.println("Details of student :"+i);
		System.out.println("Roll no:"+rollno+"Name:"+name);
		System.out.println("Marks:\tchemistry:"+chem+"\tPhysics:"+phy+"\tMaths:"+math);
		System.out.println("Total Marks:"+total+"\tAverage:"+avg);	
	}
}
class StdDetails
{
	public static void main(String args[]){
		StuDemo s1=new StuDemo();
		s1.stuRead();
		s1.stuDisplay();
		StuDemo s2=new StuDemo();
		s2.stuRead();
		s2.stuDisplay();

	}
}