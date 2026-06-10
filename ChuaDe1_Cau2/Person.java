package ChuaDe1_Cau2;
import java.util.*;
public class Person {
	protected String Id;
	protected String FullName;
	protected int YearOfBirth;
	
	public String getID() { return this.Id;
	}
	
	public void InputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập id: ");
		this.Id = sc.nextLine();
		System.out.print("Nhập tên: ");
		this.FullName = sc.nextLine();
		System.out.print("Nhập năm sinh: ");
		this.YearOfBirth = sc.nextInt(); sc.nextLine();
	}
	
	public void DisplayData() {
		System.out.println("ID: "+ Id + " - Name: "+FullName+" - "+"Year: "+YearOfBirth);
	}

}
