package com.fakhrullina.shopdatabase.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {

    @Id
    @Column(name = "orders_id")
    private long Id;

    private Date order_date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;
    private int order_price;

    @OneToMany(mappedBy = "orders")
    private Collection<OrdersGoods> ordersGoods;

    public Orders() {
        super();
    }

    public Orders(Long Id, Date order_date, Client client, Integer order_price, Collection<OrdersGoods> ordersGoods) {
        super();
        this.Id = Id;
        this.order_date = order_date;
        this.client = client;
        this.order_price = order_price;
        this.ordersGoods = ordersGoods;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getOrder_price() {
        return order_price;
    }

    public void setOrder_price(int order_price) {
        this.order_price = order_price;
    }

    public Collection<OrdersGoods> getOrdersGoods() {
        return ordersGoods;
    }

    public void setOrdersGoods(Collection<OrdersGoods> ordersGoods) {
        this.ordersGoods = ordersGoods;
    }
}
