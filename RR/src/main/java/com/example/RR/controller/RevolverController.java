package com.example.RR.controller;

import com.example.RR.model.Bullet;
import com.example.RR.model.Revolver;
import com.example.RR.service.BulletService;
import com.example.RR.service.RevolverService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RevolverController {

    @Autowired
    RevolverService revolverService;

    @GetMapping("/revolvers/search/{model}")
    public Revolver search(@PathVariable String model){
        System.out.println();
        return revolverService.search(model);

    }

    @GetMapping("/revolvers")
    public List<Revolver> getListOfRevolvers(){
        return revolverService.getListOfRevolvers();
    }

    @GetMapping("/revolvers/{id}")
    public Revolver getSR_Revolver(@PathVariable int id){
        return revolverService.getSR_Revolver(id);
    }

    @RequestMapping(value = "/revolvers/save", method = {RequestMethod.GET, RequestMethod.POST})
    public Revolver saveNewRevolver(@RequestBody Revolver revolver){
        return revolverService.saveNewRevolver(revolver);
    }

    @RequestMapping(value = "/revolvers/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String deleteRevolver(@PathVariable int id){
        return revolverService.deleteRevolver(id);
    }

    @RequestMapping(value = "/revolvers/update", method = {RequestMethod.GET,RequestMethod.PUT})
    public Revolver updateRevolver(@RequestBody Revolver revolver){
        return revolverService.updateRevolver(revolver);
    }



}
