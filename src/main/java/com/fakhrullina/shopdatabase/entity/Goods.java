package com.fakhrullina.shopdatabase.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "goods")
public class Goods implements Serializable {

    @Id
    @Column(name = "goods_id")
    private long Id;

    private String goods_name;

    private int goods_price;

    private String goods_desc;

    @OneToMany(mappedBy = "goods")
    private Collection<GoodsFeatures> goodsFeatures;

    @JsonIgnore
    @OneToMany(mappedBy = "goods")
    private Collection<OrdersGoods> ordersGoods;

    public Goods() {
        super();
    }

    public Goods(Long Id, String goods_name, Integer goods_price,
                 String goods_desc, Collection<GoodsFeatures> goodsFeatures, Collection<OrdersGoods> ordersGoods) {
        super();
        this.Id = Id;
        this.goods_name = goods_name;
        this.goods_price = goods_price;
        this.goods_desc = goods_desc;
        this.goodsFeatures = goodsFeatures;
        this.ordersGoods = ordersGoods;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public int getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(int goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_desc() {
        return goods_desc;
    }

    public void setGoods_desc(String goods_desc) {
        this.goods_desc = goods_desc;
    }

    public Collection<GoodsFeatures> getGoodsFeatures() {
        return goodsFeatures;
    }

    public void setGoodsFeatures(Collection<GoodsFeatures> goodsFeatures) {
        this.goodsFeatures = goodsFeatures;
    }

    public Collection<OrdersGoods> getOrdersGoods() {
        return ordersGoods;
    }

    public void setOrdersGoods(Collection<OrdersGoods> ordersGoods) {
        this.ordersGoods = ordersGoods;
    }
}
