package com.springboot.web;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.web.dao.UserRepository;
import com.springboot.web.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		/*
		 * User user = new User(); user.setName("Mohammed junaid");
		 * user.setCity("kunigal"); user.setStatus("c++ programmer");
		 * 
		 * User user1 = userRepository.save(user); System.out.println(user1);
		 */
		// create an object of the user

		/*
		 * User user1 = new User(); user1.setName("mukram"); user1.setCity("mandya");
		 * user1.setStatus("business men");
		 * 
		 * User user2 = new User(); user2.setName("abida"); user2.setCity("banglore");
		 * user2.setStatus("house wife");
		 * 
		 * User user = userRepository.save(user2); // saving a single user
		 * System.out.println("saved user: " + user);
		 * 
		 * // saving a multiple user
		 * 
		 * List<User> users = List.of(user1, user2); Iterable<User> result =
		 * userRepository.saveAll(users); result.forEach(e -> { System.out.println(e);
		 * });
		 */

//		update the user of id 102
		Optional<User> optional = userRepository.findById(102);
		// getting the data
		User user = optional.get();
//		System.out.println(user);
		// setting the data
//		user.setName("mukram pasha");
//		User save = userRepository.save(user);
//		System.out.println(save);

		// getting the data
		Iterable<User> all = userRepository.findAll();
//		for (User user2 : all) {
//			System.out.println(user2);
//		}

//		all.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		});

//		all.forEach(e -> {
//			System.out.println(e);
//		});

//		deleting the single  data
//		userRepository.deleteById(103);
//		System.out.println("deleted...");
//		deleting the entire data
//		Iterable<User> iterable = userRepository.findAll();
//		iterable.forEach(e -> {
//			System.out.println(e);
//		});
//		userRepository.deleteAll(iterable);
//		System.out.println("deleted....");

//		default one 
//		userRepository.findAll();
//		userRepository.findAllById(null);
//		userRepository.findById(null);

//		Custom finder methods/Drived query methods
//		data by name
//		data by name and password
//		data by name or password
//		List<User> byName = userRepository.findByName("mukram");
//
//		byName.forEach(e -> {
//			System.out.println(e);
//		});
//		List<User> byNameAndCity = userRepository.findByNameAndCity("mukram", "mandya");
//		byNameAndCity.forEach(e -> {
//			System.out.println(e);
//		});

//		List<User> byNameContaining = userRepository.findByNameContaining("d");
//
//		byNameContaining.forEach(e -> System.out.println(e));

//		List<User> byNameStartingWith = userRepository.findByNameStartingWith("m");
//		byNameStartingWith.forEach(e -> {
//			System.out.println(e);
//		});

//		List<User> byNameEndingWith = userRepository.findByNameEndingWith("a");
//		byNameEndingWith.forEach(e -> {
//			System.out.println(e);
//		});

//		List<User> allUser = userRepository.getAllUser();
//		allUser.forEach(e -> {
//			System.out.println(e);
//		});

//		List<User> userByName = userRepository.getUserByName("mukram");
//		userByName.forEach(e -> {
//			System.out.println(e);
//		});

//		List<User> userByNameAndCity = userRepository.getUserByNameAndCity("mukram", "mandya");
//
//		userByNameAndCity.forEach(e -> {
//			System.out.println(e);
//		});
//
//		List<User> userById = userRepository.getUserById(202);
//		userById.forEach(e -> {
//			System.out.println(e);
//		});
	}

}

/*
 * 1.creating spring boot project 2.adding jpa dependencies 3.creating entities
 * 4.creating the interface to interact with the database and that is extending
 * the jparepository or crudrepository 5.db configuration
 * 
 * 
 * https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#
 * reference
 */