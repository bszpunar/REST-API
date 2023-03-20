package com.example.RR.repository;

import com.example.RR.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

    Optional<UserInfo> findByName(String username);

    @Query(value = "SELECT * FROM USERS", nativeQuery = true)
    List<UserInfo> findAllUsers();
}
