package SwapSub;

public class Palidrone {
	public static void main(String[] args) {
		int n=123;
		int pal=0,r,c=n;
		
		while(n>0) {
			r=n%10;
			pal=(pal*10)+r;
			n=n/10;
		}
		if (c==pal) {
			System.out.println("Palidrone No");
		}else {
			System.out.println("Not A palidrone no");
		}
		System.out.println("Changes");
	}

}
