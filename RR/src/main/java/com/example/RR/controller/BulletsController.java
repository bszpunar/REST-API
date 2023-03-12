package com.example.RR.controller;

import com.example.RR.model.Bullet;
import com.example.RR.service.BulletService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BulletsController {

    @Autowired
    BulletService bulletService;

    @GetMapping("/bullets")
    public List<Bullet> getAllBullets(){
        return bulletService.getAllBullets();
    }

    @GetMapping("/bullets/{id}")
    public Bullet getSR_Bullet(@PathVariable int id){
        return bulletService.getSR_Bullet(id);
    }

    @RequestMapping(value = "/bullets/delete/{id}", method = {RequestMethod.GET,RequestMethod.DELETE})
    public String deleteBullet(@PathVariable int id){
        return bulletService.deleteBullet(id);
    }

    @RequestMapping(value = "/bullets/save", method = {RequestMethod.GET,RequestMethod.POST})
    public Bullet saveBullet(@RequestBody Bullet bullet){
        return bulletService.saveBullet(bullet);
    }

    @GetMapping("/bullets/search/{id}")
    public Bullet getBulletByID(@PathVariable int id){
        return bulletService.getBulletByID(id);
    }

}
