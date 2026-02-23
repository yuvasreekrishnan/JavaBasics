package BasicPractice;

import java.util.List;

public class ProductList {
	
	List<Products> Product;

	

	public List<Products> getProduct() {
		return Product;
	}

	public void setProduct(List<Products> product) {
		Product = product;
	}
	
	@Override
	public String toString() {
		return "ProductList [Product=" + Product + "]";
	}

}
