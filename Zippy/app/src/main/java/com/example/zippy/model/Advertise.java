package com.example.zippy.model;

public class Advertise {
    private String postedby;
    private String goodstype;
    private String vehicleneed;
    private String sendfrom;
    private String destinationofdelivery;
    private Double priceofdelivery;
    private String negociable;
    private Boolean statusofdelivery;
    private String ad_image;

    public Advertise(String postedby, String goodstype, String vehicleneed, String sendfrom, String destinationofdelivery, Double priceofdelivery, String negociable, Boolean statusofdelivery, String ad_image) {
        this.postedby = postedby;
        this.goodstype = goodstype;
        this.vehicleneed = vehicleneed;
        this.sendfrom = sendfrom;
        this.destinationofdelivery = destinationofdelivery;
        this.priceofdelivery = priceofdelivery;
        this.negociable = negociable;
        this.statusofdelivery = statusofdelivery;
        this.ad_image = ad_image;
    }

    public String getPostedby() {
        return postedby;
    }

    public void setPostedby(String postedby) {
        this.postedby = postedby;
    }

    public String getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(String goodstype) {
        this.goodstype = goodstype;
    }

    public String getVehicleneed() {
        return vehicleneed;
    }

    public void setVehicleneed(String vehicleneed) {
        this.vehicleneed = vehicleneed;
    }

    public String getSendfrom() {
        return sendfrom;
    }

    public void setSendfrom(String sendfrom) {
        this.sendfrom = sendfrom;
    }

    public String getDestinationofdelivery() {
        return destinationofdelivery;
    }

    public void setDestinationofdelivery(String destinationofdelivery) {
        this.destinationofdelivery = destinationofdelivery;
    }

    public Double getPriceofdelivery() {
        return priceofdelivery;
    }

    public void setPriceofdelivery(Double priceofdelivery) {
        this.priceofdelivery = priceofdelivery;
    }

    public String getNegociable() {
        return negociable;
    }

    public void setNegociable(String negociable) {
        this.negociable = negociable;
    }

    public Boolean getStatusofdelivery() {
        return statusofdelivery;
    }

    public void setStatusofdelivery(Boolean statusofdelivery) {
        this.statusofdelivery = statusofdelivery;
    }

    public String getAd_image() {
        return ad_image;
    }

    public void setAd_image(String ad_image) {
        this.ad_image = ad_image;
    }
}