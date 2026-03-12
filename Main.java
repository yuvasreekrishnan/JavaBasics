package BasicPractice;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<ModelClass> products = new ArrayList<>();

        products.add(new ModelClass(1,"Phone",12.5,5,101));
        products.add(new ModelClass(2,"Laptop",8.0,1,101));
        products.add(new ModelClass(3,"Lipstick",15.0,3,102));
        products.add(new ModelClass(4,"Shoes",5.0,2,103));

        System.out.println("Products with quantity >=2");

        List<ModelClass> quantityProducts = ProductServices.getProductsWithQuantity(products);

        for(ModelClass p : quantityProducts){
            System.out.println(p);
        }

        System.out.println("\nProducts with discount >=10");

        List<ModelClass> discountProducts = ProductServices.getProductsWithDiscount(products);

        for(ModelClass p : discountProducts){
            System.out.println(p);
        }

        System.out.println("\nProduct Name and Quantity");

        Map<String,Integer> productMap = ProductServices.getProductQuantityMap(products);

        System.out.println(productMap);

        System.out.println("\nUserID and Total Products");

        Map<Integer,Integer> userProductMap = ProductServices.getUserProductCount(products);

        System.out.println(userProductMap);
    }
}
