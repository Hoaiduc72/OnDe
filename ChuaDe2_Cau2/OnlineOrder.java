package ChuaDe2_Cau2;
import java.util.*;

public class OnlineOrder extends Order{
	protected String DeliveryAddress;
	Scanner sc = new Scanner(System.in);
	@Override
	public void InputData() {
		super.InputData();
		System.out.print("Nhập đc: ");
		this.DeliveryAddress = sc.nextLine();
	}
	public void DisplayData() {
		super.DisplayData();
		System.out.println(" - Địa chỉ: "+DeliveryAddress);
	}
}
