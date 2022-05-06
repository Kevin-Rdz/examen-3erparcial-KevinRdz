package edu.uaslp.objetos.shoppingcart.scart;

import edu.uaslp.objetos.shoppingcart.exception.EmptyShoppingCartException;
import edu.uaslp.objetos.shoppingcart.exception.InvalidDataException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> sc = new ArrayList<>();

    public ShoppingCart () {

    }

    public void removeItem ( String itemCode ) {
        for(Item item: sc){
            if(item.getCode().equals(itemCode)){
                item.setQuantity(item.getQuantity() - 1);
                if(item.getQuantity() == 0){
                    sc.remove(item);
                }
            }
        }

    }

    public boolean isEmpty () {
        return sc.isEmpty();
    }

    public BigDecimal getTotalCost () {
        if(sc.isEmpty()){
            throw new EmptyShoppingCartException();
        }
        BigDecimal totalCost = BigDecimal.ZERO;
        for(Item item: sc){
            totalCost = totalCost.add(item.getUnitCost().multiply(BigDecimal.valueOf(item.getQuantity())));
        }
        return totalCost;

    }

    public void addItem ( Item item ) {
        if(item.getCode() == null){
            throw new InvalidDataException("Null or empty string not allowed for item code");
        }
        if (item.getProviderCode().isEmpty()){
            throw new InvalidDataException("Null or empty string not allowed for provider code");
        }
        if(item.getUnitCost().compareTo(BigDecimal.ZERO) < 0){
            throw new InvalidDataException("Cost must be greater than zero");
        }
        if(item.getQuantity() < 1 || item.getQuantity() > 5){
            throw new InvalidDataException("Quantity must be greater than zero and lower than 5");
        }
        for(Item existentItem: sc){
            if(existentItem.getCode().equals(item.getCode()) && existentItem.getUnitCost().compareTo(item.getUnitCost()) == 0){
                existentItem.setQuantity(existentItem.getQuantity() + item.getQuantity());
           return;
            }
        }
        sc.add(item);
    }


    public List<Item> getItems () {
        return sc;
    }

    public int getItemsCount () {
        int count = 0;
        for(Item item: sc){
            count += item.getQuantity();
        }
        return count;
    }
}

