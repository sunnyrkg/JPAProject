
package com.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Entity
public class ProductStockInfo {

    @Expose
    @Id
    @GeneratedValue
    private Integer ProductStockInfoUid;

    @Expose
    private String stock;
    @Expose
    private String stockLastUpdate;
    @Expose
    private String stockSourceId;
    @Expose
    private String stockSourceName;
    @Expose
    private String stockStatus;
    @Expose
    private String stockStatusText;
    @Expose
    private String stockSupplierText;
    @Expose
    private String stockUnlimited;
    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getStockLastUpdate() {
        return stockLastUpdate;
    }

    public void setStockLastUpdate(String stockLastUpdate) {
        this.stockLastUpdate = stockLastUpdate;
    }

    public String getStockSourceId() {
        return stockSourceId;
    }

    public void setStockSourceId(String stockSourceId) {
        this.stockSourceId = stockSourceId;
    }

    public String getStockSourceName() {
        return stockSourceName;
    }

    public void setStockSourceName(String stockSourceName) {
        this.stockSourceName = stockSourceName;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getStockStatusText() {
        return stockStatusText;
    }

    public void setStockStatusText(String stockStatusText) {
        this.stockStatusText = stockStatusText;
    }

    public String getStockSupplierText() {
        return stockSupplierText;
    }

    public void setStockSupplierText(String stockSupplierText) {
        this.stockSupplierText = stockSupplierText;
    }

    public String getStockUnlimited() {
        return stockUnlimited;
    }

    public void setStockUnlimited(String stockUnlimited) {
        this.stockUnlimited = stockUnlimited;
    }

    public Integer getProductStockInfoUid() {
        return ProductStockInfoUid;
    }

    public void setProductStockInfoUid(Integer productStockInfoUid) {
        ProductStockInfoUid = productStockInfoUid;
    }

}
