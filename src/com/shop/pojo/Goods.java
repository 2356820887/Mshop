package com.shop.pojo;

public class Goods {
    private String goods_id;
    private String goods_name;
    private int type_id;
    private float unitPrice;
    private int stock;
    private String factory;
    private String photo;
    private String details;
    private int add_time;
    private int change_time;
    private int goods_state;
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public int type_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getAdd_time() {
        return add_time;
    }

    public void setAdd_time(int add_time) {
        this.add_time = add_time;
    }

    public int getChange_time() {
        return change_time;
    }

    public void setChange_time(int change_time) {
        this.change_time = change_time;
    }

    public int getGoods_state() {
        return goods_state;
    }

    public void setGoods_state(int goods_state) {
        this.goods_state = goods_state;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods_id='" + goods_id + '\'' +
                ", goods_name='" + goods_name + '\'' +
                ", type_id=" + type_id +
                ", unitPrice=" + unitPrice +
                ", stock=" + stock +
                ", factory='" + factory + '\'' +
                ", photo='" + photo + '\'' +
                ", details='" + details + '\'' +
                ", add_time=" + add_time +
                ", change_time=" + change_time +
                ", goods_state=" + goods_state +
                ", type=" + type +
                '}';
    }

    public Goods() {
    }

    public Goods(String goods_id, String goods_name, int type_id, float unitPrice, int stock, String factory, String photo, String details, int add_time, int change_time, int goods_state, Type type) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.type_id = type_id;
        this.unitPrice = unitPrice;
        this.stock = stock;
        this.factory = factory;
        this.photo = photo;
        this.details = details;
        this.add_time = add_time;
        this.change_time = change_time;
        this.goods_state = goods_state;
        this.type = type;
    }
}
