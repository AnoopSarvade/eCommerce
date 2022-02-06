package com.example.eCommerce.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.eCommerce.entity.User;

@Repository     // @Repository (retrive from DB its gives a result, you can manipulate  )
public interface UserRepo extends JpaRepository<User , Integer>{

	//@Modifying    // for update query need modifying
	@Query("select u from User u where u.userName=:username and u.password=:pwd")  // mySql query 
	public User login(@Param("username") String username, @Param("pwd")String password);
	
	
	
	@Modifying
	@Query("update User u set u.address=:address where u.userId=:userid")
	public void updateAddress(@Param("address") String address, @Param("userid") int userid );
	
	
	//update hbstudent.user set address = "320 salt lake city utah" where userid = 3;

}
