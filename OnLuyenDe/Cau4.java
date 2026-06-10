package OnLuyenDe;
import java.util.*;
public class Cau4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dem = 0;
		double tongSoLe =0;
		double tb = 0;
		while(true) {
			int n = sc.nextInt();
			if(n==999) {
				tb = tongSoLe/dem;
				System.out.println("Trung bình: "+tb);
				break;
			}
			else if(n%2!=0 && n!=999) {
				tongSoLe = tongSoLe+n;
				dem++;
			}
			
			
		}
	}
}
