package com.shop.pojo;

public class Cart {
    private String goods_id;
    private String goods_name;
    private float unitPrice;
    private int quantity;

    public String getUser_id() {
        return user_id;
    }

    private String user_id;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    private String photo;

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

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "goods_id='" + goods_id + '\'' +
                ", goods_name='" + goods_name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", user_id='" + user_id + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }



}
