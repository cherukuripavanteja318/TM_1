package Java;

public class StaticBlock {
	int a=5;
	int b;
	static int c;
	
	StaticBlock(){
		System.out.println("default constructor in parent class");
		a=100;
		b=50;
	}
	StaticBlock(int a,int b,int c){
		System.out.println("parent class perametarized constructer block is executed");
		this.a=a;
		this.b=b;
		this.c=c;	
	}
	
	static{
		c=50;
	}
	
	void m1(){
		System.out.println(a+b);
		//System.out.println(c);
	}
	public static void main(String[] args) {
		StaticBlock c1=new StaticBlock();
		c1.m1();
		StaticBlock c2=new StaticBlock(10,20,30);
		c2.m1();
	}
	

}
