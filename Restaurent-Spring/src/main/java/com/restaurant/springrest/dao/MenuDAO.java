package com.restaurant.springrest.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.restaurant.springrest.entity.Bills;
import com.restaurant.springrest.entity.Menu;
//I have used jpa Data repository for crud operations on my Database
public interface MenuDAO extends JpaRepository<Menu,Integer> {
	@Query(value="select itemprice from menu ", nativeQuery=true)
    List<Integer> getPrices();

}
