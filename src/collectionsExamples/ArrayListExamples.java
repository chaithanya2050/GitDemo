package collectionsExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list =new ArrayList ();
		System.out.println(list);
		
		///size
		System.out.println(list.size());
		
		
		list.add(10);
		list.add("chaithu");
		list.add(10.5);
		list.add('c');
		list.add(true);
		list.add(null);
		list.add("chaithu");
		
		System.out.println(list);
		System.out.println(list.size());

		
		//how to fetch the valeus from a list
		
		System.out.println(list.get(5));
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		
		
		///remove
		
		list.remove(5);
		
		System.out.println(list);
		
		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
//		
		
//		for(Object var:list)
//		{
//			System.out.println(var);
//		}
		
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
