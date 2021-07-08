package session3;
//MULTILEVEL INHERITANCE
class Employee2
{
	int id;
	String name;
	int salary;
	Employee2()
	{
		id=100;
		name="rakesh";
		salary=40000;
	}
	void show()
	{
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+salary);
		
	}
}

class Manager extends Employee2
{
	int salary2;
	Manager()
	{
		salary2=60000;
	}
	void display()
	{
		System.out.println("Manager salary: "+salary2);
	}
}
class Director extends Manager
{
	int salary3;
	Director()
	{
		salary3=90000;
	}
	void print()
	{
		System.out.println("Director salary: "+salary3);
	}
}


public class MultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director d=new Director();
		d.show();//from super class
		d.display();//from sub class
		d.print();//from sub-sub class
	}

}
