package com.example.kata3_1_5wo_js.repository;


import com.example.kata3_1_5wo_js.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}