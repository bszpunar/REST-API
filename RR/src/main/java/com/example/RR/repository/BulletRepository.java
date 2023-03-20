package com.example.RR.repository;

import com.example.RR.model.Bullet;
import com.example.RR.model.Revolver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BulletRepository extends JpaRepository<Bullet, Integer> {

    @Query(value = "SELECT * FROM BULLETS", nativeQuery = true)
    List<Bullet> findAllBullets();

    @Query(value = "SELECT * FROM BULLETS WHERE bullets.id = ?1", nativeQuery = true)
    Bullet findBulletByID(int id);
}