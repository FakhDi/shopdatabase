package com.fakhrullina.shopdatabase.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ordersgoods")
public class OrdersGoods implements Serializable {

    @Id
    @Column(name = "ordersgoods_id")
    private long Id;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orders_id")
    private Orders orders;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "goods_id")
    private Goods goods;
    private int goods_quant;

    public OrdersGoods() {
        super();
    }

    public OrdersGoods(Long Id, Orders orders, Goods goods, Integer goods_quant) {
        super();
        this.Id = Id;
        this.orders = orders;
        this.goods = goods;
        this.goods_quant = goods_quant;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getGoods_quant() {
        return goods_quant;
    }

    public void setGoods_quant(int goods_quant) {
        this.goods_quant = goods_quant;
    }
}
