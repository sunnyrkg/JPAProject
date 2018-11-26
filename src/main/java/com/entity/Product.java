
package com.entity;

import javax.annotation.Generated;
import javax.persistence.*;

import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Entity
public class Product {

    @Expose
    private String aggregatedStatus;
    @Expose
    private String aggregatedStatusText;
    @Expose
    private String aggregatedStock;
    @Expose
    private String aggregatedSupplierItems;
    @Expose
    private String attributeValue1;
    @Expose
    private String attributeValue2;
    @Expose
    private String attributeValue3;
    @Expose
    private String attributeValue4;
    @Expose
    private String attributeValue5;
    @Expose
    private String customsTariffNumber;
    @Expose
    private String deeplink;
    @Expose
    private String ean;
    @Expose
    private String entryDate;
    @Expose
    private String estimateGrossWeight;
    @Expose
    private String htmlSpecs;
    @Expose
    private String image1;
    @Expose
    private String imageThumb;
    @Expose
    private String longDescription;
    @Expose
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="manufacturer_id")
    private Manufacturer manufacturer;
    @Expose
    private String manufacturerSKU;
    @Expose
    private String marketingText;
    @Expose
    private String productLine;
    @Expose
    private String productLineId;
    @Expose
    private String productModel;
    @Expose
    private String productNameWithManufacturer;
    @Expose
    @OneToOne(cascade = CascadeType.ALL)
    private ProductPriceInfo productPriceInfo;
    @Expose
    @OneToOne(cascade = CascadeType.ALL)
    private ProductStockInfo productStockInfo;
    @Expose
    private String productSubType;
    @Expose
    private String productSubTypeId;
    @Expose
    @Id
    private String puid;
    @Expose
    private String qualification;
    @Expose
    private String rank;
    @Expose
    private String shortDescription;
    @Expose
    private String standardHtmlDatasheet;
    @Expose
    private String standardPdfDatasheet;

    public String getAggregatedStatus() {
        return aggregatedStatus;
    }

    public void setAggregatedStatus(String aggregatedStatus) {
        this.aggregatedStatus = aggregatedStatus;
    }

    public String getAggregatedStatusText() {
        return aggregatedStatusText;
    }

    public void setAggregatedStatusText(String aggregatedStatusText) {
        this.aggregatedStatusText = aggregatedStatusText;
    }

    public String getAggregatedStock() {
        return aggregatedStock;
    }

    public void setAggregatedStock(String aggregatedStock) {
        this.aggregatedStock = aggregatedStock;
    }

    public String getAggregatedSupplierItems() {
        return aggregatedSupplierItems;
    }

    public void setAggregatedSupplierItems(String aggregatedSupplierItems) {
        this.aggregatedSupplierItems = aggregatedSupplierItems;
    }

    public String getAttributeValue1() {
        return attributeValue1;
    }

    public void setAttributeValue1(String attributeValue1) {
        this.attributeValue1 = attributeValue1;
    }

    public String getAttributeValue2() {
        return attributeValue2;
    }

    public void setAttributeValue2(String attributeValue2) {
        this.attributeValue2 = attributeValue2;
    }

    public String getAttributeValue3() {
        return attributeValue3;
    }

    public void setAttributeValue3(String attributeValue3) {
        this.attributeValue3 = attributeValue3;
    }

    public String getAttributeValue4() {
        return attributeValue4;
    }

    public void setAttributeValue4(String attributeValue4) {
        this.attributeValue4 = attributeValue4;
    }

    public String getAttributeValue5() {
        return attributeValue5;
    }

    public void setAttributeValue5(String attributeValue5) {
        this.attributeValue5 = attributeValue5;
    }

    public String getCustomsTariffNumber() {
        return customsTariffNumber;
    }

    public void setCustomsTariffNumber(String customsTariffNumber) {
        this.customsTariffNumber = customsTariffNumber;
    }

    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }



    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getEstimateGrossWeight() {
        return estimateGrossWeight;
    }

    public void setEstimateGrossWeight(String estimateGrossWeight) {
        this.estimateGrossWeight = estimateGrossWeight;
    }

    public String getHtmlSpecs() {
        return htmlSpecs;
    }

    public void setHtmlSpecs(String htmlSpecs) {
        this.htmlSpecs = htmlSpecs;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImageThumb() {
        return imageThumb;
    }

    public void setImageThumb(String imageThumb) {
        this.imageThumb = imageThumb;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturerSKU() {
        return manufacturerSKU;
    }

    public void setManufacturerSKU(String manufacturerSKU) {
        this.manufacturerSKU = manufacturerSKU;
    }

    public String getMarketingText() {
        return marketingText;
    }

    public void setMarketingText(String marketingText) {
        this.marketingText = marketingText;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getProductLineId() {
        return productLineId;
    }

    public void setProductLineId(String productLineId) {
        this.productLineId = productLineId;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getProductNameWithManufacturer() {
        return productNameWithManufacturer;
    }

    public void setProductNameWithManufacturer(String productNameWithManufacturer) {
        this.productNameWithManufacturer = productNameWithManufacturer;
    }

    public ProductPriceInfo getProductPriceInfo() {
        return productPriceInfo;
    }

    public void setProductPriceInfo(ProductPriceInfo productPriceInfo) {
        this.productPriceInfo = productPriceInfo;
    }

    public ProductStockInfo getProductStockInfo() {
        return productStockInfo;
    }

    public void setProductStockInfo(ProductStockInfo productStockInfo) {
        this.productStockInfo = productStockInfo;
    }

    public String getProductSubType() {
        return productSubType;
    }

    public void setProductSubType(String productSubType) {
        this.productSubType = productSubType;
    }

    public String getProductSubTypeId() {
        return productSubTypeId;
    }

    public void setProductSubTypeId(String productSubTypeId) {
        this.productSubTypeId = productSubTypeId;
    }

    public String getPuid() {
        return puid;
    }

    public void setPuid(String puid) {
        this.puid = puid;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getStandardHtmlDatasheet() {
        return standardHtmlDatasheet;
    }

    public void setStandardHtmlDatasheet(String standardHtmlDatasheet) {
        this.standardHtmlDatasheet = standardHtmlDatasheet;
    }

    public String getStandardPdfDatasheet() {
        return standardPdfDatasheet;
    }

    public void setStandardPdfDatasheet(String standardPdfDatasheet) {
        this.standardPdfDatasheet = standardPdfDatasheet;
    }

}
