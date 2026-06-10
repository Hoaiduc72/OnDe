package ChuaDe3_Cau2;

import java.util.*;

public class ProductManager implements IProductManager {
	Scanner sc = new Scanner(System.in);
	public void AddNewProduct(ArrayList<DiscountedProduct> list) {
		DiscountedProduct p = new DiscountedProduct();
		p.InputData();
		list.add(p);
		System.out.println("Đã thêm");
	}
	public void DisplayProducts(ArrayList<DiscountedProduct> list) {
		for(DiscountedProduct p : list) {
			p.DisplayData();
		}
	}
	public void UpdateProductById(ArrayList<DiscountedProduct> list) {
		boolean timThay = false;
		System.out.print("Nhập id cần sửa: "); String sua = sc.nextLine();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equalsIgnoreCase(sua)) {
				list.get(i).InputData();
				System.out.println("Đã sửa");
				timThay = true;
				break;
			}
		}
		if(!timThay) { System.out.println("K tìm thấy ID");
		
	 }
	}
	public void RemoveProductById(ArrayList<DiscountedProduct> list) {
		boolean timThay = false;
		System.out.print("Nhập id cần xóa: "); String xoa = sc.nextLine();
		for(int i = 0;i < list.size();i++) {
			if(list.get(i).getId().equalsIgnoreCase(xoa)) {
				list.remove(i);
				timThay = true;
				System.out.println("Đã xóa");
			}
		}
		if(!timThay) { System.out.println("K tìm thấy ID");
	}
}
}
