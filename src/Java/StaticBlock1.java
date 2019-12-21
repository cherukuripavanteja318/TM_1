package Java;

public class StaticBlock1 extends StaticBlock {

	StaticBlock1(){
		a=200;
		b=200;
		System.out.println("default constructor in child class");
	}
	StaticBlock1(int a,int b){
		System.out.println("child class perametarized constructer block is executed");
		this.a=a;
		this.b=b;
		this.c=c;	
	}
	void m2(){
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		StaticBlock1 c1=new StaticBlock1();
		//c1.m1();
		c1.m2();
		/*StaticBlock1 c2=new StaticBlock1(10,2);
		c2.m1();*/
	}
	

}
