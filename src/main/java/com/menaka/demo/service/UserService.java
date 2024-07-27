package com.menaka.demo.service;

import com.menaka.demo.dto.UserDto;
import com.menaka.demo.model.User;
import com.menaka.demo.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDto> getAllUsers(){
        List<User> users = userRepo.findAll(); // return a list of User entity
        return modelMapper.map(users, new TypeToken<List<UserDto>>() {}.getType());
    }

    public UserDto insertUsers(UserDto userDto) {
        userRepo.save(modelMapper.map(userDto, User.class));
        return userDto;
    }

    public UserDto updateUser(UserDto userDto){
        userRepo.save(modelMapper.map(userDto, User.class));
        return userDto;
    }

    public String deleteUser(Integer userid){
        userRepo.deleteById(userid);
        return "deleted user";
    }

    /*customize query*/
    public UserDto getUserById(Integer userId) {
        User user = userRepo.findUserById(userId);
        return modelMapper.map(user, UserDto.class);
    }

    /*
 * [
 *   {
 *     "id": 1,
 *     "name": "menaka",
 *     "address": null
 *   },
 *   {
 *     "id": 2,
 *     "name": "lakshan",
 *     "address": null
 *   },
 *   {
 *     "id": 3,
 *     "name": "nimal",
 *     "address": "colombo"
 *   }
 * ]
 */
}
/*
[
  {
    "id": 1,
    "name": "menaka"
  },
  {
    "id": 2,
    "name": "lakshan"
  },
  {
    "id": 3,
    "name": "nimal"
  }
]
*/
//    public List<User> getAllUsers1() {
//        return userRepo.findAll();
//    }