package BasicPractice;

public class ModelClass {

    int id;
    String title;
    double discountPercentage;
    int stock;
    int userId;

    public ModelClass(int id, String title, double discountPercentage, int stock, int userId) {
        this.id = id;
        this.title = title;
        this.discountPercentage = discountPercentage;
        this.stock = stock;
        this.userId = userId;
    }

    public int getStock() {
        return stock;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public String getTitle() {
        return title;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "ModelClass [id=" + id +
                ", title=" + title +
                ", discountPercentage=" + discountPercentage +
                ", stock=" + stock +
                ", userId=" + userId + "]";
    }
}