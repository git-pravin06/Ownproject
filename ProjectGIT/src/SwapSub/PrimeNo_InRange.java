package SwapSub;

public class PrimeNo_InRange {
	public static void main(String[] args) {
		
		int a=1,b=50,e=1;
		for (a++;a<=b;a++) {
			for (int j=2;j<b-1;j++) {
				if (a%2==0) {
					e=e+1;
				}
			}if (e==0) {
				System.out.println(a);
			}e=0;
		}
	}

}
