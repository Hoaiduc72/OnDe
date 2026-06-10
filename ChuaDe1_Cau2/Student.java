package ChuaDe1_Cau2;
import java.util.*;
public class Student extends Person{
	public float Score;
	@Override
	public void InputData() {
		Scanner sc = new Scanner(System.in);
		super.InputData();
		System.out.print("Nhập điểm: ");
		this.Score = sc.nextFloat();sc.nextLine();
	}
	@Override
	public void DisplayData() {
		System.out.println("ID: "+ Id + " - name: "+FullName+" - year: "+YearOfBirth+ " - score: "+Score);
	}
}
