package ChuaDe2_Cau1;

public class Main {
	public static boolean kiemTra(int n) {
		if(n<=1) {
			return false;
		}
		for(int i = 2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		for(int i = 0;i<100;i++) {
			if(kiemTra(i)) {
				System.out.print(i+ " ");
			}
		}
	}
}
