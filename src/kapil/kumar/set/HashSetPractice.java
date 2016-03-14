package kapil.kumar.set;


public class HashSetPractice {

	public static void main(String[] args) 
	{

		int a=456;
		int sum=0;
		int den=0;
		while(a>0)
		{
			den=a%10;
			sum+=den;
			a/=10;
		}
		System.out.println(sum);
		/*
		ArrayList arrlist=new ArrayList();
		arrlist.add(1);
		arrlist.add(4);
		arrlist.add(2);
		arrlist.add(5);
		arrlist.add(6);
		arrlist.add(12);
		arrlist.add(10);
		System.out.println(arrlist);
		Collections.sort(arrlist);
		System.out.println(arrlist);
		System.out.println(arrlist.get(arrlist.size()-2));
		*/
		/*
		TreeSet ts=new TreeSet<Integer>();
		ts.add(1);
		ts.add(4);
		ts.add(2);
		ts.add(5);
		ts.add(6);
		ts.add(12);
		ts.add(10);
*/
//		Integer arr[]=ts.toArray(new Integer[ts.size()]);
//		String[] result = myTreeSet.toArray(new String[myTreeSet.size()]);
//		System.out.println(arr[arr.length-1]);
		
		/*Object arr[]=ts.toArray();
		System.out.println("Second highest:		"+arr[arr.length-2]);
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
//			System.out.println(it.next());
		}
		System.out.println(ts);*/
		
		/*
		
		ArrayList ls=new ArrayList();
		ls.add(9);
		ls.add(8);
		ls.add(7);
		ls.add(6);
		
		Object obj3=Collections.max(ls);
		System.out.println("min of arlst:  "+obj3);
		
		
		HashSet hs=new HashSet(0);
		HashSet hs2=new HashSet(3);
		hs.add("kapil");
		hs.add("kumar");
		hs.add(12);hs.add(75);
		hs.add(75);hs.add(75);
		hs.add(null);
		
		hs2.add(75);
		hs2.add("kapil");
		hs2.add(null);
		hs2.add("lalu");
		hs2.add("kabira");
		hs.add(hs2);
		
		HashSet newHs=new HashSet(0);
		newHs.add(1);
		newHs.add(2);
		newHs.add(3);
		newHs.add(4);
		
		
		Object obj2=Collections.min(newHs);
		
		System.out.println("max: "+obj2);
		System.out.println(newHs);
		
		System.out.println("hs hashset:		"+hs);
		//hs.remove("kapil");
		System.out.println("hs hashset:		"+hs);
		//hs.clear();								//clean hashset
		HashSet s=(HashSet) hs.clone();
		System.out.println("Cloned hashset:  "+s);
		
		HashSet s2=hs;
		System.out.println("copied hashset:  "+s2);

		Object arr[]=hs.toArray();
		System.out.println("size of hs array: "+arr.length);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
		System.out.println(arr[2] instanceof HashSet);
		System.out.println(arr[3] instanceof HashSet );

		
		
		System.out.println("bhola chacha");
		Enumeration enm=Collections.enumeration(hs);
		while(enm.hasMoreElements())
		{
			System.out.println("* "+enm.nextElement());
		}
		
		System.out.println(hs);
//		hs.retainAll(hs2);
//		System.out.println(hs);
//		
		
//		List l=(List) new HashSet();		//run time exception,can't cast HashSet into List
//		l.add("one");
//		l.add("two");
//		System.out.println("list elm"+l.get(0));
		
		if(hs.containsAll(hs2)){
			System.out.println("yes");
		}
		else System.out.println("no");
		
		Iterator it=hs.iterator();
		int count=0;
		int j=0;
		System.out.println(hs);
		while(it.hasNext())
		{
			Object obj=it.next();
			if((obj instanceof HashSet))
			{
				//System.out.println("<--------Entering inner hashset------->");
				HashSet temp=(HashSet)obj;
				Iterator it2=temp.iterator();
				int i=0;
				while(it2.hasNext())
				{
					//System.out.println("Element "+i++ +" of inner hashset "+it2.next());
				}
				//System.out.println("Temp size is: "+temp.size());
				count++;
			}
			else
			{
				//System.out.println(obj);
			}
		}
		
	*/}

}
