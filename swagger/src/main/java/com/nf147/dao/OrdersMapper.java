package com.nf147.dao;

import com.nf147.entity.Orders;
import java.util.List;

public interface OrdersMapper {

    int deleteByPrimaryKey(Integer oId);


    int insert(Orders record);


    Orders selectByPrimaryKey(Integer oId);


    List<Orders> selectAll();


    int updateByPrimaryKey(Orders record);
}