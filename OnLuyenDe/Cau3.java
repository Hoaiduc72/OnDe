package OnLuyenDe;

public class Cau3 {
	public static boolean soHoanHao(int n) {
		if(n<=2) {
			return false;
		}
		int sum = 0;
		for(int i = 1; i <= n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum==n;
	}
	public static void main(String[] args) {
		if(soHoanHao(7)) {
			System.out.println("la so hoan hao");
		}
		else{System.out.println("k phai");}
		
	}

}
	