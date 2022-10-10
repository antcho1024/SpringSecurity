package com.sparta.week02_1_login3.repository;


import com.sparta.week02_1_login3.model.Folder;
import com.sparta.week02_1_login3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUser(User user);
}