package testframwork;

import org.testng.annotations.Test;

public class TestCasePractice {
	
	@Test
	public static void logInPage() {
		int a=10,b=0;
		int c = a/b;
		System.out.println(c);
		
		System.out.println("Login page test case");
	}
	
	@Test
	public void authentication() {
		
		System.out.println("Authentication Test Case");
	}
	@Test
	public void logOut() {
		
		System.out.println("Logout Test Case");
	}

	
}
