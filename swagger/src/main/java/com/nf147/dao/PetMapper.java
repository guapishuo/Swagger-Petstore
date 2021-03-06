package com.nf147.dao;

import com.nf147.entity.Pet;
import java.util.List;

public interface PetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer petId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated
     */
    int insert(Pet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated
     */
    Pet selectByPrimaryKey(Integer petId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated
     */
    List<Pet> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Pet record);
}