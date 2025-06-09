package Execution;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class GitDevelopDemo2 {
	
	@Test
	public void MobileTesting() {
		System.out.println("IOS Apps");
		System.out.println("IOS Mobile Testing");
	}
	
	@Test
	public void RestAssured() {
		System.out.println("Rest assured deals with the API testing");
		
		String[] a = {"Hello", "Mohan", "Abhi", "Ram", "Anusha"};
		List<String> list =  Arrays.asList(a);
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals("Abhi")) {
				System.out.println("Name: "+list.get(i));
			}
		}
	}
	

}
