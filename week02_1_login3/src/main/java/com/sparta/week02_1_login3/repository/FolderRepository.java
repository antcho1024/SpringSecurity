package com.sparta.week02_1_login3.repository;


import com.sparta.week02_1_login3.model.Folder;
import com.sparta.week02_1_login3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUser(User user);
    List<Folder> findAllByUserAndNameIn(User user, List<String> names);
}