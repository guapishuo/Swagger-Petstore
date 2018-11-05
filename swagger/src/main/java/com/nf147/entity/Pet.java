package com.nf147.entity;

import java.math.BigDecimal;

public class Pet {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet.pet_id
     *
     * @mbg.generated
     */
    private Integer petId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet.category_id
     *
     * @mbg.generated
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet.pet_name
     *
     * @mbg.generated
     */
    private String petName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet.pet_price
     *
     * @mbg.generated
     */
    private BigDecimal petPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pet.pet_status
     *
     * @mbg.generated
     */
    private String petStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.pet_id
     *
     * @return the value of pet.pet_id
     *
     * @mbg.generated
     */
    public Integer getPetId() {
        return petId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.pet_id
     *
     * @param petId the value for pet.pet_id
     *
     * @mbg.generated
     */
    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.category_id
     *
     * @return the value of pet.category_id
     *
     * @mbg.generated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.category_id
     *
     * @param categoryId the value for pet.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.pet_name
     *
     * @return the value of pet.pet_name
     *
     * @mbg.generated
     */
    public String getPetName() {
        return petName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.pet_name
     *
     * @param petName the value for pet.pet_name
     *
     * @mbg.generated
     */
    public void setPetName(String petName) {
        this.petName = petName == null ? null : petName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.pet_price
     *
     * @return the value of pet.pet_price
     *
     * @mbg.generated
     */
    public BigDecimal getPetPrice() {
        return petPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.pet_price
     *
     * @param petPrice the value for pet.pet_price
     *
     * @mbg.generated
     */
    public void setPetPrice(BigDecimal petPrice) {
        this.petPrice = petPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.pet_status
     *
     * @return the value of pet.pet_status
     *
     * @mbg.generated
     */
    public String getPetStatus() {
        return petStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.pet_status
     *
     * @param petStatus the value for pet.pet_status
     *
     * @mbg.generated
     */
    public void setPetStatus(String petStatus) {
        this.petStatus = petStatus == null ? null : petStatus.trim();
    }
}