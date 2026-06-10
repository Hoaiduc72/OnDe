package ChuaDe2_Cau2;

import java.util.ArrayList;

public abstract class AbOrderManager {
	public abstract void AddNewOrder(ArrayList<OnlineOrder> list);
	public abstract void DisplayOrders(ArrayList<OnlineOrder> list);
	public abstract void UpdateOrderById(ArrayList<OnlineOrder> list);
	public abstract void RemoveOrderById(ArrayList<OnlineOrder> list);
	
}
