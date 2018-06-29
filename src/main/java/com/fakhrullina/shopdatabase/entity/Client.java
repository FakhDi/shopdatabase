package com.fakhrullina.shopdatabase.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "client")
public class Client implements Serializable {

    @Id
    @Column(name = "client_id")
    private long client_id;

    private String client_card;

    private int client_disc;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private Collection<Orders> orders;

    public Client() {
        super();
    }

    public Client(Long client_id, String client_card, Integer client_disc, Collection<Orders> orders) {
        super();
        this.client_id = client_id;
        this.client_card = client_card;
        this.client_disc = client_disc;
        this.orders = orders;
    }

    public long getClient_id() {
        return client_id;
    }

    public void setClient_id(long client_id) {
        this.client_id = client_id;
    }

    public String getClient_card() {
        return client_card;
    }

    public void setClient_card(String client_card) {
        this.client_card = client_card;
    }

    public int getClient_disc() {
        return client_disc;
    }

    public void setClient_disc(int client_disc) {
        this.client_disc = client_disc;
    }

    public Collection<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Orders> orders) {
        this.orders = orders;
    }
}
