package ChuaDe1_Cau2;	

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> danhSachSV = new ArrayList<>();
		StudentManager manager = new StudentManager();
		while(true) {
			System.out.println("1. Thêm sv");
			System.out.println("2. Hiển thị all sv");
			System.out.println("3. Xóa sv");
			System.out.println("4. Sửa sv");
			System.out.println("0. Thoát");
			int chon = sc.nextInt(); sc.nextLine();
			switch(chon){
			case 1:
                System.out.println("THÊM SINH VIÊN");
                manager.AddNewStudent(danhSachSV);
                break;
            case 2:
                System.out.println("DANH SÁCH SINH VIÊN");
                manager.DisplayStudent(danhSachSV);
                break;
            case 3:
                System.out.println("XÓA THEO ID");
                manager.RemoveStudentById(danhSachSV);
                break;
            case 4:
                System.out.println("CẬP NHẬT THEO ID");
                manager.UpdateStudentById(danhSachSV);
                break;
            case 0:
                System.out.println("Get fk out");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Lỗi");
			}
		}
	}
}
