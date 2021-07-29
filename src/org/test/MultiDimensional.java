package org.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MultiDimensional {
     public static void main(String[]args) {
    	 List <Integer> l=new ArrayList<>();
    	 l.add(10);
    	 l.add(20);
    	 l.add(30);
    	 l.add(40);
    	 l.add(50);
    	 l.add(60);
    	 l.add(20);
    	 l.add(40);
    	 
    	 System.out.println(l);
     
          Integer integer = l.get(3);
         System.out.println(integer);
         
         l.add(3,100);
         System.out.println(l);
         
         l.set(4, 200);
         System.out.println(l);
         
         Integer remove = l.remove(4);
         System.out.println(remove);
         System.out.println(l);
         
         int indexof = l.indexOf(20);
         System.out.println(indexof);
         
         int lastindexof = l.lastIndexOf(20);
         System.out.println(lastindexof);
         
         boolean contain =l.contains(300);
         System.out.println(contain);
         
         boolean empty =l.isEmpty();
         System.out.println(empty);
         
         List <Integer> ll=new LinkedList<>();
         
         boolean addAll =ll.addAll(ll);
         System.out.println(addAll);
         System.out.println(ll);
         System.out.println(l);
         
         List <Integer> lii =new LinkedList<>();
         lii.add(100);
         lii.add(200);
         lii.add(300);
         lii.add(400);
         
         int size = lii.size();
         System.out.println(l);
         System.out.println(lii);
         
         boolean retainAll =l.retainAll(lii);
         System.out.println(retainAll);
         System.out.println(lii
        		 );
         
     
     
     
     
     }

}