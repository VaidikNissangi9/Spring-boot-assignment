package com.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ShoppingService {
    @Autowired
    private ShoppingRepository shoppingRepository;
   //private List<shopping> list= new ArrayList<shopping>( Arrays.asList(new shopping("java","spring"),new shopping("python","matplotlib")));
    public List<Shopping> getList(){
        List<Shopping> list=new ArrayList<>();
         shoppingRepository.findAll().forEach(list::add);
         return list;
    }
    public Optional<Shopping> getBrand(String name){
       return shoppingRepository.findById(name);
    }

    public void addBrand(Shopping shopping) {
        shoppingRepository.save(shopping);
    }
    public void updateBrand(Shopping shopping){
        shoppingRepository.save(shopping);
    }
    public void deleteBrand(String name){shoppingRepository.deleteById(name);}
}
