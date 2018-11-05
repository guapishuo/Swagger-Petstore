package com.nf147.controller;

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

@Controller
@RequestMapping("/")
public class PetController {

    @Autowired
    private PetMapper petMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String home(@RequestParam(defaultValue = "1") int page, Model model) {
        List<Pet> pets = petMapper.selectAll();
        model.addAttribute("pets", pets);
        model.addAttribute("pageInfo", new PageInfo<>(pets));
        return "Pet";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String add(Pet pet){
        petMapper.insert(pet);
        return "redirect:/";
    }

    @RequestMapping(value = "/del/{id}",method = RequestMethod.GET)
        public String delete(@PathVariable("id") int id){
            petMapper.deleteByPrimaryKey(id);
            return "redirect:/";
    }

    @RequestMapping(value = "/selectByPrimaryKey" ,method = RequestMethod.GET)
    public String select(int petId, Model model) {
        Pet pet = petMapper.selectByPrimaryKey(petId);
        model.addAttribute("pet", pet);
        List<Pet> pets = petMapper.selectAll();
        model.addAttribute("pets", pets);
        return "petUpdate";
    }


}
