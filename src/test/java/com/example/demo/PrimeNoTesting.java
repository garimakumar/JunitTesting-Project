package com.example.demo;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrimeNoTesting {
	
	@Test
	public void test1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
      PrimeClass primeno=new PrimeClass();
      assertEquals("Prime",primeno.isPrime(number));
	}
	@Test
	public void test2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
      PrimeClass primeno=new PrimeClass();
      assertEquals("Prime",primeno.isPrime(number));
	}

	@Test
	public void test3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
      PrimeClass primeno=new PrimeClass();
      assertEquals("Prime",primeno.isPrime(number));
	}

	@Test
	public void test4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
      PrimeClass primeno=new PrimeClass();
      assertEquals("Prime",primeno.isPrime(number));
	}
	
}