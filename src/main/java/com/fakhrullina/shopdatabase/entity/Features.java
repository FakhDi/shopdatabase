package com.fakhrullina.shopdatabase.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "features")
public class Features implements Serializable {

    @Id
    @Column(name = "features_id")
    private long Id;

    private String features_name;

    @JsonIgnore
    @OneToMany(mappedBy = "features")
    private Collection<GoodsFeatures> goodsFeatures;

    public Features() {
        super();
    }

    public Features(Long Id, String features_name, Collection<GoodsFeatures> goodsFeatures) {
        super();
        this.Id = Id;
        this.features_name = features_name;
        this.goodsFeatures = goodsFeatures;
    }

    public Collection<GoodsFeatures> getGoodsFeatures() {
        return goodsFeatures;
    }

    public void setGoodsFeatures(Collection<GoodsFeatures> goodsFeatures) {
        this.goodsFeatures = goodsFeatures;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }


    public String getFeatures_name() {
        return features_name;
    }

    public void setFeatures_name(String features_name) {
        this.features_name = features_name;
    }


}
