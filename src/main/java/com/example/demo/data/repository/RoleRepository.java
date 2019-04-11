package com.example.demo.data.repository;

/**
 * Created by fdzapo on 27-Feb-19.
 */
import com.example.demo.data.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Role findByName(String name);
}
