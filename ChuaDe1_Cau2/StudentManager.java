package ChuaDe1_Cau2;
import java.util.*;
public class StudentManager implements IStudentManager{
	Scanner sc = new Scanner(System.in);
	public void AddNewStudent(ArrayList<Student> listSV) {
		Student s = new Student();
		s.InputData();
		listSV.add(s);
		System.out.println("đã thêm");
	}
	public void DisplayStudent(ArrayList<Student> listSV) {
		for(Student s : listSV) {
			s.DisplayData();
		}
	}
	public void UpdateStudentById(ArrayList<Student> listSV) {
		System.out.print("Nhập ID cần sửa: "); String id = sc.nextLine();
		boolean timThay = false;
		for(Student s : listSV) {
			if(s.getID().equalsIgnoreCase(id)) {
				s.InputData();
				timThay = true;
				break;
			}
		}
		if(!timThay) { System.out.println("Không tìm thấy ID");
		}
	}
	public void RemoveStudentById(ArrayList<Student> listSV) {
		System.out.print("Nhập ID cần xóa: "); String idX = sc.nextLine();
		boolean timThay=false;
		for(int i = 0; i < listSV.size();i++) {
			if(listSV.get(i).getID().equalsIgnoreCase(idX)) {
				listSV.remove(i);
				timThay=true;
				
				System.out.println("dã xóa");
				break;
			}
		}
		if(!timThay) {System.out.println("K tìm thấy");
		}
	}
}
