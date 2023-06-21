package com.klinnovations.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klinnovations.entity.User;

 
public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query ("select * from user_details") 
	"INSERT INTO user_details" . "(ID, Name, City)"
	"VALUES". " (101, "Himadhar", "Hyderabad")"	;								 										

}
