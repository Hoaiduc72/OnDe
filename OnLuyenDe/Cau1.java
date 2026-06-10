package OnLuyenDe;
import java.util.*;
public class Cau1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số kWh: "); double kWh = sc.nextDouble();
		sc.nextLine();
		double tienDien = 0;
		if(kWh<=0) {
			System.out.println("Số kWh phải >0");
		}
		else if(kWh<=50) {
			tienDien = kWh*1.678;
		}
		else if(kWh<=100) {
			tienDien = 50*1.678 + (kWh-50)*1.734;
		}
		else {
			tienDien = 50*1.678 + 50*1.734 + (kWh-100)*2.014;
		}
		System.out.println("Tiền điện cần trả: "+tienDien);
	}
}
