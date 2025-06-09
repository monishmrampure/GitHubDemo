package Execution;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class GitDevelopDemo {
	@Test
	public void architechChange2() {
		List<String> li = new ArrayList<String>();
		li.add("TestNG");
		li.add("Mavan");
		li.add("Page Object Model");
		li.add("Log4j");
		li.stream().sorted().forEach(arr->System.out.println("Frameworks: "+arr));
	}
	
	@Test
	public void nativeAndroid() {
		System.out.println("Native Android Ap");
	}
	
	@Test
	public void IOSApp() {
		System.out.println("IOS Apps");
		System.out.println("IOS Mobile Testing");
	}
	
	@Test
	public void AWS() {
		System.out.println("Architech added a new tech: AWS");
		System.out.println("Amazon Webservices");
	}

}
