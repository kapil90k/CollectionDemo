package kapil.kumar.comparingstuff;

public class EmployeeException extends Exception 
{
	public EmployeeException(int n)
	{
		System.out.println("employee can't vote because "+n+" which is less than 18");
	}

}
