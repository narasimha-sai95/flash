package session3;
//HIERARCHICAL INHERITANCE
class Person1
{
	int id;
	String name;
	Person1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void show()
	{
		System.out.println(id+" "+name);
	}
}
class Student extends Person1
{
	int sectionno;
	int internalmarks;
	Student(int id,String name,int sectionno,int internalmarks)
	{
		super(id,name);
		this.sectionno=sectionno;
		this.internalmarks=internalmarks;
		
	}
	void display() 
	{
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("sectionno: "+sectionno);
		System.out.println("internalmarks: "+internalmarks);
		
	}
}

class Employee1 extends Person1
{
	int perdaysalary,totalsalary;
	Employee1(int id,String name,int perdaysalary)
	{
		super(id,name);
		this.perdaysalary=perdaysalary;
	}
	void calculateSalary()
	{
		totalsalary=30*perdaysalary;
		System.out.println("totalsalary: "+totalsalary);
		
	}
	void print() 
	{
		System.out.println("<-----Employee Details----->");
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("perdaysalary: "+perdaysalary);
	
	}
}
public class HierarchicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student s=new Student(180030334,"NarasimhaSai",6,48);
	s.show();
	s.display();
	Employee1 e=new Employee1(100,"suresh",1500);
	e.print();
	e.calculateSalary();
	
	
	}

}
