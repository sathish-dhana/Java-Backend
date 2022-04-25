package masai.Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDatabase {
	Map<Integer, User> users;

	public UserDatabase(Map<Integer, User> users) {
		super();
		this.users = users;
	}

	public Map<Integer, User> getUsers() {
		return users;
	}

	public void setUsers(Map<Integer, User> users) {
		this.users = users;
	} 
	
	public boolean addUserToDataBase(int userId, User user) {
		if (users.get(userId) == null) {
			users.put(userId, user);
		} else {
			System.out.println("Already Exist");
			return false;
		}
		return true;
	}
	
	public boolean isRegistered(User user) {
		//check in database
		return false;
	}
	
	public List<User> getUsersList() {
		List<User> list = new ArrayList<>();
		
		//logic to add into list
		
		return list;
	}
}
