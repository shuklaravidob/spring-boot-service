package com.abhi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.entity.Hostel;



/**
 * @author ravi
 *
 */
@Transactional
@Repository
public class HostelDao implements IHostelDao {
	
	@PersistenceContext	
	private EntityManager entityManager;	

	@SuppressWarnings("unchecked")
	@Override
	public List<Hostel> getHostels(Integer hostelId) {
		String sql = "FROM Hostel s ";
		if(hostelId != null)
			sql += " where s.hostelId = :hostelId";
		Query query = entityManager.createQuery(sql);
		if(hostelId != null)
			query.setParameter("hostelId", hostelId);
		return (List<Hostel>)query.getResultList();
	}
	@Override
	@Transactional(readOnly=false)
	public Hostel saveHostel(Hostel hostel) {
		entityManager.persist(hostel);
		return hostel;
	}

	@Override
	@Transactional(readOnly=false)
	public Hostel updateHostel(Hostel hostel) {
		entityManager.merge(hostel);
		return hostel;
	}


}
