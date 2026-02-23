package BasicPractice;

public class Products {
	
	String title;
	String description;
	String category;
	Integer price;
	Integer rating;
	Integer stock;
	String tags;
	String	brand;
	String sku;
	Double weight;
	String warrantyInformation;
	String shippingInformation;
	String availabilityStatus;
	Reviews reviews;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getWarrantyInformation() {
		return warrantyInformation;
	}
	public void setWarrantyInformation(String warrantyInformation) {
		this.warrantyInformation = warrantyInformation;
	}
	public String getShippingInformation() {
		return shippingInformation;
	}
	public void setShippingInformation(String shippingInformation) {
		this.shippingInformation = shippingInformation;
	}
	public String getAvailabilityStatus() {
		return availabilityStatus;
	}
	public void setAvailabilityStatus(String availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}
	public Reviews getReviews() {
		return reviews;
	}
	public void setReviews(Reviews reviews) {
		this.reviews = reviews;
	}
	Integer id;
	@Override
	public String toString() {
		return "Products [id=" + id + ", title=" + title + ", description=" + description + ", category=" + category
				+ ", price=" + price + ", rating=" + rating + ", stock=" + stock + ", tags=" + tags + ", brand=" + brand
				+ ", sku=" + sku + ", weight=" + weight + ", warrantyInformation=" + warrantyInformation
				+ ", shippingInformation=" + shippingInformation + ", availabilityStatus=" + availabilityStatus + "]";
	}
	
}
