package session3;
class Employee//it is the encapsulated class it contains private variables,setter and getter methods
{
	private int eid;
	private String name;
	private int salary;
	//wrapping of data taken place
	public void setEid(int id)//setting value to eid
	{
		eid=id;
	}
	public int getEid()
	{
		return eid;
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(int s)
	{
		salary=s;
	}
	public int getSalary()
	{
		return salary;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setEid(100);
		e.setName("vijay");
		e.setSalary(1000);
		System.out.println("Employee id:"+e.getEid());
		System.out.println("Employee name:"+e.getName());
		System.out.println("Employee salary:"+e.getSalary());
		
		

	}

}
