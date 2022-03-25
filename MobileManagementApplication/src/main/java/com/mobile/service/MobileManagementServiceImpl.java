package com.mobile.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mobile.dao.MobileManagementDao;
import com.mobile.entity.Mobile;

//Implement all the method which we defined in a interface of service
public class MobileManagementServiceImpl implements MobileManagementService {
	@Autowired//its annotation internally give id of dao
	MobileManagementDao dao;
	@Override
	public Mobile addMobile(Mobile mobile) {
		return dao.save(mobile);
	}

	@Override
	public Mobile updateMobile(Mobile mobile) {
		return dao.save(mobile);
	}

	@Override
	public void deleteMobile(int mobileId) {
		dao.deleteById(mobileId);;
		
	}

	@Override
	public Optional<Mobile> getMobile(int mobileId) {
		return dao.findById(mobileId);
	}

	@Override
	public Iterable<Mobile> getAllMobiles() {
		return dao.findAll();
	}

}
