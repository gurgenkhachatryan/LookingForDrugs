package com.example.lookingfordrugs.persistence.user;

import com.example.lookingfordrugs.persistence.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
