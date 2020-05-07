package program.jav.collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String a[]){
    	
        LinkedList ll = new LinkedList();
        
        ll.add("January");
        ll.add("March");
        ll.add("May");
        ll.add("July");
        ll.add("March");
        ll.addFirst("Hello");
        
        
        System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
        System.out.println("Does LinkedList contains 'September'? "+ll.contains("September"));
        
    }
}