package com.example.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testing2 {

	AgeVerification agevalid;
	@Before
	public void init() {
		agevalid=new AgeVerification();
		System.out.println("Object initialized");
	}
	
	@Test
	public void test1() {
		System.out.println("In test1");
	//AgeVerification agevalid=new AgeVerification();  //THIS IS THE REPEATED LINE IN EVERY TEST CASE SO,IT IS TAKE IN @BEFORE ANNOTATION
	assertEquals("right to vote",agevalid.AgeVerify(30));
	}
	
	@Test
	public void test2() {
		System.out.println("In test2");
	//AgeVerification agevalid=new AgeVerification();
	assertEquals("no right to vote",agevalid.AgeVerify(10));
	}
	
	@Test
	public void test3() {
		System.out.println("In test3");
	//AgeVerification agevalid=new AgeVerification();
	assertEquals("right to vote",agevalid.AgeVerify(25));
	}
	@After
	public void deinit() {
		agevalid=null;  //Object is nullified
		System.out.println("Object deinitialized");
	}
}
