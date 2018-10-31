package com.nf147.swagger;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nf147.dao.PetMapper;
import com.nf147.entity.Pet;
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
@RequestMapping("/pet")
public class PetList {

    @Autowired
    private PetMapper petMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String home(@RequestParam(defaultValue = "1") int page, Model model) {
        PageHelper.startPage(page, 2);
        List<Pet> pets = petMapper.selectAll();
        model.addAttribute("pets", pets);
        model.addAttribute("pageInfo", new PageInfo<>(pets));
        return "pet";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String add(Pet pet){
        petMapper.insert(pet);
        return "pet";
    }

    @RequestMapping(value = "/del/{id}",method = RequestMethod.GET)
        public String delete(@PathVariable("id") int id){
            petMapper.deleteByPrimaryKey(id);
            return "pet";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String select(@PathVariable("pCategory")String pCategory){
        petMapper.selectCategory("pCategory");
        return "pet";
    }
}
