package BasicPractice;

import java.util.ArrayList;
import java.util.List;

public class DummyObjectCreation {
	
	public static void main(String[] args) {
		
		Reviews reviews = new Reviews();
		reviews.setRating(3);
		reviews.setComment("Would not recommend!");
		reviews.setReviewerEmail("eleanor.collins@x.dummyjson.com");
		reviews.setDate("24-03-2003");
		reviews.setReviewerName("JHGGREYFG");
		
		Products product = new Products();
		product.setId(1);
		product.setAvailabilityStatus("In stock");
		product.setBrand("MARS");
		product.setCategory("cosmetics");
		product.setDescription("detailed description of the product");
		product.setPrice(100);
		product.setRating(3);
		product.setShippingInformation("shipping in 3-5 days");
		product.setSku("BEA-ESS-ESS-001");
		product.setStock(99);
		product.setTags("beauty");
		product.setTitle("Essence Mascara Lash Princess");
		product.setWeight(55.55);
		product.setWarrantyInformation("1 week warranty");
		product.setReviews(reviews);
		
		List<Products> prodlst = new ArrayList<>();
		prodlst.add(product);
		
		ProductList list = new ProductList();
		list.setProduct(prodlst);
		System.out.println(list);
		
	
	}

}
