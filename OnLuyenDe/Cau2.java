package OnLuyenDe;
import java.util.*;
public class Cau2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập lương(triệu): ");
		double luong = sc.nextDouble(); sc.nextLine();
		double thue = 0;
		if(luong<11) {
			thue=0;
		}
		else if(luong<25) {
			thue = (luong-11)*0.05;
		}
		else {
			thue = (14*0.05)+(luong-25)*0.1;
		}
		System.out.println("Thuế cần đóng: "+thue);
		
	}
	
}
