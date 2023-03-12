package com.example.RR.service;

import com.example.RR.model.Bullet;
import com.example.RR.repository.BulletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BulletService {
    @Autowired
    BulletRepository bulletRepository;

    @Cacheable(cacheNames = "oneHourAnd500Heap")
    public List<Bullet> getAllBullets(){
        return bulletRepository.findAllBullets();
    }

    public Bullet getSR_Bullet(int id){
        return bulletRepository.findById(id).orElseThrow();
    }

    public Bullet saveBullet(Bullet bullet) {
        return bulletRepository.save(bullet);
    }

    public String deleteBullet(int id) {
        if(bulletRepository.existsById(id)){
            bulletRepository.deleteById(id);
            return "Deleted ! ! !";
        }else {
            return "Empty ! ! !";
        }

    }
    public Bullet getBulletByID(int id){
        return bulletRepository.findBulletByID(id);
    }
}
