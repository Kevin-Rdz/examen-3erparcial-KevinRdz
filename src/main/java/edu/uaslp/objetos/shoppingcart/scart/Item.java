package edu.uaslp.objetos.shoppingcart.scart;

import java.math.BigDecimal;

public class Item {
    private String itemCode1;
    private BigDecimal s;
    private String code;
    private String  providerCode;
    private int quantity;
    private BigDecimal unitCost;
    public Item( String itemCode, String providerCode, BigDecimal unitCost, int quantity ) {
        this.code = itemCode;
        this.providerCode = providerCode;
        this.unitCost = unitCost;
        this.quantity = quantity;
    }

    public Item () {

    }

    public void setCode (String  itemCode) {
        this.code = itemCode;
    }
    public void setProviderCode (String  providerCode) {
        this.providerCode = providerCode;
    }

    public void setQuantity (int Quantity) {
        this.quantity = Quantity;
    }
    public void setUnitCost ( BigDecimal unitCost) {
        this.unitCost = unitCost;
    }




    public int getQuantity () {
        return quantity;
    }

    public String getProviderCode () {
        return providerCode;
    }

    public BigDecimal getUnitCost () {
        return unitCost;
    }

    public String getCode () {
        return code;
    }
}
