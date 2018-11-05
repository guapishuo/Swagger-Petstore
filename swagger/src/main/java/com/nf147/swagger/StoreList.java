package com.nf147.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/store")
public class StoreList {

//    @Autowired
//    protected OrderMapper ordersMapper;
//
//    @RequestMapping(method = RequestMethod.GET)
//    public String home(@RequestParam(defaultValue = "1") int page, Model model) {
//        PageHelper.startPage(page, 2);
//        List<Order> orders = ordersMapper.selectAll();
//        model.addAttribute("order",orders);
//        model.addAttribute("pageInfo", new PageInfo<>(orders));
//        return "orders";
//    }
//    @RequestMapping(method = RequestMethod.POST)
//    public String add(Order order){
//        ordersMapper.insert(order);
//        return "orders";
//    }
//
//    @RequestMapping(value = "/del/{id}",method = RequestMethod.GET)
//    public String delete(@PathVariable("id") int id){
//        ordersMapper.deleteByPrimaryKey(id);
//        return "orders";
//    }
//    @RequestMapping(value = "/select/{id}",method = RequestMethod.GET)
//    public String select(@PathVariable("id") int id){
//        ordersMapper.selectByPrimaryKey(id);
//        return "orders";
//    }
}
