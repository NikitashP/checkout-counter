package com.checkoutcounter.controller.request;

/**
 * Created by Nikitash Pawar on 6/4/2017.
 */
public class CategoryConfigureRequest {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalesTaxPercentage() {
        return salesTaxPercentage;
    }

    public void setSalesTaxPercentage(String salesTaxPercentage) {
        this.salesTaxPercentage = salesTaxPercentage;
    }

    private String name;
    private String salesTaxPercentage;
}
