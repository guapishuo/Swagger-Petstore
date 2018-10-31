package com.nf147.swagger;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nf147.dao.OrdersMapper;
import com.nf147.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@SuppressWarnings("ALL")
@Controller
@RequestMapping("/store")
public class StoreList {

    @Autowired
    private OrdersMapper ordersMappers;

    @RequestMapping(method = RequestMethod.GET)
    public String home(@RequestParam(defaultValue = "1") int page, Model model) {
        PageHelper.startPage(page, 2);
        List<Orders> orders = ordersMappers.selectAll();
        model.addAttribute("orders", orders);
        model.addAttribute("pageInfo", new PageInfo<>(orders));
        return "orders";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String add(Orders orders){
        ordersMappers.insert(orders);
        return "orders";
    }

    @RequestMapping(value = "/del/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id){
        ordersMappers.deleteByPrimaryKey(id);
        return "orders";
    }
    @RequestMapping(value = "/select/{id}",method = RequestMethod.GET)
    public String select(@PathVariable("id") int id){
        ordersMappers.selectByPrimaryKey(id);
        return "orders";
    }
}
