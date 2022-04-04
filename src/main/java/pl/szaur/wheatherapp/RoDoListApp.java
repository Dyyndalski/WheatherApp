package pl.szaur.wheatherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.szaur.wheatherapp.User.User;
import pl.szaur.wheatherapp.User.UserDTO;
import pl.szaur.wheatherapp.User.UserService;

import java.util.List;

@RestController
public class RoDoListApp {

    @Autowired
    CarManager carManager;
    @Autowired
    UserService userService;


    @GetMapping("/show")
    public List<Car> sayHello(){
        return carManager.getCars();
    }

    @PostMapping("/addUser")
    public User addCar(@RequestBody UserDTO user){
        return userService.login(user);
    }

    @GetMapping("/api/employees/{id}")
    @ResponseBody
    public String getEmployeesById(@PathVariable String id) {
        return "ID: " + id;
    }
}
