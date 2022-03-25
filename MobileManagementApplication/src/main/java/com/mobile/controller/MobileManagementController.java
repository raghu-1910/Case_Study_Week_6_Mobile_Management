package com.mobile.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileManagementService;

@RestController //it annotation use for restcontrolling
@RequestMapping("/mobile")  //http://localhost:8685/mobile
public class MobileManagementController {
	
	@Autowired
	MobileManagementService service;
	 
	//Post-->insert ,get-->get,put-->update and delete-->remove
	
	@PostMapping("/addMobile") //http://localhost:8685/mobile/addMobile
	public Mobile addMobile(@RequestBody Mobile mbl)	//RequestBody annotation use for all the request from body
	{
		return service.addMobile(mbl);
	}
	
	@PutMapping("/updateMobile") //http://local:8685/mobile/updateMobile
	public Mobile updateMobile(@RequestBody Mobile mbl) {
		return service.updateMobile(mbl);
	}
	
	@GetMapping("/getMobile/{mid}") //http://localhost:8685/mobile/getMobile/mid
	public Optional<Mobile> getMobile(@PathVariable("mid") int mobileId) {
		return service.getMobile(mobileId);
	}
	
	@GetMapping("/getAllMobiles") //http:localhost:8685/mobile/getAllMobiles
	public Iterable<Mobile> getAllMobiles(){
		return service.getAllMobiles();
	}
	
	@DeleteMapping("/deleteMobile/{mid}") //http:localhost:8685/mobile/deleteMobile/mid
	public void deleteMobile(@PathVariable("mid") int mobileId) {
		service.deleteMobile(mobileId);
	}

}
