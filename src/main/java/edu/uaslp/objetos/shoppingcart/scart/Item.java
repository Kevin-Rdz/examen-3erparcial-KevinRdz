package edu.uaslp.objetos.shoppingcart.scart;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Item {
    private String itemCode1;
    private String providerCode1;
    private BigDecimal s;
    private int band;
    private String itemCode;
    private String  providerCode;
    private int Quantity;
    private BigDecimal unitcost;
    public Item( String itemCode1, String providerCode1, BigDecimal s, int band) {
        this.itemCode1 = itemCode1;
        this.providerCode1 = providerCode1;
        this.s = s;
        this.band = band;
    }

    public Item () {

    }

    public void setCode (String  itemCode) {
        this.itemCode = itemCode;
    }
    public void setProviderCode (String  providerCode) {
        this.providerCode = providerCode;
    }

    public void setQuantity (int Quantity) {
        this.Quantity = Quantity;
    }
    public void setUnitCost ( BigDecimal unitcost) {
        this.unitcost = unitcost;
    }


    public boolean getCode () {
    }

    public int getQuantity () {
        return Quantity;
    }

    public String getProviderCode () {
        return providerCode;
    }

    public BigDecimal getUnitCost () {
        return unitcost;
    }
}
