package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.UserEntity;
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer>{
	List<UserEntity> findAll();
	
	public List<UserEntity> findByfirstName(String firstName);
	//custom query
	
	@Query(value="select * from users where active =:active",nativeQuery = true)
	List<UserEntity> getAllByStatusActivation(Boolean active);
	//write nativeQuery=true is notify that use of Custom Query
	//Also write JPQL Query
	//active =: active that represent to take the value of active in above method call parameter
	
	
}
