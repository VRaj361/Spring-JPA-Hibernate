package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{
	List<UserEntity> findAll();

}
