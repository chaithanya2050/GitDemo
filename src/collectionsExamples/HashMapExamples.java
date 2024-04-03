package collectionsExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> map=new HashMap<String, String>();
		
		map.put("chaith", "anya");
		map.put("lastname","k");
		map.put("sub", "selenium");
		map.put("chaith", "anya");
		
		System.out.println(map);
		System.out.println(map.size());
		
		Set<String> keys=map.keySet();
		
		for(String key:keys)
		{
			System.out.println("key--->"+key+" value is -->"+map.get(key));
		}
		
		Map<String, List<String>> map1=new HashMap<String, List<String>>();
		List<String> listofEmails=new ArrayList<String>();
		listofEmails.add("abcd@gmail.com");
		listofEmails.add("efgh@gmail.com");
		listofEmails.add("ijkl@gmail.com");
		listofEmails.add("mnop@gmail.com");
	
		map1.put("emails", listofEmails);
		
		
	}

}
