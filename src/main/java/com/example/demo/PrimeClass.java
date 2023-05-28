package com.example.demo;

public class PrimeClass {
		  
		 
	public String isPrime(int number) {
		
	
		if(number<=1) {
			System.out.println(number+":\tNumber is not prime");
			return "Not Prime";
		}
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				System.out.println(number+":\tNumber is not prime");
				return "Not Prime";
			}
			
		}
		
		System.out.println(number+":\tNumber is Prime");
		return "Prime";
	}
}

