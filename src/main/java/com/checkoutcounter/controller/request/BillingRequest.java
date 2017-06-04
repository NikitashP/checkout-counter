package com.checkoutcounter.controller.request;

import java.util.List;

/**
 * Created by Nikitash Pawar on 6/4/2017.
 */
public class BillingRequest {

    public List<PurchaseRequest> getPurchase() {
        return purchase;
    }

    public void setPurchase(List<PurchaseRequest> purchase) {
        this.purchase = purchase;
    }

    private List<PurchaseRequest> purchase;
}
