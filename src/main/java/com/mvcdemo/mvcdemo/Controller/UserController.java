package com.mvcdemo.mvcdemo.Controller;



import com.mvcdemo.mvcdemo.Modal.User;
import com.mvcdemo.mvcdemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @PostMapping("/users")
    public String createUser(@ModelAttribute User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

//    @DeleteMapping("/users/{userId}")
//    public String deleteUser(@PathVariable Long userId){
//        userService.deleteUser(userId);
//        return "redirect:/users";
//    }
}