package kapil.kumar.comparingstuff;

import java.util.LinkedHashSet;
import java.util.Set;



public class CollectionDemo {

	public void display1()
	{
//		System.out.println(data.hashCode());
//		System.out.println(data1.hashCode());
//		System.out.println(data3.hashCode());
//		System.out.println(data4.hashCode());
	}
	
//	public void display2()
//	{
//		System.out.println(data.hashCode());
//	}
	
	
	public String data="this is data";
	public String data1="this is data";
	public String data3=new String("this is data");
	public String data4=new String("this is data");
	
	public static void main(String[] args) 
	{
		CollectionDemo cd=new CollectionDemo();
		Employee emp1=new Employee("kapil","mca",17);
		Employee emp2=new Employee("kapil","mca",18);
		Employee emp3=new Employee("kapil","mba",19);
		Employee emp4=new Employee("kapil","m7a",20);
		cd.display1();
//		cd.display2();
//		System.out.println(emp1);
//		System.out.println(emp2);
		if(cd.checkVoteEligible(emp1))
		{
			System.out.println("eligible for vote");
		}
		
		/*if(emp1.equals(emp2))
		{
			System.out.println("lol");
		}
		else
			System.out.println("not lol");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());*/
		
//		List ts=new Vector<Employee>();
//		Set ts=new LinkedHashSet<Employee>();
//		
//		ts.add(emp1);
//		ts.add(emp2);
//		ts.add(emp3);
//		ts.add(emp4);
//		System.out.println(ts);
//		
//		System.out.println(emp1);
	}

	private boolean checkVoteEligible(Employee emp1) 
	{
		if(emp1.getAge()>=18)
		return true;
		else
		{
			try {
				throw new EmployeeException(emp1.getAge());
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				System.out.println("not eligible for vote");
			}
			return false;
		}
		
	}

}
