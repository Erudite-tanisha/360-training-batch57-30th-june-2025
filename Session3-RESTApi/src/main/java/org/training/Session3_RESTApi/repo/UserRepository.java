package org.training.Session3_RESTApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.training.Session3_RESTApi.entities.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.username LIKE :character% ")
    List<User> findByUserStartingWithV(Character character);


}
