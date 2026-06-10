package ChuaDe3_Cau1;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String maSP=sc.nextLine();
		String tenSP = sc.nextLine();
		double donGia = sc.nextDouble();
		int soLuong = sc.nextInt();
		
		double tongTien = donGia*soLuong;
		if(tongTien>1000000) {
			tongTien=tongTien/10 *9;
		}
		System.out.println("Tổng tiền: "+tongTien);
		
	}
}
