package session3;
class A{//parent class
	int a,b;
	A(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void show()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
	class B extends A//b class can get or take of A class
	{
		int c;
		B(int a,int b,int c)
		{
			super(a,b);//using super key word we get a,b A's class variables to class B
			this.c=c;
		}
		void sum()
		{
			int d;
			d=a+b+c;
			System.out.println("Sum of 3 Numbers="+d);
		}
	}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B(10,20,30);//B has A,B 's properties so we can directly creates the object to class B
		ob.sum();
		ob.show();
	}

} 
