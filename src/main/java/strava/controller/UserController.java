package strava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import strava.service.UserService;

public class UserController {
	private UserService userService;
	 
    public UserController(UserService userService) {
		this.userService = userService;
	}

    @GetMapping("/validar")
    public boolean validar(@RequestParam(name = "email") String email) {
        return userService.getUser(email) != null;
    }

    @GetMapping("/login")
    public boolean login(
        @RequestParam(name = "email") String email,
        @RequestParam(name = "password") String password
    ) {
        var user = userService.getUser(email);
        if (user != null) {
            return user.getPassword().equals(password);
        }
        return false;
    }
}
