package program.jav.collection;

import java.util.*;

class HashSetExample{
	public static void main(String[] args){
		
		TreeSet hs=new TreeSet();
		
		hs.add("d");
		hs.add("c");
		hs.add("b");
		hs.add("a");
		hs.add("c");
		hs.add("i");
		hs.add("l");
		
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Hashset is "+ hs.size());
		
		System.out.println("Does hashset contains this 'u' element  " + hs.contains("u"));
	}
}