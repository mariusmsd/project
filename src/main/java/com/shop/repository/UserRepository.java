package com.shop.repository;


import com.shop.domain.User;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

//	@Query("SELECT * FROM user")
//	List<User> getAllUsers();

}
