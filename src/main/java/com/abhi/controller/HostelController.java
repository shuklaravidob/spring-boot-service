package com.abhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.entity.Hostel;
import com.abhi.service.IHostelService;

/**
 * @author ravi
 *
 */
@RestController
@RequestMapping("api")
public class HostelController {
	
	@Autowired
	private IHostelService hostelService;
	
	@GetMapping(path = {"/hostels"})
	public List<Hostel> getHostels() {
		List<Hostel> hostels = hostelService.getHostels(null);
		return hostels;
	}
	
	@GetMapping(path = {"/hostels/{hostelId}"})
	public List<Hostel> getHostel(@PathVariable("hostelId") Integer hostelId) {
		List<Hostel> hostels = hostelService.getHostels(hostelId);
		return hostels;
	}

	@PostMapping(path = {"/hostel"})
	public Hostel saveHostel(@RequestBody Hostel hostel) {
		Hostel hostelR = hostelService.saveHostel(hostel);
		return hostelR;
	}
	@PutMapping(path = {"/hostel"})
	public Hostel updateHostel(@RequestBody Hostel hostel) {
		Hostel hostelR = hostelService.updateHostel(hostel);
		return hostelR;
	}
}
