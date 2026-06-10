package ChuaDe3_Cau2;
import java.util.*;
public class Product {
	protected String Id;
	protected String ProductName;
	protected double Price;
	
	public String getId() {
		return Id;
	}
	
	public void InputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID: "); Id = sc.nextLine();
		System.out.print("Nhập tên sp: "); ProductName = sc.nextLine();
		System.out.print("Nhập giá: "); Price = sc.nextDouble();
	}
	public void DisplayData() {
		System.out.print(" ID: "+Id+"  -  Tên SP: "+ProductName+"  -  Giá: "+Price);
	}
}
