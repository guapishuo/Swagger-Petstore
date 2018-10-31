package com.nf147.swagger;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nf147.dao.UserMapper;
import com.nf147.entity.User;
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
public class UserList {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String home(@RequestParam(defaultValue = "1") int page, Model model) {
        PageHelper.startPage(page, 2);
        List<User> users = userMapper.selectAll();
        model.addAttribute("users", users);
        model.addAttribute("pageInfo", new PageInfo<>(users));
        return "user";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String add(User user){
        userMapper.insert(user);
        return "orders";
    }

    @RequestMapping(value = "/del/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id){
        userMapper.deleteByPrimaryKey(id);
        return "orders";
    }
    @RequestMapping(value = "/select/{id}",method = RequestMethod.GET)
    public String select(@PathVariable("id") int id){
        userMapper.selectByPrimaryKey(id);
        return "orders";
    }
}
