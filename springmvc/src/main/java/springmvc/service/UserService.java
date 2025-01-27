package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.Dao.UserDao;
import springmvc.model.User;

@Service
public class UserService {

    // Autowiring the UserDao at the field level
    @Autowired
    private UserDao userDao;

    // Method to create the user
    public int createUser(User user) {
        // Delegate the saving logic to UserDao
        return this.userDao.saveUser(user);
    }
}
