package com.abhi.service;

import java.util.List;

import com.abhi.entity.Hostel;
import com.abhi.entity.Student;


public interface IHostelService {
	
	List<Hostel> getHostels(Integer hostelId);

	Hostel saveHostel(Hostel hostel);

	Hostel updateHostel(Hostel hostel);
	
	Hostel deleteHostel(Hostel hostel);
}
