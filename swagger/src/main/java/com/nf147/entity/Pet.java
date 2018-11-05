package com.nf147.entity;

import java.math.BigDecimal;

public class Pet {

    private Integer petId;
    private String petJpg;
    private Integer categoryId;
    private String petName;
    private BigDecimal petPrice;
    private String petStatus;


    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getPetName() {
        return petName;
    }


    public void setPetName(String petName) {
        this.petName = petName == null ? null : petName.trim();
    }


    public BigDecimal getPetPrice() {
        return petPrice;
    }


    public String getPetJpg() {
        return petJpg;
    }

    public void setPetJpg(String petJpg) {
        this.petJpg = petJpg;
    }

    public void setPetPrice(BigDecimal petPrice) {
        this.petPrice = petPrice;
    }


    public String getPetStatus() {
        return petStatus;
    }


    public void setPetStatus(String petStatus) {
        this.petStatus = petStatus == null ? null : petStatus.trim();
    }
}