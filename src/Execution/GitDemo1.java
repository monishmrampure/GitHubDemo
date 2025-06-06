package Execution;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class GitDemo1 {
	
	@Test
	public void getDataGit() {
		List<String> names = new ArrayList<String>();
		names.add("Monish");
		names.add("Abhishek");
		names.add("Padma");
		names.add("Mohan");
		names.add("Anusha");
		names.add("Anil");
		
		long total = names.stream().filter(s->s.contains("a")).count();
		System.out.println("Total count: "+total);
	}
	
	@Test
	public void getPrintData() {
		int a = 10;
		int b = 20;
		String str1 = "Hello";
		String str2 = "Git World";
		
		System.out.println("Printing the data: "+(a+b+" "+str1+" "+str2));
		System.out.println("Postjira2");
		System.out.println("Postjira3");
		System.out.println("Post jira 4");
	}

}
