package com.eyup.mitek.mitektester.repository;

import com.eyup.mitek.mitektester.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<Users, Long> {
    Users findByName(String name);
}
