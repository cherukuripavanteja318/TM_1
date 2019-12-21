package testNGConcept;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNG_Demo {
		
	@Parameters({"UID","PWD"})
    @Test
	public void TC001(String uid,String pwd ){
		System.out.println("TC001 Executed");
		System.out.println(uid);
		System.out.println(pwd);
	}

}
