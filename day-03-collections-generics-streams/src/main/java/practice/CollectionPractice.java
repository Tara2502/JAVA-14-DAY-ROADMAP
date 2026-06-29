package practice;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        List<String> cities=new ArrayList<>();
        cities.add("mumbai");
        cities.add("delhi");
        cities.add("bangalore");
        cities.add("kolkata");
        cities.add("mumbai");
        //entire list
        System.out.println("Entire List:" );
         for(String city: cities){
             System.out.println("-"+city);
         }
         //element at index 2
        System.out.println("element at index 2:");
        System.out.println(cities.get(2));
        System.out.println("Total elements: ");
        System.out.println(cities.size());

        Set<String> set=new HashSet<String>();
        set.add("mumbai");
        set.add("delhi");
        set.add("bangalore");
        set.add("kolkata");
        set.add("mumbai");
        //entire set
        System.out.println("Entire set:" );
        for(String city: set){
            System.out.println("-"+city);
        }
        Map<Integer,String> person=new HashMap<>();
        person.put(1,"Tara");
        person.put(2,"Aarya");
        person.put(3,"Riya");
        for(Integer i:person.keySet()){
            System.out.println("key: "+i);
        }
        for (String s:person.values()){
            System.out.println("value: "+s);
        }
        for(Map.Entry<Integer, String> p:person.entrySet()){
            System.out.println(p);
        }

        //linkedList demonstration
        LinkedList<String> names=new LinkedList<>() ;
        names.add("tara");
        names.add("aishwarya");
        names.add("poonam");
        names.addFirst("john");
        names.addLast("john");
        names.add("dean");
        names.removeFirst();
        names.removeLast();
         for(String i:names){
             System.out.println(i);
         }
         //treemap demonstration
        Map<Integer,String> p=new TreeMap<>() ;
         p.put(4,"dale");
         p.put(1,"graham");
        p.put(2,"blooh");
        p.put(3,"blah");
        for(Integer i:p.keySet()){
            System.out.println(i);
        }
    }



}
