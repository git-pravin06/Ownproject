package git;

public class MycodingMaths {
	public static void main(String[] args) {
		//Swap the Two Numbers Without Using Third variable
		
		int a=10;
		int b=30;
		int sum =a+b; // 10+30=40
		b=sum-b; 	//40-30=10
		a=sum-b;	//40-10=30
		
		System.out.println(a);
		System.out.println(b);
	}
}
