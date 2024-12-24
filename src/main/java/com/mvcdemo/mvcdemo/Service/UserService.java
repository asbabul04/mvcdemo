package com.mvcdemo.mvcdemo.Service;



import com.mvcdemo.mvcdemo.Modal.User;
import com.mvcdemo.mvcdemo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        User user1 = new User();
        user1.setEmail(user.getEmail());
        user1.setName(user.getName());
        return userRepository.save(user1);
    }

//    public void deleteUser(Long userId) {
//        userRepository.deleteById ( userId );
//    }
}