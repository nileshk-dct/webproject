package day42;

import org.testng.annotations.Test;



public class TestngFirst {
	
	@Test (priority=1)
	void openapp() {
		System.out.println("Open app");
		
	}
	
	@Test (priority=2)
	void login() {
		System.out.println("Login test");
	}
	
	@Test (priority=3)
	void logout() {
		System.out.println("Logout test");
	}

}
