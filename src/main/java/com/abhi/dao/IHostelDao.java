package com.abhi.dao;

import java.util.List;

import com.abhi.entity.Hostel;


/**
 * @author ravi
 *
 */
public interface IHostelDao {
	
	List<Hostel> getHostels(Integer HostelId);
    
	Hostel saveHostel(Hostel hostel);

	Hostel updateHostel(Hostel hostel);
	
	Hostel deleteHostel(Hostel hostel);

}
