package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{
	List<UserEntity> findAll();
	
	//custom query
	@Query(value="select * from users where active =:active",nativeQuery = true)
	List<UserEntity> getAllByStatusActivation(Boolean active);
	//nativequery is for custom query
	//active =: active that represent to take the value of active in below method call parameter
	
	
}
