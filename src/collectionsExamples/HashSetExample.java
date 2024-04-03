package collectionsExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set=new HashSet<String>();
		
		set.add("chaithu");
		set.add("automation");
		set.add("selenium");
		set.add("appium");
		set.add("chaithu");
		
		
		System.out.println(set);
		
		for(String var:set)
		{
			//System.out.println(var);
		}
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals("selenium"))
			
			System.out.println(itr.next());
		}
		
	}

}
