package com.abhi.service;

import java.util.List;

import com.abhi.entity.Hostel;


public interface IHostelService {
	
	List<Hostel> getHostels(Integer hostelId);

}