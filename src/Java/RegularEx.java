package Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx {

	public static void main(String[] args) {
		
		int a=0;
		Pattern p=Pattern.compile("a?");
		Matcher m=p.matcher("aabggaaa @25%");
		
		while(m.find()){
			System.out.println(m.start()+"------"+m.group());
			a++;
		}
		System.out.println("no of matches :"+a);
	}

}
