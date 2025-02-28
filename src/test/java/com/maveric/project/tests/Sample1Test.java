package com.maveric.project.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Sample1Test {	
	
private 	String string1, string2, string3, string4;
	
	@BeforeAll
	public static void setUpContextEnv() {
		System.out.println("====setUpContextEnv()");
	}
	
	@BeforeEach
	public void setUpTestMockDataEnv(){
		 string1 ="Hello To All";
		 string2="hello To All";
		 string3=null;
		 string4="This is a Junit framework Training Program";
	}
	
	@Test 
	@DisplayName("assert that string1 and string2 are equals ")
	public void test1() {
		Assertions.assertEquals(string1, string2);
	}

	@Test	
	@DisplayName("assert that string3 should not be null ")
	public void test2() {
		Assertions.assertNotNull(string3);
	}
	
	@Test	
	@DisplayName("assert that string 4 should content the word 'Junit' ")
	public void test3() {
		boolean isContain = string4.contains("Junit");
		Assertions.assertTrue(isContain);
	}
	
	@AfterEach
	public void tearDownTestMockDataEnv(){
		System.out.println("====tearDownTestMockDataEnv()");
	}
	

	@AfterAll
	public static void tearDownContextEnv() {
		System.out.println("====tearDownContextEnv()");
	}

}