import java.util.*;
class RectDemo
{
	Scanner s=new Scanner(System.in);
	float l,b;
	void rectRead(){
	System.out,println("Enter lenght and breadth of the rectangle");
	l=s.nextFloat();
	b=s.nextFloat();
}
	void rectDisplay()
{
	float a=l*b;
	float p=2*(l+b);
	System.out.println("Area="+a+"\tPerimeter="+p);
}
class Rectangle
{
	public static void main(String args[]){
	RectDemo r=new RectDemo();
	r.rectRead();
	r.rectDisplay();
}
}

}