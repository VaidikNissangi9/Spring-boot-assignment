package com.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ShoppingController {

    @Autowired
    private ShoppingService service;

    @RequestMapping("/brands")
    public List<Shopping> getList(){
        return service.getList();
    }
    @RequestMapping("/brands/{name}")
    public Optional<Shopping> getBrand(@PathVariable String name){
        return service.getBrand(name);
    }
    @RequestMapping(method= RequestMethod.POST,value="/brands")
    public void addBrand(@RequestBody Shopping shopping){
         service.addBrand(shopping);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/brands/{name}")
    public void updateBrand(@RequestBody Shopping shopping, @PathVariable String name){
        service.updateBrand(shopping);
    }
    @RequestMapping(method=RequestMethod.DELETE, value="/brands/{name}")
    public void deleteBrand(@PathVariable String name){
        service.deleteBrand(name);
    }

}
