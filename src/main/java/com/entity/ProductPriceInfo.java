
package com.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Entity
public class ProductPriceInfo {

    @Id
    @GeneratedValue
    private Integer productPriceInfoUid;

    @Expose
    private String currencyCode;
    @Expose
    private String minScale;
    @Expose
    private String price;
    @Expose
    private String priceCalc;
    @Expose
    private String priceCalcVat;
    @Expose
    private String priceLastUpdate;
    @Expose
    private String priceSourceId;
    @Expose
    private String priceSourceName;
    @Expose
    private String priceStatus;
    @Expose
    private String priceSupplierId;
    @Expose
    private String priceSupplierItemId;
    @Expose
    private String priceSupplierName;
    @Expose
    private String priceSupplierSKU;
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getMinScale() {
        return minScale;
    }

    public void setMinScale(String minScale) {
        this.minScale = minScale;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceCalc() {
        return priceCalc;
    }

    public void setPriceCalc(String priceCalc) {
        this.priceCalc = priceCalc;
    }

    public String getPriceCalcVat() {
        return priceCalcVat;
    }

    public void setPriceCalcVat(String priceCalcVat) {
        this.priceCalcVat = priceCalcVat;
    }

    public String getPriceLastUpdate() {
        return priceLastUpdate;
    }

    public void setPriceLastUpdate(String priceLastUpdate) {
        this.priceLastUpdate = priceLastUpdate;
    }

    public String getPriceSourceId() {
        return priceSourceId;
    }

    public void setPriceSourceId(String priceSourceId) {
        this.priceSourceId = priceSourceId;
    }

    public String getPriceSourceName() {
        return priceSourceName;
    }

    public void setPriceSourceName(String priceSourceName) {
        this.priceSourceName = priceSourceName;
    }

    public String getPriceStatus() {
        return priceStatus;
    }

    public void setPriceStatus(String priceStatus) {
        this.priceStatus = priceStatus;
    }

    public String getPriceSupplierId() {
        return priceSupplierId;
    }

    public void setPriceSupplierId(String priceSupplierId) {
        this.priceSupplierId = priceSupplierId;
    }

    public String getPriceSupplierItemId() {
        return priceSupplierItemId;
    }

    public void setPriceSupplierItemId(String priceSupplierItemId) {
        this.priceSupplierItemId = priceSupplierItemId;
    }

    public String getPriceSupplierName() {
        return priceSupplierName;
    }

    public void setPriceSupplierName(String priceSupplierName) {
        this.priceSupplierName = priceSupplierName;
    }

    public String getPriceSupplierSKU() {
        return priceSupplierSKU;
    }

    public void setPriceSupplierSKU(String priceSupplierSKU) {
        this.priceSupplierSKU = priceSupplierSKU;
    }

    public Integer getProductPriceInfoUid() {
        return productPriceInfoUid;
    }

    public void setProductPriceInfoUid(Integer productPriceInfoUid) {
        this.productPriceInfoUid = productPriceInfoUid;
    }

}
