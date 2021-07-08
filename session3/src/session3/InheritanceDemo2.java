package session3;
//SIMPLE INHERITANCE
class Person//parent class
{
	int id;
	String name;
	int acno;
	Person(int id,String name,int acno)
	{
		this.id=id;
		this.name=name;
		this.acno=acno;
	}
	void display()
	{
		System.out.println(id+""+name+""+acno);
	}
}
class Customer extends Person//child class
{
	int intialamount,withdraw,deposit,totalamount;
	Customer(int id,String name,int acno,int intialamount,int deposit,int withdraw)
	{
		super(id,name,acno);
		this.intialamount=intialamount;
		this.withdraw=withdraw;
		this.deposit=deposit;
		
	}
	void calculate()
	{
		System.out.println("Customer id: "+id);
		System.out.println("Customer name: "+name);
		System.out.println("Customer acno: "+acno);
		totalamount=intialamount+deposit;
		System.out.println("Total amount after deposited: "+totalamount);
		totalamount=intialamount+withdraw;
		System.out.println("Total amount after withdraw: "+totalamount);
	}
}


public class InheritanceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=new Customer(6152,"NarasimhaSai",63445678,50000,1000,2000);
		c1.calculate();
	
		
	}

}
