package kapil.kumar.comparingstuff;

public class Employee 
{
	private String name;
	private String course;
	private int age;
	
	public Employee(String name, String course,int age) {
		super();
		this.name = name;
		this.course = course;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) 
	{
		Employee emp=(Employee)obj;
		if(this.getName().equals(emp.getName()) && this.getCourse().equals(emp.getCourse()))
		{
			return true;
		}
		else return false;
	}

	
}
