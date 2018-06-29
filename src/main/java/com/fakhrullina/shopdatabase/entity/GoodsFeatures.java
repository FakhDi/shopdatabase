package com.fakhrullina.shopdatabase.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "goodsfeatures")
public class GoodsFeatures implements Serializable {

    @Id
    @Column(name = "goodsfeat_id")
    private long Id;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "goods_id")
    private Goods goods;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "features_id")
    private Features features;

    private String feat_value;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public String getFeat_value() {
        return feat_value;
    }

    public void setFeat_value(String feat_value) {
        this.feat_value = feat_value;
    }
}
