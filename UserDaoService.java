package com.revature.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;


//Signifies a spring bean. Spring should manage the bean
@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	private static int usersCount = 3;
	
	static {
		
		users.add(new User(1, " ", "Larry", "The", "Coder", " ", "101 Winter Lane", "Cupertino", "California", "98333", " ", "101-222-5555", "larry@gmail.com"));
		users.add(new User(2, " ", "Satoshi", "The", "Bitcoiner", " ", "432 Summer Lane", "Palo Alto", "California", "98434", " ", "202-678-0222", "satoshi@gmail.com"));
		users.add(new User(3, " ", "Daniel", "The", "Cryptographer", " ", "454 Crypto Lane", " ", "Stanford", "California", " ", "989-121-2233", "crypto@gmail.com"));
	}
	
	//find all users
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId() == null) {
			user.setId(++usersCount);
		}
		
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		
		for(User user : users) {
			
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			
			if(user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}

}
