package com.demo;

public class Collection {
	
	public static void main(String[] args) {
	
//		List<String> l=new ArrayList<>();
//		l.add("Sohel");
//		l.add("Shadab");
//		l.add("Shonu");
		
		//1. Iterate By using Iterator --> 
	/*	Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		//2. Iterate By using ListIterator -->
	/*	 ListIterator itr1 = l.listIterator();	
		 while(itr1.hasNext()) {
			 System.out.println(itr1.next());
		 }*/
		 
		//3. Iterate By using foreach loop -->
 	/*	for(String i:l) {
			System.out.println((i));
		}	*/
		
	/*	Map<Integer,String> al=new HashMap<>();
		
			al.put(1, "Sohel");
			al.put(2, "Abhay");
			al.put(3, "Raj");	
			
			System.out.println(al);*/
			
//			1. Iterate HashMap by using keySet() - 
			
//			 Iterator<Integer> itr = al.keySet().iterator();
//			 while(itr.hasNext()) {
//				 Integer key = itr.next();
//				 String value = al.get(key);
//				 System.out.println("Key = "+key+" | Value = "+value);
//			 }
		 	
//			2. Iterate HashMap by using EntrySet() - 
			
//			Iterator<Map.Entry<Integer, String>> itr1 = al.entrySet().iterator();
//			while(itr1.hasNext()) {
//				Map.Entry<Integer, String> entry = itr1.next();
//				System.out.println("Key = "+entry.getKey()+" | Value = "+entry.getValue());
//			}
			
//			3. By using lambda and for each - Java 8 feature - 
//			al.forEach((k,v) -> System.out.println("Key = "+k+" | Value = "+v));
 			
//		1. Type safe
	/*	List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l.contains(10));
		System.out.println(l.indexOf(3));
		System.out.println(l.isEmpty());
		System.out.println(l.remove(2));	*/
//		l.add("Sohel");
//		System.out.println(l);
	/*	System.out.print("\n");
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
	/*	System.out.print("\n");
		
		for (Integer i: l) {
			System.out.println(i);
		}*/
		
//		2. Un-Type safe
	/*	List ll=new ArrayList();
		ll.add(1);
		ll.add("Sohel");*/
//		System.out.println(ll);
		
	/*	Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
	/*	System.out.println("\n");
		for (Object i: ll) {
			System.out.println(i);
		}*/
		
	/*	Vector v=new Vector();
		
		v.add(12);
		v.add("Sohel");
		v.add("Shadab");
		
		System.out.println(v);
		for (Object i : v) {
			System.out.println(i);
		}*/
		
//		Stack<String> st = new Stack<>();
//		st.push("Sohel");
//		st.push("Shadab");
//		st.push("Sam");
//		System.out.println(st.peek());					//Sam
//		System.out.println(st.pop());					//Sam
//		System.out.println(st.peek());					//Shadab
//		System.out.println(st.search("Shadab"));		//1
//		System.out.println(st);							//[Sohel, Shadab]
//		System.out.println(st.isEmpty());				//false		
		
	/*	List l=new ArrayList<>();
		l.add(12);
		l.add("Sohel");
		l.add("Shonu");
		l.add("Tanzim");
		l.add("Shadab");	*/
		
//		System.out.println(l);
	/*	for (Object i : l) {
			System.out.println(i);
		}*/
		
//		HashSet hs=new HashSet();
//		Duplicates are not allowed..(X)
//		Insertion order does not follow..(X)
//		hs.add(12);
//		hs.add("Sohel");
//		hs.add(120);
//		hs.add(120);
//		hs.add(null);
//		hs.add(null);
//		System.out.println(hs);
//		for (Object i : hs) {
//			System.out.println(i);
//		}
//		System.out.println("--------------------------------");
		
//		LinkedHashSet lhs=new LinkedHashSet();
//		Duplicates are not allowed..(X)
//		Insertion order follow..
//		lhs.add(12);
//		lhs.add(12);
//		lhs.add(120);
//		lhs.add("Sohel");
//		lhs.add("Pune");
//		System.out.println(lhs);
//		for (Object i : lhs) {
//			System.out.println(i);
//		}	
		
//		SortedSet ss=new TreeSet();
//		Sorting order follow..
//		Duplicates are not allowed..(X)
//		Diffrerent data type not take..(X)
	/*	ss.add(1);
		ss.add(12);
		ss.add(12);
		ss.add(1220);
		ss.add(123456);
		ss.add(123456789);
		ss.add(122);*/
	/*	ss.add("Amol");
		ss.add("Amol");
		ss.add("Dog");
		ss.add("Cat");
		ss.add("Boss");*/
		
//		System.out.println(ss);
		
	/*	TreeSet ts=new TreeSet();
//	 	Sorting order folllow..
//		Duplicates are not allowed..(X)
//		Diffrerent data type not take..(X)
//		Insertion order not follow..(X)
		ts.add(12);
		ts.add(120);
		ts.add(45);
		ts.add(56);
	//	ts.add("Sohel");
	//	ts.add("Abhay");
		
		System.out.println(ts);*/
		
	/*	HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "Physics");
		hm.put(2, "Maths");
		hm.put(3, "Science");	*/
//		System.out.println(hm);
		
//		1. Iterate by using - keySet -->
		
		/*	Iterator<Integer> itr = hm.keySet().iterator();
			while(itr.hasNext()) {
				Integer key = itr.next();
				String value = hm.get(key);
				System.out.println("Key - "+key+" Value - "+value);
			}*/
		
//		1. Iterate by using - entrySet -->
		
	/*	Iterator<Map.Entry<Integer, String>> itr1 = hm.entrySet().iterator();
		while(itr1.hasNext()) {
			Map.Entry<Integer, String> entry = itr1.next();
			System.out.println("key - "+entry.getKey()+" Value - "+entry.getValue());
		}*/
		
//		1. Iterate by using - Java8 [foreach & lambda features] -->
		
	//	hm.forEach((k,v) -> System.out.println("Key - "+k+" Value - "+v));
		
		
		/*LinkedHashMap< Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(1, "Sohel");
		lhm.put(2, "Abhay");
		lhm.put(3, "Raj");
		
//		System.out.println(lhm);
		*/
		
	/*	ArrayList<String> al=new ArrayList();
		al.add("Amol");
		al.add("Karan");
		al.add("Raj");
		al.add("Vijay");*/
//		(Print object in one Line..)-->
//		By using sysout statement..
	/*	System.out.println(al);
		System.out.println("-------------------------------");*/
		
//		(Print object in one by one..)-->
//		By using for each loop..
		/*for (String i : al) {
			System.out.println(i);
		}
		System.out.println("-------------------------------");*/
		
//		By using iterator..
	/*	Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------------------------");*/
		
//		By using ListIterator..
	/*	ListIterator<String> itr=al.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------------------------");*/

		
	/*	HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "Physics");
		hm.put(2, "Chemistry");
		hm.put(3, "Maths");
//		By using sysout statement..
		System.out.println(hm);
		
		System.out.println("---------------------------");*/
		
//		By using sysout statement..
		/*for(Map.Entry<Integer, String> entry: hm.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		System.out.println("---------------------------");*/
		
		
		//Rough space - 

		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
	}
}
