package ChuaDe3_Cau2;
import java.util.*;
public class DiscountedProduct extends Product{
	int DiscountRate;
	@Override
	public void InputData() {
		Scanner sc = new Scanner(System.in);
		super.InputData();
		System.out.print("Nhập % giảm giá: "); DiscountRate = sc.nextInt(); sc.nextLine();
	}
	public void DisplayData() {
		super.DisplayData();
		System.out.println("  -  Giảm giá: "+DiscountRate);
	}
}
