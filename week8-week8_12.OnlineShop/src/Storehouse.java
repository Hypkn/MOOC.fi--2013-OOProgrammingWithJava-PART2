
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dev
 */
public class Storehouse {

   
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;

    public Storehouse() {
        this.productPrice = new HashMap<String, Integer>();
        this.productStock = new HashMap<String, Integer>();

    }

    public void addProduct(String product, int price, int stock) {
        productPrice.put(product, price);
        productStock.put(product, stock);
    }

    public int price(String product) {
        if (productPrice.get(product) == null) {
            return -99;
        }

        return productPrice.get(product);
    }

    public int stock(String product) {
        if (productStock.get(product) == null) {
            return 0;
        }
        return productStock.get(product);

    }

    public boolean take(String product) {
        if (productStock.get(product) == null) {
            return false;
        }

        if (productStock.get(product) > 0) {
            productStock.put(product, productStock.get(product) - 1);
            return true;

        }
        return false;
    }
    
    
    public Set<String> products(){
       Set<String> names = productPrice.keySet();
        
        return names;
    }

}
