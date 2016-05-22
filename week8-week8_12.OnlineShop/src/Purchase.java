/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dev
 */
public class Purchase {
    
    private int amount;
    private String product;
    private int unitPrice;
    
    
    public Purchase(String product, int amount, int unitPrice){
        this.amount = amount;
        this.product = product;
        this.unitPrice = unitPrice;
    }
    
    
    public int price(){
        return this.unitPrice * this.amount;
    }
    
    public int amount(){
        return this.amount;
    }
    
    public void increaseAmount(){
        this.amount+=1;
        
    }
    
    @Override
    public String toString(){
        return this.product + ": " + this.amount;
    }
    
    
}
