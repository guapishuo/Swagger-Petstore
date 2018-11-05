package com.nf147.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/store")
public class UserController {

//    @Autowired
//    private UserMapper userMapper;
//
//    @RequestMapping(method = RequestMethod.GET)
//    public String home(@RequestParam(defaultValue = "1") int page, Model model) {
//        PageHelper.startPage(page, 2);
//        List<User> users = userMapper.selectAll();
//        model.addAttribute("users", users);
//        model.addAttribute("pageInfo", new PageInfo<>(users));
//        return "user";
//    }
//    @RequestMapping(method = RequestMethod.POST)
//    public String add(User user){
//        userMapper.insert(user);
//        return "orders";
//    }

//    @RequestMapping(value = "/del/{id}",method = RequestMethod.GET)
//    public String delete(@PathVariable("id") int id){
//        userMapper.deleteByPrimaryKey(id);
//        return "orders";
//    }
//    @RequestMapping(value = "/select/{id}",method = RequestMethod.GET)
//    public String select(@PathVariable("id") int id){
//        userMapper.selectByPrimaryKey(id);
//        return "orders";
//    }
}
