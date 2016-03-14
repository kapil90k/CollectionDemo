package kapil.kumar.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {

	public static void main(String[] args) {
		EmployeeSerialize emp = new EmployeeSerialize();
		emp.setAge(20);
		emp.setCourse("mca");
		emp.setName("Kapil Kumar");
		System.out.println(emp.getAge());
		System.out.println(emp.getCourse());
		System.out.println(emp.getName());
		
		//Serializing Employee

		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try 
		{
			fos = new FileOutputStream("E:\\emp_serial.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
		}
		catch (FileNotFoundException fnfe) 
		{
			System.out.println("didn't find specified file");
		}
		catch (IOException ioe) 
		{
			System.out.println("Some input output exception occured"+ioe);
		}
		finally 
		{
			try 
			{
				fos.close();
				oos.close();
			}
			catch (IOException e) 
			{
				System.out.println("====Some input output exception occured");
			}
		}
		
		//Deserializing Employee

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("E:\\emp_serial.ser");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			EmployeeSerialize emp2=(EmployeeSerialize)ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
