package ChuaDe3_Cau2;
import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ProductManager manager = new ProductManager();
	ArrayList<DiscountedProduct> ds = new ArrayList<>();
	
	while(true) {
		System.out.println("1. Thêm sp");
		System.out.println("2. Hiển thị sp");
		System.out.println("3. Sửa sp");
		System.out.println("4. Xóa sp");
		int chon = sc.nextInt();sc.nextLine();
		switch(chon) {
		case 1:
			manager.AddNewProduct(ds);
			break;
		case 2:
			manager.DisplayProducts(ds);
			break;
		case 3:
			manager.UpdateProductById(ds);
			break;
		case 4:
			manager.RemoveProductById(ds);
			break;
		default:
			System.out.println("Lựa chọn lỗi");
		}
	}
}
}