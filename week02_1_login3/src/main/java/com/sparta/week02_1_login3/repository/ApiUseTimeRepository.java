package com.sparta.week02_1_login3.repository;


import com.sparta.week02_1_login3.model.ApiUseTime;
import com.sparta.week02_1_login3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApiUseTimeRepository extends JpaRepository<ApiUseTime, Long> {
    Optional<ApiUseTime> findByUser(User user);
}