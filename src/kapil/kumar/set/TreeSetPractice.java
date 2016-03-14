package kapil.kumar.set;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetPractice {

	/*public static void main(String[] args) 
	{
		TreeSet ts1=new TreeSet();
		ts1.add(1);
		ts1.add(2);
		ts1.add(3);
		ts1.add(1);
		ts1.add(2);
		ts1.add(1);
		ts1.add(6);

		Object minObj=Collections.min(ts1);
		System.out.println("min value:	"+minObj);
		System.out.println("min value:	"+ts1.first());
		
		Object maxObj=Collections.max(ts1);
		System.out.println("max value:	"+maxObj);
		System.out.println("max value:	"+ts1.last());
		
		
		System.out.println(ts1);
		System.out.println(ts1.headSet(3));
		System.out.println(ts1.tailSet(3));
		System.out.println(ts1.subSet(3, 4));
		
	}*/
	public static void main(String args[])
	{
		TreeSet ts1=new TreeSet();
		ts1.add("kapil");
		ts1.add("kumar");
		ts1.add("my");
		ts1.add("name");
		ts1.add("kapil");
		ts1.add("kumar");
		ts1.add("is");

		Object minObj=Collections.min(ts1);
		System.out.println("min value:	"+minObj);
		System.out.println("min value:	"+ts1.first());
		
		Object maxObj=Collections.max(ts1);
		System.out.println("max value:	"+maxObj);
		System.out.println("max value:	"+ts1.last());
		
		System.out.println(ts1);
		Object obj[]=ts1.toArray();
		System.out.println(obj.length);
		System.out.println(obj[0]);
		System.out.println(obj[obj.length-1]);
		
		
		
	}
}