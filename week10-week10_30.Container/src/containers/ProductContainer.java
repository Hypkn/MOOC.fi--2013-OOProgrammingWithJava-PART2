/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author dev
 */
public class ProductContainer extends Container {
    
    private String productName;

    
    
    
    public ProductContainer (String productName, double capacity){
        super(capacity);
        this.productName = productName;
        
    }
    
    public void setName(String newName){
        this.productName = newName;
    }
    
    public String getName(){
        return this.productName;
    }
    
<<<<<<< HEAD
    
=======
  
    
     public void setName(String newName) {
        this.productName = newName;
    }
>>>>>>> f0ef54ffb5fa2f7846283edc55c00a46976e5965
    
    @Override
    public String toString(){
        return this.productName + (": ")+  super.toString();
    }
    
    
}
