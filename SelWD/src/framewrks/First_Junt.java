package framewrks;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class First_Junt {

	
	//This is first Junit Program
	
	@Before
	public void before(){
		System.out.println("This statement is executed before every test");
	}
	
	@After
	public void after(){
		System.out.println("This statement is executed after every test");
	}
	
	@Test
	public void Test1(){
		System.out.println("Test1");
	}
	
	@Ignore
	@Test
	public void Test2(){
		System.out.println("Test2");
	}
	
	@Test
	public void Test3(){
		System.out.println("Test3");
	}
}
