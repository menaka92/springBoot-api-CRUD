package com.menaka.demo.controller;

import com.menaka.demo.dto.UserDto;
import com.menaka.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

@Autowired
private UserService userService;
    /*get all  users*/
    @GetMapping("/showall")
    public List<UserDto> all() {
        return userService.getAllUsers();
    }
/*get users bys id*/
    @GetMapping("/showone/{uesrid}")
    public UserDto allbyid(@PathVariable Integer uesrid) {
        return userService.getUserById(uesrid);
    }
    @PostMapping ("/insert")
    public UserDto get(@RequestBody UserDto userDto) {
        return userService.insertUsers(userDto);
    }
    @PutMapping("update")
    public UserDto update(@RequestBody UserDto userDto) {
        return userService.insertUsers(userDto);
    }
    @DeleteMapping("delete/{userid}")// this is path parameeter ,if use ? this is query parameeter
    public  String del(@PathVariable Integer userid){
        return  userService.deleteUser(userid);
    }
}
