package ChuaDe2_Cau2;

import java.util.*;

public class OrderManager extends AbOrderManager{
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void AddNewOrder(ArrayList<OnlineOrder> list) {
		OnlineOrder o = new OnlineOrder();
		o.InputData();
		list.add(o);
		System.out.println("đã thêm");
	}
	@Override
	public void DisplayOrders(ArrayList<OnlineOrder> list) {
		for(OnlineOrder o : list) {
			o.DisplayData();
		}
	}
	public void UpdateOrderById(ArrayList<OnlineOrder> list) {
		boolean timThay = false;
		System.out.print("Nhập id cần sửa: ");
		String sua = sc.nextLine();
		
		for(OnlineOrder o : list) {
			if(o.getId().equalsIgnoreCase(sua)) {
				o.InputData();
				timThay = true;
				System.out.println("Đã sửa");
				break;
			}
		}
		if(!timThay) { System.out.println("K tìm thấy đối tượng");
		}
	}
	public void RemoveOrderById(ArrayList<OnlineOrder> list) {
		boolean timThay = false;
		System.out.print("Nhập id cần xóa: ");
		String xoa = sc.nextLine();
		for(int i = 0; i < list.size();i++) {
			if(list.get(i).getId().equalsIgnoreCase(xoa)) {
				list.remove(i);
				timThay = true;
				System.out.println("Đã xóa");
				break;
			}
		}
		if(!timThay) { System.out.println("k tìm thấy đối tượng");
		}
	}
}
