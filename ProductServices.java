package BasicPractice;
import java.util.*;

public class ProductServices {

    public static List<ModelClass> getProductsWithQuantity(List<ModelClass> products) {

        List<ModelClass> result = new ArrayList<>();

        for(ModelClass p : products){
            if(p.getStock() >= 2){
                result.add(p);
            }
        }

        return result;
    }

    public static List<ModelClass> getProductsWithDiscount(List<ModelClass> products){

        List<ModelClass> result = new ArrayList<>();

        for(ModelClass p : products){
            if(p.getDiscountPercentage() >= 10){
                result.add(p);
            }
        }

        return result;
    }

    public static Map<String,Integer> getProductQuantityMap(List<ModelClass> products){

        Map<String,Integer> map = new HashMap<>();

        for(ModelClass p : products){
            map.put(p.getTitle(), p.getStock());
        }

        return map;
    }

    public static Map<Integer,Integer> getUserProductCount(List<ModelClass> products){

        Map<Integer,Integer> map = new HashMap<>();

        for(ModelClass p : products){

            int userId = p.getUserId();

            map.put(userId, map.getOrDefault(userId,0)+1);
        }

        return map;
    }
}