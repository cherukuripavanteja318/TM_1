package Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2 {
	
	public static boolean validateReg(String src,String trg){
		 boolean a=false;
		int n=0;
		Pattern p=Pattern.compile(src);
		Matcher m=p.matcher(trg);
		
		while(m.find()){
			System.out.println(m.group());
			a=true;
			n++;
		}
		System.out.println("no of ids matched :"+n);
		return a;	
	}
	
	public static void main(String[] args) {
		String ptrn="[A-Z]{5}\\.[0-5]{3}\\@gmail\\.com";
		String trg="PAVXN.123@gmail.com,PAvAN.123@gmail.com,P1VAN.123@gmail.com";
		boolean b=validateReg(ptrn,trg);
		if(b){
			//System.out.println(" ids matched");
		}
		else{
			System.out.println("no ids  mached");
		}
	}

}
