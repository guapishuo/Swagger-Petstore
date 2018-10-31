package com.nf147.dao;

import com.nf147.entity.User;

import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    List<User> selectAll();

    int updateByPrimaryKey(User record);

    User selectByPrimaryKey(Integer pId);

    int deleteByPrimaryKey(Integer uId);
}