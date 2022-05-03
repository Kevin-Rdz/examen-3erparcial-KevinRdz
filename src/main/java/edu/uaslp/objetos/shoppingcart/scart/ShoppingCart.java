package edu.uaslp.objetos.shoppingcart.scart;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    LinkedList<Item> sc = new LinkedList<Item>();
    private boolean band;
    private Item[] items;

    public int getSize() {
        return sc.size();
    }
    public ShoppingCart(){

    }
    public void removeItem(String itemCode2){

    }
    public boolean isEmpty () {
        return band;
    }
    public BigDecimal getTotalCost(){
        BigDecimal totalCost = BigDecimal.ZERO;

        for(Item item: items){
            totalCost = totalCost.add(item.getUnitCost().multiply(BigDecimal.valueOf(item.getQuantity())));
        }

        return totalCost;
    }
    public void addItem(Item product) {
        sc.add(product);
    }

    public boolean getItemsCount () {
    }

    public List<Item> getItems () {
    }
}
