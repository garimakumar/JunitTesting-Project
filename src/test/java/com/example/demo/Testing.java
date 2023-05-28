package com.example.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing {

	@BeforeClass
	public static void initializer() { //static--In @BeforeClass-
		                                        //we are creating the object only once because all the test 
		                                        //cases are executed at the same time all together.
		                                        //so, to retain a single value of the object STATIC is used.
		                                       //Also,If we are creating the object for reference of one method
		                                        //or we r creating the object for reference of another method
		                                        //...etc then the value of the object get changed 
		System.out.println("Its @BeforeClass");
	}
//	@Before
//	public void initializer() {
//		System.out.println("Its @Before");
//	}
	@Test
	public void test1() {
		System.out.println("Its test 1");
	}
	@Test
	public void test2() {
		System.out.println("Its test 2");
	}
//	@After
//	public void deinitializer() {
//		System.out.println("Its @After");
//	}
	@AfterClass
	public static void deinitializer() {
		System.out.println("Its @AfterClass");
	}
	
}
