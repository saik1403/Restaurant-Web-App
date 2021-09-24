package com.restaurant.springrest.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.restaurant.springrest.entity.Users;

//I have used jpa Data repository for crud operations on my Database

public interface UserDAO extends JpaRepository <Users, Integer> {
}
