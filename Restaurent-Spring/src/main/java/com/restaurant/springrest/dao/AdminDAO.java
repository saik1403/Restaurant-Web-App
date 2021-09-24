package com.restaurant.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restaurant.springrest.entity.Admins;

//I have used jpa Data repository for crud operations on my Database

public interface AdminDAO extends JpaRepository<Admins,Integer> {

}
