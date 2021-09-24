package com.restaurant.springrest.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.restaurant.springrest.entity.Bills;

//I have used jpa Data repository for crud operations on my Database

public interface BillsDAO extends JpaRepository<Bills,Integer> {
	@Query(value="select * from bills a where a.username= :username and a.billdate=curdate()", nativeQuery=true)
    List<Bills> getBillsByName(String username);
	//"insert into bills (BillDate,ItemId,TotalPrice,Userid,Username) values (curdate(),"+id+","+totalprice+","+userId+","+"'"+userName+"'"+")"
	@Modifying
	@Transactional
	@Query(value="insert into bills (BillDate,ItemId,TotalPrice,Userid,Username) values (curdate(),:itemid, :totalprice, :userid, :username)", nativeQuery=true)
     void billsentry(@Param("itemid") Integer itemid,@Param("totalprice") Integer totalprice,@Param("userid") Integer userid,@Param("username") String username);
	
	@Query(value="select BillId,BillDate,ItemId,sum(TotalPrice) as TotalPrice,Userid,Username from bills a where a.billdate=curdate() group by username", nativeQuery=true)
	List<Bills> getTodaysBills();
	@Query(value="select BillId,BillDate,ItemId,sum(TotalPrice) as TotalPrice,Userid,Username from bills a where month(a.billdate)=month(curdate()) group by username", nativeQuery=true)
	List<Bills> getThisMonthBills();
	}

