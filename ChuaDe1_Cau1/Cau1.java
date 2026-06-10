package ChuaDe1_Cau1;
import java.util.*;
public class Cau1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tong = 0;
		while(true) {
			int i = sc.nextInt();
			sc.nextLine();
			if(i<=0) {
				break;
			}
			tong = tong +i;
		}
		System.out.println("tổng: "+tong);
	}
}
