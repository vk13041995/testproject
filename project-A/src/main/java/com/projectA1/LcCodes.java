package com.projectA1;

import java.util.Scanner;

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

	        public static void main(String[] args) {
	            Scanner scanner = new Scanner(System.in);

	            System.out.print("Enter a number to check if it's prime: ");
	            int number = scanner.nextInt();

	            if (isPrime(number)) {
	                System.out.println(number + " is a prime number.");
	            } else {
	                System.out.println(number + " is NOT a prime number.");
	            }

	            scanner.close();
	        }


//	    public static void main(String[] args) {
//	        int n = 5;
//	        System.out.println("Ways to climb " + n + " stairs: " + climbStairs70(n));
//	    }
	}
