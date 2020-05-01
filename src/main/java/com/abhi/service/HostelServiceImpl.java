package com.abhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.dao.IHostelDao;
import com.abhi.entity.Hostel;
import com.abhi.entity.Student;
import com.abhi.entity.Subject;



/**
 * @author ravi
 *
 */
@Service
public class HostelServiceImpl implements IHostelService {
	
	@Autowired
	private IHostelDao hostelDao;

	@Override
	public List<Hostel> getHostels(Integer hostelId) {
		return hostelDao.getHostels(hostelId);
	}
    
	@Override
	@Transactional(readOnly=false)
	public Hostel saveHostel(Hostel hostel) {
		return hostelDao.saveHostel(hostel);
	}

	@Override
	@Transactional(readOnly=false)
	public Hostel updateHostel(Hostel hostel) {
		return hostelDao.updateHostel(hostel);
	}
	
	@Override
	public Hostel deleteHostel(Hostel hostel) {
		return hostelDao.deleteHostel(hostel);
	}
}
