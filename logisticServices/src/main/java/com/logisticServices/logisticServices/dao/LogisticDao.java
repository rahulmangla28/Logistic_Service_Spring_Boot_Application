package com.logisticServices.logisticServices.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.logisticServices.logisticServices.entities.Logistic;

@Repository
public interface LogisticDao extends JpaRepository<Logistic,Long>{
	  	
	  @Query(
			  nativeQuery = true,
			  value = 
			  "select * from \"logistic load data\" where \"shipper id\" =:shipperId")
	  List<Logistic> findByShipperId(@Param("shipperId") String shipperId);

}
