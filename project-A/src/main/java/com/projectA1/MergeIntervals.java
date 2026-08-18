package com.projectA1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Input:  [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
public class MergeIntervals {

	public static List<List<Integer>> test(List<List<Integer>> intervals) {
		Collections.sort(null);
		intervals.sort((a, b) -> a.get(0) - b.get(0));
//		System.out.println(intervals);
		return null;}
	
	
	  public static void allSubsequences(String s, int index, String current) {
	        if (index == s.length()) {
	            System.out.println("value: "+current);
	            return;
	        }
	        // exclude current character
	        allSubsequences(s, index + 1, current);
//	        System.out.println("s: "+s+" index: " +index + " current: "+ current);
	        // include current character
	        allSubsequences(s, index + 1, current + s.charAt(index));
//	        System.out.println("s: "+s+" index: " +index + " current: "+ current);
	    }
	
	public static void main(String[] args) {
		
		        allSubsequences("abc", 0, "");
		
		
//		String s= "test";
		List<String> r= Arrays.asList("test","java","microservices","SpringBoot","Springmvc");
		
		List<String> z=r.stream().filter(a->a.startsWith("Spring")).toList();
		
		List<String> k=r.stream().filter(a->a.toLowerCase().startsWith("s")).map(a->a.toUpperCase()).collect(Collectors.toList());
		
		List<Integer> o= new ArrayList<Integer>();
		o=Arrays.asList(1,2,5,7,9,8,4,12,15);

		        String secret = "ddef";
		        
		        String w=secret.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
		        .entrySet().stream().map(ez->ez.getKey()+String.valueOf(ez.getValue())).collect(Collectors.joining());

		        
		        
//		        secret.chars().mapToObj(null)
		        
		        
		        //		        int shift = 3;
//
//		        String encrypted = secret.chars()
//		                .map(c -> c +shift)       // Perform arithmetic operation directly on the int
//		                .mapToObj(c -> (char) c)   // Convert back to Character
//		                .map(Object::toString)
//		                .collect(Collectors.joining());

//		        System.out.println(encrypted); // Output: def
		
//		String e= secret.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting())).
//				entrySet().stream().map(entry->entry.getKey()+String.valueOf(entry.getValue())).collect(Collectors.joining());

		        		//Integer x= Stream.of(1,2,5,7,9,8,4,12,14).max(Integer::compare).orElseThrow()	;	
		
//		System.out.println(e);
	List<Integer> l=	o.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
	
	
	
	Map<Integer,String> m = new HashMap<Integer, String>();
	
	m.put(1, "test1");
	m.put(2, "test2");
	m.put(3, "test3");
	m.put(4, "test4");
	m.put(5, "test5");

	
	
	
	
	 m.entrySet().forEach(awq->System.out.println(awq.getKey()));
	
//	System.out.println("d: "+d);
//	m.entrySet().stream().forEach(pa->System.out.println(pa.getValue() + pa.getKey()));
//	m.keySet().stream().forEach(qw-> System.out.println(qw));

//		List<Integer> q= Stream.of(1,2,5,7,9,8,4,12,14).filter(a->a%2==0).collect(Collectors.toList());

//System.out.println(encrypted);
//		HashMap<String, Long> a=s.chars().mapToObj(q->(chars)q).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())
//		
//		HashMap<String, Long> a= s.chars().mapToObj(c-> (Chars) c).collect(Collectors.groupingBy(function()), null, null)
//
//				
//				  String output = input.chars()
//		            .mapToObj(c -> (char) c)
//		            .collect(Collectors.groupingBy(
//		                Function.identity(),
//		                LinkedHashMap::new,     // Critical: Maintains character insertion order
//		                Collectors.counting()
//		            ))
//		            .entrySet()
//		            .stream()
//		            .map(entry -> entry.getKey() + String.valueOf(entry.getValue()))
//		            .collect(Collectors.joining());
//		LinkedHashMap<Character, Integer> j =new LinkedHashMap<Character, Integer>();
//for(char c:s.toCharArray()) {
//	
//	if(j.containsKey(c)) {
//		j.put(c, j.get(c)+1);
//	} else {j.put(c, 1);}
//}
//for (Map.Entry<Character, Integer> entry : j.entrySet()) {
//    System.out.print(entry.getKey() + "" + entry.getValue());
//}

//System.out.println(j.entrySet().toString()+j.keySet());
	
	
//	public static void main(String[] args) {
//		Arrays.asList({1,3},{2,6},{8,10},{15,18}});
//        List<List<Integer>> intervals = new ArrayList<>();
//        intervals.add(Arrays.asList(1, 3));
//        intervals.add(Arrays.asList(8, 10));
//        intervals.add(Arrays.asList(2, 6));
//        intervals.add(Arrays.asList(15, 18));
//		test(intervals);
//		test([[1,3],[2,6],[8,10],[15,18]]);

//		Task: Given a list of Employee objects, filter for employees who are older than 30, sort them by their salary in descending order, and extract just their names into a list.
		
		
//		 List<Employee> employees = Arrays.asList(
//		            new Employee("Alice",20, "aT", 80000),
//		            new Employee("Bob",40, "dR", 60000),
//		            new Employee("Charlie",30, "bT", 90000),
//		            new Employee("David",25, "cT", 30000),
//		            new Employee("Harry",39, "hT", 40000),
//		            new Employee("A",28, "kT", 50000)
//		        );
//		 
//		 
//		 List<String> q = employees.stream().filter(e->e.getAge()>30).sorted(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getDept)).map(Employee::getName).collect(Collectors.toList());
//		 
//		 
//		 System.out.println(q);
		 
		 String ad=secret.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().map(qa->qa.getKey()+ String.valueOf(qa.getValue())).collect(Collectors.joining());
		 
		 System.out.println(ad);
		 
		 
		 
//		 List<String> q = employees.stream().filter(e->e.getAge()>30)
//				 .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//				 .map(Employee::getName)
//				 .collect(Collectors.toList());
//		 System.out.println(q);
////		 
////		 List<String> names = employees.stream()
////		            .filter(e -> e.getAge() > 30) // 1. Filter age > 30
////		            // 2. Sort by salary in descending order
////		            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()) 
////		            .map(Employee::getName)       // 3. Extract just the names
////		            .collect(Collectors.toList());
//
//		        // Chaining multiple comparators
//		        employees.sort(
//		            Comparator.comparing(Employee::getDept)           // 1. Primary: Dept (Asc)
//		                      .thenComparing(Employee::getSalary,     // 2. Secondary: Salary
//		                                     Comparator.reverseOrder()) // (Desc)
//		                      .thenComparing(Employee::getName)       // 3. Tertiary: Name (Asc)
//		        ));
//		        
//		        employees.forEach(System.out::println);
		 
//		 Task: Given a list of lists of integers, flatten the structure into a single sequence of numbers, remove any duplicates, and find the maximum number.
//		 Input: Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(3, 4, 5), Arrays.asList(5, 6))
		
		List<List<Integer>> a= Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(3, 4, 5), Arrays.asList(5, 6));
		
		Optional<Integer> v= a.stream().flatMap(e->e.stream()).distinct().max((c, b) -> c.compareTo(b));
		
		
		
		
		
		
//		System.out.println(v.max(null));
//		System.out.println(v);
		    }
}
