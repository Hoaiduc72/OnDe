package ChuaDe1_Cau2;

import java.util.ArrayList;

public interface IStudentManager {
	public void AddNewStudent(ArrayList<Student> list);
	public void DisplayStudent(ArrayList<Student> list);
	public void UpdateStudentById(ArrayList<Student> list);
	public void RemoveStudentById(ArrayList<Student> list);
	
}
