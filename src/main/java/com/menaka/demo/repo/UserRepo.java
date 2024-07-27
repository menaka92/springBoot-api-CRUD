package com.menaka.demo.repo;

import com.menaka.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// controllers and services walat adala data types thiami meke store krnne
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
//methnadi denne use krn model ekai eke pk ekai

//    @Query(value="SELECT * FROM user WHERE id=?1 AND name =?2")
//    public getUserByIdAndName(Integer userId,String name);
@Query(value = "SELECT * FROM user WHERE id=?1", nativeQuery = true)
User findUserById(Integer userId);
}
