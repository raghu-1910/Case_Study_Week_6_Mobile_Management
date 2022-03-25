package com.mobile.dao;

import org.springframework.data.repository.CrudRepository;

import com.mobile.entity.Mobile;

public interface MobileManagementDao extends CrudRepository<Mobile, Integer> {
	//here we use CRUDRepository in this we have a predefind method like save,deleteById,findAll and findById

}
