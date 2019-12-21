package Java;

public class Sample2 {

	public static void  m1() {
		StringBuilder sb=new StringBuilder("paVan");
		System.out.println(sb.append("kishore"));
		System.out.println(sb.codePointAt(5));
		
	}
	
	
	public static  void  m2() {
		StringBuilder sb=new StringBuilder("teja");
		System.out.println(sb.append("kumar"));
		StringBuffer s;
	}
	
	
	public static void main(String[] args) {
	m1();
	m2();
	
	}

}
