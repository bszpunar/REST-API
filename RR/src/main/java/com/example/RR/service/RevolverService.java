package com.example.RR.service;

import com.example.RR.model.Revolver;
import com.example.RR.model.UserInfo;
import com.example.RR.repository.RevolverRepository;
import com.example.RR.repository.UserInfoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RevolverService {


    @Autowired
    RevolverRepository revolverRepository;


    @Cacheable(cacheNames = "oneHourAnd500Heap")
    public List<Revolver> getListOfRevolvers(){
        return revolverRepository.findAllRevolvers();
    }

    public Revolver getSR_Revolver(int id){
        return revolverRepository.findById(id).orElseThrow();
    }

    public Revolver saveNewRevolver(Revolver revolver){
        return revolverRepository.save(revolver);
    }

    public String deleteRevolver(int id){
        if(revolverRepository.existsById(id)){
            revolverRepository.deleteById(id);
            return "Revolver deleted succesfully!";
        }else {
            return "Failed to delete revolver!";
        }

    }

    @Transactional
    public Revolver updateRevolver(Revolver revolver){

        if(revolverRepository.existsById(revolver.getId())){
            Revolver updatedRevolver = revolverRepository.findById(revolver.getId()).orElseThrow();

            updatedRevolver.setModel(revolver.getModel());
            updatedRevolver.setPrice(revolver.getPrice());

            return updatedRevolver;
        }else{
            throw new IllegalArgumentException("Bad ID!");
        }

    }


    public Revolver search(String model){
        return revolverRepository.findRevolverByModel(model);
    }




}
