package com.rate_my_rejection_backend.rate_my_rejection.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rate_my_rejection_backend.rate_my_rejection.dto.Login;
import java.util.Optional;


public interface LoginRepository extends JpaRepository<Login, Long> {
    boolean existsByUsernameAndPassword(String username, String password);
    boolean existsByUsername(String username);

}