package ChuaDe3_Cau2;

import java.util.ArrayList;

public interface IProductManager {
	public void AddNewProduct(ArrayList<DiscountedProduct> list);
	public void DisplayProducts(ArrayList<DiscountedProduct> list);
	public void UpdateProductById(ArrayList<DiscountedProduct> list);
	public void RemoveProductById(ArrayList<DiscountedProduct> list);
}
