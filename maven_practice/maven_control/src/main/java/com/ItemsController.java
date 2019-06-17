package com;

import com.domain.Items;
import com.service.impl.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private serviceimpl service;

    @RequestMapping("/findDetail")
    public String findById(Model model){
        Items item = service.findById(1);
        model.addAttribute("item",item);
        return "itemDetail";
    }
}
