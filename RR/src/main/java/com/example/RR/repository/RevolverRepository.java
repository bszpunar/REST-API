package com.example.RR.repository;

import com.example.RR.model.Revolver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RevolverRepository extends JpaRepository<Revolver, Integer> {

    @Query(value = "SELECT * FROM REVOLVERS", nativeQuery = true)
    List<Revolver> findAllRevolvers();

    @Query(value = "SELECT * FROM REVOLVERS WHERE revolvers.model = ?1", nativeQuery = true)
    Revolver findRevolverByModel(String model);





}
