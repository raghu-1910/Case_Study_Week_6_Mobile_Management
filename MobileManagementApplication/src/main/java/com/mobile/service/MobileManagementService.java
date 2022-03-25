package com.mobile.service;

import java.util.Optional;

import com.mobile.entity.Mobile;
//adding all the method
public interface MobileManagementService {
	
	Mobile addMobile(Mobile mobile);

	Mobile updateMobile(Mobile mobile);

	void deleteMobile(int mobileId);

	 Optional<Mobile> getMobile(int mobileId);

	 Iterable<Mobile> getAllMobiles();

}
