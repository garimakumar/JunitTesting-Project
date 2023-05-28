package com.example.demo;

public class AgeVerification {

	
	public String AgeVerify(int age) {
		if(age>=18) {
			return "right to vote";
		}
		else {
			return "no right to vote";
		}
	}
}
