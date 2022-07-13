package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.entity.AddressEntity;

public interface AddressRepository extends CrudRepository<AddressEntity, Integer>{
	List<AddressEntity> findAll();
}
