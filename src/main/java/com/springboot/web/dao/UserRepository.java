package com.springboot.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.web.entities.User;

//JpaRepository<User, Integer> or CrudRepository<User, Integer> 
public interface UserRepository extends CrudRepository<User, Integer> {

	public List<User> findByName(String name);

	public List<User> findByNameAndCity(String name, String city);

	public List<User> findByNameStartingWith(String prefix);

	public List<User> findByNameEndingWith(String suffix);

	public List<User> findByNameContaining(String word);

//	JPQL
	@Query("select u from User u")
	public List<User> getAllUser();

	/* parametarized query */
	@Query("select u from User u where u.name =:n ")
	public List<User> getUserByName(@Param("n") String name);

	@Query("select u from User u where u.name =:name and u.city =:city")
	public List<User> getUserByNameAndCity(@Param("name") String name, @Param("city") String city);

	@Query("select u from User u where u.id =:id")
	public List<User> getUserById(@Param("id") int id);
}
