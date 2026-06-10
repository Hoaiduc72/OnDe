package ChuaDe2_Cau2;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OrderManager manager = new OrderManager();
		ArrayList<OnlineOrder> ds = new ArrayList<>();
		while(true) {
			System.out.println("1. Thêm order");
			System.out.println("2. Hiển thị order");
			System.out.println("3. Sửa order");
			System.out.println("4. Xóa order");
			int chon = sc.nextInt(); sc.nextLine();
			switch(chon) {
			case 1: 
				System.out.println("Thêm order");
				manager.AddNewOrder(ds);
				break;
			case 2:
				System.out.println("Hiển thị order");
				manager.DisplayOrders(ds);
				break;
			case 3:
				System.out.println("Sửa order");
				manager.UpdateOrderById(ds);
				break;
			case 4:
				System.out.println("Xóa order");
				manager.RemoveOrderById(ds);
				break;
			default:
				System.out.println("Lỗi");
			}
			
				
		}
	}
}
