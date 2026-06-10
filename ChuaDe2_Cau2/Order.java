package ChuaDe2_Cau2;
import java.util.*;
public class Order {
	protected String Id;
	protected String CustomerName;
	protected String OrderDate;
	
	public String getId() { return Id;
	}
	
	public void InputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID: ");
		this.Id = sc.nextLine();
		System.out.print("Nhập tên: ");
		this.CustomerName = sc.nextLine();
		System.out.print("Nhập ngày order: ");
		this.OrderDate = sc.nextLine();
	}
	public void DisplayData() {
		System.out.println( "Id: "+Id+" - Tên: "+CustomerName+" - Ngày Order: "+OrderDate);
	}
}
