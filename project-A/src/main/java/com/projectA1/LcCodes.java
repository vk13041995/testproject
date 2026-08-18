package com.projectA1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LcCodes {


	    public static int climbStairs70(int n) {
	        if (n <= 2) return n;

	        int[] dp = new int[n + 1];
	        dp[1] = 1;  // One way to climb 1 step
	        dp[2] = 2;  // Two ways to climb 2 steps

	        for (int i = 3; i <= n; i++) {
	            dp[i] = dp[i - 1] + dp[i - 2]; // Sum of ways to get to (i-1) and (i-2)
	        }

	        return dp[n];
	    }
	    

	        // Function to check if a number is prime
	        public static boolean isPrime(int num) {
	            if (num <= 1) return false;         // 0 and 1 are not prime
	            if (num == 2) return true;          // 2 is the only even prime number
	            if (num % 2 == 0) return false;     // eliminate other even numbers

	            for (int i = 3; i <= Math.sqrt(num); i += 2) {
	                if (num % i == 0)
	                    return false;
	            }

	            return true;
	        }
	        
//	        Input: strs = ["eat","tea","tan","ate","nat","bat"]
//    		Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    
	        public static int rearrange(ArrayList<String> n) {
	        	
	        	
	        	ArrayList<String> data = new ArrayList<String>();
	        	List<String> f=Arrays.asList("eat","tea","tan","ate","nat","bat");
	        	data.addAll(f);
	        	
	        	ArrayList<List<String>> list = new ArrayList<List<String>>();
	        	
	        	for(String g:data) {
	        		
	        	}
	        	
	        	
				return 0;
	        	
	        } public static String  rearrange() {
//		        Input: Arrays.asList("Java", "Go", "Python", "C", "Rust")
//		        Expected Output: ["JAVA", "PYTHON", "RUST"]
	        	
	        	List<Integer> a =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        	int b=a.stream().filter(x->x%2==0).mapToInt(x->x).sum();
	        	System.out.println(b);
	        	return null;}
    

//	        public static void main(String[] args) {
//	            Scanner scanner = new Scanner(System.in);
//
//	            System.out.print("Enter a number to check if it's prime: ");
//	            int number = scanner.nextInt();
//
//	            if (isPrime(number)) {
//	                System.out.println(number + " is a prime number.");
//	            } else {
//	                System.out.println(number + " is NOT a prime number.");
//	            }
//
//	            scanner.close();
//	        }


	    public static void main(String[] args) {
//	        int n = 5;
//	        System.out.println("Ways to climb " + n + " stairs: " + climbStairs70(n));
	    	rearrange();
	    }
//	        public static String  rearrange1() {
//		        Input: Arrays.asList("Java", "Go", "Python", "C", "Rust")
//		        Expected Output: ["JAVA", "PYTHON", "RUST"]
	        	
//	        	List<String> a =  Arrays.asList("Java", "Go", "Python", "C", "Rust");
//	        	List<String> b= a.stream().filter(x->x.length()>=4).map(x->x.toUpperCase()).collect(Collectors.toList());
//	        	System.out.println(b);
	        	

//	        		Arrays.asList({1,3},{2,6},{8,10},{15,18}});
//	                List<List<Integer>> intervals = new ArrayList<>();
//	                intervals.add(Arrays.asList(1, 3));
//	                intervals.add(Arrays.asList(8, 10));
//	                intervals.add(Arrays.asList(2, 6));
//	                intervals.add(Arrays.asList(15, 18));
//	        		test(intervals);
//	        		test([[1,3],[2,6],[8,10],[15,18]]);

//	        		Task: Given a list of Employee objects, filter for employees who are older than 30, sort them by their salary in descending order, and extract just their names into a list.
	        		
	        		
	        		 List<Employee> employees = Arrays.asList(
	        		            new Employee("Alice",20, "IT", 80000),
	        		            new Employee("Bob",40, "HR", 60000),
	        		            new Employee("Charlie",30, "IT", 90000),
	        		            new Employee("David",25, "IT", 30000),
	        		            new Employee("Harry",29, "IT", 40000),
	        		            new Employee("A",28, "IT", 50000)
	        		        );
	        		 
	        		 
	        		 
	        		 
//	        		 List<String> q = employees.stream().filter(e->e.getAge()>30).sorted(Comparator.comparing(Employee.getSalary()).reversed()).map(Employee::getName).collect(Collectors.toList());
//	        	
//	    
//	        		 List<String> q = employees.stream().filter(e->e.getAge()>30)
//	        				 .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//	        				 .map(Employee::getName)
//	        				 .collect(Collectors.toList());
//	        		 System.out.println(q);
	        }

//	        

	}
