package com.SetApp.entity;

import com.SetApp.entity.base.BaseEntity;

public class Purchase extends BaseEntity {

    private Double totalAmount;
    private Double qty;
    private Product product;

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
